public class Transactiondemo{
	public static void main(String[] args) {
		Transaction t=new Transaction("Daivik 4/12/2016 12:04:25");
		System.out.println("Seconds"+t.getSeconds());
		System.out.println("Minutes"+t.getMinutes());
	}
}