package com.openclassrooms.cardgame;

import com.openclassrooms.cardgame.games.GameEvaluator;
import com.openclassrooms.cardgame.games.HighCardGameEvaluator;
import com.openclassrooms.cardgame.games.LowCardGameEvaluator;

public class GameEvaluatorFactory {
	public enum EvaluatorType {
		HIGHT, LOW
	};

	public static GameEvaluator makeEvaluator(EvaluatorType type) {
		switch (type) {
		case HIGHT:
			return new HighCardGameEvaluator();
		case LOW:
			return new LowCardGameEvaluator();

		}

		return new HighCardGameEvaluator();
	}
}
