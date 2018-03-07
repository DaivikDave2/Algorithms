
import edu.princeton.cs.algs4.*;
class kthElement{
	public static void main(String[] args) {
		int QueueLength=1;
		ResizingArrayQueueofStrings  rq=new ResizingArrayQueueofStrings(Integer.parseInt(args[0]));
		while(!StdIn.isEmpty()){
			QueueLength++;
			rq.enqueue(StdIn.readString());
		}

		int k=Integer.parseInt(args[0]);
		int popvalue=QueueLength-k;{
			if(popvalue<=0){
				System.out.println("The value of n has exceeded QueueSize");

			}
			else{
				try{
				for(int i=0;i<popvalue-1;i++){
					
						rq.dequeue();
					
					
				}
				System.out.println(rq.dequeue()+" is the value.");
			}
			catch(QueueEmptyException e){
				System.out.println("Something went wrong");
			}
			}

		}
	}
}