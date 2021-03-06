package com.discount.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "`user`", uniqueConstraints = {
		@UniqueConstraint(columnNames = "id"),
		@UniqueConstraint(columnNames = "login") })
public class User {

	@Id
	@SequenceGenerator(name = "id_seq", sequenceName = "user_id_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "login")
	private String login;

	@Column(name = "password")
	private String password;

	@Column(name = "`firstName`")
	private String firstName;

	@Column(name = "`lastName`")
	private String lastName;

	@Column(name = "email")
	private String email;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinTable(name = "`user_role`", joinColumns = { @JoinColumn(name = "`userId`", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "`roleId`", nullable = false, updatable = false) })
	private List<UserRole> roles;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<UserRole> getRoles() {
		return roles;
	}

	public void setRoles(List<UserRole> roles) {
		this.roles = roles;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		User user;
		if (obj instanceof User) {
			user = (User) obj;

			if (this.getLogin().equals(user.getLogin())
					&& this.getEmail().equals(user.getEmail())
					&& this.getPassword().equals(user.getPassword())
					&& this.getFirstName().equals(user.getFirstName())
					&& this.getLastName().equals(user.getLastName())
			/* && this.getRoles().equals(user.getRoles()) */) {
				result = true;
			}
		}
		return result;
	}

}
