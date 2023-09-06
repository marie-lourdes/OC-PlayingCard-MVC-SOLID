package com.openclassrooms.cardgame.model;

public class IPlayer {
	private String name;
	private Hand hand;

	public IPlayer(String name) {
		this.name = name;
		hand = new Hand();
	}

	public void addCardToHand(PlayingCardAdapter pc) {
		hand.addCard(pc);
	}

	public PlayingCardAdapter getCard(int index) {
		return hand.getCard(index);
	}

	public PlayingCardAdapter removeCard() {
		return hand.removeCard();
	}

	public String getName() {
		return name;
	}

}
