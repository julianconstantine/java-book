/******************************************************************************
 *  Compilation:  javac ReverseString.java
 *  Execution:    java ReverseString s
 *
 *  Takes a string command-line argument and reverses its characters.
 *  
 *  % java Reverse accttagggcatc
 *  ctacgggattcca
 *
 ******************************************************************************/

public class ReverseString {
    public static String reverse(String s) {
	// Length of String
	int n = s.length();
	
	// Initialize reversed array
	// NOTE: Need to use 'new' keyword!
	char[] reversed = new char[n];
	
	// Insert characters of String into array in reversed order
	for (int i = 0; i < n; i++) {
	    char thisChar = s.charAt(i);
	    
	    // Insert into position n - 1 - i in array
	    reversed[n-1-i] = thisChar;
	}

	// Convert back to string
	return new String(reversed);
    }

    public static void main(String[] args) {
	String s = args[0];
	System.out.println(reverse(s));
    }
}