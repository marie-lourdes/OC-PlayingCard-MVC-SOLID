package com.openclassrooms.cardgame.model;

public enum Suit {
	//carte Jocker sans couleur au lieu de passer par l heritage de playingCard qui ne prevoyez pas de carte sans valeur et couleur
	//on modifie l enum rank et suit en ajoutant la valeur 0 pour les valeur rank et couleur suit
	NONE(0)
	DIAMONDS(1),
	HEARTS(2),
	SPADES(3),
	CLUBS(4);

	int suit;

	private Suit(int value) {
		suit = value;
	}

	public int value() {
		return suit;
	}
}
