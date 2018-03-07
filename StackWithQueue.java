import java.util.*;
public class StackWithQueue{
	java.util.Queue<Integer> q;
	StackWithQueue(){
		q=new java.util.LinkedList<>();
	}
	public boolean isEmpty(){
		return q.isEmpty();
	}
	public void push(Integer val){
		q.add(val);
	}
	public Integer pop() throws Exception{
		if(q.isEmpty()){
			throw new Exception();
		}
		int n=q.size();
		for(int i=1;i<n;i++){
			q.add(q.remove());
		}
		return q.remove();
	}
	public static void main(String[] args) throws Exception {
		StackWithQueue s=new StackWithQueue();
		s.push(1);
		s.push(11);
		s.push(111);
		s.push(1111);

		s.push(11111);
		s.push(111111);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());

		System.out.println(s.pop());
		System.out.println(s.pop());

		System.out.println(s.pop());

	}
}