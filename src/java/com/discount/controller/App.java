package com.discount.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.discount.model.Client;
import com.discount.model.Product;
import com.discount.model.ProductCategory;
import com.discount.model.User;
import com.discount.model.UserRole;
import com.discount.services.ClientService;
import com.discount.services.ProductCategoryService;
import com.discount.services.ProductService;
import com.discount.services.UserRoleService;
import com.discount.services.UserService;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"spring/config/BeanLocations.xml");

		// testClient(appContext);

		// testUser(appContext);

		// testProductCategory(appContext);

		testRole(appContext);

		System.out.println("Done");
	}

	private static void testRole(ApplicationContext appContext) {
		UserRoleService roleService = (UserRoleService) appContext
				.getBean("userRoleService");

		UserRole role = new UserRole();
		role.setRole("Megapihar");

		roleService.save(role);

		UserRole role2 = roleService.findByRole(role.getRole());
		System.out.println(role2.getRole());
	}

	private static void testProductCategory(ApplicationContext appContext) {
		ProductCategoryService productCategoryService = (ProductCategoryService) appContext
				.getBean("productCategoryService");

		List<String> settings = new ArrayList<String>();
		settings.add("CPU");
		settings.add("RAM");
		settings.add("Memory");

		ProductCategory productCategory = new ProductCategory();
		productCategory.setName("Laptop");
		// productCategory.setSettings(settings);
		productCategoryService.save(productCategory);
	}

	private static void testProduct(ApplicationContext appContext) {
		ProductService productService = (ProductService) appContext
				.getBean("productService");
		ClientService clientService = (ClientService) appContext
				.getBean("clientService");

		Product product = new Product();
		product.setName("Product name");
		product.setShortDescription("Short description");
		product.setDiscount(new Integer(20));
		product.setDiscountPrice(new Integer(100));
		product.setInitialPrice(new Integer(150));
		product.setClient(clientService.findById(new Integer(200)));
		product.setBeginShowDate(new Date());
		product.setEndShowDate(new Date());
		product.setLongDescription("Long description");
		// product.setProductCategory(productCategory);
		// product.setSettings(settings);
	}

	private static void testUser(ApplicationContext appContext) {
		UserService userService = (UserService) appContext
				.getBean("userService");
		// UserRoleService userRoleService = (UserRoleService) appContext
		// .getBean("userRoleService");

		User user = new User();
		user.setId(new Integer(1));
		// user.setLogin("login");
		// user.setPassword("password");
		// user.setEmail("fl@example.com");
		// user.setFirstName("Andriy");
		// user.setLastName("Vintoniv");
		// user.setRole(userRoleService.findAll());

		userService.save(user);

		List<User> allUsers = userService.findAll();

		// User user2 = userService.findByLogin(user.getLogin());

		// user.setEmail("updated@example.com");
		userService.update(user);

	}

	private static void testClient(ApplicationContext appContext) {
		ClientService clientService = (ClientService) appContext
				.getBean("clientService");

		/** insert **/
		Client client = new Client();
		client.setName("First client without id");
		client.setType("golden");
		clientService.save(client);

		/** select **/
		Client client2 = clientService.findByName("First client");
		System.out.println(client2);

		/** update **/
		client2.setType("platinum");
		clientService.update(client2);

		/** delete **/
		// clientService.delete(client2);
	}
}
