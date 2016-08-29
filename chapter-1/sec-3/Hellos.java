/******************************************************************************
 *  Compilation:  javac Hellos.java
 *  Execution:    java Hellos n
 * 
 *  Prints ith Hello for i = 1 to n.
 *
 *  % java Hellos
 *  1st Hello
 *  2nd Hello 
 *  3rd Hello
 *  4th Hello
 *  5th Hello
 *  6th Hello
 *  7th Hello
 *  8th Hello
 *  9th Hello
 *  10th Hello
 *  11th Hello
 *  12th Hello
 *  13th Hello
 *  14th Hello
 *  15th Hello
 *  16th Hello
 *  17th Hello
 *  18th Hello
 *  19th Hello
 *  20th Hello
 *  21st Hello
 *  22nd Hello
 *  23rd Hello
 *  24th Hello
 *
 ******************************************************************************/

public class Hellos {
    public static void main(String[] args) {
	// Number of hellos to print
	int n = Integer.parseInt(args[0]);
	
	for (int i = 1; i <= n; i ++) {
	    if (i % 10 == 1) {
		System.out.println(i + "st Hello");
	    } else if (i % 10 == 2) {
		System.out.println(i + "nd Hello");
	    } else if (i % 10 == 3) {
		System.out.println(i + "rd Hello");
	    } else {
		System.out.println(i + "th Hello");
	    } 
	}
    }
}