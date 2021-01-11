package com.jaxws.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	
	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/examen?serverTimezone=UTC";
	private static final String USER = "Franco";
	private static final String PASSWORD = "12234556";

	public Connection conectar() {

		java.sql.Connection conexion = null;
		try {
			Class.forName(CONTROLADOR);
			conexion = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.print("conexion OK\n");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Errror al cargar el controlador");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.print("Error en la conexion");
			e.printStackTrace();
		}

		return conexion;
	}


	public static void main(String[] args) {

	}
	

}
