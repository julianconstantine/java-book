/******************************************************************************
 *  Compilation:  javac PowersOfTwo.java
 *  Execution:    java PowersOfTwo n
 *  
 *  This program takes a command-line argument n and prints a table of
 *  the powers of 2 that are less than or equal to 2^n.
 *
 *  % java PowersOfTwo 5
 *  0 1
 *  1 2
 *  2 4
 *  3 8
 *  4 16
 *  5 32
 *
 *  % java PowersOfTwo 6
 *  0 1
 *  1 2
 *  2 4
 *  3 8
 *  4 16
 *  5 32
 *  6 64
 *
 *  Remarks
 *  ------------
 *  Only works if 0 <= n < 31 since 2^31 overflows an int.
 *
 ******************************************************************************/

public class PowersOfTwo {
    public static void main(String[] args) {
	// Input integer
	int n = Integer.parseInt(args[0]);
	
	// Print out all powers of 2 less than n
	int m = 0;

	while (Math.pow(2, m) < n) {
	    System.out.println(Math.pow(2, m));
	    
	    m++;
	}
    }
}