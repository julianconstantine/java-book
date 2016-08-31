/******************************************************************************
 *  Compilation:  javac ArrayEquals.java
 *  Execution:    java ArrayEquals
 *
 *  The function eq() takes two integer array arguments and returns
 *  true if they have the same length and all corresponding pairs
 *  of integers are equal.
 *
 *  % java ArrayEquals
 *  true
 *  false
 *  true
 *  false
 *  
 ******************************************************************************/

public class ArrayEquals {
    public static boolean eq(int[] a, int[] b) {
	if (a.length != b.length) {
	    return false;
	} else {
	    boolean isEqual = true;
	    
	    for (int i = 0; i < a.length; i++) {
		if (a[i] != b[i]) isEqual = false;
	    }

	    return isEqual;
	}
    }

    // Test client (use the main() function to test the eq() function
    public static void main(String[] args) {
	int[] a = { 3, 1, 4, 1, 5 };
	int[] b = { 3, 1, 4, 1 };
	int[] c = { 3, 1, 4, 1, 5 };
	int[] d = { 2, 7, 1, 8, 2 };

	System.out.println(eq(a, a));
	System.out.println(eq(a ,b));
	System.out.println(eq(a, c));
	System.out.println(eq(a, d));
    }
}
