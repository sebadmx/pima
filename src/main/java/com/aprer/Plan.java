package com.aprer;

public class Plan {
	
	private int idplan;
	private String descripcion;
	private int valortotal;
	
	public Plan() {

	}

	public Plan(String descripcion, int valortotal) {
		this.descripcion = descripcion;
		this.valortotal = valortotal;
	}

	public int getIdplan() {
		return idplan;
	}

	public void setIdplan(int idplan) {
		this.idplan = idplan;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getValortotal() {
		return valortotal;
	}

	public void setValortotal(int valortotal) {
		this.valortotal = valortotal;
	}

	@Override
	public String toString() {
		return "Plan [idplan=" + idplan + ", descripcion=" + descripcion + ", valortotal=" + valortotal + "]";
	}
	
	
	
}
