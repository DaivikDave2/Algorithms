class StringQueueDemo{
	public static void main(String[] args) {
		ResizingArrayQueueofStrings rq=new ResizingArrayQueueofStrings(5);
		for(int i=0;i<10;i++){
			rq.enqueue(Integer.toString(i));
			if(rq.isFull()){
				System.out.println("full after"+i);
			}
		}
		while(!rq.isEmpty()){
			try{
			System.out.println(rq.dequeue());}
			catch(QueueEmptyException e){
				System.out.println(e);
			}
		}
	}
}