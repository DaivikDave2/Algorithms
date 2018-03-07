public class visualCounter {
	int counter,noOfOperations;
	final int max,N;
	visualCounter(int N,int max){
		counter=0;
		this.max=max;
		this.N=N;
		noOfOperations=0;
		StdDraw.setXscale(0,N);
		StdDraw.setYscale(max*-1,max);
		StdDraw.setPenRadius(0.005);
	}
	public void increment(){
		if(counter<max && noOfOperations<N){
			counter++;
			noOfOperations++;
			StdDraw.setPenColor(StdDraw.DARK_GRAY);
			StdDraw.point(noOfOperations,counter);
		}
		else{
			System.out.print("You have reached the end of trial version please buy the software");
		}
	}
	public void decrement(){
		if(noOfOperations<N){
			counter--;
			noOfOperations++;
			StdDraw.setPenColor(StdDraw.DARK_GRAY);
			StdDraw.point(noOfOperations,counter);
		}
		else{
			System.out.print("You have reached the end of trial version please buy the software");
		}
	}
	public static void main(String[] args) {
	visualCounter v=new visualCounter(20,20);
	for(int i=0;i<20;i++){
		if (StdRandom.bernoulli(0.5)) v.increment();
else v.decrement();
	}	
	}
}