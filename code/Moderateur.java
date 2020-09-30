package tp;

import tp.Show;
import tp.Update;

public class Moderateur extends Utilisateur implements Show, Update{
     /**
     * On retourne la liste des ObjetConnecte
     */
	List<ObjetConnecte> list() {

    }

    /**
     * On retourne un ObjetConnecte selon son id
     */
	ObjetConnecte getById(int id){

    }
    
    /**
     * On modifie un objetConnecte
     */
    void update(ObjetConnecte objetConnecte) {

    }
}