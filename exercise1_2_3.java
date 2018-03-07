 import libraries.StdRandom;
 import java.lang.*;
public class exercise1_2_3 {
	static Interval2D values[];
	exercise1_2_3(int N,int min,int max){
	StdDraw.rectangle(1,1,5,10);
		/*
		values=new Interval2D[N];
		StdDraw.setXscale(0, N);
		StdDraw.setYscale(0, max);
		StdDraw.setPenRadius(.005);
		for(int i=0;i<N;i++){
			double x1=StdRandom.uniform(min,max);
			double y1=StdRandom.uniform(min,max);
			double x2=StdRandom.uniform(min,max);
			double y2=StdRandom.uniform(min,max);
			Interval1D x=new Interval1D(x1,y1);
			Interval1D y=new Interval1D(x2,y2);
			values[i]=new Interval2D(x,y);
			StdDraw.rectangle(x1,y1,Math.abs(x2-x1),Math.abs(y2-y1));

		}
	*/
}
	public static void main(String[] args) {
		exercise1_2_3 x=new exercise1_2_3(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
		}
	
};