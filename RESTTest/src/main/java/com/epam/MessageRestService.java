package main.java.com.epam;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/json/product")
public class MessageRestService {
	@GET
	@Path("/get")
	@Produces("application/json")
	public Product getProduct() {

		Product product = new Product();
		product.setName("Laptop");
		product.setQty(1000);

		return product;

	}

	@POST
	@Path("/post")
	@Consumes("application/json")
	public Response createProductInJSON(Product product) {

		String result = "Product created : " + product;
		return Response.status(201).entity(result).build();

	}

}