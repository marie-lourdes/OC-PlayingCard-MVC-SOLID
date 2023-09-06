package com.openclassrooms.cardgame.games;

import java.util.List;

import com.openclassrooms.cardgame.model.IPlayer;
import com.openclassrooms.cardgame.model.PlayingCardAdapter;

public class HighCardGameEvaluator implements GameEvaluator {

	@Override
	public IPlayer evaluateWinner(List<IPlayer> players) {
		IPlayer bestPlayer = null;
		int bestRank = -1;
		int bestSuit = -1;

		for (IPlayer player : players) {
			boolean newBestPlayer = false;

			if (bestPlayer == null) {
				newBestPlayer = true;
			} else {
				PlayingCardAdapter pc = player.getCard(0);
				int thisRank = pc.getRank().value();
				if (thisRank >= bestRank) {
					// si la carte actuelle est superieur ou egale a la carte engregistré
					// precedemment
					// on verifie la superiorité pou evaluer si ce joueur est le nouveau joueur avec
					// la carte la plus forte
					if (thisRank > bestRank) {
						newBestPlayer = true;
					} else {
						// si la carte du joueur actuel n est pas superieur à la carte du joueur
						// precedent comme meilleur joueur actuel
						// c'est que la carte est egale , puis le if global a deja trier les carte
						// superieur et egale
						// si c est egale en valeur rank on verifie la couleur de la carte du joueur
						// actuel avec celui
						// de la carte pr du joueur precedent gagnant actuelle
						if (pc.getSuit().value() > bestSuit) {
							newBestPlayer = true;
						}
						if (pc.getSuit().value() == bestSuit) {
							newBestPlayer = false;
							bestPlayer = null;
							System.out.println("egalité");
							// fonctionnalité de le valuation de l egalité des carte en valeur et couleur
							// testé avec testDeck
						}

					}
				}
			}

			if (newBestPlayer) {
				bestPlayer = player;
				PlayingCardAdapter pc = player.getCard(0);
				bestRank = pc.getRank().value();
				bestSuit = pc.getSuit().value();
			}
		}

		return bestPlayer;
	}

}
