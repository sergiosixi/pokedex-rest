package edu.cibertec.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConexionMySQL {

	private static Connection conexion;
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection obtenerConexion(){
		String cadenaCn = "jdbc:mysql://localhost:3306/bd_pokemon?user=root&password=mysql&useSSL=false";
		try {
			conexion = DriverManager.getConnection(cadenaCn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conexion;
	}
}
