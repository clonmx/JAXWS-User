package com.jaxws.businesslogic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jaxws.connection.Conexion;
import com.jaxws.models.UserModel;

public class UserBusinessLogic {

	static Conexion mysqlconnect = new Conexion();

	public UserModel getUserbyId(int userId) {

		Connection conexion = mysqlconnect.conectar();
		UserModel userModel = new UserModel();

		try {
			Statement s = conexion.createStatement();
			ResultSet result = s.executeQuery("select username, password, fullname from user where id =" + userId);
			if (result.next()) {
				userModel.setId(userId);
				userModel.setUserName(result.getString(1));
				userModel.setPassword(result.getString(2));
				userModel.setFullName(result.getString(3));
			} else {
				userModel.setId(userId);
				userModel.setUserName("Usuario no existe");
				userModel.setPassword(null);
				userModel.setFullName(null);
			}
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}

		return userModel;

	}

	public boolean getAuthentication(String username, String password) {

		boolean authenticate = false;
		try {
			Connection conexion = mysqlconnect.conectar();

			Statement s = conexion.createStatement();
			ResultSet result = s.executeQuery(
					"select username from user where username ='" + username + "' and password ='" + password + "'");
			if (result.next()) {
				authenticate = true;
			}
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}

		return authenticate;

	}

}
