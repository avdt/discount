package com.discount.services;

import com.discount.model.Client;

public interface ClientService {
	void save(Client client);

	void update(Client client);

	void delete(Client client);

	Client findByName(String client);
}
