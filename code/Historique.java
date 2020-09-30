/**
 * Historique nous permets de logger les actions, en sauvegardant l'utilisateur, l'action, la date et sur 
 * quel objet connecte
 */

package tp;

import tp.Action;
import tp.Utilisateur;
import tp.ObjetConnecte;

public class Historique {

	private Date dateCreation = new Date();
	private Action action;
	private Utilisateur utilisateur;
	private ObjetConnecte objetConnecte;

	public String toString() {
		return utilisateur.getNom() + " | "+ action.getNom() + " | "+ objetConnecte.getNom() + " | " +  dateCreation;
	}

}