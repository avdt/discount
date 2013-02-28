package com.discount.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.discount.model.Client;
import com.discount.services.ClientService;

@Path("/json/product")
public class MessageRestService {

	@Autowired
	private ClientService clientService;

//	@GET
//	@Path("/get")
//	@Produces("application/json")
//	public Client getClient() {
//
////		Client client = clientService.findByName("init client");
//		return client;
//	}

	@POST
	@Path("/post")
	@Consumes("application/json")
	public Response createProductInJSON(Product product) {

		String result = "Product created : " + product;
		return Response.status(201).entity(result).build();

	}

}