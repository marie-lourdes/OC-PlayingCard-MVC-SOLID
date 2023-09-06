package com.openclassrooms.cardgame.model;

import java.util.ArrayList;

<<<<<<< HEAD
public class TestDeck extends Deck {
	public TestDeck() {
		cards = new ArrayList<PlayingCardAdapter>();
		for (int i = 0; i < 14; ++i) {
			cards.add(new PlayingCardAdapter(Rank.ACE, Suit.CLUBS));
=======
public class TestDeck extends Deck{
	public TestDeck() {
		cards = new ArrayList<PlayingCard> ();
		for (int i = 0; i < 20; ++i) {
			cards.add(new PlayingCard (Rank.ACE, Suit.CLUBS));
>>>>>>> part3-chap3-step1
		}
	}
}
