/******************************************************************************
 *  Compilation:  javac Deal.java
 *  Execution:    java Deal PLAYERS
 *
 *  Deal 5-card hands at random to the given number of players.
 *
 *  % java Deal 3
 *  4 of Spades
 *  9 of Spades
 *  Ace of Hearts
 *  9 of Clubs
 *  9 of Diamonds
 *
 *  6 of Spades
 *  10 of Hearts
 *  Queen of Hearts
 *  8 of Hearts
 *  King of Spades
 *
 *  7 of Hearts
 *  8 of Diamonds
 *  Queen of Spades
 *  3 of Spades
 *  4 of Diamonds
 *
 ******************************************************************************/

public class Deal {
    public static void main(String[] args) {
	// Number of hands to deal
	int NUM_PLAYERS = Integer.parseInt(args[0]);
	
	int CARDS_PER_PLAYER = 5;

	String[] SUITS = {
	    "Clubs", "Diamonds", "Hearts", "Spades"
	};

	String[] RANKS = {
	    "2", "3", "4", "5", "6", "7", "8", "9", "10", 
	    "Jack", "Queen", "King", "Ace"
	};
	
	int n = SUITS.length * RANKS.length;
	
	if (NUM_PLAYERS * CARDS_PER_PLAYER > n) {
	    throw new RuntimeException("Too many players");
	}

	// Initialize deck
	String[] deck = new String[n];

	for (int i = 0; i < RANKS.length; i++) {
	    for (int j = 0; j < SUITS.length; j++) {
		deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
	    }
	}

	// Shuffle the deck
	for (int i = 0; i < n; i++) {
	    // Generate a random number between i and n-1
	    int r = i + (int) (Math.random() *(n-i));
	    String temp = deck[r];
	    deck[r] = deck[i];
	    deck[i] = temp;
	}

	// Print shuffled deck (i.e. "deal" the shuffled cards until all players have been dealt a hand of 5 cards)
	for (int i = 0; i < CARDS_PER_PLAYER*NUM_PLAYERS; i++) {
	    System.out.println(deck[i]);
	    
	    // Print a newline after printing each player's hand
	    if (i % CARDS_PER_PLAYER == CARDS_PER_PLAYER-1) {
		System.out.println();
	    }
	}
    }
}