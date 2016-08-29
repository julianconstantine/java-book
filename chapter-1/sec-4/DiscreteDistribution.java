/******************************************************************************
 *  Compilation:  javac DiscreteDistribution.java
 *  Execution:    java DiscreteDistribution freq0 freq1 freq2 ...
 *
 *  Reads in an array of n frequency counts from the command line,
 *  and prints out i with probability proportional to the ith
 *  frequency count.
 *
 *  // six equally likely events
 *  % java DiscreteDistribution 1 1 1 1 1 1
 *  3
 *
 *  % java DiscreteDistribution 1 1 1 1 1 1
 *  0
 *
 *  // six events, one 3x more likely than the others
 *  % java DiscreteDistribution 1 1 1 1 1 3
 *  5
 *
 *  % java DiscreteDistribution 1 1 1 1 1 3
 *  2
 *
 *  % java DiscreteDistribution 1 1 1 1 1 3
 *  5
 *
 ******************************************************************************/

public class DiscreteDistribution {
    public static void main(String[] args) {
	// Number of command-line arguments
	int n = args.length;

	// Initialize an empty array to store the command-line arguments as integers
	int[] intArgs = new int[n];

	// Sum of the elements of the array
	int sumArgs = 0;

	// Fill in the array
	for (int i = 0; i < n; i++) {
	    intArgs[i] = Integer.parseInt(args[i]);

	    sumArgs += intArgs[i];
	}

	// Array of doubles with CDF of normalized probabilities
	double[] cdf = new double[n];

	// Accumulator-type constant for CDF
	double acc = 0.0;

	// Fill in the array
	for (int i = 0; i< n; i++) {
	    cdf[i] = acc + ((double) intArgs[i])/sumArgs;
	    // System.out.println(cdf[i]);
	    acc = cdf[i];
	}

	// Generate a random number
	double r = Math.random();
	// System.out.println(r);

	double lastCDF = 0.0;

	for (int i = 0; i < n; i++) {
	    if (r >= lastCDF && r < cdf[i]) {
		System.out.println(intArgs[i]);
		break;
	    } else {
		lastCDF = cdf[i];
	    }
	}
    }
}