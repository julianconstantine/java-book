/******************************************************************************
 *  Compilation:  javac Newton.java
 *  Execution:    java Newton x0 x1 x2 x3
 *
 *  Compute the square root using Newton's method. Package it
 *  in a static method.
 *
 *  % java Newton 1 2 3 1000000.1 -2 0 -0 NaN Infinity -Infinity
 *  1.0
 *  1.414213562373095
 *  1.7320508075688772
 *  1000.0000499999987
 *  NaN
 *  0.0
 *  -0.0
 *  NaN
 *  Infinity
 *  NaN
 *
 ******************************************************************************/

public class Newton {
    public static double sqrt(double s) {
	if (s < 0) return Double.NaN;

	// Tolerance bound epsilon
	double EPSILON = 1E-15;

	// Initialize our current guess to 1.0
	double current = 1.0;

	// Next guess
	double next = current - (current * current - s) / (2 * current);
	
	while (Math.abs((next - current) / current) > EPSILON) {
	    current = next;
	    next = current - (current * current - s) / (2 * current);
	}

	return next;
    }

    // Text client
    public static void main(String[] args) {
	// Parse command-line arguments
	double[] a = new double[args.length];

	for (int i = 0; i < args.length; i++) {
	    a[i] = Double.parseDouble(args[i]);
	}

	// Compute the square root for each number in the array
	for (int i = 0; i < a.length; i++) {
	    double x = sqrt(a[i]);
	    System.out.println(x);
	}
    }
}
