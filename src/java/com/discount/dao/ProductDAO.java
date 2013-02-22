package com.discount.dao;

import java.util.List;

import com.discount.model.Product;

public interface ProductDAO extends GenericDAO<Product> {
	List<Product> findByClientId(Integer clientId);
}
