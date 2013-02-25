package com.discount.dao;

import java.util.List;

import com.discount.model.ProductSettings;

public interface ProductSettingsDAO extends GenericDAO<ProductSettings> {
	List<ProductSettings> findByProductId(Integer productId);

	ProductSettings findByPropertyName(String propertyName);
}
