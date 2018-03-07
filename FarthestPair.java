public class FarthestPair{
	public static void main(String[] args) {
		int i=0;
		int[] a=new int[args.length];
		for(String arg:args){
			a[i++]=Integer.parseInt(arg);
		}
		int min=0;
		int max=0;
		for(int j=1;j<a.length;j++){
			if(a[min]>a[j]){
				min=j;
			}
			if(a[max]<=a[j]){
				max=j;
			}
		}
		System.out.println(min+" "+max);
	}
}