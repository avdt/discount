package com.discount.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.discount.model.Client;
import com.discount.services.ClientService;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"spring/config/BeanLocations.xml");

		ClientService clientService = (ClientService) appContext
				.getBean("clientService");

		/** insert **/
		Client client = new Client();
		client.setId(new Integer(1));
		client.setName("First client");
		client.setType("golden");
		clientService.save(client);

		/** select **/
		Client client2 = clientService.findByName("First client");
		System.out.println(client2);

		/** update **/
		client2.setType("platinum");
		clientService.update(client2);

		/** delete **/
		clientService.delete(client2);

		System.out.println("Done");
	}
}
