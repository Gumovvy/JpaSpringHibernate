package com.gmv.decerto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
public class Vechicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vechcleId;
	private String vechicleName;
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private UserDetails user;

	public UserDetails getUser() {
		return user;
	}

	public void setUser(UserDetails user) {
		this.user = user;
	}

	public int getVechcleId() {
		return vechcleId;
	}

	public void setVechcleId(int vechcleId) {
		this.vechcleId = vechcleId;
	}

	public String getVechicleName() {
		return vechicleName;
	}

	public void setVechicleName(String vechicleName) {
		this.vechicleName = vechicleName;
	}

}
