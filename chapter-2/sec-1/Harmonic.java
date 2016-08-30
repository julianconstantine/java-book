/******************************************************************************
 *  Compilation:  javac Harmonic.java
 *  Execution:    java Harmonic n
 *  
 *  Prints the nth harmonic number: 1/1 + 1/2 + ... + 1/n.
 * 
 *  % java Harmonic 10
 *  2.9289682539682538
 *
 *  % java Harmonic 10000
 *  9.787606036044348
 *
 ******************************************************************************/

public class Harmonic {
    // Function to calculate the harmonic series
    public static double harmonic(int n) {
	double sum = 0.0;
	
	// Sum up the numbers 1 + 1/2 + 1/3 + ... + 1/n
	for (int i = 1; i <= n; i++) {
	    sum += 1.0 / i;
	}

	return sum;
    }

    // Main method to interact with the user
    public static void main(String[] args) {
	for (int i = 0; i < args.length; i++) {
	    int arg = Integer.parseInt(args[i]);
	    
	    // Calculare the harmonic series up to arg and print it
	    double value = harmonic(arg);
	    System.out.println(value);
	}
    }
}