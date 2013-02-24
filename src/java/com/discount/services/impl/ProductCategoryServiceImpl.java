package com.discount.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.discount.dao.ProductCategoryDAO;
import com.discount.model.ProductCategory;
import com.discount.services.ProductCategoryService;

@Service("productCategoryService")
public class ProductCategoryServiceImpl implements ProductCategoryService {

	@Autowired
	private ProductCategoryDAO productCategoryDAO;

	@Override
	public void save(ProductCategory object) {
		this.productCategoryDAO.save(object);
	}

	@Override
	public void update(ProductCategory object) {
		this.productCategoryDAO.update(object);
	}

	@Override
	public void delete(ProductCategory object) {
		this.productCategoryDAO.delete(object);
	}

	@Override
	public ProductCategory findById(Integer id) {
		return this.productCategoryDAO.findById(id);
	}

	@Override
	public List<ProductCategory> findAll() {
		return this.productCategoryDAO.findAll();
	}

	@Override
	public ProductCategory findByName(String mane) {
		return this.productCategoryDAO.findByName(mane);
	}

}
