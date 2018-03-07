class moveToFront<Item>{
	int size;
	node first=null;
	class node{
		private	Item value;
		private node next;
		node(){
			next=null;
		}
		public Item getValue(){return value;}
		public node getNext(){return next;}
		public void setValue(Item item){
			value=item;
		}
		public void setNext(node n){
			next=n;
		}
	}
	moveToFront(){
		first=null;
		size=0;
	}
	private node getPreviousElement(Item item){
		if(first==null){
			return null;
		}else{
			node iterator=first;
			node previous=null;
			while(iterator!=null){
				if(item==iterator.getValue()){
					return previous;
				}
				previous=iterator;
				iterator=iterator.getNext();
			}
		}
		return null;
	}
	private void removeFromPrevious(node previous){
		node temp=previous.getNext();
		previous.setNext(temp.getNext());
		temp.setNext(null);
	}
	public void add(Item item){
		node temp=getPreviousElement(item);
		if(first==null){
			first=new node();
			first.setValue(item);
			size++;
			return;
		}
		if(temp==null){
			if(first.getValue()!=item){
				node n=new node();
				n.setNext(first);
				n.setValue(item);
				first=n;
				size++;
			}else{
				node n=temp.getNext();
				temp.setNext(n.getNext());
				n.setNext(first);
				first=n;
				size++;
			}
		}else{
			node n=temp.getNext();
			removeFromPrevious(temp);
			n.setNext(first);
			first=n;
			size++;		
		}
	}
	public boolean remove(Item item){
		node temp=getPreviousElement(item);
		if(temp==null){
			if(item==first.getValue()){
				node n=first;
				first=first.getNext();
				n.setNext(null);
				size--;
				return true;
			}
		}else{
			node n=temp.getNext();
			temp.setNext(n.getNext());
			n.setNext(null);
			size--;
		return true;
		}
		return false;
	}		

	public void display(){
		node iterator=first;
		while(iterator!=null){
			System.out.print(iterator.getValue()+" ");
			iterator=iterator.getNext();
		}
	}


}