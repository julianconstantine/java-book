/******************************************************************************
 *  Compilation:  javac TenHellos.java
 *  Execution:    java TenHellos
 * 
 *  Prints ith Hello for i = 1 to 10. Illlustrates using a while loop
 *  for a repetitive task.
 *
 *  % java TenHellos
 *  1st Hello
 *  2nd Hello 
 *  3rd Hello
 *  4th Hello
 *  5th Hello
 *  6th Hello
 *  7th Hello
 *  8th Hello
 *  9th Hello
 *  10th Hello
 *
 ******************************************************************************/

public class TenHellos {
    public static void main(String[] args) {
	int counter = 0;
	
	// Print "Hello, World" 10 times
	while (counter < 10) {
	    System.out.println("Hello, World");
	    
	    counter++;
	}
    }
}