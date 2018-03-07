public class DoublingTime{
	public static double ratio(int N){
		int a[]=new int [N];
		java.util.Random r=new java.util.Random();
		for(int i=0;i<N;i++){
			a[i]=r.nextInt();
		}
		long starttime1=System.currentTimeMillis();
		int cnt=0;
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				for (int k = 0; k < N; k++)
					if (i < j && j < k)
						if (a[i] + a[j] + a[k] == 0)
							cnt++;

		long endtime1=System.currentTimeMillis();
		long starttime2=System.currentTimeMillis();
		int cnt1=0;
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				for (int k = 0; k < N; k++)
					if (a[i] + a[j] + a[k] == 0)
							cnt1++;

		long endtime2=System.currentTimeMillis();
		if(cnt!=cnt1){
			System.out.println("Count Mismatch : "+cnt+" "+cnt1);
		}
		return (endtime2-starttime2)/(endtime1-starttime1);
	}
	public static void main(String[] args) {
		for(int i=250;;i*=2){
			System.out.println(i+" "+ratio(i));
		}
	}
}