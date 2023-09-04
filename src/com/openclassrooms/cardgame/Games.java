package com.openclassrooms.cardgame;

import com.openclassrooms.cardgame.DeckFactory.DeckType;
import com.openclassrooms.cardgame.controller.GameController;
import com.openclassrooms.cardgame.games.HighCardGameEvaluator;
import com.openclassrooms.cardgame.view.GameSwingView;

public class Games {

	public static void main(String args[]) {
		GameSwingView gsv = new GameSwingView();
		gsv.createAndShowGUI();
		// appel de la methode makedeck a partir de la class Deckfactory sans l
		// instancier car c est une classe utilitaire avec sa methode static
		// DeckFactory se charge d instancier la classe de type deck selon le type:
		//// TestDeck, NormalDeck, SmallDeck qui utilise les methode herité de Deck ,
		// et la methode shuffle dans leur constructor afin de melanger un certain
		// nombre de carte selon le type de deck, jeu de carte
		GameController gc = new GameController(DeckFactory.makeDeck(DeckType.NORMAL), gsv, new HighCardGameEvaluator());

		gc.run();
	}
}
