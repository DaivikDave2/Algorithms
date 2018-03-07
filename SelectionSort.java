import edu.princeton.cs.algs4.*;
import java.util.Random;
public class SelectionSort{
  public <Type extends Number & Comparable> void draw (Type[] values,int n) throws InterruptedException {
     StdDraw.setPenRadius(0.0125);
    
     StdDraw.setPenColor(StdDraw.BLACK);
     StdDraw.setXscale(-1,n+1);
     Type max =values[0];
    for(int i=0;i<n;i++) {
      if(max.compareTo(values[i]) < 0){
        max = values[i];
      }
    }
    StdDraw.setYscale(-1,max.doubleValue()+6);
    for(int i=0;i<n;i++) {
      int min = i;
      for(int j=i;j<n;j++) {
        if(values[j].compareTo(values[min]) < 0) {
          min = j;
        }
        
      }
      StdDraw.clear();
        for(int b=0;b<n;b++){
          if(b<i){
            StdDraw.setPenColor(StdDraw.GRAY);
          }else if(b == min){
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.text(b,(values[b]).doubleValue()+2,"min");
          }else {
            StdDraw.setPenColor(StdDraw.BLACK);
          }
          /* if(j == b){
            StdDraw.text(b,(values[b]).doubleValue()+1,"*");
        
            }*/
          StdDraw.line(b,0,b,(values[b]).doubleValue());
         }
        Thread.sleep(1000);
      Type temp=values[min];
      values[min]=values[i];
      values[i]=temp;
      
    }
    
  }
  public <Type extends Number & Comparable> void sort (Type[] values,int n) throws InterruptedException {
    for(int i=0;i<n;i++) {
      int min = i;
      for(int j=i;j<n;j++) {
        if(values[j].compareTo(values[min]) < 0) {
          min = j;
        }
        
      }
      Type temp=values[min];
      values[min]=values[i];
      values[i]=temp;
      
    }
    
  }
  public static void main(String args[]) throws InterruptedException{
    Random r = new Random();
    int n=20;
    System.out.println(n);
    Integer[] a=new Integer[n];
    for(int i=0;i<n;i++){
      a[i]=r.nextInt(20)+5;
    }
    SelectionSort s= new SelectionSort();
    s.sort(a,a.length);
    }
 
    
}
