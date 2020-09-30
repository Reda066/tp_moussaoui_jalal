package tp;

import tp.Periodicite;
import tp.Action;

/**
 * Une permission associe une action et une periodicite pour permetre apre
 * a Un utilisateur de effectuer une action
 */
public class Permission {

	private Periodicite periodicite;
	private Action action;

	public void setAction(Action action) {
		this.action = action;
	}

	public void setPeriodicite(Periodicite periodicite) {
		this.periodicite = periodicite;
	}

}