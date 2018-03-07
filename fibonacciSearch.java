public class fibonacciSearch{
	public static int search(int[] a,int val){
		int fibM=1,fibMm1=1,fibMm2=0;
		while(fibM<a.length){
			fibMm2=fibMm1;
			fibMm1=fibM;
			fibM=fibMm1+fibMm2;
		}
		int offset =-1;
		while(fibM>1){
			int i=Math.min(offset+fibMm2,a.length-1);
			
			if(a[i]<val){
				fibM=fibMm1;
				fibMm1=fibMm2;
				fibMm2=fibM-fibMm1;
				offset=i;
			}else if(a[i]>val){
				fibM=fibMm2;
				fibMm1=fibMm1-fibMm2;
				fibMm2=fibM-fibMm1;
			}else return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a=new int[args.length];
		int i=0;
		for(String val:args){
			a[i++]=Integer.parseInt(val);
		}
		System.out.println(search(a,53));
	}
	
}