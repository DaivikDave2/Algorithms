public class rational {
	long numerator,denominator;
	rational(){

	}
	rational(long numerator,long denominator){
		this.numerator=numerator;
		this.denominator=denominator;
	}
	public String value(){
		return numerator+"/"+denominator;
	}
	public void rationalise(){
		long divisor=numerator<denominator?numerator:denominator;
		long divident=numerator>denominator?numerator:denominator;
		long common=gcd(divisor,divident);
		numerator/=common;
		denominator/=common;
		
	}
	long gcd(long divisor,long divident){
		while(divisor!=0){
			long remainder=divident%divisor;
			divident=divisor;
			divisor=remainder;
		}
		return divident;
	}
	long lcm(long first,long second){
		return (first*second)/(first<second?gcd(first,second):gcd(second,first));
	}
	rational add(rational another){
		rational result=new rational();
		result.denominator=lcm(denominator,another.denominator);
		result.numerator=(numerator*(result.denominator/denominator))+(another.numerator*(result.denominator/another.denominator));
		//result.rationalise();
		return result;
	}

	rational substract(rational another){
		rational result=new rational();
		result.denominator=lcm(denominator,another.denominator);
		result.numerator=(numerator*(result.denominator/denominator))-(another.numerator*(result.denominator/another.denominator));
		//result.rationalise();
		return result;
	}
	rational multiply(rational another){
		rational result=new rational();
		result.numerator=numerator*another.numerator;
		result.denominator=denominator*another.denominator;
		result.rationalise();
		return result;
	}
	rational divide(rational another)
	{
		rational result=new rational();
		result.numerator=numerator*another.denominator;
		result.denominator=denominator*another.numerator;
		result.rationalise();
		return result;
	}

	
}