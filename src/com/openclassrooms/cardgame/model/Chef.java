package com.openclassrooms.cardgame.model;

/* *********************pattern Strategy********************** */
public class Chef implements PrepareSteak {
	public PrepareSteak prepareSteak;

	public Chef(PrepareSteak prepareSteak) {
		this.prepareSteak = prepareSteak;
	}

	@Override
	public void cook(String steak) {
		prepareSteak.cook(steak);
	}

}
