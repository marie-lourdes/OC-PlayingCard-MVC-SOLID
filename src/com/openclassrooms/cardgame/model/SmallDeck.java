package com.openclassrooms.cardgame.model;

import java.util.ArrayList;

<<<<<<< HEAD
public class SmallDeck extends Deck {
	public SmallDeck() {
		cards = new ArrayList<PlayingCardAdapter>();
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {

				/*
				 * if (rank.value() == 0 && suit.value() == 0) {
				 * System.out.println("Creating card [" + rank + "][" + suit + "]");
				 * cards.add(new PlayingCard(rank, suit)); break; } if (suit.value() != 0) {
				 * System.out.println("Creating card [" + rank + "][" + suit + "]");
				 * cards.add(new PlayingCard(rank, suit)); }
				 */

				if (rank.value() >= 7 && suit.value() != 0) {
					System.out.println("Creating card: [" + rank + "][" + suit + "]");
					cards.add(new PlayingCardAdapter(rank, suit));
				}
			}
		}

=======
public class SmallDeck extends Deck{
	public SmallDeck() {
		cards = new ArrayList<PlayingCard> ();
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				if (rank.value() >= 7) {
					System.out.println ("Creating card: [" + rank + "][" + suit + "]");
					cards.add(new PlayingCard (rank, suit));
				}
			}
		}
		
>>>>>>> part3-chap3-step1
		shuffle();
	}
}
