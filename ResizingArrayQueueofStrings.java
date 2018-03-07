class ResizingArrayQueueofStrings{
	private int first,last,size;
	private String values[];
	ResizingArrayQueueofStrings(int size){
		first=-1;
		last=-1;
		this.size=size;
		values=new String[size];
	}
	public void enqueue(String s){
		if(!isFull()){
			values[++last]=s;
		}
		else{
			String[] temp=new String[size*2];
			for(int i=0;i<size;i++){
				temp[i]=values[i];
			}
			values=temp;
			values[++last]=s;
			size*=2;
		}
	}
	public String dequeue() throws QueueEmptyException{
	if(first==(size/2)){
			for(int i=first;i<last;i++){
				values[i-first]=values[i];
			}
			last=last-first-1;
			first=-1;
			
		}
		if(!isEmpty()){
		return values[++first];
		}
		else{
		throw new QueueEmptyException();
		}
		
	}
	public boolean isEmpty(){
		return (first>=last);
	}
	public boolean isFull(){
		return (last>=size-1);
	}
}