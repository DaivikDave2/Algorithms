import edu.princeton.cs.algs4.*;
import java.util.Random;
public class PrimitiveTest {
  
  public static void main(String args[]) {
    Random r = new Random();
    int n=256;
    while(true) {
      Integer[] a=new Integer[n];
      int[] b=new int[n]; 
      for(int i=0;i<n;i++){
        a[i]=r.nextInt(20)+5;
        b[i] = a[i];
      }
      InsertionSort s= new InsertionSort();
      long starttime=System.currentTimeMillis();
      s.sort(b,n);
      long endtime= System.currentTimeMillis();
      long elapsed=endtime-starttime;
      starttime=System.currentTimeMillis();
      s.sort(a,n);
      endtime= System.currentTimeMillis();
      long elapsedautoboxed=endtime - starttime;
      System.out.println(n+" : "+((double)elapsedautoboxed/elapsed)+" : ");
      n*=2;
    }
    /*  Integer[] a=new Integer[n];
    for(int i=0;i<n;i++){
       a[i]=r.nextInt(20)+5;
      
    }
    PrimitiveTest s= new PrimitiveTest();
    s.sort(a,a.length);
    */
    }
 
}
