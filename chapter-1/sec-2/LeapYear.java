/******************************************************************************
 *  Compilation:  javac LeapYear.java
 *  Execution:    java LeapYear n
 *  
 *  Prints true if n corresponds to a leap year, and false otherwise.
 *  Assumes n >= 1582, corresponding to a year in the Gregorian calendar.
 *
 *  % java LeapYear 2004
 *  true
 *
 *  % java LeapYear 1900
 *  false
 *
 *  % java LeapYear 2000
 *  true
 *
 ******************************************************************************/

public class LeapYear {
    public static void main(String[] args) {
	// Take command line argument as input and convert to integer
	int year = Integer.parseInt(args[0]);
	
	// Declare isLeapYear boolean variable
	boolean isLeapYear;

	// Divisible by 4
	isLeapYear = (year % 4 == 0);

	// Divisible by 4 and not 100
	isLeapYear = isLeapYear && (year % 100 != 0);

	// Divisible by 4 and not 100 unless divisible by 400
	isLeapYear = isLeapYear || (year % 400 == 0);

	System.out.println(isLeapYear);
    } 
}
