public class WeightedUnionUF{
	static int[] values;
	static int[] weights;
	WeightedUnionUF(int N){
		values=new int[N];
		weights=new int[N];
		for(int i=0;i<N;i++){
			values[i]=i;
			weights[i]=1;
		}
	}
	public static int find(int p){
		while(p!=values[p]){
			p=values[p];
		}	
		return p;
	}
	public static void union(int p,int q){
		int rootP=find(p);
		int rootQ=find(q);
		if(rootP!=rootQ){
			if(weights[rootP]<weights[rootQ]){
				int prev;
				while(p!=rootP){
					prev=values[p];
					values[p]=rootQ;
					p=prev;
				}
				values[rootP]=rootQ;
				weights[rootQ]+=weights[rootP];
			}else{
				int prev;
				while(q!=rootQ){
					prev=values[q];
					values[q]=rootP;
					q=prev;
				}
				values[rootQ]=rootP;
				weights[rootP]+=weights[rootQ];
			}
		}
		

	}
	public static boolean connected(int p,int q){
		return find(p)==find(q);
	}

	public static void main(String[] args) {
		WeightedUnionUF union=new WeightedUnionUF(10);
		union(4,3);
		union(3,8);
		union(6,5);
		union(9,4);
		union(2,1);
		union(8,9);
		union(5,0);
		union(7,2);
		union(6,1);
		System.out.println(connected(4,8));
	}
}
