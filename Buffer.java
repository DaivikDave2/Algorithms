import java.util.Stack;
import java.util.EmptyStackException;
public class Buffer{
	Stack<Character> left,right;
	Buffer(){
		left=new Stack<>();
		right=new Stack<>();
	}
	public void insert(char c){
		left.push(c);
	}
	public char delete() throws EmptyStackException{
		if(!left.isEmpty()){
			return left.pop();
		}else{
			throw new EmptyStackException();
		}
	}
	public void left(int k){
		if(k>left.size()){
			while(!left.isEmpty()){
				right.push(left.pop());	
			}
		}else{
			for(int i=0;i<k;i++){
				right.push(left.pop());
			}
		}
	}
	public void right(int k){
		if(k>right.size()){
			while(!right.isEmpty()){
				left.push(right.pop());	
			}
		}else{
			for(int i=0;i<k;i++){
				left.push(right.pop());
			}
		}	
	}
	public int size(){
		return left.size()+right.size();
	}
}