package com.openclassrooms.cardgame.model;

public class WinnerPlayer implements IPlayer {
	IPlayer winner;
	// l objet decorator WinnerPlayer utlisera l implementation de l interface
	// Iplayer de la classe Player
	// en modifiant la methode d interface avec sa propre implementation et
	// decoration et avec l implementation de Player winner.getName()

	public WinnerPlayer(IPlayer player) {

		this.winner = player;

	}

	@Override
	public void addCardToHand(PlayingCardAdapter pc) {
		winner.addCardToHand(pc);
	}

	@Override
	public PlayingCardAdapter getCard(int index) {
		return winner.getCard(index);
	}

	@Override
	public PlayingCardAdapter removeCard() {
		return winner.removeCard();
	}

	@Override
	public String getName() {
		return "***** " + winner.getName() + " *****";
	}
}
