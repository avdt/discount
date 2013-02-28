package com.discount.services.impl;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.discount.model.Client;
import com.discount.services.ClientService;

public class ClientServiceImplTest {
	private ApplicationContext appContext = new ClassPathXmlApplicationContext(
			"spring/config/BeanLocations.xml");

	@Test
	public void testSave() {
		ClientService clientService = (ClientService) appContext
				.getBean("clientService");

		Client expectedClient = getClient();

		clientService.save(expectedClient);

		Client actualClient = clientService
				.findByName(expectedClient.getName());

		Assert.assertEquals(expectedClient, actualClient);

		clientService.delete(expectedClient);

	}

	@Test
	public void testUpdate() {
		String NAME_TO_UPDATE = "Updated name";

		ClientService clientService = (ClientService) appContext
				.getBean("clientService");

		Client expectedClient = getClient();
		clientService.save(expectedClient);

		Client actualClient = clientService
				.findByName(expectedClient.getName());

		actualClient.setName(NAME_TO_UPDATE);
		clientService.update(actualClient);

		Client updatedClient = clientService.findById(actualClient.getId());

		Assert.assertEquals(actualClient, updatedClient);

		clientService.delete(expectedClient);
	}

	private Client getClient() {
		Client client = new Client();

		client.setName("Rozetka");
		client.setType("golden");

		return client;
	}

}
