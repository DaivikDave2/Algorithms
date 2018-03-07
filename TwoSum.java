public class TwoSum{
	
	public static int count(int [] a){
		int count=0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]+a[j]==0){
					count++;
				}
			}
		}
		return count;
	}
	public static int fastCount(int a[]){
		int count=0;
		java.util.Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			if(binarysearch(a,-a[i])>i){
				count++;
			}
		}

		return count;
	}
	public static int binarysearch(int[] a,int val){
		int low=0;
		int high=a.length-1;
		while(high>=low){
			int mid=low +((high-low)/2);
			
			if(val==a[mid]){
				while(mid-1>=0 && a[mid-1]==a[mid]){
					mid--;
				}
				return mid;
			}else if(a[mid]<val){
				low=mid+1;
			}else if(a[mid]>val){
				high=mid-1;
			}
		}
		return -1;
	}
}