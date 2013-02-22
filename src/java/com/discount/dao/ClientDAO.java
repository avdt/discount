package com.discount.dao;

import com.discount.model.Client;

public interface ClientDAO extends GenericDAO<Client> {

	Client findByName(String name);
}
