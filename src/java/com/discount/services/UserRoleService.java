package com.discount.services;

import com.discount.model.UserRole;

public interface UserRoleService extends GenericService<UserRole> {
	UserRole findByRole(String role);
}
