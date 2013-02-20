package com.discount.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "user", uniqueConstraints = {
		@UniqueConstraint(columnNames = "id"),
		@UniqueConstraint(columnNames = "login"),
		@UniqueConstraint(columnNames = "email") })
public class User {

	@Id
	@SequenceGenerator(name = "id_seq", sequenceName = "user_id_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "login", unique = true, nullable = false, length = 100)
	private String login;

	@Column(name = "password", unique = false, nullable = false, length = 100)
	private String password;

	@Column(name = "firstName", unique = false, nullable = true, length = 100)
	private String firstName;

	@Column(name = "lastName", unique = false, nullable = true, length = 100)
	private String lastName;

	@Column(name = "email", unique = true, nullable = false, length = 100)
	private String email;

	@OneToMany
	private Set<UserRole> role;

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

	public Set<UserRole> getRole() {
		return role;
	}

	public void setRole(Set<UserRole> role) {
		this.role = role;
	}
}
