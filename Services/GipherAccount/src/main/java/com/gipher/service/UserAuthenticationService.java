package com.gipher.service;

import com.gipher.exception.UserAlreadyExistsException;
import com.gipher.exception.UserNotFoundException;
import com.gipher.model.User;

public interface UserAuthenticationService {

    	/*
	 * Should not modify this interface. You have to implement these methods in
	 * corresponding Impl classes
	 */

    public User findByUserIdAndPassword(String userId, String password) throws UserNotFoundException;

    boolean saveUser(User user) throws UserAlreadyExistsException;
}
