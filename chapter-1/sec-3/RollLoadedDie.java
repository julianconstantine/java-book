/******************************************************************************
 *  Compilation:  javac RollLoadedDie.java
 *  Execution:    java RollLoadedDie
 *
 *  Simulate the roll of a loaded six-sided die, where the values
 *  1, 2, 3, 4, and 5 appear with probability 1/8 and the value 6
 *  appears with probablity 3/8, and print the resulting number.
 *
 *  % java RollLoadedDie
 *  4
 *
 *  % java RollLoadedDie
 *  6
 *
 ******************************************************************************/

public class RollLoadedDie {
    public static void main(String[] args) {
	// Random number between 0 and 8
	double r = 8*Math.random();
	
	// Declare integer variable for die roll
	// For some reason, Java won't compile if you declare and assign the roll variable inside the if/else statements
	int roll;

	if (r <= 1) {
	    roll = 1;
	} else if (r <= 2) {
	    roll = 2;
	} else if (r <= 3) {
	    roll = 3;
	} else if (r <= 4) {
	    roll = 4;
	} else if (r <= 5) {
	    roll = 5;
	} else {
	    roll = 6;
	}

	// Print the result of the die roll
	System.out.println(roll);
    }
}
