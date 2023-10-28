package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConexionBDD {
	private final static String DRIVER =  "org.postgresql.Driver";
	private static String URL =  "jdbc:postgresql://localhost:5432/foreing_keys";
	private static String URL2 =  "jdbc:postgresql://localhost:5432/reto25";

	private final static String USER = "postgres";
	private final static String PSWD = "1234";
	private static final Logger LOGGER = LogManager.getLogger(ConexionBDD.class);


	public static Connection conectar()throws Exception {
	Connection c = null;
	try {
		Class.forName(DRIVER);
		c = DriverManager.getConnection(URL,USER,PSWD);

	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		LOGGER.error("Driver no encontrado", e);
		throw new Exception("Driver no encontrado");
	} catch (SQLException e) {
		LOGGER.error("Error en credenciales para la conexion", e);
		throw new Exception("Error en credenciales para la conexion");

	}
	
	return c; 
	}
	
	public static Connection conectarBD2()throws Exception {
	Connection c = null;
	try {
		Class.forName(DRIVER);
		c = DriverManager.getConnection(URL2,USER,PSWD);

	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		LOGGER.error("Driver no encontrado", e);
		throw new Exception("Driver no encontrado");
	} catch (SQLException e) {
		LOGGER.error("Error en credenciales para la conexion", e);
		throw new Exception("Error en credenciales para la conexion");

	}
	
	return c; 
	}
}
