package com.openclassrooms.cardgame.model;

<<<<<<< HEAD
public class PlayingCard implements IPlayableCard {
	private Rank rank;
	private Suit suit;
	protected boolean faceUp;

=======
public class PlayingCard {
	private Rank rank;
	private Suit suit;
	private boolean faceUp;
	
>>>>>>> part3-chap3-step1
	public PlayingCard(Rank rank, Suit suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}
<<<<<<< HEAD

	public Rank getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public boolean isFaceUp() {
		return faceUp;
	}

=======
	public Rank getRank() {
		return rank;
	}
	public Suit getSuit() {
		return suit;
	}
	
	public boolean isFaceUp() {
		return faceUp;
	}
	
>>>>>>> part3-chap3-step1
	public boolean flip() {
		faceUp = !faceUp;
		return faceUp;
	}
<<<<<<< HEAD

=======
	
>>>>>>> part3-chap3-step1
}
