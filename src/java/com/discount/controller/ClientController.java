package com.discount.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class ClientController {
	private ApplicationContext appContext = new ClassPathXmlApplicationContext(
			"spring/config/BeanLocations.xml");
	
	
}
