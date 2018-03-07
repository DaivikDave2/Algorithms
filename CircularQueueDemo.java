import edu.princeton.cs.algs4.*;
class CircularQueueDemo{
	public static void main(String[] args) {
		CircularQueue<Integer> cq=new CircularQueue<Integer>();
		
		for (int i=0;i<15;i++){
			cq.enqueue(i);
		}
		for(int j:cq){
			StdOut.print(j+" ");
		}
		StdOut.println("Dequeueing");
		try{
			while(!cq.isEmpty()){
			StdOut.print(cq.dequeue()+" ");
			}
		}catch(QueueEmptyException e){
			StdOut.println("Queue Empty"+e);
		}
		
	}
}