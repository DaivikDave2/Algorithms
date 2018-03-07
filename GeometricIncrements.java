import java.util.Random;
public class GeometricIncrements {
  public static void main(String args[]) {
    if(args.length <= 0){
      System.out.println("Usage with args");
      return;
    }
    Random r = new Random();
    int n = Integer.parseInt(args[0]);
    Double[] d = new Double[n];
    for(int i = 0;i<n;i++) {
      d[i] = r.nextDouble();
    }
    ShellSortArray s = new ShellSortArray();
    for(int t = 100 ; t<=10000 ; t*=2) {
      long starttime = System.currentTimeMillis();
      long endtime = System.currentTimeMillis();
      long time = endtime - starttime;
    }
  }
  public  static <Type extends Comparable>  Type[] copy(Type[] val) {
    Type[] temp =(Type[]) new Object[val.length];
    for ( int i = 0 ; i < val.length ; i++ ) {
      temp [i] = val[i];
    }
    return temp;
  }
}
