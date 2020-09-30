package tp;

import tp.Permission;
import tp.hasPermissions;
/**
 * Une classe qui presente un utilisateur avec une liste des permission
 */

public class Utilisateur implements hasPermissions {

	private String name;
	private String username;
	private String password;
	private String email;
	private int ip;
	private List<Permission> permissions;

	public String getName() {
		return this.name;
	}

	public List<Permission> getPermissions() {
		return this.permissions;
	}
}