import java.util.*;
public class CircularString {
	public static void main(String[] args) {
		String s,t;
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Strings :");
		s=sc.next();
		t=sc.next();
		if(s.length()==t.length()){
			int j=0,i=t.indexOf(s.charAt(0));
			for(;i<t.length();i++,j++){
				System.out.println(s.charAt(j)+" with "+t.charAt(i));
				if(s.charAt(j)!=t.charAt(i)){
					flag=false;
					break;
				}
			}
			for(int k=0,l=j;l<t.length();k++,l++){
				System.out.println(s.charAt(l)+" with "+t.charAt(k));
				if(s.charAt(l)!=t.charAt(k)){
					flag=false;
					break;
				}
			}
			
		}
		else{
			flag=false;
		}
		if(flag==true) System.out.println("The strings are circularly same");
		
	}
}