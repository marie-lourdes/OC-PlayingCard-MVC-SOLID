package com.openclassrooms.cardgame.builder;

import com.openclassrooms.cardgame.DeckFactory;
import com.openclassrooms.cardgame.DeckFactory.DeckType;
import com.openclassrooms.cardgame.GameEvaluatorFactory;
import com.openclassrooms.cardgame.GameEvaluatorFactory.EvaluatorType;
import com.openclassrooms.cardgame.model.Game;

public class NormalHightCardGameBuilder implements GameBuilder {

	public Game getGame() {

		return new Game(DeckFactory.makeDeck(DeckType.NORMAL), GameEvaluatorFactory.makeEvaluator(EvaluatorType.HIGHT));
	}

}
