/******************************************************************************
 *  Compilation:  javac LongestRun.java 
 *  Execution:    java LongestRun
 *         [ input required from standard input                        ]
 *         [ use Ctrl-d (OS X or Dr. Java) or Ctrl-z (Windows) for EOF ]
 *
 *  Dependencies: StdIn.java StdOut.java
 *
 *  Read in a sequence of integers and prints out both the integer
 *  that appears in a longest consecutive run and length of the run.
 *
 *  % java LongestRun
 *  1 2 2 1 5 1 1 7 7 7 7 1 1
 *  Ctrl-d
 *  Longest run: 4 consecutive 7s
 *
 ******************************************************************************/

public class LongestRun {
    public static void main(String[] args) {
	int longest = StdIn.readInt();
	int count = 1;

	while (!StdIn.isEmpty()) {
	    int value = StdIn.readInt();

	    
	}
    }
}
