package com.discount.dao;

import com.discount.model.UserRole;

public interface UserRoleDAO extends GenericDAO<UserRole> {
	UserRole findByRole(String role);
}
