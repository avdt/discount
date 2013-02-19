package com.discount.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "client", uniqueConstraints = {
		@UniqueConstraint(columnNames = "id"),
		@UniqueConstraint(columnNames = "name") })
public class Client {

	@Id
	@SequenceGenerator(name = "id_seq", sequenceName = "client_id_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "name", unique = true, nullable = false, length = 100)
	private String name;

	@Column(name = "type", nullable = true, unique = false)
	private String type;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
