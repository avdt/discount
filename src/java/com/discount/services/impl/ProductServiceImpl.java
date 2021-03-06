package com.discount.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.discount.dao.ProductDAO;
import com.discount.model.Product;
import com.discount.services.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDAO;

	@Override
	public void save(Product object) {
		productDAO.save(object);
	}

	@Override
	public void update(Product object) {
		productDAO.update(object);
	}

	@Override
	public void delete(Product object) {
		productDAO.delete(object);
	}

	@Override
	public Product findById(Integer id) {
		return productDAO.findById(id);
	}

	@Override
	public List<Product> findAll() {
		return productDAO.findAll();
	}

	@Override
	public List<Product> findByClientId(Integer clientId) {
		return productDAO.findByClientId(clientId);
	}

	@Override
	public Product findByName(String name) {
		return this.productDAO.findByName(name);
	}

	@Override
	public List<Product> findByCategoryId(Integer productCategoryId) {
		return this.productDAO.findByCategoryId(productCategoryId);
	}

}
