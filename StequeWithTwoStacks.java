
public class StequeWithTwoStacks{
	java.util.Stack<Integer> left,right;
	StequeWithTwoStacks(){
		left=new java.util.Stack<Integer>();
		right=new  java.util.Stack<Integer>();
	}
	public int size(){
		return left.size()+ right.size();
	}
	public boolean isEmpty(){
		return left.isEmpty() && right.isEmpty();
	}
	public void push(Integer val){
		while(!left.isEmpty()){
			right.push(left.pop());
		}
		right.push(val);
	}
	public void enqueue(Integer val){
		while(!right.isEmpty()){
			left.push(right.pop());
		}
		left.push(val);
	}
	public Integer pop() throws QueueEmptyException{
		if(isEmpty()){
			throw new QueueEmptyException();
		}
		while(!left.isEmpty()){
			right.push(left.pop());
		}
		return right.pop();
	}
	public static void main(String[] args) throws Exception {
		StequeWithTwoStacks s=new StequeWithTwoStacks();
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);

		s.enqueue(2);
		s.enqueue(1);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());

		System.out.println(s.pop());
		System.out.println(s.pop());

		System.out.println(s.pop());

	}
}