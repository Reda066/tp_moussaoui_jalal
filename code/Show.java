package tp;

import tp.ObjetConnecte;


/**
 * Cette interface impose la redefinition des methodes qui font des SELECT sur la BD
 */
public interface Show {

	/**
     * On retourne la liste des ObjetConnecte
     */
	List<ObjetConnecte> list();

	/**
     * On retourne un ObjetConnecte selon son id
     */
	ObjetConnecte getById(int id);

}