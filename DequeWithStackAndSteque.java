public class DequeWithStackAndSteque{
	java.util.Stack<Integer> s;
	StequeWithTwoStacks stq;
	
	DequeWithStackAndSteque(){
		s=new java.util.Stack<Integer>();
		stq=new StequeWithTwoStacks();
	}

	public int size(){
		return s.size()+stq.size();
	}

	public boolean isEmpty(){
		return s.isEmpty() && stq.isEmpty();
	}

	public void pushLeft(Integer val){
		stq.push(val);
	}

	public void pushRight(Integer val){
		s.push(val);
	}
	public Integer popLeft() throws QueueEmptyException{
		if(isEmpty()){
			throw new QueueEmptyException();
		}else if(stq.isEmpty()){
			while(!s.isEmpty()){
				stq.push(s.pop());
			}
			return stq.pop();
		}else{
			return stq.pop();
		}
	}
	public Integer popRight() throws QueueEmptyException{
		if(isEmpty()){
			throw new QueueEmptyException();
		}else if(s.isEmpty()){
			while(!s.isEmpty()){
				s.push(stq.pop());
			}
			return s.pop();
		}else{
			return s.pop();
		}
	}
}