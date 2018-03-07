public class bitonicSearch{
	public static int findMax(int[] elements){
		int low=0;
		int high=elements.length-1;
		int mid;
		while (low<=high){
			mid=(low+high)/2;
			if((mid-1<0 ||elements[mid]>=elements[mid-1] ) &&  (mid+1>elements.length-1 || elements[mid]>=elements[mid+1])){
				int i=mid,j=mid;
				while(i>0  && elements[i-1]==elements[i]){
					i--;
				}
				while(j<elements.length-1 && elements[j]==elements[j+1]){
					j++;
				}
				if(i>0 &&  j<elements.length-1 && elements[i-1]<elements[mid] && elements[j+1]<elements[mid]){
					return j;
				}else{
					if(elements[j+1]>=elements[mid]){
						low=j+1;
					}else{
						high=i-1;
					}
				}

			}else if(elements[mid+1]>elements[mid]){
				low=mid+1;
			}else{
				high=mid-1;
			}
		}
		return -1;
	}
	public static int binarySearch(int[] a,int val,int low,int high){
		int mid;
		while(low<=high){
			mid=(high+low)/2;
			if(a[mid]==val){
				return mid;
			}else if(a[mid]>val){
				high=mid-1;
			}else{
				low=mid+1;
			}
		}
		return -1;
	}
	public  static int binarySearch(int[] a, int val){
		int max=findMax(a);
		int index=binarySearch(a,val,0,max);
		if(index>0){
			return index;
		}
		index=binarySearch(a,val,max+1,a.length-1);
		if(index>0){
			return index;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a=new int[args.length];
		int i=0;
		for(String val:args){
			a[i++]=Integer.parseInt(val);
		}
		System.out.println(binarySearch(a,53));
	}
}
