package com.aprer;

public class Rubro {
	
	private int idrubro;
	private String descripcionrubro;
	
	
	public Rubro() {

	}	
	public Rubro(String descripcionrubro) {
		this.descripcionrubro = descripcionrubro;
	}
	public int getIdrubro() {
		return idrubro;
	}
	public void setIdrubro(int idrubro) {
		this.idrubro = idrubro;
	}
	public String getDescripcionrubro() {
		return descripcionrubro;
	}
	public void setDescripcionrubro(String descripcionrubro) {
		this.descripcionrubro = descripcionrubro;
	}
	@Override
	public String toString() {
		return "Rubro [idrubro=" + idrubro + ", descripcionrubro=" + descripcionrubro + "]";
	}
	
	
	
	
	
}
