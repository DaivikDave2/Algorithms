import java.util.Iterator;
class Stack<type> implements Iterable<type>{
	

	private node first;
	int size;
	class node{
		node next;
		type value;
		public String toString(){
			return value.toString();
		}
	}
	Stack(){
		first=null;
		size=0;
	}
	Stack(type value){
		first=new node();
		first.value=value;
		first.next=null;
		size=1;
	}

	Stack(Stack<type> s){
		node my_iterator=new node();
		node s_iterator=s.first;
		node temp;
		my_iterator.value=s_iterator.value;
		first=my_iterator;
		while(s_iterator.next!=null){
			s_iterator=s_iterator.next;
			temp=new node();
			temp.value=s_iterator.value;
			my_iterator.next=temp;
			my_iterator=my_iterator.next;
		}
		my_iterator.next=null;
		size=s.size;
		
	}

	public Iterator<type> iterator(){
		return new StackIterator();
	}
	private class StackIterator implements Iterator<type>{
		private node iterator;
		StackIterator(){
			iterator=first;
		}
		public boolean hasNext(){
			return (iterator!=null);
		}
		public type next(){
			type value=iterator.value;
			iterator=iterator.next;
			return value;
		}
		public void remove(){
			throw new UnsupportedOperationException();
		}
	}

	public void push(type val){
		node temp=new node();
		temp.value=val;
		temp.next=first;
		
		first=temp;
		size++;
	}

	public type pop() throws StackEmptyException{
		if(size>=1){
			type temp=first.value;
			first=first.next;
			size--;
			return temp;
		}
		else{
			throw new StackEmptyException();
		}
	}

	public type peep() throws StackEmptyException{
		if(size>=1){
			return first.value;
		}
		else{
			throw new StackEmptyException();
		}
	}

	public boolean isEmpty(){
		return (size<1?true:false);
	}
}