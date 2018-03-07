import java.util.Iterator;
class RandomQueue<Item> implements Iterable<Item>{
	final static double RATIO=0.75;
	private int size,top;
	Item values[];
	RandomQueue(){
		values=(Item[])new Object[5];
		top=-1;
	}
	public boolean isEmpty(){
		return top<0;
	}
	public void enqueue(Item item){
		if(top>=RATIO*values.length){
			resize();
		}
		values[++top]=item;
	}
	Item dequeue() throws QueueEmptyException{
		int r=(int)(Math.random()*top);
		if(top<=-1){
			throw new QueueEmptyException();
		}
		Item temp=values[r];
		values[r]=values[top];
		top--;
		return temp;
	}
	Item sample() throws QueueEmptyException{
		int r=(int)(Math.random()*top);
		if(top<0){
			throw new QueueEmptyException();
		}
		while(r<top){
			r=(int)(Math.random()*top);
		}
		return values[r];
	}
	private void resize(){
		Item []temp=values;
		values=(Item[]) new Object[temp.length*2];
		for(int i=0;i<top;i++){
			values[i]=temp[i];
		}
	}
	public Iterator<Item> iterator(){
		return new RandomQueueIterator();
	}

	class RandomQueueIterator implements Iterator <Item> {
		public boolean hasNext(){
			if(!isEmpty()){
				return true;
			}else{
				return false;
			}
		}
		public Item next() {
			Item sampl=null;
			try{
			 sampl=sample();
			}catch(QueueEmptyException e){
				sampl=null;
			}
			return sampl;
		} 
		public void remove()throws UnsupportedOperationException{
			throw new UnsupportedOperationException();
		}
	} 

}