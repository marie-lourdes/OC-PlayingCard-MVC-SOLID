package com.openclassrooms.cardgame.games;

import java.util.List;

import com.openclassrooms.cardgame.model.Player;
<<<<<<< HEAD
import com.openclassrooms.cardgame.model.PlayingCardAdapter;
=======
import com.openclassrooms.cardgame.model.PlayingCard;
>>>>>>> part3-chap3-step1

public class LowCardGameEvaluator implements GameEvaluator {

	@Override
	public Player evaluateWinner(List<Player> players) {
		Player bestPlayer = null;
		int bestRank = -1;
		int bestSuit = -1;

		for (Player player : players) {
			boolean newBestPlayer = false;

			if (bestPlayer == null) {
				newBestPlayer = true;
			} else {
<<<<<<< HEAD
				PlayingCardAdapter pc = player.getCard(0);
=======
				PlayingCard pc = player.getCard(0);
>>>>>>> part3-chap3-step1
				int thisRank = pc.getRank().value();
				if (thisRank <= bestRank) {
					if (thisRank < bestRank) {
						newBestPlayer = true;
					} else {
						if (pc.getSuit().value() < bestSuit) {
							newBestPlayer = true;
						}
					}
				}
			}

			if (newBestPlayer) {
				bestPlayer = player;
<<<<<<< HEAD
				PlayingCardAdapter pc = player.getCard(0);
=======
				PlayingCard pc = player.getCard(0);
>>>>>>> part3-chap3-step1
				bestRank = pc.getRank().value();
				bestSuit = pc.getSuit().value();
			}
		}

		return bestPlayer;
	}

}
