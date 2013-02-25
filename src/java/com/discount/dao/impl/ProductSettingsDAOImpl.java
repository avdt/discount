package com.discount.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.discount.dao.ProductSettingsDAO;
import com.discount.model.ProductSettings;
import com.discount.util.CustomHibernateDaoSupport;

@Repository
public class ProductSettingsDAOImpl extends CustomHibernateDaoSupport implements
		ProductSettingsDAO {

	@Override
	public void save(ProductSettings object) {
		getHibernateTemplate().save(object);
	}

	@Override
	public void update(ProductSettings object) {
		getHibernateTemplate().update(object);
	}

	@Override
	public void delete(ProductSettings object) {
		getHibernateTemplate().delete(object);
	}

	@Override
	public ProductSettings findById(Integer id) {
		List<ProductSettings> list = getHibernateTemplate().find(
				"from ProductSettings where id=?", id);
		return list.get(0);
	}

	@Override
	public List<ProductSettings> findAll() {
		List<ProductSettings> list = getHibernateTemplate().find(
				"from ProductSettings");
		return list;
	}

	@Override
	public List<ProductSettings> findByProductId(Integer productId) {
		List<ProductSettings> list = getHibernateTemplate().find(
				"from ProductSettings where productId=?", productId);
		return list;
	}

	@Override
	public ProductSettings findByPropertyName(String propertyName) {
		List<ProductSettings> list = getHibernateTemplate().find(
				"from ProductSettings where propertyName=?", propertyName);
		return list.get(0);
	}

}
