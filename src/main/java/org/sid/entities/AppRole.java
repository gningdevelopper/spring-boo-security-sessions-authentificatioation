package org.sid.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class AppRole {
	public AppRole(String roleName) {
		this.roleName=roleName;
	}
	@Id @GeneratedValue
	private long id;
	private String roleName;
}
