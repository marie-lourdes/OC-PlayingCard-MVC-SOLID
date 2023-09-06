package com.openclassrooms.cardgame.model;

import java.util.ArrayList;

public class TestDeck extends Deck {
	public TestDeck() {
		cards = new ArrayList<PlayingCardAdapter>();
		for (int i = 0; i < 14; ++i) {
			cards.add(new PlayingCardAdapter(Rank.ACE, Suit.CLUBS));
		}
	}
}
