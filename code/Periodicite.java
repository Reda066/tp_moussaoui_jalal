package tp;


/** 
 * Cette classe nous permet de limiter l'utilisation d'un objet a partir 
 * d'une heure de debut et fin dans la journee, plus un pattern de jour (exemple : Chaque Samedi)
 * pour pouvoir tester si la date actuelle match la periodicite donnee
 */
public class Periodicite {

	private String heureDebut;
	private String heureFin;

	// Un patter pour verifier Si le jour match la contrainte
	private String datePattern;

	public boolean match(Date date) {
	}
}