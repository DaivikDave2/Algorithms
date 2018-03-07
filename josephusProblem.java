import java.util.*;
public class josephusProblem{
	 public static void main(String[] args) {
	 	int n=Integer.parseInt(args[0]);
	 	int m=Integer.parseInt(args[1]);
	 	java.util.Queue<Integer> circle=new java.util.LinkedList<>();
	 	Scanner sc=new Scanner(System.in);
	 	for(int i=0;i<n;i++){
	 		circle.add(sc.nextInt());
	 	}
	 	int i=1;
	 	while(!circle.isEmpty()){
	 		if(i%m==0){
	 			System.out.println(circle.remove());
	 		}
	 		else{
	 			circle.add(circle.remove());
	 		}
	 		i++;
	 	}
	 }
}