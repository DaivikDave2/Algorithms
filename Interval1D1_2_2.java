import edu.princeton.cs.algs4.*;
public class Interval1D1_2_2 {
	static Interval1D values[];
	Interval1D1_2_2(int n){
		values=new Interval1D[n];
		for(int i=0;i<n;i++){
			values[i]=new Interval1D(StdRandom.random(),StdRandom.random());
		}
	}
	static void printIntersect(){
		for(int i=0;i<values.length;i++){
			for(int j=i+1;j<values.length;j++){
				if(i==j) continue;
				if(values[i].intersects(values[j])){
					System.out.println(values[i]+" intersects "+values[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
			Interval1D1_2_2 p=new Interval1D1_2_2(Integer.parseInt(args[0]));
			printIntersect();

	}
};