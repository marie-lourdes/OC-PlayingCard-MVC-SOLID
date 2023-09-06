package com.openclassrooms.cardgame.model;

import java.util.ArrayList;

public class NormalDeck extends Deck {
	public NormalDeck() {
<<<<<<< HEAD
		cards = new ArrayList<PlayingCardAdapter>();
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				// type de jeux de carte comprenant le joker avec une seule ietration sur la
				// valeur rank none 0 et une seule iteration sur sa couleur suit none 0
				// pour les autres Rank valeur on itere sur les couleur suit

				if (rank.value() == 0 && suit.value() == 0) {
					System.out.println("Creating card [" + rank + "][" + suit + "]");
					cards.add(new PlayingCardAdapter(rank, suit));
					break;
				}

				if (suit.value() != 0) {
					System.out.println("Creating card [" + rank + "][" + suit + "]");
					cards.add(new PlayingCardAdapter(rank, suit));
					//
				}
			}
		}

=======
		cards = new ArrayList<PlayingCard>();
		for(Rank rank : Rank.values()) {
			for(Suit suit: Suit.values()) {
				System.out.println("Creating card ["+rank+"]["+suit+"]");
				cards.add(new PlayingCard(rank, suit));
			}
		}
		
>>>>>>> part3-chap3-step1
		shuffle();
	}
}
