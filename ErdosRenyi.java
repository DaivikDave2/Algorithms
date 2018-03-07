import java.util.Random;
public class ErdosRenyi{
  static  WeightedUnionUF w;
  public static int count(int n){
    w = new WeightedUnionUF(n);
    int count=0;
    Random r = new Random();
    while(!connected(n)){
      int i = r.nextInt(n);
      int j = r.nextInt(n);
      if(!w.connected(i,j)) {
        w.union(i,j);
        //  System.out.println("connecting"+ i + " " + j);
        
      }
      count++;
    }
    return count;
  }
  public static boolean connected(int n) {
    for(int i=1;i<n;i++) {
      if(!w.connected(0,i)) {
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args){
    /* if(args.length == 0) {
      System.out.println("Command line argument missing . Usage java ErdosRenyi n");
      return;
    }
    
    System.out.println("count is :" +count(Integer.parseInt(args[0])));
    */
    int n=2;
    while(true) {
      System.out.println(n+"count is :" +count(n)+" 1/2 n ln n is :"+(0.5*n*Math.log(n)));
      n*=2;
    }
  }
}
