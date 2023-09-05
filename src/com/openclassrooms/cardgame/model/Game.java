package com.openclassrooms.cardgame.model;

import com.openclassrooms.cardgame.games.GameEvaluator;

public class Game {
	private Deck deck;
	private GameEvaluator evaluator;

	public Game(Deck deck, GameEvaluator evaluator) {
		this.deck = deck;
		this.evaluator = evaluator;
	}

	public Deck getDeck() {
		return deck;
	}

	public GameEvaluator getEvaluator() {
		return evaluator;
	}
}
