package com.openclassrooms.cardgame.model;

import java.util.Collections;
import java.util.List;
import java.util.Random;

//la classe concrete Deck est devenu une classe abstraite utilisé par les differente class de type de deck :
//TestDeck, NormalDeck, SmallDeck et utiliser les methode herité de Deck , et la methode shuffle dans leur constructor afin de melanger un certain nombre de carte selon le type de deck, jeu de carte
public abstract class Deck {
	protected List<PlayingCardAdapter> cards;

	public void shuffle() {
		Random random = new Random();
		for (int i = 0; i < cards.size(); ++i) {
			Collections.swap(cards, i, random.nextInt(cards.size()));
		}
	}

	public PlayingCardAdapter removeTopCard() {
		return cards.remove(0);
	}

	public void returnCardToDeck(PlayingCardAdapter pc) {
		cards.add(pc);
	}

	public List<PlayingCardAdapter> getCards() {
		return cards;
	}

}
