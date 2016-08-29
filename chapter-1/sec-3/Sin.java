/******************************************************************************
 *  Compilation:  javac Sin.java
 *  Execution:    java Sin x
 *  
 *  Prints out sin(x) using Taylor expansion.
 *  
 *     sin x = x - x^3/3! + x^5/5! - x^7/7! + ...
 *
 *  % java sin  java Sin 0.523598775598299
 *  0.5000000000000002
 *
 *  Note:  sin(pi/6) = sin(0.523598775598299...) = 1/2
 *
 *  We use identity sin(x) = sin(x + 2 PI) to pre-process
 *  x to be between -2 PI and 2 PI. Yes, % works with doubles!
 *
 ******************************************************************************/

public class Sin {
    public static void main(String[] args) {
	// Angle to take sine of
	double x = Double.parseDouble(args[0]);

	// Convert to radians
	x = x % (2 * Math.PI);
	
	// Initialize sin(x) to zero
	double sum = 0.0;

	// Initialize the term to one
	double term = 1.0;

	for (int i = 1; term != 0.0; i++) {
	    term *= (x/i);

	    if (i % 4 == 1) {
		sum += term;
	    } else if (i % 4 == 3) {
		sum -= term;
	    }
	}
	
	// Print sine(x)
	System.out.println(sum);
    }
}