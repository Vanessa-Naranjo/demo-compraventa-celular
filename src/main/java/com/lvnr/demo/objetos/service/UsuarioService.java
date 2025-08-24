package com.lvnr.demo.objetos.service;

import java.util.ArrayList;
import java.util.List;

import com.lvnr.demo.objetos.dto.UsuarioDto;

public class UsuarioService {

	private List<UsuarioDto> usuarios;

	public UsuarioService() {

		usuarios = new ArrayList<>();

	}

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

	public void createUsuario (String codigo, String nombreCompleto) {
		UsuarioDto usuarioDto=new UsuarioDto();
		usuarioDto.setCodigo(codigo);
		usuarioDto.setNombreCompleto(nombreCompleto);

			if (usuarioDto.getCodigo().equals(codigo)){
				System.out.println("El usuario ya existe");
			}
		   this.usuarios.add(usuarioDto);
	}

}
