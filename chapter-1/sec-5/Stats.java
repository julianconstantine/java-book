/******************************************************************************
 *  Compilation:  javac Stats.java
 *  Execution:    java Stats n
 *  Dependencies: StdIn.java StdOut.java
 *  
 *  Reads in a command-line integer n, a sequence of n real numbers from
 *  standard input, and prints the mean and sample standard deviation.
 *
 *  % java Stats 6
 *  10.0 5.0 6.0
 *  3.0 7.0 32.0
 *  <Ctrl-d>
 *  Mean                      = 10.5
 *  Sample standard deviation = 10.784247771634329
 *
 *  Note <Ctrl-d> signifies the end of file on Unix.
 *  On windows use <Ctrl-z>.
 *
 ******************************************************************************/

public class Stats {
    public static void main(String[] args) {
	// Read in n numbers from standard input
	int n = Integer.parseInt(args[0]);

	// Initialize array of n doubles
	double[] arr = new double[n];

	// Fill in the array
	// NOTE: This operates one input at a time, no matter how you space the input out (e.g. multiple inputs per line, all inputs on different lines, etc.)
	for (int i = 0; i < n; i++) {
	    arr[i] = StdIn.readDouble();
	}

	// Compute the mean
	double sum = 0;
	
	for (int i = 0; i < n; i++) {
 	    sum += arr[i];
	}

       	double mean = sum / n;

	// Compute the standard deviation
	double sum2 = 0.0;

	for (int i = 0; i < n; i++) {
	    sum2 += (arr[i] - mean) * (arr[i] - mean);
	}

	double stdev = Math.sqrt(sum2 / (n-1));

	// Print the results
	StdOut.println("Mean: " + mean);
	StdOut.println("Sample standard deviation: " + stdev);    
    }
}
