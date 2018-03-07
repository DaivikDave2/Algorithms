import java.io.*;
import java.util.*;
public class QueueWithTwoStacks{
	Stack<Integer> left,right;
	QueueWithTwoStacks(){
		left=new Stack<>();
		right=new Stack<>();
	}
	public boolean isEmpty(){ return (left.isEmpty() && right.isEmpty());}
	public Integer dequeue() throws QueueEmptyException,StackEmptyException{
		if(isEmpty()){
			throw new QueueEmptyException();
		}else if(right.isEmpty()){
			while(!left.isEmpty()){
				right.push(left.pop());
			}
		}
		return right.pop();
	}
	public void enqueue(Integer val){
		left.push(val);
	}
	public static void main(String[] args)throws QueueEmptyException,StackEmptyException{
		QueueWithTwoStacks qq=new QueueWithTwoStacks();
		qq.enqueue(10);
		qq.enqueue(20);
		qq.enqueue(30);
		System.out.println(qq.dequeue());
		System.out.println(qq.dequeue());
		qq.enqueue(40);
		qq.enqueue(50);
		System.out.println(qq.dequeue());
		System.out.println(qq.dequeue());
		System.out.println(qq.dequeue());
		

	}
}