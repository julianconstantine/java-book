/******************************************************************************
 *  Compilation:  javac Hyperbolic.java
 *  Execution:    java Hyperbolic x
 *  
 *  Static library of hyperbolic trigonometric functions.
 *
 *  Remark
 *  ------
 *  Java 1.5 includes more robust methods Math.sinh(),
 *  Math.cosh(), and Math.tanh().
 * 
 ******************************************************************************/

public class Hyperbolic {
    public static double sinh(double x) {
	return (Math.exp(x) - Math.exp(-x)) / 2.0;
    }

    public static double cosh(double x) {
	return (Math.exp(x) + Math.exp(-x)) / 2.0;
    }

    public static double tanh(double x) {
	return sinh(x) / cosh(x);
    }

    public static void main(String[] args) {
	double x = Double.parseDouble(args[0]);

	System.out.println(sinh(x));
	System.out.println(cosh(x));
	System.out.println(tanh(x));
    }
}
