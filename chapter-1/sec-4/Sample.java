/******************************************************************************
 *  Compilation:  javac Sample.java
 *  Execution:    java Sample m n
 *
 *  This program takes two command-line arguments m and n and produces
 *  a random sample of m of the integers from 0 to n-1.
 *
 *  % java Sample 6 49
 *  10 20 0 46 40 6
 *
 *  % java Sample 10 1000
 *  656 488 298 534 811 97 813 156 424 109
 *
 ******************************************************************************/

public class Sample {
    public static void main(String[] args) {
	int m = Integer.parseInt(args[0]);  // Sample size 
	int n = Integer.parseInt(args[1]);  // Sample set: 0, 1, ..., n-1

	// Create a "permutation" of 0, 1, ..., n-1 in sorted order
	int[] perm = new int[n];

	for (int i = 0; i < n; i++) {
	    perm[i] = i;
	}

	// Take a random sample of the "permutation"
	for (int i = 0; i < m; i++) {
	    // Generate a random number between i and n-1
	    int r = i + (int) (Math.random() * (n-i));
	    
	    // Swap elements i and r
	    int t = perm[r];
	    perm[r] = perm[i];
	    perm[i] = t;
	}

	// Print the output
	for (int i = 0; i < m; i++) {
	    System.out.print(perm[i] + " ");
	}

	System.out.println();
    }
}