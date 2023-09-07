package com.openclassrooms.exemples;

/* *********************pattern State (pattern d 'Etat)********************** */
//objet utilisé par le client main pour changer le comportement de l objet intial Son
public class Daughter implements Person {

	@Override
	public String getSodaFromFridge() {
		return " soda a la vanille servi a mum";
	}

}
