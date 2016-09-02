/******************************************************************************
 *  Compilation:  javac Squeeze.java
 *  Execution:    java Squeeze
 *  Dependencies: In.java
 *
 *  Takes a string command line argument and removes adjacent spaces.
 *  
 *  % java Squeeze "this is    a    test"
 *  this is a test
 *
 ******************************************************************************/

public class Squeeze {
    public static String squeeze(String s) {
	// Length of the string
	int n = s.length();

	// Initialize previous character to the empty string
	String lastChar = "";
	
	// Initialize new string (with extra whitespaces removed) to the empty string
	String t = "";
	
	for (int i = 0; i < n; i++) {
	    String thisChar = "" + s.charAt(i);
	    
	    if (thisChar.equals(" ") && lastChar.equals(" ")) {
		// Skip to next iteration
		continue;
	    } else {
		// If there are no two spaces in a row, concatenate the output String with the current character 
		t += thisChar;
		lastChar = thisChar;
	    }
	}
	
	return t;
    }

    public static void main(String[] args) {
	String s = args[0];
	
	System.out.println(s);
	System.out.println(squeeze(s));
    }
}