package com.aprer;

public class Cliente {
	
	private int idcliente;
	private String nombre;
	private String appaterno;
	private String apmaterno;
	private int rut;
	private String dv;
	private String direccion;
	private String telefono;
	private String email;
	private int rubro_idrubro;
	
	
	
	public Cliente() {
		
	}

	public Cliente( String nombre, String appaterno, String apmaterno, int rut, String dv,
			String direccion, String telefono, String email, int rubro_idrubro) {
		this.nombre = nombre;
		this.appaterno = appaterno;
		this.apmaterno = apmaterno;
		this.rut = rut;
		this.dv = dv;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.rubro_idrubro = rubro_idrubro;
	}
	
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAppaterno() {
		return appaterno;
	}
	public void setAppaterno(String appaterno) {
		this.appaterno = appaterno;
	}
	public String getApmaterno() {
		return apmaterno;
	}
	public void setApmaterno(String apmaterno) {
		this.apmaterno = apmaterno;
	}
	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
	public String getDv() {
		return dv;
	}
	public void setDv(String dv) {
		this.dv = dv;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRubro_idrubro() {
		return rubro_idrubro;
	}
	public void setRubro_idrubro(int rubro_idrubro) {
		this.rubro_idrubro = rubro_idrubro;
	}

	@Override
	public String toString() {
		return "Cliente [idcliente=" + idcliente + ", nombre=" + nombre + ", appaterno=" + appaterno + ", apmaterno="
				+ apmaterno + ", rut=" + rut + ", dv=" + dv + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", email=" + email + ", rubro_idrubro=" + rubro_idrubro + "]";
	}
	
	
	
	
	
}
