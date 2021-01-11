package com.jaxws.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.jaxws.models.UserModel;

@WebService
public interface User {

	@WebMethod
	public UserModel getUserById(int id);

	@WebMethod
	public boolean getAuthentication(String username, String password);

}
