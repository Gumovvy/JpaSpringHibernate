package com.gmv.decerto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Vechicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vechcleId;
	private String vechicleName;
	@ManyToMany
	private Collection<UserDetails> userList = new ArrayList<UserDetails>();

	public Collection<UserDetails> getUserList() {
		return userList;
	}

	public void setUserList(Collection<UserDetails> userList) {
		this.userList = userList;
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
