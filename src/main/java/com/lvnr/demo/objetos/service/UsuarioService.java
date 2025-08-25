package com.lvnr.demo.objetos.service;

import java.util.ArrayList;
import java.util.List;

import com.lvnr.demo.objetos.dto.UsuarioDto;

public class UsuarioService {

	private List<UsuarioDto> usuarios = new ArrayList<>();

	public List<UsuarioDto> getAll() {
		return usuarios;
	}

	public UsuarioDto getByCodigo(String codigo) {
		for (UsuarioDto usuarioDto : usuarios) {
			if (usuarioDto.getCodigo().equals(codigo)) {
				return usuarioDto;
			}
		}
		return null;
	}

	public void createUsuario(String codigo, String nombreCompleto) {
		UsuarioDto usuarioExiste = getByCodigo(codigo);

		if (usuarioExiste == null) {
			UsuarioDto usuarioDto = new UsuarioDto();
			usuarioDto.setCodigo(codigo);
			usuarioDto.setNombreCompleto(nombreCompleto);
			this.usuarios.add(usuarioDto);

		} else {
			System.err.println("El codigo del usuario ya existe " +codigo);
		}
		/*
		 * boolean usuarioExisteV2 = false; for (UsuarioDto usuarioDto : usuarios) {
		 * 
		 * if (usuarioDto.getCodigo().equals(codigo)) { usuarioExisteV2 = true; } } if
		 * (!usuarioExisteV2) { UsuarioDto usuarioDto = new UsuarioDto();
		 * usuarioDto.setCodigo(codigo); usuarioDto.setNombreCompleto(nombreCompleto);
		 * this.usuarios.add(usuarioDto);
		 * 
		 * }
		 */

	}

}
