package com.openclassrooms.cardgame.model;

public class Player implements IPlayer {
	private String name;
	private Hand hand;

	public Player(String name) {
		this.name = name;
		hand = new Hand();
	}

	@Override
	public void addCardToHand(PlayingCardAdapter pc) {
		hand.addCard(pc);
	}

	@Override
	public PlayingCardAdapter getCard(int index) {
		return hand.getCard(index);
	}

	@Override
	public PlayingCardAdapter removeCard() {
		return hand.removeCard();
	}

	@Override
	public String getName() {
		return name;
	}

}
