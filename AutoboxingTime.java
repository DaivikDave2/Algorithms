public class AutoboxingTime{
	static long[] a;
	static Long[] b;

	AutoboxingTime(int n){
		a=new long[n];
		b=new Long[n];
		java.util.Random r = new java.util.Random(); 
		long temp;
		for(int i=0;i<n;i++){
			temp=r.nextLong();
			a[i]=temp;
			b[i]=temp;
		}
	}
	public static long countlongElapsedTime(){
		long sum=0;
		long startTime=System.currentTimeMillis();
		int n=a.length;
		for(int i=0;i<n;i++){
			sum+=a[i];
		}
		long endTime=System.currentTimeMillis();
		return endTime-startTime;		
	}
	public static long countLongElapsedTime(){
		long sum=0;
		long startTime=System.currentTimeMillis();
		int n=a.length;
		for(int i=0;i<n;i++){
			sum+=b[i];
		}
		long endTime=System.currentTimeMillis();
		return endTime-startTime;		
	}
	
	public static void main(String[] args) {
		AutoboxingTime timer;
		for(int i=1;;i*=2){
			System.gc();
			timer=new AutoboxingTime(i);
			System.out.println(i+" : "+(countLongElapsedTime()-countlongElapsedTime()));
		}
	}
}