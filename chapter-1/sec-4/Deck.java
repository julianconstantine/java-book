/******************************************************************************
 *  Compilation:  javac Deck.java
 *  Execution:    java Deck
 *
 *  Deal 52 cards uniformly at random.
 *
 *  % java Deck
 *  Ace of Clubs
 *  8 of Diamonds
 *  5 of Diamonds
 *  ...
 *  8 of Hearts
 *
 ******************************************************************************/

public class Deck {
    public static void main(String[] args) {
	// Declare array SUITS at compile time
	String[] SUITS = {
	    "Clubs", "Diamonds", "Hearts", "Spades"
	};

	// Declare array RANKS at compile time
	String[] RANKS = {
	    "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", 
	    "Queen", "King", "Ace"
	};

	// Length of deck (52)
	int n = SUITS.length * RANKS.length;

	// Initialize empty array
	String[] deck = new String[n];

	// Fill in deck
	for (int i = 0; i < RANKS.length; i++) {
	    for (int j =0; j < SUITS.length; j++) {
		deck[SUITS.length*i +j] = RANKS[i] + " of " + SUITS[j];
	    }
	}

	// Print unshuffled deck
	System.out.println("UNSHUFFLED DECK");

	for (int i = 0; i < n; i++) {
	    System.out.println(deck[i]);
	}

	// Shuffle
	for (int i = 0; i < n; i++) {
	    // Generate a random number between i and n-1
	    int r = i + (int) (Math.random() * (n-i));
	    
	    // Swap cards in position i and r
	    String temp = deck[r];
	    deck[r] = deck[i];
	    deck[i] = temp;
	}

	// Print shuffled deck
	System.out.println("SHUFFLED DECK");

	for (int i = 0; i < n; i++) {
	    System.out.println(deck[i]);
	}
    }
}
