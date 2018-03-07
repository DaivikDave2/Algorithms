public class TwoSumDemo{
	public static void main(String[] args) {
		if(args.length<=0){
			System.out.println("Usage :javac TwoSumDemo.java [numbers list]");
			return;
		}
		int[] a=new int[args.length];
		for(int i=0;i<args.length;i++){
			a[i]=Integer.parseInt(args[i]);
		}
		System.out.println(TwoSum.fastCount(a));
	}
}