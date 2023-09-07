package com.openclassrooms.cardgame;

import com.openclassrooms.cardgame.builder.GameBuilder;
import com.openclassrooms.cardgame.builder.SmallHightCardGameBuilder;
import com.openclassrooms.cardgame.controller.GameController;
import com.openclassrooms.cardgame.view.GameSwingPassiveView;
import com.openclassrooms.cardgame.view.GameSwingView;
import com.openclassrooms.cardgame.view.GameViewables;
import com.openclassrooms.exemples.Chef;
import com.openclassrooms.exemples.Daughter;
import com.openclassrooms.exemples.Discounter;
import com.openclassrooms.exemples.PrepareSteak;
import com.openclassrooms.exemples.RareSteak;
import com.openclassrooms.exemples.SomeClass;
import com.openclassrooms.exemples.Son;
import com.openclassrooms.exemples.SonFriends;
import com.openclassrooms.exemples.SoundManager;

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
		// pattern Strategy,pattern Singleton
		// et le test de fonction lambda avec redifinition de l interface fonctionnelle
		// exemple qui ne sont pas lié aux jeux de cartes, voir dans le
		// package:com.openclassrooms.exemples

		// gc.run();

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

		// OTHER EXAMPLES OF DESIGN PATTERN in package com.openclassrooms.exemples out
		// of package CardGame

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

		/* *********************pattern Strategy********************** */

		// La classe Chef est l objet strategy qui utilise une des classe de la
		// famille d algorithme au choix
		// l objet strategy Chef choisit une variante de l algorithme avec les
		// classes d implementations rareSteak , mediumStek, WellDoneSteak
		// d implementation et l interface commune preparesteack
		// ce pattern utilise le principe open/closed, pas besoin de modifier la class
		// Chef, lorsque l'on veux changer de cuisson dans sa methode cook(),
		// on utilise une autre implementation lors de l instantiation de Chef
		// sans toucher au code de la classe
		// on passe par une interface commune et differente implementation, qui injecté
		// dans le constructor de Chef

		PrepareSteak chef = new Chef(new RareSteak());
		chef.cook("Charal");

		/* *****Refinition des methodes d interface avec les fonction lambada**** */

		// java trouve la methode de l interface qui doit etre
		// redfinit ci dessous
		// sans nommer la methode a redefinir avec la fonction lambda, on implemente pas
		// mais on l importe ou insere l interface focntionnele en l intgrant dans ce
		// meme fichier
		Discounter christmasDiscounter = (string) -> System.out.println("--------" + string + "------------");
		christmasDiscounter.applyDiscount("redefinition interface avec les fonctions lambada!");

		/* *********************pattern d'Etat********************** */
		// changemnt du comportement de l objet initial Son et de la boisson apporté par
		// le Son,
		// en fonction des objet utilisé dans le Son, par le client main, Daughter ou
		// SonFriend ou le Son lui meme(avec le premier constructor), et donc fonction
		// de l
		// etat de l objet initial qui change avec son attribut Person personInKitchen

		// the mum ask for your son soda passing by his daughter
		Son sonAndDaughter = new Son(new Daughter());
		// son.getMumSoda();
		String sodaOfMum = sonAndDaughter.getMumSoda();
		System.out.println(sodaOfMum);

		// the mum ask for your son soda passing by your friend
		Son sonAndFriend = new Son(new SonFriends());
		// son.getMumSoda();
		String soda3OfMum = sonAndFriend.getMumSoda();
		System.out.println(soda3OfMum);

		// the mum ask for your son soda , he bring soda himself without person
		Son sonHimself = new Son();
		// son.getMumSoda();
		String soda2OfMum = sonHimself.getSodaFromFridge();
		System.out.println(soda2OfMum);
	}

}
