package com.openclassrooms.cardgame.model;

<<<<<<< HEAD
public class Player {
	private String name;
	private Hand hand;

=======
import java.util.List;

public class Player {
	private String name;
	private Hand hand;
	
	
>>>>>>> part3-chap3-step1
	public Player(String name) {
		this.name = name;
		hand = new Hand();
	}
<<<<<<< HEAD

	public void addCardToHand(PlayingCardAdapter pc) {
		hand.addCard(pc);
	}

	public PlayingCardAdapter getCard(int index) {
		return hand.getCard(index);
	}

	public PlayingCardAdapter removeCard() {
		return hand.removeCard();
	}

	public String getName() {
		return name;
	}

=======
	
	public void addCardToHand(PlayingCard pc) {
		hand.addCard(pc);
	}
	
	public PlayingCard getCard(int index) {
		return hand.getCard(index);
	}
	
	public PlayingCard removeCard() {
		return hand.removeCard();
	}
	
	public String getName() {
		return name;
	}
	
>>>>>>> part3-chap3-step1
}
