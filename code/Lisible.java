/**
 * cette interface, defnie qu'un objet connecte peut nous fournir des informations lisible
 */
import tp.Capteur;

public interface Lisible {

	/**
	 * L'objet connecte doit avoir une liste Des capteur
	 */
	List<Capteur> getCapteurs();

}