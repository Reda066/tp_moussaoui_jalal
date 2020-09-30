package tp;
import tp.Utilisateur;
import tp.Show;
import tp.Create;
import tp.Update;
import tp.Delete;
import tp.ObjetConnecte;

/**
 * Un adminstrateur est une specification d'Utilisateur
 * Un adminstrateur a le droit de faire toute les methodes CRUD
 */
public class Administrateur extends Utilisateur implements Show, Create, Update, Delete{

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

    /**
     * On insert le objetConnecte
     */
    void save(ObjetConnecte objetConnecte) {

    }

    /**
     * On supprime le objetConnecte
     */
    void delete(int id) {

    }
}