package com.openclassrooms.cardgame.model;

public interface IPlayer {

	void addCardToHand(PlayingCardAdapter pc);

	PlayingCardAdapter getCard(int index);

	PlayingCardAdapter removeCard();

	String getName();

}
