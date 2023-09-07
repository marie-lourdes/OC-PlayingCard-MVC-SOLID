package com.openclassrooms.cardgame;

import com.openclassrooms.cardgame.builder.GameBuilder;
import com.openclassrooms.cardgame.builder.SmallHightCardGameBuilder;
import com.openclassrooms.cardgame.controller.GameController;
import com.openclassrooms.cardgame.model.CookSteak;
import com.openclassrooms.cardgame.model.Discounter;
import com.openclassrooms.cardgame.model.PrepareSteak;
import com.openclassrooms.cardgame.model.RareSteak;
import com.openclassrooms.cardgame.model.SomeClass;
import com.openclassrooms.cardgame.model.SoundManager;
import com.openclassrooms.cardgame.view.GameSwingPassiveView;
import com.openclassrooms.cardgame.view.GameSwingView;
import com.openclassrooms.cardgame.view.GameViewables;

public class Games {

	public static void main(String args[]) {

		/* ***********************pattern Composite******************** */
		// Création de l 'Observable
		GameViewables viewsComposite = new GameViewables();

		GameSwingView gsv = new GameSwingView();
		gsv.createAndShowGUI();
		// ajout de la vue graphique interactive Observer mais interagit
		viewsComposite.addViewable(gsv);

		/* **************************pattern Observer********************* */
		// ajout de 3 vue graphique passive et non interactive
		// qui sont les Observers passives

		for (int i = 0; i < 3; i++) {
			GameSwingPassiveView passiveView = new GameSwingPassiveView();
			passiveView.createAndShowGUI();

			viewsComposite.addViewable(passiveView);

			// sleep to move new Swing frame on window before genrate other view
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		GameBuilder smallHightCardGameBuilder = new SmallHightCardGameBuilder();

		GameController gc = new GameController(smallHightCardGameBuilder.getDeck(), viewsComposite,
				smallHightCardGameBuilder.getEvaluator());
		// desactiver le run du controller pour voir en oeuvre le pattern Prototype, le
		// pattern Strategy, et
		// le test de fonction lambda avec redifinition de l interface fonctionnelle
		// exemple qui ne sont pas lié aux jeux de cartes
		gc.run();

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

		/* *****************************pattern Builder*************************** */

		// design pattern Buider qui permet de recuperer une formule de jeu avec l
		// option small jeu 32 cartes et l evaluation de la carte la plus forte
		// Et lancer le leu avec ces options precise et assemblée ensemble

		/*
		 * GameBuilder normalHightCardGameBuilder = new SmallHightCardGameBuilder();
		 * 
		 * GameController gc = new GameController(normalHightCardGameBuilder.getDeck(),
		 * gsv, normalHightCardGameBuilder.getEvaluator()); gc.run();
		 */

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

		/* *****Refinition des methodes d interface avec les fonction lambada**** */

		// java trouve la methode de l interface qui doit etre
		// redfinit ci dessous
		// sans nommer la methode a redefinir avec la fonction lambda, on implemente pas
		// mais on l importe ou insere l interface focntionnele en l intgrant dans ce
		// meme fichier
		Discounter christmasDiscounter = (string) -> System.out.println("--------" + string + "------------");
		christmasDiscounter.applyDiscount("redefinition interface avec les fonctions lambada!");

		/* *********************pattern Strategy********************** */

		// La classe CookSteack est l objet strategy qui utilise une des classe de la
		// famille d algorithme pour le cooking steack au choix
		// l objet strategy CookSteak choisit une variante de l algoritme avec les
		// classes d implementations rareSteak , mediumStek, WellDoneSteak
		// d implementation et l interface commune preparesteack
		// ce pattern utilise le principe open/closed, pas besoin de modifier la class
		// CookSteack, lorsque l'on veux changer de cuisson dans sa methode cook(),
		// on utilise une autre implementation lors de l instantiation de CookSteack
		// sans toucher au code de la classe
		// on passe par une interface commune et differente implementation, qui injecté
		// dans le constructor de CookSteak

		PrepareSteak cookSteak = new CookSteak(new RareSteak());
		cookSteak.cook("Charal");
	}

}
