import edu.princeton.cs.algs4.*;
class GridAnimation{
  public static void main(String[] args){
    if(args.length == 0){
      System.out.println("Command line argument required");
      return;
    }
    int n=Integer.parseInt(args[0]);
    GridGenerator g= new GridGenerator();
    WeightedUnionUF w = new WeightedUnionUF(n*n);
    GridGenerator.Connection c[] = g.generate(n);
    StdDraw.setPenRadius(0.005);
    StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.setScale(-1,n+1);
    for(int i=0;i<n*n;i++){
      StdDraw.point(get_X(i,n),get_Y(i,n));
      StdDraw.text(get_X(i,n)-0.5,get_Y(i,n),Integer.toString(i));
    }
    StdDraw.setPenRadius(0.0025);
    StdDraw.setPenColor(StdDraw.RED);
    for(int i=0;i<c.length;i++){
      if(!w.connected(c[i].p,c[i].q)){
        w.union(c[i].p,c[i].q);
        StdDraw.line(get_X(c[i].p,n),get_Y(c[i].p,n),get_X(c[i].q,n),get_Y(c[i].q,n));
        StdDraw.pause(200);
      }
    }
  }
  public static int get_X(int p,int n){
    return p%n;
  }
  public static int get_Y(int p , int n){
    return p/n;
  }
}
