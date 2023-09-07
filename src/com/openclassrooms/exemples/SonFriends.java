package com.openclassrooms.exemples;

/* *********************pattern State (pattern d 'Etat)********************** */
//objet utilisé par le client main pour changer le comportement de l objet intial Son
public class SonFriends implements Person {

	@Override
	public String getSodaFromFridge() {
		return " eau gazeuse, premiere boisson trouvé sous la main dans le frigo servi a mum,oops mon pote s est trompé";
	}

}
