package com.test.ejb;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User1 implements Serializable {
	private static final long serialVersionUID = -8560447261650234259L;

	private Integer id;
	private String name;
	
//	@OneToMany
//	@JoinColumn(name = "user_id")
//	private Set<Address1> address;

	@Id
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public Set<Address1> getAddress() {
//		return address;
//	}
//
//	public void setAddress(Set<Address1> address) {
//		this.address = address;
//	}

}
