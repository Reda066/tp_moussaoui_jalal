package tp;

import tp.ObjetConnecte;

/**
 * Cette interface impose la redefinition des methode qui font des SELECT sur la BD
 */
public interface Update {

	void update(ObjetConnecte objetConnecte);

}