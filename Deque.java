class Deque<Type>{
	class Node{
		Node next,previous;
		Type value;
		public Type getValue() {return value;}
		public Node getNext() {return next;}
		public void setValue(Type val){ value=val;}
		public void setNext(Node n) {next =n;}
		public void setPrevious(Node p){previous=p;}
		public Node getPrevious(){return previous;}
	}
	Node top,bottom;
	int size;
	Deque(){
		top=null;
		bottom=null;
		size=0;
	}
	Deque(Type val){
		top=new Node();
		top.setValue(val);
		size=1;
		bottom=top;
		top.setNext(null);
		top.setPrevious(null);
	}
	Deque(Deque c){
		if(c.size==0){
			top=null;
	   		bottom=null;
			size=0;
		}
		else{
			Node iterator= c.top;
			Node previous=new Node();
			previous.setValue(iterator.getValue());
			previous.setPrevious(null);
			top=previous;
			Node next=null;
			while(iterator.getNext()!=null){
				iterator=iterator.getNext();
				next=new Node();
				next.setValue(iterator.getValue());
				previous.setNext(next);
				next.setPrevious(previous);
				previous=next;
			}
			bottom=previous;
			bottom.setNext(null);
			size=c.size;
		}

	}
	public void pushLeft(Type t){
		if(size==0){
		Node temp=new Node();
		temp.setValue(t);
		temp.setNext(null);
		temp.setPrevious(null);
		top=temp;
		bottom=top;
		size++;
		}
		else{
		Node temp=new Node();
		temp.setValue(t);
		temp.setPrevious(null);
		temp.setNext(top);
		top.setPrevious(temp);
		top=temp;
		size++;
		}
		

	}
	public void pushRight(Type val){
		if(size==0){
		Node temp=new Node();
		temp.setValue(val);
		temp.setNext(null);
		temp.setPrevious(null);
		top=temp;
		bottom=top;
		size++;
		}
		else{
			Node temp=new Node();
			temp.setValue(val);
			temp.setNext(null);
			bottom.setNext(temp);
			temp.setPrevious(bottom);
			bottom=temp;
			size++;
		}
	}
	public Type popLeft() throws QueueEmptyException{
		if(top==null){
			throw new QueueEmptyException();
		}
		else if(top==bottom){
			bottom=null;
			Type val= top.getValue();
			Node temp=top;

			top=top.getNext();
			top.setPrevious(null);
			temp.setNext(null);
			size--;
			return val;
		}
		else{
			Node temp=top;
			Type val= top.getValue();
			top=top.getNext();
			temp.setNext(null);
			top.setPrevious(null);
			size--;
			return val;
		}
	}
	public Type popRight() throws QueueEmptyException{
		if(bottom==null){
			throw new QueueEmptyException();
		}
		else if(bottom==top){
			top=null;
			Type val=bottom.getValue();
			bottom=bottom.getPrevious();
			size--;
			return val;
		}
		else{
			Node temp=bottom;
			Type val=bottom.getValue();
			bottom=bottom.getPrevious();
			temp.setPrevious(null);
			bottom.setNext(null);
			size--;
			return val;
		}
	}
	public boolean isEmpty(){
		return size<=0;
	}
}