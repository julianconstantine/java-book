/******************************************************************************
 *  Compilation:  javac TwentyQuestions.java
 *  Execution:    java TwentyQuestions
 *  Dependencies  StdIn.java
 *
 *  % java TwentyQuestions 
 *  I'm thinking of a number between 1 and 1,000,000 
 *  What's your guess? 500000 
 *  Too high 
 *  What's your guess? 250000 
 *  Too low 
 *  What's your guess? 375000 
 *  Too high 
 *  What's your guess? 312500 
 *  Too high 
 *  What's your guess? 300500 
 *  Too low 
 *  ... 
 *
 ******************************************************************************/

public class TwentyQuestions {
    public static void main(String[] args) {
	// Generate a random integer between 1 and 1,000,000  and answer questions as the user tries to guess it
	int secret = 1 + (int) (Math.random()*1000000);

	StdOut.print("I'm thinking of a number ");
	StdOut.println("between 1 and 1,000,000");

	int guess = 0;

	while (guess != secret) {
	    // Ask the user to guess a number, then respond with a clue
	    StdOut.print("What is your guess? ");
	    guess = StdIn.readInt();

	    if (guess == secret) StdOut.println("You win!");
	    else if (guess < secret) StdOut.println("Too low");
	    else if (guess > secret) StdOut.println("Too high");
	}
    }
}
