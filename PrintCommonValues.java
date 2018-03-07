import java.util.Scanner;
public class PrintCommonValues{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter int value of n");
		int n=sc.nextInt();
		int v1[]=new int[n];
		int v2[]=new int[n];
		System.out.println("Enter "+n+" values  for array1 : ");
		for(int i=0;i<n;i++){
			v1[i]=sc.nextInt();	
		}
		System.out.println("Enter "+n+" values  for array2 : ");
		for(int i=0;i<n;i++){
			v2[i]=sc.nextInt();	
		}
		int i=0;
		int j=0;
		java.util.Arrays.sort(v1);
		java.util.Arrays.sort(v2);
		
		while(i<n && j<n){
			if(v1[i]==v2[j]){
				System.out.println(v1[i]);
				i++;
				j++;
			}
			else if(v1[i]<v2[j]){
				i++;
			}else if(v1[i]>v2[j]){
				j++;
			}
		}
	}
}