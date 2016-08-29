/******************************************************************************
 *  Compilation:  javac CouponCollector.java
 *  Execution:    java CouponCollector n
 *
 *  Given n distinct card types, how many random cards do you need
 *  do collect before you have (at least) one of each type?
 *  This program simulates this random process.
 *
 *
 *  % java CouponCollector 1000
 *  6583
 *
 *  % java CouponCollector 1000
 *  6477
 *
 *  % java CouponCollector 1000000
 *  12782673
 *
 ******************************************************************************/

public class CouponCollector {
    public static void main(String[] args) {
	// Number of card types
	int n = Integer.parseInt(args[0]);

	// Initialize Boolean array to mark if card type has been collected
	boolean[] isCollected = new boolean[n];

	int count = 0;   // Total number of cards collected
	int distinct = 0;   // Number of distinct cards

	// Repeatedly choose a random card to check if it's a new one
	while (distinct < n) {
	    // Draw a random card between 0 and n-1
	    int value = (int) (Math.random() * n);

	    // Increment counter
	    count++;
	    
	    // If card has not yet been collected, mark as collected
	    if (!isCollected[value]) {
		distinct++;
		isCollected[value] = true;
	    }
	}

	// Print the total number of cards collected
	System.out.println(count);
    }
}