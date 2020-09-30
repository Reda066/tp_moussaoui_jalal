package tp;
import tp.Borne;
import tp.Capteur;
import tp.Lisible;
import tp.Actionable;

/**
 * Un Objet connecete qui en meme temps actionable et lisible
 */
public class ObjetMixte extends ObjetConnecte implements Lisible, Actionable{

	List<Capteur> capteurs;
	List<Borne> bornes;

	public List<Capteur> getCapteurs() {
		this.capteurs;
	}

	public void getBornes() {
		this.bornes;
	}

}