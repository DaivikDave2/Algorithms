import java.util.Random;
public class Equalkeys {
  public <Type extends Comparable>  void shuffle(Type[] t) {
    Random r = new Random();
    for(int i=0;i<t.length;i++) {
      int index = r.nextInt(t.length);
      Type temp = t[index];
      t[index] = t[i];
      t[i] = temp;
    }
    
  }
  public static void main(String args[]) throws InterruptedException {
    int n = 128;
    Random r = new Random();
    while(true) {
      Double[] in = new Double[n];
      Double[] se = new Double[n];
      for(int i = 0; i<n ; i++){
        if(i%2 ==0){
          in[i] = 0.0;
        }else {
          in[i] = 1.0;
        }
      }
      Equalkeys e = new Equalkeys();
      e.shuffle(in);
      for(int i = 0; i<n ; i++){
        se[i] = in[i];
      }
      InsertionSort IN= new InsertionSort();
      SelectionSort SE = new SelectionSort();
      long starttime=System.currentTimeMillis();
      IN.sort(in,n);
      long endtime = System.currentTimeMillis();
      long insertiontime= endtime - starttime;
      starttime=System.currentTimeMillis();
      SE.sort(se,n);
      endtime = System.currentTimeMillis();
      long selectiontime= endtime - starttime;
      System.out.println(n+" : "+((double)selectiontime/insertiontime));
      n*=2;
    }  
  }
  
}
