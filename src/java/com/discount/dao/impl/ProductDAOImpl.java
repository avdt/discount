package com.discount.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.discount.dao.ProductDAO;
import com.discount.model.Client;
import com.discount.model.Product;
import com.discount.util.CustomHibernateDaoSupport;

@Repository
public class ProductDAOImpl extends CustomHibernateDaoSupport implements
		ProductDAO {

	@Override
	public void save(Product object) {
		getHibernateTemplate().save(object);
	}

	@Override
	public void update(Product object) {
		getHibernateTemplate().update(object);
	}

	@Override
	public void delete(Product object) {
		getHibernateTemplate().delete(object);
	}

	@Override
	public Product findById(Integer id) {
		List<Product> list = getHibernateTemplate().find(
				"from Product where id=?", id);
		return list.get(0);
	}

	@Override
	public List<Product> findAll() {
		List<Product> list = getHibernateTemplate().find("from Product");
		return list;
	}

	@Override
	public List<Product> findByClientId(Integer clientId) {
		List<Product> list = getHibernateTemplate().find(
				"from Product where clientId=?", clientId);
		return list;
	}

}
