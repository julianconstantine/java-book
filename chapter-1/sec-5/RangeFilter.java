/******************************************************************************
 *  Compilation:  javac RangeFilter.java
 *  Execution:    java RangeFilter lo hi < input.txt
 *  Dependencies: StdIn.java StdOut.java
 *
 *  Read in a sequence of integers from standard input and print
 *  out those values between lo and hi.
 *
 ******************************************************************************/

public class RangeFilter {
    public static void main(String[] args) {
	// Read in two command-line arguments
	int low = Integer.parseInt(args[0]);
	int high = Integer.parseInt(args[1]);

	// Repeat as long as there's more input to read in
	while (!StdIn.isEmpty()) {
	    // Read in the next integer
	    int t = StdIn.readInt();

	    // Print out the given integer if it's between low and high
	    if (t >= low && t <= high) {
		StdOut.print(t + " ");
	    }
	}

	// Print a newline
	StdOut.println();
    }
}
