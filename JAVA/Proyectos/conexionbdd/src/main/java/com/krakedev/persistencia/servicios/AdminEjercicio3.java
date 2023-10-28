package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Habitacion;
import com.krakedev.persistencia.entidades.Proyecto;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminEjercicio3 {
	
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);
	Connection c = null; 
	PreparedStatement ps = null;
	public void insertarProyecto(Proyecto p) {
		String sql = "INSERT INTO public.proyecto(id, proyecto, monto, fecha_inicio, fecha_fin)"
				+ "	VALUES (?, ?, ?, ?, ?);";
		try {
			c = ConexionBDD.conectarBD2();
			ps = c.prepareStatement(sql);
			ps.setInt(1, p.getId());
			ps.setString(2, p.getProyecto());
			ps.setBigDecimal(3, p.getMonto());
			ps.setDate(4, new java.sql.Date(p.getFecha_inicio().getTime()));
			ps.setDate(5, new java.sql.Date(p.getFecha_fin().getTime()));
			
			if(ps.executeUpdate() == 1) {
				LOGGER.info("proyecto insertado");
				System.out.println("proyecto insertado");
			}
		} catch (Exception e) {
			// TODO: handle exception
			LOGGER.error("Error de conexion",e);
		}finally {
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	public void insertarHabitacion(Habitacion h)throws Exception {
		String sql = "INSERT INTO public.habitaciones(habitacion_numero, precio_por_noche, piso, max_personas)"
				+ "	VALUES (?, ?, ?, ?);"; 
		try {
		c = ConexionBDD.conectarBD2();
		ps = c.prepareStatement(sql);
		 
		ps.setInt(1, h.getHabitacion_numero());
		ps.setBigDecimal(2, h.getPrecioNoche());
		ps.setInt(3, h.getPiso());
		ps.setInt(4, h.getMax_personas());
		if(ps.executeUpdate() == 1) {
			LOGGER.info("Habitacion insertado");
			System.out.println("Habitacion insertado");
		}
		}catch(Exception e){
			LOGGER.error("Error de conexion",e);
		}finally {
			c.close();
		}
	}
	
	public void editarProyecto(Proyecto p)throws Exception {
		String sql = "UPDATE proyecto SET proyecto=?, monto=?, fecha_inicio=?, fecha_fin=?"
				+ "	WHERE id = ?;";
		try {
		c = ConexionBDD.conectarBD2();
		ps = c.prepareStatement(sql);
		
		ps.setString(1, p.getProyecto());
		ps.setBigDecimal(2, p.getMonto());
		ps.setDate(3, new java.sql.Date(p.getFecha_inicio().getTime()));
		ps.setDate(4, new java.sql.Date(p.getFecha_fin().getTime()));
		
		ps.setInt(5, p.getId());		
		if(ps.executeUpdate() == 1) {
			LOGGER.info("proyecto editado");
			System.out.println("proyecto editado");
		}
		} catch (Exception e) {
			LOGGER.error("Error: Algo salio mal al insertar datos", e);
			throw new Exception("Error: Algo salio mal al editar");
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
	
	public void editarHabitacion(Habitacion h)throws Exception {
		
		String sql = "UPDATE habitaciones SET precio_por_noche=?, piso=?, max_personas=?"
				+ "	WHERE habitacion_numero=?;";
		try {
		c = ConexionBDD.conectarBD2();
		ps = c.prepareStatement(sql);
		
		ps.setBigDecimal(1, h.getPrecioNoche());
		ps.setInt(2, h.getPiso());
		ps.setInt(3, h.getMax_personas());
		
		ps.setInt(4, h.getHabitacion_numero());

		if(ps.executeUpdate() == 1) {
			LOGGER.info("Habitacion editada");
			System.out.println("Habitacion editada");
		}
		} catch (Exception e) {
			LOGGER.error("Error: Algo salio mal al insertar datos", e);
			throw new Exception("Error: Algo salio mal al editar");
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
	public void eliminarProyecto(int i)throws Exception {
		String sql = "DELETE FROM proyecto WHERE id = ?;";
		try {
		c = ConexionBDD.conectarBD2();
		ps = c.prepareStatement(sql);
		ps = c.prepareStatement(sql);
		ps.setInt(1, i);
		if(ps.executeUpdate() == 1) {
			LOGGER.info("proyecto eliminado");
			System.out.println("proyecto eliminado");
		}
		
		} catch (Exception e) {
			LOGGER.error("Error: Algo salio mal al insertar datos", e);
			throw new Exception("Error: Algo salio mal al eliminar el dato");
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
	public void eliminarHabitacion(int i)throws Exception {
		String sql = "DELETE FROM habitaciones WHERE habitacion_numero = ?;";
		try {
		c = ConexionBDD.conectarBD2();
		ps = c.prepareStatement(sql);
		ps.setInt(1, i);
		if(ps.executeUpdate() == 1) {
			LOGGER.info("habitacion eliminado");
			System.out.println("habitacion eliminada");
		}
		} catch (Exception e) {
			LOGGER.error("Error: Algo salio mal al insertar datos", e);
			throw new Exception("Error: Algo salio mal al eliminar el dato");
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
	
	
	
}
