package com.openclassrooms.cardgame.model;

public class SoundManager {
	// il faut garder en mémoire l'instance unique quelque part
	// nous allons donc garder une variable statique

	private static SoundManager _instance = null;

	// comme n'importe quelle classe, il y a des attributs

	private int currentSoundLevel;

	// rendre le constructeur privé
	// afin qu'il ne soit appelé par rien d'autre
	// que les méthodes de cette classe même

	private SoundManager() {
		currentSoundLevel = 11;
	}

	// la méthode que les clients appellent pour accéder au singleton
	public static SoundManager getInstance() {

		// si nous n'avons pas déjà d'instance, en créer une maintenant
		if (_instance == null)

			_instance = new SoundManager();

		// retourner celle que nous venons de faire
		// ou que nous avions déjà faite

		return _instance;
	}

	// rien de spécial à propos des autres méthodes

	public void setVolume(int value) {
		currentSoundLevel = value;
	}

	public int getVolume() {
		return currentSoundLevel;
	}

}
