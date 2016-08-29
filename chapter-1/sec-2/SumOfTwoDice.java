/******************************************************************************
 *  Compilation:  javac SumOfTwoDice.java
 *  Execution:    java SumOfTwoDice
 *  
 *  Generate 2 integers between 1 and 6, and print their sum.
 * 
 *  %  java SumOfTwoDice
 *  5
 *
 *  %  java SumOfTwoDice
 *  9
 *
 *  %  java SumOfTwoDice
 *  3
 *
 *  %  java SumOfTwoDice
 *  11
 *
 *  %  java SumOfTwoDice
 *  8
 *
 *  %  java SumOfTwoDice
 *  7
 *
 ******************************************************************************/

public class SumOfTwoDice {
    public static void main(String[] args) {
	// Generate two random real numbers between 1 and 6
	double dx = 6*Math.random() + 1;
	double dy = 6*Math.random() + 1;
	
	// Drop decimals 
	// NOTE: This DOES NOT work unless you create dx, dy first
	int x = (int) dx;
	int y = (int) dy;
	
	// Add them together
	int sum = x + y;
	
	// Print the result
	System.out.println(x + " " + y + " " + sum);
    }
}