package com.lvnr.demo.objetos.controller;

import com.lvnr.demo.objetos.service.UsuarioService;

public class UsuarioController {

	public static void main(String[] args) {
		
		UsuarioService usuarioService=new UsuarioService();
		
		usuarioService.createUsuario("834324j", "Carlos Martinez");
		usuarioService.createUsuario("834324", "Carlos Martinez");

	}
}
