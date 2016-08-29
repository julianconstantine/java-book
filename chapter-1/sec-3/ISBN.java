/******************************************************************************
 *  Compilation:  javac ISBN.java
 *  Execution:    java ISBN n
 *  
 *  Determines the check digit of an ISBN number given the first 9 digits.
 *
 *  An ISBN number is legal if it consists of 10 digits and
 *  d_1 + 2*d_2 + 3*d_3 + ... + 10*d_10 is a multiple of 11.
 *  For example, 0-201-31452-5 is legal since
 *  1*5 + 2*2 + 3*5 + 4*4 + 5*1 + 6*3 + 7*1 + 8*0 + 9*2 + 10*0 = 88
 *  and 88 is a multiple of 11.
 *
 *  Sample execution:
 *
 *       % java ISBN 020131452
 *       The full ISBN number is 201314525.
 *
 ******************************************************************************/

public class ISBN {
    public static void main(String[] args) {
	// ISBN number
	int n = Integer.parseInt(args[0]);

	// Weighted sum of digits of n
	int sum = 0;

	for (int i = 2; i <= 10; i++) {
	    // Rightmost digit
	    int digit = n % 10;
	    
	    // Update sum
	    sum += i*digit;
	    
	    // Clip off rightmost digit (via integer division)
	    n /= 10;
	}
	
	// String is CAPITALIZED
	String last = String.valueOf((11 - (sum % 11)) % 11);

	// Print the 10-digit ISN
	System.out.print(args[0]);
	System.out.println(last);
    }
}