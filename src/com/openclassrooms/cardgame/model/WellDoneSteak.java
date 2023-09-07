package com.openclassrooms.cardgame.model;

public class WellDoneSteak implements PrepareSteak {

	public void cook(String steak) {
		/* oublier le steak et revenir plus tard */
		System.out.println(steak + " cuisson bien cuit");
	}

}
