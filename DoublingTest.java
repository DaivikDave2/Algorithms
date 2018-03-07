import edu.princeton.cs.algs4.*;
public class DoublingTest{
	public static double timeTrial(int N){
	int MAX=100000;
	int[] a=new int[N];
	for (int i = 0; i < N; i++)
		a[i] = StdRandom.uniform(-MAX, MAX);
	Stopwatch timer = new Stopwatch();
	int cnt = ThreeSum.fastCount(a);
	return timer.elapsedTime();
	}
	public static void main(String[] args)
	{ // Print table of running times.
		double[] x=new double[7];
		double[] y=new double[7];
		for (int N = 250,i=0; N<=8000; N += N,i++)
		{ // Print time for problem size N.
			double time = timeTrial(N);
			System.out.println("time:"+time);
			x[i]=Math.log(time)/Math.log(2);
			y[i]=Math.log(N)/Math.log(2);
			StdOut.printf("%7d %5.1f\n", N, time);
		}
		System.out.println("calculated");
		for(int i=0;i<x.length-1;i++){
			System.out.println(x[i]+" "+y[i]);
			StdDraw.line(x[i],y[i],x[i+1],y[i+1]);
		}

	}
	
}