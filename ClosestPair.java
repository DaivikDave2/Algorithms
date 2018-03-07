public class ClosestPair{
	public static void main(String[] args) {
		int j=0;
		int[] a=new int[args.length];
		for(String arg:args){
			a[j++]=Integer.parseInt(arg);
		}
		java.util.Arrays.sort(a);
		int leastdiff=a[a.length-1];
		int diffIndex=a.length-1;
		for(int i=1;i<a.length;i++){
			if(a[i]==a[i-1]){
				leastdiff=0;
				diffIndex=i;
				break;
			}else if(a[i]-a[i-1]<leastdiff){
				leastdiff=a[i]-a[i-1];
				diffIndex=i;
			}
		}
		System.out.println(leastdiff+" "+diffIndex+" "+(diffIndex-1));
	}
}
