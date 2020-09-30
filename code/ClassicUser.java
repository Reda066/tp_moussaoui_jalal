package tp;

import tp.Adresse;
import tp.Show;


public class ClassicUser extends Utilisateur implements Show{
	private Adresse adresseFacturation;
	private Adresse adresse;
	private int numeroTelephone;
	private String fonction;

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
}