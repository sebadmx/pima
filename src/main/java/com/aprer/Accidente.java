package com.aprer;

public class Accidente {
	private int idaccidente;
	private String fechaacidente;
	private String descripcion;
	private int cliente_idcliente;
		
	public Accidente() {

	}

	public Accidente(String fechaacidente, String descripcion, int cliente_idcliente) {
		this.fechaacidente = fechaacidente;
		this.descripcion = descripcion;
		this.cliente_idcliente = cliente_idcliente;
	}

	public int getIdaccidente() {
		return idaccidente;
	}

	public void setIdaccidente(int idaccidente) {
		this.idaccidente = idaccidente;
	}

	public String getFechaacidente() {
		return fechaacidente;
	}

	public void setFechaacidente(String fechaacidente) {
		this.fechaacidente = fechaacidente;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCliente_idcliente() {
		return cliente_idcliente;
	}

	public void setCliente_idcliente(int cliente_idcliente) {
		this.cliente_idcliente = cliente_idcliente;
	}

	@Override
	public String toString() {
		return "Accidente [idaccidente=" + idaccidente + ", fechaacidente=" + fechaacidente + ", descripcion="
				+ descripcion + ", cliente_idcliente=" + cliente_idcliente + "]";
	}

	
	
}
