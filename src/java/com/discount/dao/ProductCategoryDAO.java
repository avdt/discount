package com.discount.dao;

import com.discount.model.ProductCategory;

public interface ProductCategoryDAO extends GenericDAO<ProductCategory> {
	ProductCategory findByName(String name);
}
