package org.sid.service;

import org.sid.entities.AppRole;
import org.sid.entities.AppUser;

public interface AccountService {
	public AppUser saveUser(AppUser user);
	public AppRole saverole(AppRole role);
	public void addRoleToUser(String username,String roleName);
	public AppUser findUserByUsername(String username);
}
