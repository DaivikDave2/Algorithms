import edu.princeton.cs.algs4.*;
import java.util.Random;
public class InsertionSort {
  public <Type extends  Number & Comparable> void animate (Type[] values ,int n) throws InterruptedException {
     StdDraw.setPenRadius(0.0125);
    
     StdDraw.setPenColor(StdDraw.BLACK);
     StdDraw.setXscale(-3,n+1);
     Type max =values[0];
    for(int i=0;i<n;i++) {
      if(max.compareTo(values[i]) < 0){
        max = values[i];
      }
    }
    StdDraw.setYscale(-1,max.doubleValue()+6);
    int j;
    for(int i = 1 ; i < n; i++) {
      Type current = values[i];
      for(j = i ; j > 0 && current.compareTo(values[j-1]) < 0 ; --j){
        /*  StdDraw.clear();
        StdDraw.line(-2,0,-2,current.doubleValue());
        StdDraw.text(-2,current.doubleValue(),"current");
        for(int b = 0 ; b < n ; b++){
          StdDraw.line(b,0,b,values[b].doubleValue());
        }
        Thread.sleep(1000);
        */
        values[j] = values[j-1];
        StdDraw.clear();
        StdDraw.line(-2,0,-2,current.doubleValue());
        StdDraw.text(-2,current.doubleValue(),"current");
        
        for(int b = 0 ; b < n ; b++){
          if(b == j){
            StdDraw.setPenColor(StdDraw.GREEN);
          }else if(b == j-1){
            StdDraw.setPenColor(StdDraw.WHITE);
          
          }
          else{
              StdDraw.setPenColor(StdDraw.BLACK);
          
          }
          StdDraw.line(b,0,b,values[b].doubleValue());
        }
        Thread.sleep(1000);
      }
      values [j] = current;
      StdDraw.clear();
      StdDraw.line(-2,0,-2,current.doubleValue());
        StdDraw.text(-2,current.doubleValue(),"current");
      for(int b = 0 ; b < n ; b++){
          if(b == j){
            StdDraw.setPenColor(StdDraw.BLUE);
          }else{
              StdDraw.setPenColor(StdDraw.BLACK);
          
          }
          StdDraw.line(b,0,b,values[b].doubleValue());
        }
        Thread.sleep(1000);
    }
    
    System.out.println();
  }
  public <Type extends Comparable> void sort (Type[] values ,int n)  {
    int j;
    for(int i = 1 ; i < n; i++) {
      Type current = values[i];
      for(j = i ; j > 0 && current.compareTo(values[j-1]) < 0 ; --j){
        values[j] = values[j-1];
      }
      values [j] = current;
    }
    /*
    for(int i = 0 ; i < n; i++) {
      System.out.print(values[i]+" ");
      }
    System.out.println();
    */
  }

  public  void sort (int[] values ,int n)  {
    int j;
    for(int i = 1 ; i < n; i++) {
      int current = values[i];
      for(j = i ; j > 0 && current < values[j-1]  ; --j){
        values[j] = values[j-1];
      }
      values [j] = current;
    }
    /*
    for(int i = 0 ; i < n; i++) {
      System.out.print(values[i]+" ");
      }
    System.out.println();
    */
  }
  
  public <Type extends Comparable> void sortWithSentinel (Type[] values ,int n)  {
    int j;
    int min = 0;
    for(int i = 1 ;i < n ; i++) {
      if(values [min].compareTo( values [i]) > 0  ){
        min = i;
      }
    }
    Type temp = values[min];
    values[min] = values[0];
    values[0] = temp;
    for(int i = 1 ; i < n; i++) {
      Type current = values[i];
      for(j = i ; current.compareTo(values[j-1]) < 0 ; --j){
        values[j] = values[j-1];
      }
      values [j] = current;
    }
    /*
    for(int i = 0 ; i < n; i++) {
      System.out.print(values[i]+" ");
    }
    System.out.println();
    */
  }

  public <Type extends Comparable> void sortWithExchange (Type[] values ,int n)  {
    int j;
    
    for(int i = 1 ; i < n; i++) {
      for(j = i ;j>0 && values[j].compareTo(values[j-1]) < 0 ; --j){
        Type temp = values[j];
        values[j] = values[j-1];
        values[j-1] = temp;
      }
      
    }
    /*
    for(int i = 0 ; i < n; i++) {
      System.out.print(values[i]+" ");
    }
    System.out.println();
    */
  }
  
  public static void main(String args[]) throws InterruptedException{
    Random r = new Random();
    int n=256;
    while(true) {
      Integer[] a=new Integer[n];
      Integer[] b=new Integer[n]; 
      for(int i=0;i<n;i++){
        a[i]=r.nextInt(20)+5;
        b[i] = a[i];
      }
      InsertionSort s= new InsertionSort();
      long starttime=System.currentTimeMillis();
      s.sort(a,n);
      long endtime= System.currentTimeMillis();
      long elapsed=endtime-starttime;
      starttime=System.currentTimeMillis();
      s.sortWithExchange(b,n);
      endtime= System.currentTimeMillis();
      long elapsedsentinel=endtime - starttime;
      System.out.println(n+" : "+((double)elapsedsentinel/elapsed)+" : ");
      n*=2;
    }
    /*  Integer[] a=new Integer[n];
    for(int i=0;i<n;i++){
       a[i]=r.nextInt(20)+5;
      
    }
    InsertionSort s= new InsertionSort();
    s.sort(a,a.length);
    */
    }
 
}
