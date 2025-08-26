package com.lvnr.demo.objetos.dto;

public class VentaDto {

	private int numeroVenta;
	private UsuarioDto usuario;
	private PersonaDto persona;
	private CelularDto celular;
	private int cantidad;

	public int getNumeroVenta() {
		return numeroVenta;
	}

	public void setNumeroVenta(int numeroVenta) {
		this.numeroVenta = numeroVenta;
	}

	public UsuarioDto getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDto usuario) {
		this.usuario = usuario;
	}

	public PersonaDto getPersona() {
		return persona;
	}

	public void setPersona(PersonaDto persona) {
		this.persona = persona;
	}

	public CelularDto getCelular() {
		return celular;
	}

	public void setCelular(CelularDto celular) {
		this.celular = celular;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
