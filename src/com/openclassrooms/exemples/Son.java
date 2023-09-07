package com.openclassrooms.exemples;

/* *********************pattern State (pattern d 'Etat)********************** */
//Objet initial dont le comportement est modifié par les objets utilisé par le client main: soit objet Daughter ou SonFriends
//qui modifiera la methode getMumSoda en fonction de la person in the Kitchen les objets utilisés
public class Son implements Person {
	private Person personInKitchen;

	public Son(Person p) {
		this.personInKitchen = p;
	}

	public String getMumSoda() {
		return personInKitchen.getSodaFromFridge();
	}

	@Override
	public String getSodaFromFridge() {
		return " soda ginger ale servi  a mum, c'est ce qu elle aime, parfait!";
	}

}
