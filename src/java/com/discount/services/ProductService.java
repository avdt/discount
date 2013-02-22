package com.discount.services;

import java.util.List;

import com.discount.model.Product;

public interface ProductService extends GenericService<Product> {
	List<Product> findByClientId(Integer clientId);
}
