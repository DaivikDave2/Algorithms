public class QuickUnionUF{
	static int[] values;
	QuickUnionUF(int N){
		values=new int[N];
		for(int i=0;i<N;i++){
			values[i]=i;
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
                //path compression
                if(rootP!=rootQ){
			values[rootP]=rootQ;
		}
	}
	public static boolean connected(int p,int q){
		return find(p)==find(q);
	}

	public static void main(String[] args) {
		QuickUnionUF union=new QuickUnionUF(10);
		union(4,3);
		union(3,8);
		union(6,5);
		union(9,4);
		union(2,1);
		union(8,9);
		union(5,0);
		union(7,2);
		union(6,1);
		System.out.println(connected(4,5));
	}
}
