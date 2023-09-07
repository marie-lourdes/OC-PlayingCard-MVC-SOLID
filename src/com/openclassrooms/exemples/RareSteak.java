package com.openclassrooms.exemples;

/* *********************pattern Strategy********************** */
public class RareSteak implements PrepareSteak {

	public void cook(String steak) {
		/* pas trop longtemps */
		System.out.println(steak + " cuisson bleu");
	}

}
