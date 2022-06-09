package War;

public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		
		Player player1 = new Player();
		Player player2 = new Player();
		
		dealCards(player1, player2, deck);
		
		for (int p = 0; p < 26; p++) {
			Card p1Card = player1.flip();
			int value1 = p1Card.getValue();
			System.out.print("Player 1 drew ");  
			p1Card.describe();
			
			Card p2Card = player2.flip();
			int value2 = p2Card.getValue();
			System.out.print("Player 2 drew ");
			p2Card.describe();
			System.out.println();
		
		
		if (value1 > value2) {
			player1.incrementScore();
			System.out.println("Player 1 wins!");
			System.out.println();
		} else if (value2 > value1) {
			player2.incrementScore();
			System.out.println("Player 2 wins!");
			System.out.println();
		} else {
			System.out.println("Tie!");
		}	
		System.out.println();
		}
		
		if(player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 wins! " + player1.getScore() + " to " + player2.getScore() + ".");
		}
		else if (player1.getScore() < player2.getScore()) {
			System.out.println("Player 2 wins! " + player2.getScore() + " to " + player1.getScore() + ".");
		}
		else {
			System.out.println("It's a tie! " + player1.getScore() + " to " + player2.getScore() + "." );
		}  
		
	}

	private static void dealCards(Player player1, Player player2, Deck deck) {
		for (int i = 0; i < 26; i++) {
			player1.draw(deck);
			player2.draw(deck);
		}
		
	}

}
