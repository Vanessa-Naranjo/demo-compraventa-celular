package com.lvnr.demo.objetos.dto;

public class PersonaDto {

	private String documento;
	private String nombreCompleto;
	private String tipoPersona;

	/**
	 * Los tipos de persona seran INVITADO, PREMIUM, VIP 
	 * @return
	 */
	public String getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

}
