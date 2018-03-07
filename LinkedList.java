
import java.util.Iterator;
public final class LinkedList<Type extends Comparable<Type>> implements Iterable<Type>{
	node first;
	node last;
	int size;
	class node{
	private Type value;
	private node next;
			
		public void setValue(Type t){
			value=t;
		}
		public void setNext(node n){
			next=n;
		}
		public Type getValue(){
			return value;
		}
		public node getNext(){
			return next;
		}
	}

	public Iterator<Type> iterator(){
		return new ListIterator();
	}

	class ListIterator implements Iterator<Type>{
		private node iterator;
		ListIterator(){
			iterator=first;
		}
		public boolean hasNext(){
			return (iterator!=null);
		}
		public Type next(){
			Type value=iterator.getValue();
			iterator=iterator.getNext();
			return value;
		}
		public void remove() {
			throw new UnsupportedOperationException();
		}
	} 
	
		LinkedList(){
			first=null;
			last=null;
			size=0;
		}
		LinkedList(Type val){
			first=new node();
			first.setValue(val);
			first.setNext(null);
			last=first;
			size=1;
		}
		LinkedList(LinkedList l){
			l.size=size;
			l.first=new node();
			node this_iterator=first;
			l.first.setValue(this_iterator.getValue());
			node l_iterator=l.first;
			while(this_iterator.getNext()!=null){
				this_iterator=this_iterator.getNext();
				node temp=new node();
				temp.setValue(this_iterator.getValue());
				l_iterator.setNext(temp);
				l_iterator=l_iterator.getNext();
			}
			l_iterator.setNext(null);
			l.last=l_iterator;
		}
		public boolean isEmpty(){
			return first==null;
		}
		public void display(){
			for(Type d:this){
				System.out.println(d+" ");
			}
		}
		public void addFirst(Type val){
			if(first==null){
				first=new node();
				first.setValue(val);
				first.setNext(null);
				last=first;
				size=1;
			}
			else{
				node temp=new node();
				temp.setValue(val);
				temp.setNext(first);
				first=temp;
				size++;
			}
		}
		public void add(Type val,int index){
			if(index==0){
				addFirst(val);
			}
			else{
				if(index>=size){
					addlast(val);
				}
				else{
					node this_iterator=first;
					for(int i=0;i<index-1;i++){
						this_iterator=this_iterator.getNext();
					}
					node temp=new node();
					temp.setValue(val);;
					temp.setNext(this_iterator.getNext());
					this_iterator.setNext(temp);
					size++;
				}	
			}
		}
		public void addlast(Type val){
			if(first==null){
			first=new node();
			first.setValue(val);
			first.setNext(null);
			last=first;
			size=1;		
			}
			else{
				node temp=new node();
				temp.setValue(val);
				temp.setNext(null);
				last.setNext(temp);
				last=temp;
				size++;

				
			}
		}
		public Type removefirst ()throws ListEmptyException{
			if(first==null){
				throw new ListEmptyException();
			}
			else{
				Type val=first.getValue();
				first=first.getNext();
				size--;
				return val;
			}
		}
		public void remove (int index)throws ListIndexOutOfBoundsException,ListEmptyException{
			if(index>=size){
				throw new ListIndexOutOfBoundsException();
			}
			else if(index==0){
				removefirst();
			}
			else{
				node this_iterator=first;
					for(int i=0;i<index-1;i++){
						this_iterator=this_iterator.getNext();
					}
					this_iterator.setNext(this_iterator.getNext().getNext());
					size--;
			}
		}
		public boolean find(Type val){
			node iterator=first;
			while(iterator!=null){
				if(iterator.getValue()==val){
					iterator=iterator.getNext();
					return true;
				}
				
			}
			return false;
		}
		public Type max(){
			Type t=max(first,first.getValue());
			System.out.println("got"+ t);
			return t;
		}
		public Type max(node f,Type maxvalue){
			
			if(f==null){
				System.out.println("Null Pointer reached"+maxvalue);
				return maxvalue;
			}
			else{
				System.out.println(f.getValue()+" "+maxvalue);
				if(maxvalue.compareTo(f.getValue())<0){
					maxvalue=max(f.getNext(),f.getValue());
				}
				else{
					maxvalue=max(f.getNext(),maxvalue);	
				}
			}
				System.out.println("returning"+maxvalue);
			
			return maxvalue;
		}
		public void reverseIterative(){
			node previous, current,next;
			current=first;
			previous=null;
			while(current!=null){
				next=current.getNext();
				current.setNext(previous);
				previous=current;
				current=next;
				
			}
			first=last;
			last=previous;
		}
		public node reverseRecursive(node n){
			if(n==null) return null;
			if(n.getNext()==null) return n;
			node second=n.getNext();
		    node rest=reverseRecursive(second);
		    second.setNext(n);
		    n.setNext(null);
		    return rest;
		}
		public node getfirst(){
			return first;
		}
		public  void setfirst(node n){
			first=n;
		}
	}


