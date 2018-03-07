class DoublyLinkedList<type>{
	doubleNode first,last;
	int size;
	class doubleNode{
		type value;
		doubleNode previous,next;
		public void setValue(type val){ value=val;}
		public type getValue(){return value;}
		public void setPrevious(doubleNode p){previous=p;}
		public doubleNode getPrevious(){return previous;}
		public void setNext(doubleNode n){next=n;}
		public doubleNode getNext(){return next;}

	}	
	DoublyLinkedList(){
		first=null;
		last=null;
		size=0;
	}
	DoublyLinkedList(type val){
		first=new doubleNode();
		first.setValue(val);
		first.setPrevious(null);
		first.setNext(null);
		last=first;
		size=1;
	}
	DoublyLinkedList(DoublyLinkedList dl){

	}
	public void insertAtFirst(type val){
		if(size==0){
		first=new doubleNode();
		first.setValue(val);
		first.setPrevious(last);
		first.setNext(last);
		last=first;
		size=1;		
		}
		else{
			doubleNode temp=new doubleNode();
			temp.setNext(first);
			temp.setValue(val);
			temp.setPrevious(last);
			last.setNext(first);
			first=temp;
			size++;
		}
	}
	public void insertAtLast(type val){
		if(size==0){
		first=new doubleNode();
		first.setValue(val);
		first.setPrevious(last);
		first.setNext(last);
		last=first;
		last.setNext(first);
		size=1;		
		}
		else{
			doubleNode temp=new doubleNode();
			temp.setPrevious(last);
			temp.setValue(val);
			temp.setNext(first);
			last.setNext(temp);
			last=temp;
			size++;
		}
		
	}
	public type removeAtFirst() throws ListEmptyException{
		if(first==null){
			throw new ListEmptyException();
		}
		else{
			type val=first.getValue();
			first=first.getNext();
			if(first!=null){
			first.setPrevious(last);
			}
			size--;
			return val;
		}
	}
	public type removeAtLast()throws ListEmptyException{
		if(last==null){
			throw new ListEmptyException();
		}
		else{
			type val=last.getValue();
			last=last.getPrevious();
			size--;
			if(last!=null){
				last.setNext(first);
			}
			return val;
		}
	}
	public void insert(type val,int index)throws ListIndexOutOfBoundsException{
		if(index>size){
			throw new ListIndexOutOfBoundsException();
		}
		else if(index==size){
			insertAtLast(val);
		}
		else{
			doubleNode temp=first;
			for(int i=1;i<index;i++){
				temp=temp.getNext();
			}
			doubleNode node=new doubleNode();
			node.setNext(temp.getNext());
			temp.getNext().setPrevious(node);
			node.setValue(val);
			node.setPrevious(temp);
			temp.setNext(node);
			size++;
		}
	}
	public void  insertAfter(type val,int index) throws ListIndexOutOfBoundsException{
		if(index>=size){
			insertAtLast(val);
		}
		else if(index<=0){
			insertAtFirst(val);
		}
		else{
			insert(val,index+1);
		}
	}
	public  void insertBefore(type val,int index) throws ListIndexOutOfBoundsException{
		if(index>size){
			insertAtLast(val);
		}
		else if(index<=1){
			insertAtFirst(val);
		}
		else{
			insert(val,index-1);
		}
	}

	public type remove(int index) throws ListIndexOutOfBoundsException,ListEmptyException{
		if(index<=0) return removeAtFirst();
		else if(index>=size-1) return removeAtLast();
		else{
		doubleNode temp=first;
			for(int i=0;i<index-1;i++){
				temp=temp.getNext();
			}
			type val=temp.getNext().getValue();
			temp.getNext().getNext().setPrevious(temp);
			temp.setNext(temp.getNext().getNext());
			size--;
			return val;
		}

	}

	public boolean isEmpty(){
		return size>=0;
	}
	public void display(){
		doubleNode temp=first;
		while(temp!=last){
			System.out.print(temp.getValue()+" ");
			temp=temp.getNext();
		}
		System.out.println(temp.getValue()+" "+size);
	}


}