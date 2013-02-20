package com.discount.dao;

import com.discount.model.Client;

public interface ClientDAO {
	void save(Client stock);

	void update(Client stock);

	void delete(Client stock);

	Client findByName(String name);
}
