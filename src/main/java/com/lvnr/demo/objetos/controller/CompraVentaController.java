package com.lvnr.demo.objetos.controller;

import com.lvnr.demo.objetos.dto.UsuarioDto;
import com.lvnr.demo.objetos.dto.PersonaDto;
import com.lvnr.demo.objetos.dto.CelularDto;
import com.lvnr.demo.objetos.service.CelularService;
import com.lvnr.demo.objetos.service.CompraService;
import com.lvnr.demo.objetos.service.PersonaService;
import com.lvnr.demo.objetos.service.UsuarioService;
import com.lvnr.demo.objetos.service.VentaService;

public class CompraVentaController {

	public static void main(String[] args) {

		CelularDto celularDto = new CelularDto();
		celularDto.setMarca("Samsung");
		celularDto.setModelo("Galaxy20");
		celularDto.setValor(1500000);

		System.out.println("****Crear Usuario****");
		UsuarioService usuarioService = new UsuarioService();
		usuarioService.createUsuario("12345R", "Carlos Rodriguez");
		usuarioService.createUsuario("23456M", "Laura Martinez");
		usuarioService.createUsuario("78910M", "Gloria Morales");
		UsuarioDto usuarioDto = usuarioService.getByCodigo("12345R");

		System.out.println("****Crear Persona*****");
		PersonaService personaService = new PersonaService();
		personaService.createPersona("634829", "Elena Corredor");
		personaService.createPersona("983743", "Eduardo Rodriguez");
		personaService.createPersona("103184", "Angie Zarate");
		PersonaDto personaDto = personaService.getByDocumento("634829");

		System.out.println("****Crear Celular*****");
		CelularService celularService = new CelularService();
		celularService.crearCelular("Samsung", "Galaxy20", 1500000);
		celularService.crearCelular("Motorola", "M34", 2100000);
		celularService.crearCelular("Iphone", "I54", 3500000);

		System.out.println("****Crear Compra******");
		CompraService compraService = new CompraService();
		compraService.crearCompra(usuarioDto, celularDto, 1);
		compraService.imprimirCompras();

		System.out.println();
		System.out.println("****Crear Venta*******");
		VentaService ventaService = new VentaService();
		ventaService.crearVenta(usuarioDto, personaDto, celularDto, 2);
		ventaService.imprimirVentas();

	}
}
