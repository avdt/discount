//package com.discount.rest;
//
//import javax.ws.rs.Consumes;
//import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.Response;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import com.discount.model.Client;
//import com.discount.services.ClientService;
//
//@Path("/rest/client")
//public class ClientRestService {
//	private ApplicationContext appContext = new ClassPathXmlApplicationContext(
//			"spring/config/BeanLocations.xml");
//
//	@GET
//	@Path("/get")
//	@Produces("application/json")
//	public Client getClient() {
//		ClientService clientService = (ClientService) appContext
//				.getBean("clientService");
//
//		Client client = clientService.findByName("init client");
//		return client;
//
//	}
//
//	@POST
//	@Path("/post")
//	@Consumes("application/json")
//	public Response createClientInJSON(Client client) {
//
//		String result = "Product created : " + client;
//		return Response.status(201).entity(result).build();
//
//	}
//
//}
