package com.openclassrooms.cardgame.model;

/* *********************pattern Strategy********************** */
public class CookSteak implements PrepareSteak {
	public PrepareSteak prepareSteak;

	public CookSteak(PrepareSteak prepareSteak) {
		this.prepareSteak = prepareSteak;
	}

	@Override
	public void cook(String steak) {
		prepareSteak.cook(steak);
	}

}
