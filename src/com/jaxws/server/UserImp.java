package com.jaxws.server;

import javax.jws.WebService;

import com.jaxws.businesslogic.UserBusinessLogic;
import com.jaxws.models.UserModel;

@WebService(endpointInterface = "com.jaxws.server.User")
public class UserImp implements User {

	UserBusinessLogic userBusinessLogic = new UserBusinessLogic();

	@Override
	public UserModel getUserById(int id) {
		// TODO Auto-generated method stub
		return userBusinessLogic.getUserbyId(id);
	}

	public boolean getAuthentication(String username, String password) {
		// TODO Auto-generated method stub

		return userBusinessLogic.getAuthentication(username, password);

	}

}
