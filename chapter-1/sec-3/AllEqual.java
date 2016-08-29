/******************************************************************************
 *  Compilation:  javac AllEqual.java
 *  Execution:    java AllEqual a b c
 *
 *  Prints "equal" if a = b = c and "not equal" otherwise.
 *
 *  % java AllEqual 10 10 10
 *  all equal
 *
 *  % java AllEqual 10 20 10
 *  not all equal
 *
 ******************************************************************************/

public class AllEqual {
    public static void main(String[] args) {
	// Three integer command line arguments
	int x = Integer.parseInt(args[0]);
	int y = Integer.parseInt(args[1]);
	int z = Integer.parseInt(args[2]);

	boolean equal;
	equal = (x == y) && (x == z);

	if (equal) {
	    System.out.println("equal");
	} else {
	    System.out.println("not equal");
	}
    }
}