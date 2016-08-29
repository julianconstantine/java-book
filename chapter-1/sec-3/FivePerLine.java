/******************************************************************************
 *  Compilation:  javac FivePerLine.java
 *  Execution:    java FivePerLine
 *  
 *  Print the integers from 1000 to 2000, 5 per line.
 *
 *  % java FivePerLine
 *
 ******************************************************************************/

public class FivePerLine {
    public static void main(String[] args) {
	for (int i = 1000; i <= 2000; i++) {
	    // Print the number 
	    System.out.print(i + " ");
	    
	    // If next number mod 5 is zero, print a newline
	    if ((i + 1) % 5 == 0) {
		System.out.println();
	    }
	}
    }
}