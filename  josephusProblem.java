import java.util.*;
public class josephusProblem{
	 public static void main(String[] args) {
	 	int n=Integer.parseInt(args[0]);
	 	int m=Integer.parseInt(args[1]);
	 	Queue<Integer> circle=new Queue<>();
	 	Scanner sc=new Scanner(System.in);
	 	for(int i=0;i<n;i++){
	 		circle.enqueue(sc.nextInt());
	 	}
	 	int i=1;
	 	while(!circle.isEmpty()){
	 		if(i%3==0){
	 			System.out.println(circle.dequeue());
	 		}
	 		else{
	 			circle.enqueue(circle.dequeue());
	 		}
	 		i++;
	 	}
	 }
}