package com.discount.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.discount.dao.ProductCategoryDAO;
import com.discount.model.ProductCategory;
import com.discount.util.CustomHibernateDaoSupport;

@Repository
public class ProductCategoryDAOImpl extends CustomHibernateDaoSupport implements
		ProductCategoryDAO {

	@Override
	public void save(ProductCategory object) {
		getHibernateTemplate().save(object);
	}

	@Override
	public void update(ProductCategory object) {
		getHibernateTemplate().update(object);
	}

	@Override
	public void delete(ProductCategory object) {
		getHibernateTemplate().delete(object);
	}

	@Override
	public ProductCategory findById(Integer id) {
		List<ProductCategory> list = getHibernateTemplate().find(
				"from ProductCategory where id=?", id);
		return list.get(0);
	}

	@Override
	public List<ProductCategory> findAll() {
		List<ProductCategory> list = getHibernateTemplate().find(
				"from ProductCategory");
		return list;
	}

	@Override
	public ProductCategory findByName(String name) {
		List<ProductCategory> list = getHibernateTemplate().find(
				"from ProductCategory where name=?", name);
		return list.get(0);
	}

}
