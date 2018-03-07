import edu.princeton.cs.algs4.*;
public class Point2D1_2_1 {
	static Point2D values[];
	Point2D1_2_1(int n){
		values=new Point2D[n];
		for(int i=0;i<n;i++){
			values[i]=new Point2D(StdRandom.random(),StdRandom.random());
		}
	}
	static double minDistance(){
		double minimum=values[0].distanceTo(values[1]);
		for(int i=1;i<values.length;i++){
			for(int j=i+1;j<values.length;j++){
				if(i==j) continue;
				if(minimum>values[i].distanceTo(values[j])){
					minimum=values[i].distanceTo(values[j]);
				}
			}
		}
		return minimum;
	}

	public static void main(String[] args) {
			Point2D1_2_1 p=new Point2D1_2_1(Integer.parseInt(args[0]));
			System.out.println(p.minDistance());

	}
};