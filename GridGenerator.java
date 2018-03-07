import java.util.Random;
class GridGenerator{
  class Connection{
    public int p , q;
    Connection(int x , int y) {
      p = x;
      q = y;
    }
    public void print(){
      System.out.println(p +" -> " + q+" ");
    }
  }
  public static int get_connections_count(int n){
    return (4*(n-2)*(n-2))+(8)+(3*4*(n-2));
  }
  public  Connection[] generate(int n) {
    Connection[] connections = new Connection[get_connections_count(n)];
    for (int  i =0,k=0 ; i < n*n ; i++) {
      if( i - n >= 0 ){
        connections[k++] = new Connection(i , i - n);
      }
      if( i + n <(n * n) ){
        connections[k++] = new Connection(i , i + n);
      }
      if (!((i % n == 0) || (i == 0 ))){
        connections[k++] = new Connection(i , i - 1);
      }
      if (!((i+1) % n == 0)){
        connections[k++] = new Connection(i , i + 1);
      }
      
    }
    shuffle(connections);
    return connections;
  }
  public void shuffle(Connection[] c){
    int random;
    Random r = new Random();
    for(int i=0;i<c.length;i++){
      random=r.nextInt(c.length);
      Connection temp=c[random];
      c[random]=c[i];
      c[i]=temp;
    }
  }
  public static void main(String[] args) {
    GridGenerator g= new GridGenerator();
    if(args.length == 0){
      System.out.println("Command line argument required");
      return;
    }
    Connection c[] = g.generate(Integer.parseInt(args[0]));
    g.shuffle(c);
    for(int i=0;i<c.length;i++){
      c[i].print();
    }
  }
}
