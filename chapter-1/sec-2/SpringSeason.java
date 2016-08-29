/******************************************************************************
 *  Compilation:  javac DayOfWeek.java
 *  Execution:    java DayOfWeek m d y
 *
 *  Read in the month (m), day (d), and year (y) and print out what
 *  day of the week it falls on according to the Gregorian calendar.
 *  For M use 1 for January, 2 for February, and so forth. Outputs
 *  0 for Sunday, 1 for Monday, and so forth.
 *
 *        y0 = y - (14 - m) / 12
 *        x = y0 + y0/4 - y0/100 + y0/400
 *        m0 = m + 12 * ((14 - m) / 12) - 2
 *        d = (d + x + (31*m0)/12) mod 7
 *
 *
 *  % java DayOfWeek 8 2 1953      // August 2, 1953
 *  0                              // Sunday
 *
 *  % java DayOfWeek 1 1 2000      // January 1, 2000
 *  6                              // Saturday
 *
 ******************************************************************************/

public class SpringSeason {
    public static void main(String[] args) {
	int m = Integer.parseInt(args[0]);
	int d = Integer.parseInt(args[1]);
	
	// Initialize Boolean condition variable
	boolean condition;
	
	// Want month to be between March and June (exclusive)
	condition = m > 3 && m < 6;

	// If March, must be after March 20th
	condition = condition || (m == 3 && d >= 20);

	// If June, must be before June 20th
	condition = condition || (m == 6 && d <= 20);

	System.out.println(condition);
    }
}
