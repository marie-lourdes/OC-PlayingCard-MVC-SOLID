package com.openclassrooms.cardgame.builder;

import com.openclassrooms.cardgame.games.GameEvaluator;
import com.openclassrooms.cardgame.model.Deck;
import com.openclassrooms.cardgame.model.Game;

public interface GameBuilder {
	Game getGame();

	default Deck getDeck() {
		Deck deck = this.getGame().getDeck();
		return deck;
	}

	default GameEvaluator getEvaluator() {
		GameEvaluator evaluator = this.getGame().getEvaluator();
		return evaluator;
	}
}
