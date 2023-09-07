package com.openclassrooms.cardgame.model;

public class PlayingCardAdapter extends PlayingCard implements IPlayableCard {
	public CoolCard thisCard = new CoolCard();

	public PlayingCardAdapter(Rank rank, Suit suit) {
		super(rank, suit);
	}

// le mieux serait de definir toutes les methode de playingcard dans l interface IplayableCard pour l exemple de PlayingCardAdapter
	@Override
	public boolean flip() {

		super.faceUp = thisCard.turnOver(super.faceUp);
		return super.faceUp;

	}
}
