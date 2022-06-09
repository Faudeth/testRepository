package War;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards = new ArrayList<Card>();
	
	public Deck() {
	int[] value = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
	String[] name = {"Clubs", "Diamonds", "Hearts", "Spades"};
	for (int v = 0; v <= 12; v++) {
		for (int n = 0; n <= 3; n++) {
		Card newCard = new Card();
		newCard.setValue(value[v]);
		newCard.setName(name[n]);
		cards.add(newCard);
		}
	}	
	
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return cards.remove(0);
		
	}


}
