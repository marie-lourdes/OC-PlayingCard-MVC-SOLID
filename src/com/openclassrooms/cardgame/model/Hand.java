package com.openclassrooms.cardgame.model;

import java.util.ArrayList;
import java.util.List;

public class Hand {
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

}
