package com.aprer;

public class Contrato {
	
	private int idcontrato;
	private String detalle;	
	private String fechacontrato;
	private int cliente_idcliente;
	private int plan_idplan;
	
	
	
	public Contrato() {
	}

	public Contrato(String detalle, String fechacontrato, int cliente_idcliente, int plan_idplan) {

		this.detalle = detalle;
		this.fechacontrato = fechacontrato;
		this.cliente_idcliente = cliente_idcliente;
		this.plan_idplan = plan_idplan;
	}

	public int getIdcontrato() {
		return idcontrato;
	}

	public void setIdcontrato(int idcontrato) {
		this.idcontrato = idcontrato;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getFechacontrato() {
		return fechacontrato;
	}

	public void setFechacontrato(String fechacontrato) {
		this.fechacontrato = fechacontrato;
	}

	public int getCliente_idcliente() {
		return cliente_idcliente;
	}

	public void setCliente_idcliente(int cliente_idcliente) {
		this.cliente_idcliente = cliente_idcliente;
	}

	public int getPlan_idplan() {
		return plan_idplan;
	}

	public void setPlan_idplan(int plan_idplan) {
		this.plan_idplan = plan_idplan;
	}

	@Override
	public String toString() {
		return "Contrato [idcontrato=" + idcontrato + ", detalle=" + detalle + ", fechacontrato=" + fechacontrato
				+ ", cliente_idcliente=" + cliente_idcliente + ", plan_idplan=" + plan_idplan + "]";
	}
	
	
	
}
