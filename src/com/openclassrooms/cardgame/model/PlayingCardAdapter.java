package com.openclassrooms.cardgame.model;

public class PlayingCardAdapter implements IPlayableCard {
// le mieux serait de definir toutes les methode de playingcard dans l interface IplayableCard pour l exemple de PlayingCardAdapter

	CoolCard thisCard = new CoolCard(); ;

	public boolean flip() {

		boolean faceUp = thisCard.turnOver();
		return faceUp;

	}
}
