package tp;

import tp.API;
public class Action {
	/**
	 * Chaque Action a un nom, et un id
	 */
	private int id;
	private String nom;

	/**
	 * cette methode utilise l'API pour executer l'action
	 * exemple : eteindre une lampe
	 */
	public void run() {
		
	}

	/**
	 * nom getter
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * id getter
	 */
	public int getId() {
		return this.id;
	}

}