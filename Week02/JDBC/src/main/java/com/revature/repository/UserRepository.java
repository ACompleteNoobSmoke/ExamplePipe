package com.revature.repository;

import java.util.List;

import com.revature.model.User;

public interface UserRepository {

	public List<User> getAllUsers();
	public void getUserById(int id);
	public void insertUser();
	public void updateUser();
	public void deleteUser();
}
