import edu.princeton.cs.algs4.*;
import java.util.Queue;
import java.util.LinkedList;
public class Transaction implements Comparable<Transaction> {
  private int amount;
  public Transaction(){
    amount = 0;
  }
  public Transaction(int amount) {
    this.amount = amount;
  }
  public Transaction[] readTransactions() {
    Queue<Transaction> q = new LinkedList<>();
    while(!StdIn.isEmpty()){
      q.add(new Transaction(StdIn.readInt()));
    }
    Transaction[] t = new Transaction[q.size()];
    int size=q.size();
    for(int i = 0 ;i< size;i++) {
      t[i]=q.remove();
    }
    return t;
  }
  public int compareTo(Transaction t) {
    if (amount < t.amount) return -1;
    if (amount > t.amount) return 1;
    return 0;
   }
  public String toString(){
    return String.valueOf(amount);
  }
}
