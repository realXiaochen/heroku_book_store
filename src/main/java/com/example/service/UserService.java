package com.example.service;

import java.util.Set;

import com.example.domain.User;
import com.example.domain.security.UserRole;

public interface UserService {
	User createUser(User user, Set<UserRole>userRoles);
	
}
