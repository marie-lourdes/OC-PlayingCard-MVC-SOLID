package com.openclassrooms.cardgame.model;

/* *********************pattern Strategy********************** */
public class RareSteak implements PrepareSteak {

	public void cook(String steak) {
		/* pas trop longtemps */
		System.out.println(steak + " cuisson bleu");
	}

}
