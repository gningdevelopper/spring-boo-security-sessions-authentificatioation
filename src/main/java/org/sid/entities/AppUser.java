package org.sid.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class AppUser {
	public AppUser(String username, String password, Collection<AppRole> roles) {
		this.username=username;
		this.password=password;
		this.roles=roles;
	}
	@Id @GeneratedValue
	private long id;
	@Column(unique=true)
	private String username;
	private String password;
	//eager signifie quand on charge l'utilisateur automatiquement il va charger ses roles
	@ManyToMany(fetch=FetchType.EAGER)
	private Collection<AppRole> roles=new ArrayList<>();
}
