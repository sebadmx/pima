package com.aprer;

public class Visitas {
	
	private int idvisitas;
	private String fechavisita;	
	private String detalle;
	private String observacion;
	private int cliente_idcliente;
	private int profesional_idprofesional;
	private String coordenadas;
	
	public Visitas() {

	}

	public Visitas(String fechavisita, String detalle, String observacion, int cliente_idcliente,
			int profesional_idprofesional, String coordenadas) {

		this.fechavisita = fechavisita;
		this.detalle = detalle;
		this.observacion = observacion;
		this.cliente_idcliente = cliente_idcliente;
		this.profesional_idprofesional = profesional_idprofesional;
		this.coordenadas = coordenadas;
	}

	public int getIdvisitas() {
		return idvisitas;
	}

	public void setIdvisitas(int idvisitas) {
		this.idvisitas = idvisitas;
	}

	public String getFechavisita() {
		return fechavisita;
	}

	public void setFechavisita(String fechavisita) {
		this.fechavisita = fechavisita;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
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

	public String getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}

	@Override
	public String toString() {
		return "Visitas [idvisitas=" + idvisitas + ", fechavisita=" + fechavisita + ", detalle=" + detalle
				+ ", observacion=" + observacion + ", cliente_idcliente=" + cliente_idcliente
				+ ", profesional_idprofesional=" + profesional_idprofesional + ", coordenadas=" + coordenadas + "]";
	}
	
	
	
	
}
