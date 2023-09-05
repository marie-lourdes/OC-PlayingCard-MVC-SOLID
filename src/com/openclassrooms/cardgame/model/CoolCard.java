package com.openclassrooms.cardgame.model;

public class CoolCard {
	boolean faceUp;

	public boolean turnOver() {

		// implémentation cool ici
		System.out.println("cool card, implementation amliorée de flip() de PlayingCard a adapter");
		faceUp = faceUp ? false : true;
		return faceUp;
	}

}
