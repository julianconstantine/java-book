/******************************************************************************
 *  Compilation:  javac HowMany.java
 *  Execution:    java HowMany arg1 arg2 arg3 ...
 *
 *  HowMany takes a variable number of command-line arguments
 *  and prints a message reporting how many there are.
 *
 *  % java HowMany
 *  You entered 0 command-line arguments.
 *
 *  % java HowMany Alice Bob Carol
 *  You entered 3 command-line arguments.
 *
 *  % java HowMany Alice
 *  You entered 1 command-line argument.
 *
 ******************************************************************************/

public class HowMany {
    public static void main(String[] args) {
	System.out.println(args.length);
    }
}