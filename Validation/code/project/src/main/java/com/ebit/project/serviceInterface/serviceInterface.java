package com.ebit.project.serviceInterface;

import java.util.List;

import com.ebit.project.model.User;

import jakarta.validation.Valid;

public interface serviceInterface {

	

	User addData(@Valid User user);

	User updateData(int id, User user);

	String deleteDataById(int id);

	List<User> getData();
	
	

}
