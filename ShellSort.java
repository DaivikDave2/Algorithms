import edu.princeton.cs.algs4.*;
import java.util.Random;
public class ShellSort{
  public <Type extends Comparable<Type>> void sort(Type[] values, int n) {
    int k=1;
   
    while(k<n/3) k=3*k+1;
    while(k>=1){
      // int count=0;
      for(int i=k;i<n;i++){
        for(int j=i;j>=k && values[j].compareTo(values[j-k]) < 0 ;j-=k){
          Type temp =values[j];
          values[j]= values[j-k];
          values[j-k] = temp;
          //  count++;
         
        }
      }
      // System.out.println("for"+n+" : "+count/n);
      k=k/3;
    }
     
    System.out.println();
  }
  public static void main(String[] args){
    ShellSort s = new ShellSort();
    int start_n=100;
    while(true) {
      s.sort(s.generate(start_n),start_n);
      start_n*=10;
    }
  }
  public Double[] generate(int n){
    Double[] d=new Double[n];
    Random r=new Random();
    for(int i=0;i<n;i++) {
      d[i]=r.nextDouble();
    }
    return d;
  }
  public<Type extends Comparable> boolean check(Type[] t,int n){
    Type[] backup=(Type[])new Object[n];
    for(int i=0;i<n;i++){
      backup[i]=t[i];
    }
    ShellSort s=new ShellSort();
    s.sort(backup,n);
    for(int i=1;i<n;i++) {
      if(backup[i].compareTo(backup[i-1])>0){
        return false;
      }
    }
    return true;
  }
}
