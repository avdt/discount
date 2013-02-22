package com.discount.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.discount.dao.ClientDAO;
import com.discount.model.Client;
import com.discount.util.CustomHibernateDaoSupport;

@Repository
public class ClientDAOImpl extends CustomHibernateDaoSupport implements
		ClientDAO {

	@Override
	public void save(Client client) {
		getHibernateTemplate().save(client);
	}

	@Override
	public void update(Client client) {
		getHibernateTemplate().update(client);
	}

	@Override
	public void delete(Client client) {
		getHibernateTemplate().delete(client);
	}

	@Override
	public Client findByName(String name) {
		List<Client> list = getHibernateTemplate().find(
				"from Client where name=?", name);
		return list.get(0);
	}

	@Override
	public Client findById(Integer id) {
		List<Client> list = getHibernateTemplate().find(
				"from Client where id=?", id);
		return list.get(0);
	}

	@Override
	public List<Client> findAll() {
		List<Client> list = getHibernateTemplate().find("from Client");
		return list;
	}

}
