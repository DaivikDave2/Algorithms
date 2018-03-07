public class ThreeSum
{
	public static int count(int[] a)
	{ // Count triples that sum to 0.
		int N = a.length;
		int cnt = 0;
		for (int i = 0; i < N; i++)
			for (int j = i+1; j < N; j++)
				for (int k = j+1; k < N; k++)
					if (a[i] + a[j] + a[k] == 0)
						cnt++;
		return cnt;
	}
	public static int fastCount(int[] a)
	{ // Count triples that sum to 0.
		int N = a.length;
		int cnt = 0;
		java.util.Arrays.sort(a);
		for (int i = 0; i < N; i++)
			for (int j = i+1; j < N; j++){
				if(java.util.Arrays.binarySearch(a,-(a[i]+a[j]))>j){
					cnt++;
				}
			}
		return cnt;
	}
	public static void main(String[] args)
	{	int i=0;
		int[] a=new int[args.length];
		for(String arg:args){
			a[i++]=Integer.parseInt(arg);
		}
		System.out.println(fastCount(a));
	}
}