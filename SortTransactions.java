public class SortTransactions {
  public static void main(String args[]) {
    InsertionSort in = new InsertionSort();
    Transaction t = new Transaction();
    Transaction[] values = t.readTransactions();
    
    in.sort(values,values.length);
    
  }
}
