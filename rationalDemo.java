public class rationalDemo{
	public static void main(String[] args) {
		rational first=new rational(12,16);
		rational second=new rational(5,8);
		System.out.println("Sum is "+first.add(second).value());
		System.out.println("substraction is "+first.substract(second).value());
		System.out.println("mul is is "+first.multiply(second).value());
		System.out.println("division is "+first.divide(second).value());
	}
}