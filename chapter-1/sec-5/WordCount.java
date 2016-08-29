/******************************************************************************
 *  Compilation:  javac WordCount.java 
 *  Execution:    java WordCount
 *         [ input required from standard input                        ]
 *         [ use Ctrl-d (OS X or Dr. Java) or Ctrl-z (Windows) for EOF ]
 *
 *  Dependencies: StdIn.java StdOut.java
 *
 *  Read in a sequence of strings from standard input and print out
 *  the number of strings read in.
 *
 *  % java WordCount
 *  it was the best of times
 *  it was the worst of times
 *  number of words  = 12
 *  Ctrl-d
 *
 *  % java WordCount < tale.txt 
 *  number of words  = 139043
 *
 ******************************************************************************/

public class WordCount {
    public static void main(String[] args) {
	// Initialize word count to zero
	int count = 0;
	
	// While receiving standard input, increment the counter
	while (!StdIn.isEmpty()) {
	    // NOTE: Need to actually read the input else this will just loop forever
	    String value = StdIn.readString(); 
	    count++;
	}

	StdOut.println("number of words = " + count);
    }
}
