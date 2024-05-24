package kr.or.kosa;

public class Factorial {
	static public long factorialUsingForLoop(int n) throws NegativeValueException {
		
		if (n < 0) throw new NegativeValueException();
		
	    long fact = 1;
	    
	    for (int i = 2; i <= n; i++) {
	        fact = fact * i;
	    }
	    
	    return fact;
	}
}
