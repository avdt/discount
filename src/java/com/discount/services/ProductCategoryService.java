package com.discount.services;

import com.discount.model.ProductCategory;

public interface ProductCategoryService extends GenericService<ProductCategory> {
	ProductCategory findByName(String name);
}
