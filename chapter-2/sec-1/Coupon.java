/******************************************************************************
 *  Compilation:  javac Coupon.java
 *  Execution:    java Coupon n
 *
 *  % java Coupon 1000 
 *  6522 
 *
 *  % java Coupon 1000 
 *  6481 
 *
 *  % java Coupon 1000000 
 *  12783771
 *  
 ******************************************************************************/

public class Coupon {
    // Return a random coupon (integer) between 0 and n-1
    public static int getCoupon(int n) {
	return (int) (Math.random() * n);
    }

    // Return number of cards you collect before obtaining one of the n types
    public static int collect(int n) {
	// True if card type i is already collected
	boolean[] isCollected = new boolean[n];

	// Number of cards collected
	int count = 0;
	
	// Number of distinct cards collected
	int distinct = 0;

	// Repeat until you've collected all n card types
	while (distinct < n) {
	    int value = getCoupon(n);
	    count++;

	    if (!isCollected[value]) {
		distinct++;
		isCollected[value] = true;
	    }
	}
	return count;
    }

    // Test clien
    public static void main(String[] args) {
	// Parse command-line argument n
	int n = Integer.parseInt(args[0]);
	
	// Calculate number of cards you need to draw before you collected all n distinct card types
	int count = collect(n);

	// Print the results
	System.out.println(count);
    }
}