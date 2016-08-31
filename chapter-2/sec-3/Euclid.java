/******************************************************************************
 *  Compilation:  javac Euclid.java
 *  Execution:    java Euclid p q
 *  
 *  Reads two command-line arguments p and q and computes the greatest
 *  common divisor of p and q using Euclid's algorithm.
 *
 *  Remarks
 *  -----------
 *    - may return the negative of the gcd if p is negative
 *
 ******************************************************************************/

public class Euclid {
    // Recursively calculate the greatest command divisor
    public static int gcd(int p, int q) {
	if (q == 0) return p;
	else return gcd(q, p % q);
    }

    // Non-recursive implementation
    public static int gcd2(int p, int q) {
	while (q != 0) {
	    int temp = q;
	    q = p % q;
	    p = temp;
	}

	return p;
    }

    public static void main(String[] args) {
	int p = Integer.parseInt(args[0]);
	int q = Integer.parseInt(args[1]);

	System.out.println(gcd(p, q));
	System.out.println(gcd2(p, q));
    }
}
