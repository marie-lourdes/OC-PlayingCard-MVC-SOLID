
package com.openclassrooms.cardgame.controller;

import java.util.ArrayList;
import java.util.List;

import com.openclassrooms.cardgame.games.GameEvaluator;
import com.openclassrooms.cardgame.model.Deck;
import com.openclassrooms.cardgame.model.IPlayer;
import com.openclassrooms.cardgame.model.Player;
import com.openclassrooms.cardgame.model.PlayingCardAdapter;
import com.openclassrooms.cardgame.model.WinnerPlayer;
import com.openclassrooms.cardgame.view.GameViewable;

public class GameController {

	enum GameState {
		AddingPlayers, CardsDealt, WinnerRevealed;
	}

	Deck deck;
	List<IPlayer> players;
	IPlayer winner;
	GameViewable view;
	GameState gameState;
	GameEvaluator evaluator;
	int round = 0;

// le controller utilise l abstraction deck.java classe abstraite pour utiliser les methodes de la classe abstraite
	public GameController(Deck deck, GameViewable view, GameEvaluator gameEvaluator) {
		super();
		this.deck = deck;
		this.view = view;
		this.players = new ArrayList<IPlayer>();
		this.gameState = GameState.AddingPlayers;
		this.evaluator = gameEvaluator;
		view.setController(this);
	}

	public void run() {
		while (gameState == GameState.AddingPlayers) {
			view.promptForPlayerName();
		}

		switch (gameState) {
		case CardsDealt:
			view.promptForFlip();
			break;
		case WinnerRevealed:
			view.promptForNewGame();
			break;
		default:
			break;
		}
	}

	public void addPlayer(String playerName) {
		if (gameState == GameState.AddingPlayers) {
			// nous ajoutons les Players de la classe PLayer qui implements IPlayer
			// et non new Iplayer suggeré par Eclipse lors de l ajout de IPlayer dans les
			// occurences anciennemnt Player
			// les interface ne s intantie pas tout commes les classe abstraite et les
			// classe utilitaires
			players.add(new Player(playerName));
			view.showPlayerName(players.size(), playerName);
		}
	}

	public void startGame() {
		if (gameState != GameState.CardsDealt) {
			deck.shuffle();
			int playerIndex = 1;
			for (IPlayer player : players) {
				player.addCardToHand(deck.removeTopCard());
				view.showFaceDownCardForPlayer(playerIndex++, player.getName());
			}
			gameState = GameState.CardsDealt;
		}
		this.run();
	}

	public void flipCards() {
		int playerIndex = 1;
		for (IPlayer player : players) {
			PlayingCardAdapter playingCard = player.getCard(0);

			System.out.println("faceup de PlayingCard  depuis le controller" + playingCard.flip());

			/* ********************************pattern Adapter********************** */

			// PLayingCardAdapter est l emballer de PlayingCard et de CoolCard pour les
			// adapter ensemble grace à l interface IplayableCard
			// PLayingCardAdapter herite de PLayingCard et adapte le code de Playingcard
			// dont il herite en modifiant l interface implementé avec le code code card et
			// sa méthode turnover toutes les occureces playingCard d origine remplacé par
			// PlayongCradAdapter pour pouvoir integrer
			// et adpater la nouvelle fonctionnalité de coolCard sans reecrire le code de
			// PlayCard, on utilise
			// le design pattern Adapter
			// si on veut plus l adapter la nouvelle fonctionnalité on enleve
			// PLayingCardAdapter et garde son implementation de Playablecard d origine pour
			// flip() au lieude turnover()
			PlayingCardAdapter pc = player.getCard(0);

			pc.flip();

			System.out.println("faceup de PlayingCardAdapter de PlayingCard depuis le controller" + pc.isFaceUp());
			view.showCardForPlayer(playerIndex++, player.getName(), pc.getRank().toString(), pc.getSuit().toString());
		}

		evaluateWinner();
		displayWinner();
		rebuildDeck();
		gameState = GameState.WinnerRevealed;
		this.run();
	}

	void evaluateWinner() {
		// on evalue le winner , si l eglité est absolue en valeur et couleur c est le
		// controller sui decide de recommence un tour de jeu,et d arreter le jeu au
		// 5eme round
		try {

			/* ********************************pattern Decorator********************** */
			// utilisation de l objet Decorator WinnerPlayer qui utilise l objet initial
			// player
			// avec un methode de l interface Iplayer qui affiche le nom du player avec une
			// decoration autour du nom Player
			winner = new WinnerPlayer(evaluator.evaluateWinner(players));
			if (winner == null && round <= 5) {
				round++;
				gameState = GameState.WinnerRevealed;
				this.run();
			}

		} catch (NullPointerException e) {
			// une winner provoque une une nullpointer exception
			// apres avoir renvoyé null au moins cinq fois dans les 5 round executé, le
			// system gere
			// l exception en arretant le jeu
			System.exit(0);
		}

	}

	void displayWinner() {
		view.showWinner(winner.getName());
	}

	void rebuildDeck() {
		for (IPlayer player : players) {
			deck.returnCardToDeck(player.removeCard());
		}
	}

	void exitGame() {
		System.exit(0);
	}

	public void nextAction(String nextChoice) {
		if ("+q".equals(nextChoice))
			exitGame();
		startGame();
	}

}