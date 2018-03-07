public class QuickFindUF{
	static int[] values;
	QuickFindUF(int N){
		values=new int[N];
		for(int i=0;i<N;i++){
			values[i]=i;
		}
	}
	public static int find(int p){
		return values[p];
	}
	public static void union(int p,int q){
		int rootP=find(p);
		int rootQ=find(q);
		if(rootP!=rootQ){
			for(int i=0;i<values.length;i++){
				if(values[i]==rootP){
					values[i]=rootQ;
				}
			}	
		}
		

	}
	public static boolean connected(int p,int q){
		return find(p)==find(q);
	}

	public static void main(String[] args) {
		QuickFindUF union=new QuickFindUF(10);
		union(4,3);
		union(3,8);
		union(6,5);
		union(9,4);
		union(2,1);
		union(8,9);
		union(5,0);
		union(7,2);
		union(6,1);
		System.out.println(connected(4,1));
	}
}