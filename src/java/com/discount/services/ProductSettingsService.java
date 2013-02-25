package com.discount.services;

import java.util.List;

import com.discount.model.ProductSettings;

public interface ProductSettingsService extends GenericService<ProductSettings> {
	List<ProductSettings> findByProductId(Integer productId);

	ProductSettings findByPropertyName(String propertyName);
}
