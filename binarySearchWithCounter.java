import java.util.*;
public class binarySearchWithCounter {
	static int counter;
	static int rank(int[] arr,int key){
		int low=0,high=arr.length;
		int mid=(high+low)/2;
		while(low<high){
			if(key==arr[mid]) return mid;
			else if (key<arr[mid]){high=mid-1;}
			else if (key>arr[mid]){low=mid+1;}
			mid=(high+low)/2;
			
			counter++;}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int length,arr[];
		System.out.print("Enter the size of array : ");
		length=sc.nextInt();
		arr=new int[length];
		System.out.print("Enter the values : ");
		for(int i=0;i<length;i++){
			arr[i]=sc.nextInt();

		}
		System.out.print("Enter the value to search : ");
		int value=sc.nextInt();
		Arrays.sort(arr);
		int rank=rank(arr,value);
		System.out.print(value+" found at "+rank+" in "+counter+" Searches");
		

	}
}