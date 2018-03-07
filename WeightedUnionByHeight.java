public class WeightedUnionByHeight{
	static int[] values;
	static int[] height;
	WeightedUnionByHeight(int N){
		values=new int[N];
		height=new int[N];
		for(int i=0;i<N;i++){
			values[i]=i;
			height[i]=1;
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
                  if(height[rootP] == height[rootQ]){
                    values[rootP] = rootQ;
                    height[rootQ] = height[rootP] + 1;
                  }else if(height[rootP]<height[rootQ]){
                    values[rootP]=rootQ;
                  }else{
                    values[rootQ]=rootP;
                  }
                }
                System.out.println(p+" and "+ q+" " + height[find(p)]+ " " + height[find(q)]);
                
	}
	public static boolean connected(int p,int q){
		return find(p)==find(q);
	}

	public static void main(String[] args) {
		WeightedUnionByHeight union=new WeightedUnionByHeight(10);
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
