package com.openclassrooms.cardgame;

import com.openclassrooms.cardgame.model.Deck;
import com.openclassrooms.cardgame.model.NormalDeck;
import com.openclassrooms.cardgame.model.SmallDeck;
import com.openclassrooms.cardgame.model.TestDeck;

//class utilitaire qui se charge d instancier les objet model Deck 
public class DeckFactory {
	public enum DeckType {
		Normal, Small, Test
	};

//le deck factory a besoin de la classe mere, l abstraction deck, classe abstraite  le type generale et abstraite 
	// pour acceder et instancier les sous type sepcifique les classe fille
	// NormalDeck, SmallDeck, et TestDeck
	public static Deck makeDeck(DeckType type) {
		switch (type) {
		case Normal:
			return new NormalDeck();
		case Small:
			return new SmallDeck();
		case Test:
			return new TestDeck();
		}

		return new NormalDeck();
	}
}
