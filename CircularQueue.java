import java.util.Iterator;
class CircularQueue<type> implements Iterable<type> {
	class node{
		private type value;
		private node next;
		public type getValue() {return value;}
		public void setValue(type val) {value=val;}
		public node getNext() {return next;}
		public void setNext(node n) {next=n;}
	}
	node last;
	int size;
	CircularQueue(){
		last=null;
		size=0;
	}
	CircularQueue(type val){
		node temp=new node();
		temp.setValue(val);
		last=temp;
		last.setNext(last);
		size=1;
	}
	CircularQueue(CircularQueue c){
		node c_iterator=c.last.getNext();
		node this_first=new node();
		this_first.setValue(c_iterator.getValue());
		node this_iterator=this_first;
		node temp;
		while(c_iterator!=c.last){
			c_iterator=c_iterator.getNext();
			temp=new node();
			temp.setValue(c_iterator.getValue());
			this_iterator.setNext(temp);
			this_iterator=temp;
		}
		this_iterator.setNext(this_first);
		last=this_iterator;
		size=c.size;
	}
	public void enqueue(type val){
		if(size==0){
		node temp=new node();
		temp.setValue(val);
		last=temp;
		last.setNext(last);
		size++;	
		}
		else{
			node temp=new node();
			temp.setValue(val);
			temp.setNext(last.getNext());
			last.setNext(temp);
			last=temp;
			size++;
		}
	}
	public type dequeue() throws QueueEmptyException{
		if(size==0 ) {throw new QueueEmptyException();}
		else if(size==1){ type val=last.getValue();
			last=null;
			size--;
			return val;
		}
		else{
			type val=last.getNext().getValue();
			last.setNext(last.getNext().getNext());
			size--;
			return val;
		}
	}
	public boolean isEmpty(){
		return size==0;
	}

	public Iterator<type> iterator(){
		return new QueueIterator();
	}

	class QueueIterator implements Iterator<type>{
		private node iterator;
		int iterate_count;
		QueueIterator(){
			iterate_count=0;
			iterator=last.getNext();
		}
		public type next(){
			iterate_count++;
			type val=iterator.getValue();
			iterator=iterator.getNext();
			return val;
		}
		public boolean hasNext(){
			return iterate_count<size;
		}
		public void remove() throws UnsupportedOperationException{
			throw new UnsupportedOperationException();
		}
	}



}