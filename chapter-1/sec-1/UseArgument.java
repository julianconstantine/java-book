/******************************************************************************
 *  Compilation:  javac UseArgument.java
 *  Execution:    java UseArgument yourname
 *
 *  Prints "Hi, Bob. How are you?" where "Bob" is replaced by the
 *  command-line argument.
 *
 *  % java UseArgument Bob
 *  Hi, Bob. How are you?
 *
 *  % java UseArgument Alice
 *  Hi, Alice. How are you?
 *
 ******************************************************************************/

public class UseArgument {

    public static void main(String[] args) {
	// Print out "Hi [name]" on a single line (this is why we use print() instead of println())
	System.out.print("Hi, ");
	System.out.print(args[0]);
	System.out.println(". How are you?");
    }
}
