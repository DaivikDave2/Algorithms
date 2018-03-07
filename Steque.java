class Steque<Type>{
	class Node{
		Node next;
		Type value;
		public Type getValue() {return value;}
		public Node getNext() {return next;}
		public void setValue(Type val){ value=val;}
		public void setNext(Node n) {next =n;}
	}
	Node top,bottom;
	int size;
	Steque(){
		top=null;
		bottom=null;
		size=0;
	}
	Steque(Type val){
		top=new Node();
		top.setValue(val);
		size=1;
		bottom=top;
		top.setNext(null);
	}
	Steque(Steque c){
		if(c.size==0){
			top=null;
	   		bottom=null;
			size=0;
		}
		else{
			Node iterator= c.top;
			Node previous=new Node();
			previous.setValue(iterator.getValue());
			top=previous;
			Node next=null;
			while(iterator.getNext()!=null){
				iterator=iterator.getNext();
				next=new Node();
				next.setValue(iterator.getValue());
				previous.setNext(next);
				previous=next;
			}
			bottom=next;
			bottom.setNext(null);
			size=c.size;
		}

	}
	public void push(Type t){
		if(size==0){
		Node temp=new Node();
		temp.setValue(t);
		temp.setNext(null);
		top=temp;
		bottom=top;
		size++;
		}
		else{
		Node temp=new Node();
		temp.setValue(t);
		temp.setNext(top);
		top=temp;
		size++;
		}
		

	}
	public void enqueue(Type val){
		if(size==0){
		Node temp=new Node();
		temp.setValue(val);
		temp.setNext(null);
		top=temp;
		bottom=top;
		size++;
		}
		else{
			Node temp=new Node();
			temp.setValue(val);
			temp.setNext(null);
			bottom.setNext(temp);
			bottom=temp;
			size++;
		}
	}
	public Type pop() throws QueueEmptyException{
		if(top==null){
			throw new QueueEmptyException();
		}
		else if(top==bottom){
			bottom=null;
			Type val= top.getValue();
			top=top.getNext();
			size--;
			return val;
		}
		else{
			Type val= top.getValue();
			top=top.getNext();
			size--;
			return val;
		}
	}
	public boolean isEmpty(){
		return size<=0;
	}
}