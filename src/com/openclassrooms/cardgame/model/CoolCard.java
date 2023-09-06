package com.openclassrooms.cardgame.model;

public class CoolCard {
	boolean faceUp;

	public boolean turnOver(boolean faceUp) {

		// implémentation cool ici
		System.out.println("cool card, implementation amliorée de flip() de PlayingCard a adapter");
		this.faceUp = this.faceUp ? false : true;
		return this.faceUp;
	}

}
