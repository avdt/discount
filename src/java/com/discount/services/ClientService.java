package com.discount.services;

import com.discount.model.Client;

public interface ClientService extends GenericService<Client> {
	Client findByName(String client);
}
