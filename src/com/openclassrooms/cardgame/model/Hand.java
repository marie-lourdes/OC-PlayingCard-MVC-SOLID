package com.openclassrooms.cardgame.model;

import java.util.ArrayList;
import java.util.List;

public class Hand {
<<<<<<< HEAD
	private List<PlayingCardAdapter> cards;

	public Hand() {
		cards = new ArrayList<PlayingCardAdapter>();
	}

	public void addCard(PlayingCardAdapter pc) {
		cards.add(pc);
	}

	public PlayingCardAdapter getCard(int index) {
		return cards.get(index);
	}

	public PlayingCardAdapter removeCard() {
		return cards.remove(0);
	}

=======
	private List<PlayingCard> cards;

	public Hand() {
		cards = new ArrayList<PlayingCard>();
	}
	
	public void addCard(PlayingCard pc) {
		cards.add(pc);
	}
	
	public PlayingCard getCard(int index) {
		return cards.get(index);
	}
	
	public PlayingCard removeCard() {
		return cards.remove(0);
	}
	
>>>>>>> part3-chap3-step1
}
