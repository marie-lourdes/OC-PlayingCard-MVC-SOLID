package com.openclassrooms.cardgame.model;

public enum Suit {
<<<<<<< HEAD
	// ajout de none value 0 pour la carte Joker qui n a pas de valeur rank et de
	// couleur suit
	NONE(0), DIAMONDS(1), HEARTS(2), SPADES(3), CLUBS(4);
=======
	DIAMONDS(1), HEARTS(2), SPADES(3), CLUBS(4);
>>>>>>> part3-chap3-step1

	int suit;

	private Suit(int value) {
		suit = value;
	}

	public int value() {
		return suit;
	}
}
