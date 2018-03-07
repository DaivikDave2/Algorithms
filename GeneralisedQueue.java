class GeneralisedQueue<Item>{
	final static double RATIO=0.75;
	Item values[];
	int front,rear;
	GeneralisedQueue(){
		values=(Item[])new Object[5];
		front=-1;
		rear=-1;
	}
	GeneralisedQueue(int n){
		values=(Item[])new Object[5];
		front=-1;
		rear=-1;
	}
	GeneralisedQueue(GeneralisedQueue<Item> q){
		values=(Item[])new Object[q.values.length];
		for(int i=q.front;i<=q.rear;i++){
			values[i]=q.values[i];
		}
		front=q.front;
		rear=q.rear;
	}
	public void add(Item i){
		if(rear>=RATIO*values.length && front>=(1-RATIO)*values.length){
			shiftTofront();
		}else if(rear>=RATIO*values.length){
			resize();
		}else{
			values[++rear]=i;
		}
	}
	public Item remove(int k) throws ArrayIndexOutOfBoundsException{
		if(k>rear || k<=front){
			throw new ArrayIndexOutOfBoundsException();
		}else{
			Item val=values[k];
			for(int i=k;i<rear;i++){
				values[i]=values[i+1];
			}
			rear--;
			return val;
		}
	}
	public void shiftTofront(){
		for(int i=front+1;i<=rear;i++){
			values[i-front-1]=values[i];
		}
		rear=rear-front-1;
		front=-1;
	}
	public void resize(){
		Item[] temp=values;
		values=(Item[] )new Object[temp.length*2];
		for(int i=front+1,j=0;i<=rear;i++,j++){
			values[j]=values[i];
		}
		rear=rear-front-1;
		front=-1;

	}
}