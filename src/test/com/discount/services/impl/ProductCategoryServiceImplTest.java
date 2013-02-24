package com.discount.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.discount.model.ProductCategory;
import com.discount.services.ProductCategoryService;

public class ProductCategoryServiceImplTest {
	private ApplicationContext appContext;
	private ProductCategoryService productCategoryService;

	@Test
	public void testSaveAndFind() {
		appContext = new ClassPathXmlApplicationContext(
				"spring/config/BeanLocations.xml");
		productCategoryService = (ProductCategoryService) appContext
				.getBean("productCategoryService");

		ProductCategory productCategory = getProductCategory();

		productCategoryService.save(productCategory);
		ProductCategory categoryByName = productCategoryService
				.findByName(productCategory.getName());

		Assert.assertEquals(productCategory, categoryByName);

		productCategoryService.delete(categoryByName);
	}

	@Test
	public void testUpdate() {

	}

	private ProductCategory getProductCategory() {
		ProductCategory productCategory = new ProductCategory();

		List<String> settings = new ArrayList<String>();
		settings.add("CPU");
		settings.add("RAM");

		productCategory.setName("test category");
		// productCategory.setSettings(settings);

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(new Integer(1));

		// productCategory.setTest(arrayList);

		return productCategory;
	}
}
