import java.util.Random;
class ShellSortArray{
  public void sort(int[] values,int n){
    int[] gap=new int[getsize(n)];
    int k=1;
    int i=0;
    gap[i++]=k;
    while(k<n/3){
      k=k*3+1;
      gap[i++]=k;
    }
    for(int a=gap.length-1;a>=0;a--){
      for(int p=gap[a];p<values.length;p++){
        for(int q = p ; q>=gap[a] && values[q] < values[q-gap[a]];q-=gap[a]){
          int temp=values[q];
          values[q]=values[q-gap[a]];
          values[q-gap[a]]=temp;
        }
      }
    }
    /* for(int b=0;b<n;b++){
        System.out.print(values[b]+ " ");
        }*/
  }

  public void customIncrementSort(int[] values,int[] gap,int n){
    int max_index = 0;
    while((n/3) < gap[max_index] ) {
      max_index++;
    }
    for(int a=max_index;a>=0;a--){
      for(int p=gap[a];p<values.length;p++){
        for(int q = p ; q>=gap[a] && values[q] < values[q-gap[a]];q-=gap[a]){
          int temp=values[q];
          values[q]=values[q-gap[a]];
          values[q-gap[a]]=temp;
        }
      }
    }
    /*
    for(int b=0;b<n;b++){
        System.out.print(values[b]+ " ");
        }*/
  }
  public int getsize(int n){
    int size = 1;
    int k=1;
        while(k <n/3){
          k=k*3+1;
          size++;
        }
    return size;
  }
  public static void main(String[] args){
    ShellSortArray s = new ShellSortArray();
    int n = 128;
    int[] gap= { 1, 5, 19, 41, 109, 209, 505, 929, 2161, 3905, 8929,16001, 36289, 64769, 146305, 260609 };
    Random r = new Random();
    while(true) {
      int[] ar = new int[n];
      int[] cs = new int[n];
      for(int i = 0; i<n ; i++){
      ar[i] = cs[i]=  r.nextInt(); 
      }
      long starttime=System.currentTimeMillis();
      s.sort(ar,n);
      long endtime = System.currentTimeMillis();
      long artime= endtime - starttime;
      starttime=System.currentTimeMillis();
      s.customIncrementSort(cs,gap,n);
      endtime = System.currentTimeMillis();
      long cstime= endtime - starttime;
      System.out.println(n+" : "+((double)cstime/artime));
      n*=2;
    }
  } 
}
