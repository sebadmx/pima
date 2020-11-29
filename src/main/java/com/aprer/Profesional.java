package com.aprer;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Profesional {
	
	private int idprofesional;
	private String nombre;
	private String appaterno;
	private String apmaterno;
	private int rut;
	private String dv;
	private String fechanacimiento;
	private String profesion;
	private String direccion;
	private String telefono;
	private String email;
	private String cargo;
	
	
	public Profesional() {

	}	
	
	public Profesional(String nombre, String appaterno, String apmaterno, int rut, String dv, String fechanacimiento,
			String profesion, String direccion, String telefono, String email, String cargo) {

		this.nombre = nombre;
		this.appaterno = appaterno;
		this.apmaterno = apmaterno;
		this.rut = rut;
		this.dv = dv;
		this.fechanacimiento = fechanacimiento;
		this.profesion = profesion;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.cargo = cargo;
	}
	
	
	

	public int getIdprofesional() {
		return idprofesional;
	}

	public void setIdprofesional(int idprofesional) {
		this.idprofesional = idprofesional;
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

	public String getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Profesional [idprofesional=" + idprofesional + ", nombre=" + nombre + ", appaterno=" + appaterno
				+ ", apmaterno=" + apmaterno + ", rut=" + rut + ", dv=" + dv + ", fechanacimiento=" + fechanacimiento
				+ ", profesion=" + profesion + ", direccion=" + direccion + ", telefono=" + telefono + ", email="
				+ email + ", cargo=" + cargo + "]";
	}



	
	
	

}
