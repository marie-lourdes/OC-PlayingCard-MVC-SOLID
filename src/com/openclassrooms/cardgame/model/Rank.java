package com.openclassrooms.cardgame.model;

public enum Rank {
	//carte Jocker sans valeur au lieu de passer par l heritage de playingCard qui ne prevoyez pas de carte sans valeur et couleur
	//on modifie l enum rank et suit en ajoutant la valeur 0 pour les valeur rank et couleur suit
	NONE(0)
	TWO (2),
	THREE (3),
	FOUR (4),
	FIVE (5),
	SIX (6),
	SEVEN (7),
	EIGHT (8),
	NINE (9),
	JACK (10),
	QUEEN (11),
	KING (12),
	ACE (13);
	
	int rank;
	
	private Rank(int value) {
		rank = value;
	}
	
	public int value() {
		return rank;
	}
}
