package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Proyecto {

	private int id;
	private String proyecto;
	private BigDecimal monto;
	private Date fecha_inicio;
	private Date fecha_fin;
	
	public Proyecto(int id, String proyecto, BigDecimal monto) {
		super();
		this.id = id;
		this.proyecto = proyecto;
		this.monto = monto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProyecto() {
		return proyecto;
	}

	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	@Override
	public String toString() {
		return "Proyecto [id=" + id + ", proyecto=" + proyecto + ", monto=" + monto + ", fecha_inicio=" + fecha_inicio
				+ ", fecha_fin=" + fecha_fin + "]";
	}
	
	
}
