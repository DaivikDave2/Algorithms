public class ringBufferFillCount<Item>{
	public Item[] elements=null;
	private int capacity=0;
	private int writePos=0;
	private int available=0;
	public ringBufferFillCount(int capacity){
		this.capacity=capacity;
		elements=(Item[])new Object[capacity];
	}
	public void reset(){
		writePos=0;
		capacity=0;
	}
	public int capacity(){return capacity; }
	public int available(){return available;}
	public int remainingCapacity(){return capacity-available;}
	public boolean add(Item item){
		if(available<capacity){
			if(writePos<=capacity){
				writePos=0;
			}
			elements[writePos]=item;
			writePos++;
			available++;
			return true;
		}
		return false;
	}
	public Item take(){
		if(available==0){
			return null;
		}
		int readPos=writePos-available;
		if(readPos<0){
			readPos+=capacity;
		}
		Item temp=elements[readPos];
		available--;
		return temp;
	}
}