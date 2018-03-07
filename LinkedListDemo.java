import edu.princeton.cs.algs4.*;
import java.io.*;
class LinkedListDemo{
	public static void main(String[] args)throws ListIndexOutOfBoundsException,ListEmptyException,IOException {
		LinkedList<Integer> l=new LinkedList<Integer>();
		while(!StdIn.isEmpty()){
			l.addlast(StdIn.readInt());
		}
		System.out.println("Enter index to remove");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		l.remove(Integer.parseInt(br.readLine()));
		l.display();
		System.out.println("Max Value is"+(l.max()));	
	}
	//this method doesn't work ....Iterator doesn't take the first value into account
	public static <Type extends Comparable<Type>> Type max(LinkedList<Type> l){
		Type max=(Type)l.iterator().next();
		for(Type t:l){
			System.out.println(max+" to "+t);
			if(max.compareTo(t)<0){
				max=t;
			}
		}
		return max;
	}
}