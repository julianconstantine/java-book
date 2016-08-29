/******************************************************************************
 *  Compilation:  javac AddInts.java
 *  Execution:    java AddInts
 *  Dependencies: StdIn.java StdOut.java
 *  
 *  This program takes a command-line argument n, reads in n integers,
 *  and prints out their sum.
 *
 *  % java AddInts n
 *
 ******************************************************************************/


public class AddInts {
    public static void main(String[] args) {
	// Command-line argument n, number of integers to read in
	int n = Integer.parseInt(args[0]);

	int sum = 0;

	// Read in n integers from Standard Input and compute the sum
	for (int i = 0; i < n; i++) {
	    int value = StdIn.readInt();
	    sum += value;
	}

	// Print the results
	StdOut.println("Sum is " + sum);
    }
}
