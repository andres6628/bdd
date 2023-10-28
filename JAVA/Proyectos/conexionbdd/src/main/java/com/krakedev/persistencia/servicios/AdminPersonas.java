package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);
	Connection c = null; 
	PreparedStatement ps = null;
	public void insertar(Persona p)throws Exception {
		String sql = "insert into personas(cedula, nombre, apellido, estatura, fecha_nacimiento, hora_nacimineto, cantidad_ahorrada, numero_hijos, estado_civil)"
				+ "	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
		try {
			c = ConexionBDD.conectar();
			//insertar
			ps = c.prepareStatement(sql);
			ps.setString(1, p.getCedula());
			ps.setString(2, p.getNombre());
			ps.setString(3, p.getApellido());
			ps.setDouble(4, p.getEstaura());
			ps.setDate(5, new java.sql.Date(p.getFecha_nacimiento().getTime()));
			ps.setTime(6, new Time(p.getHora_nacimiento().getTime()));
			ps.setBigDecimal(7, p.getCantidad_Ahorrada());
			ps.setInt(8, p.getNumero_hijos());
			ps.setString(9, p.getEstado_civil().getCodigo());
			

			if(ps.executeUpdate() == 1) {
				System.out.println("Registro guardado");
			}
		} catch (Exception e) {
			LOGGER.error("Error: Algo salio mal al insertar datos", e);
			throw new Exception("Error: Algo salio mal al insertar datos");
			// TODO: handle exception
		}finally {
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Error en la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
		
	}
	
	public void editar(Persona p) {
		String sql = "UPDATE personas SET "
				+ "nombre=?, apellido=?, estatura=?, fecha_nacimiento=?, hora_nacimineto=?, cantidad_ahorrada=?, numero_hijos=?, estado_civil=?"
				+ "	WHERE cedula = ?;";
		try {
			c = ConexionBDD.conectar();
			ps = c.prepareStatement(sql);
			
			ps.setString(1, p.getNombre());
			ps.setString(2, p.getApellido());
			ps.setDouble(3, p.getEstaura());
			ps.setDate(4, new java.sql.Date(p.getFecha_nacimiento().getTime()));
			ps.setTime(5, new Time(p.getHora_nacimiento().getTime()));
			ps.setBigDecimal(6, p.getCantidad_Ahorrada());
			ps.setInt(7, p.getNumero_hijos());
			ps.setString(8, p.getEstado_civil().getCodigo());
			
			ps.setString(9, p.getCedula());
			if(ps.executeUpdate() == 1) {
				LOGGER.debug("Registro actualizado");
				System.out.println("Actualizado");
			}

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			LOGGER.error("Error al conectar la base", e);
		}finally {
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				LOGGER.error("Error al actualizar", e);
			}
		}
		
	}
	public void eliminar(String cedula) {
		String sql = "DELETE FROM personas WHERE cedula = ?;";
		
		try {
			c = ConexionBDD.conectar();
			ps = c.prepareStatement(sql);
			ps.setString(1, cedula);
			if(ps.executeUpdate() == 1) {
				LOGGER.debug("Registro eliminado");
				System.out.println("eliminado");
			}

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			LOGGER.error("Error al conectar la base", e);

		}
	}
}
