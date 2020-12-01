package com.aprer;

public class Capacitacion {
	private int idcapacitacion;
	private String fechacapacitacion;	
	private int observacion;
	private int cliente_idcliente;
	private int profesional_idprofesional;
	
	public Capacitacion() {
	}	
	
	public Capacitacion(String fechacapacitacion, int observacion, int cliente_idcliente,
			int profesional_idprofesional) {
		this.fechacapacitacion = fechacapacitacion;
		this.observacion = observacion;
		this.cliente_idcliente = cliente_idcliente;
		this.profesional_idprofesional = profesional_idprofesional;
	}

	public int getIdcapacitacion() {
		return idcapacitacion;
	}

	public void setIdcapacitacion(int idcapacitacion) {
		this.idcapacitacion = idcapacitacion;
	}

	public String getFechacapacitacion() {
		return fechacapacitacion;
	}

	public void setFechacapacitacion(String fechacapacitacion) {
		this.fechacapacitacion = fechacapacitacion;
	}

	public int getObservacion() {
		return observacion;
	}

	public void setObservacion(int observacion) {
		this.observacion = observacion;
	}

	public int getCliente_idcliente() {
		return cliente_idcliente;
	}

	public void setCliente_idcliente(int cliente_idcliente) {
		this.cliente_idcliente = cliente_idcliente;
	}

	public int getProfesional_idprofesional() {
		return profesional_idprofesional;
	}

	public void setProfesional_idprofesional(int profesional_idprofesional) {
		this.profesional_idprofesional = profesional_idprofesional;
	}

	@Override
	public String toString() {
		return "Capacitacion [idcapacitacion=" + idcapacitacion + ", fechacapacitacion=" + fechacapacitacion
				+ ", observacion=" + observacion + ", cliente_idcliente=" + cliente_idcliente
				+ ", profesional_idprofesional=" + profesional_idprofesional + "]";
	}



	
	
	
	
}
