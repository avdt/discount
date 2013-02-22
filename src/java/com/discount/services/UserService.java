package com.discount.services;

import com.discount.model.User;

public interface UserService extends GenericService<User> {

	User findByEmail(String email);

	User findByLogin(String login);

}
