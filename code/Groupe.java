package tp;

import tp.Utilisateur;
import tp.Permission;

/**
 * un Groupe permet de regrouper plusieurs utilisateurs en les donnant des permissions; 
 */

public class Groupe {

	private String nom;
	private List<Utilisateur> utilisateurs;
	private List<Permission> permissions;

}