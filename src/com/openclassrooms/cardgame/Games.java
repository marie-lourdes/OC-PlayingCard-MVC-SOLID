package com.openclassrooms.cardgame;

<<<<<<< HEAD
import com.openclassrooms.cardgame.buider.GameBuilder;
import com.openclassrooms.cardgame.buider.SmallHightCardGameBuilder;
import com.openclassrooms.cardgame.controller.GameController;
import com.openclassrooms.cardgame.model.SomeClass;
import com.openclassrooms.cardgame.model.SoundManager;
import com.openclassrooms.cardgame.view.GameSwingView;

public class Games {

	public static void main(String args[]) {

		GameSwingView gsv = new GameSwingView();
		gsv.createAndShowGUI();

		/* ****************************pattern Factory****************************** */

		// design pattern Factory
		// appel de la methode makedeck a partir de la class Deckfactory sans l
		// instancier car c est une classe utilitaire avec sa methode static
		// DeckFactory se charge d instancier la classe de type deck selon le type:
		//// TestDeck, NormalDeck, SmallDeck qui utilise les methode herité de Deck ,
		// et la methode shuffle dans leur constructor afin de melanger un certain
		// nombre de carte selon le type de deck, jeu de carte
		/*
		 * GameController gc = new GameController(DeckFactory.makeDeck(DeckType.NORMAL),
		 * gsv, GameEvaluatorFactory.makeEvaluator(EvaluatorType.HIGHT));
		 */

		/* *****************************pattern Buider*************************** */

		// design pattern Buider qui permet de recuperer une formule de jeu avec l
		// option small jeu 32 cartes et l evaluation de la carte la plus forte
		// Et lancer le leu avec ces options precise et assemblée ensemble
		GameBuilder normalHightCardGameBuilder = new SmallHightCardGameBuilder();

		GameController gc = new GameController(normalHightCardGameBuilder.getDeck(), gsv,
				normalHightCardGameBuilder.getEvaluator());
		gc.run();

		/* ********************************pattern Prototype********************** */

		// design pattern Prototype clone pour recreer des objets avec copie et un clone
		// nouvel instance
		// pour eviter de consommer tropde memeoire lorsqu il a plusieur objets a
		// intancier, permet de ne pas creer plusieir instances avec new et des valeurs
		// differentes mais de cloner un objet
		// et modifier les valeur du clone de l objets

		SomeClass a = new SomeClass();
		a.someField = 1202;
		a.someField2 = 5456;
		System.out.println(a.someField);
		SomeClass b = (SomeClass) a.clone();

		// a.someField remains 1202 // since it is a different object

		b.someField = 5;
		System.out.println(b.someField);
		System.out.println("a somefield pas modifié apres un clone: " + a.someField);
		System.out.println(b.someField2);

		/* ********************************pattern Singleton********************** */
		SoundManager soundManagerSingleton = SoundManager.getInstance();
		System.out.println("soundmanager volume: " + soundManagerSingleton.getVolume());
		soundManagerSingleton.setVolume(5);
		System.out.println("soundmanager volume modifié: " + soundManagerSingleton.getVolume());
	}


}
