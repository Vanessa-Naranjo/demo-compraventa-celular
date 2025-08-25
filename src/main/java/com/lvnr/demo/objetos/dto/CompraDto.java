package com.lvnr.demo.objetos.dto;

public class CompraDto {

	private int numeroCompra;
	private UsuarioDto usuario;
	private CelularDto celular;
	private int cantidad;

	public int getNumeroCompra() {
		return numeroCompra;
	}

	public void setNumeroCompra(int numeroCompra) {
		this.numeroCompra = numeroCompra;
	}

	public UsuarioDto getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioDto usuario) {
		this.usuario = usuario;
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
