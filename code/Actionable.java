package tp;
import tp.Borne;

/**
 * cette interface, defnie qu'un utilisateur peut modifier l'etat d'un objet
 * un objet qui implemente cette interface peut avoir plusieurs bornes actionable
 */
public interface Actionable {

	/**
	 * Un objet actionable doit pouvoir retourner une liste des Bornes
	 */
	List<Borne> getBornes();

}