/**
 * une borne definie une certaine etat d'un objet,
 * par exemple une lamp a plusieurs bornes:
 * - Luminosite entre 0 a 1000
 * - allume ou eteint
 * etc
 */

public abstract class Borne {

	/**
	 *  valeur, c'est la valeur actuelle (exemple : luminosite 15%)
	 *  MAX_VALUE = 100
	 *  MIN_VALUE = 0
	 */
	private String nom;
	private int valeur;
	private int MAX_VALUE;
	private int MIN_VALUE;
	

	public int setValeur(int valeur) {
		this.valeur = valeur;
	}

	public int getValeur() {
		return valeur;
	}

	public int getMAX_VALUE() {
		return this.MAX_VALUE;
	}

	public void setMAX_VALUE(int MAX_VALUE) {
		this.MAX_VALUE = MAX_VALUE;
	}

	public int getMIN_VALUE() {
		return this.MIN_VALUE;
	}

	public void setMIN_VALUE(int MIN_VALUE) {
		this.MIN_VALUE = MIN_VALUE;
	}

}