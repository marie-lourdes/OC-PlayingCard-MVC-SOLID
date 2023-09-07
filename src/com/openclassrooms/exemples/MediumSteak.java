package com.openclassrooms.exemples;

/* *********************pattern Strategy********************** */
public class MediumSteak implements PrepareSteak {

	public void cook(String steak) {
		/* garder le steak sur le grill un peu trop longtemps */
		System.out.println(steak + " cuisson à point");
	}

}
