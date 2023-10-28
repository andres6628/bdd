package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection c = null;
		PreparedStatement ps = null;
		String sql1 = "insert into habitaciones(habitacion_numero,precio_por_noche,piso,max_personas) "
				+ "values(?,?,?,?)";
		String sql2 = "insert into proyecto(id,proyecto,monto,fecha_inicio,fecha_fin)"
				+ "values(?,?,?,?,?)";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		String fechaI = "2023-10-25";
		String fechaF = "2024-07-10";
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/reto25","postgres","1234");
			System.out.println("Conexion exitosa");

			ps = c.prepareStatement(sql1);
			ps.setInt(1, 15);
			ps.setBigDecimal(2, new BigDecimal(250.4));
			ps.setInt(3, 1);
			ps.setInt(4, 10);
			if(ps.executeUpdate() == 1) {
				System.out.println("Registro 1 guardado");
			} 			
			Date fecha = sdf.parse(fechaI);
			Date fecha2 = sdf.parse(fechaF);		
			long fechaMili = fecha.getTime();
			long fechaMili2 = fecha2.getTime();
			java.sql.Date  fechaSQL = new java.sql.Date(fechaMili);
			java.sql.Date  fechaSQL2 = new java.sql.Date(fechaMili2);
			ps = c.prepareStatement(sql2);
			ps.setInt(1, 4);
			ps.setString(2,"App Municipio");
			ps.setBigDecimal(3, new BigDecimal(1500));
			ps.setDate(4, fechaSQL);
			ps.setDate(5, fechaSQL2);	
			if(ps.executeUpdate() == 1) {
				System.out.println("Registro 2 guardado");
			} 
		} catch (ClassNotFoundException | SQLException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
