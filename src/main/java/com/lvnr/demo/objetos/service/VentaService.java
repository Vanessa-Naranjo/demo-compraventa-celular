package com.lvnr.demo.objetos.service;

import java.util.ArrayList;
import java.util.List;

import com.lvnr.demo.objetos.dto.CelularDto;
import com.lvnr.demo.objetos.dto.PersonaDto;
import com.lvnr.demo.objetos.dto.VentaDto;

public class VentaService {

	private List<VentaDto> ventas = new ArrayList<>();

	public void crearVenta(String numeroVenta, String usuario, String persona, String celular, int cantidad) {
		VentaDto ventaDto = new VentaDto();
		ventaDto.setNumeroVenta(numeroVenta);
		ventaDto.setUsuario(usuario);
		ventaDto.setPersona(persona);
		ventaDto.setCelular(celular);
		ventaDto.setCantidad(cantidad);
		this.ventas.add(ventaDto);
	}

	public CelularDto consultarVenta(String marca, String modelo) {
		CelularDto celularDto = new CelularDto();
		if (celularDto.getMarca().equals(marca) && (celularDto.getModelo().equals(modelo))) {
			return celularDto;
		}

		return null;
	}

	public void imprimirVentas() {
		VentaDto ventaDto = new VentaDto();
		System.out.println("Número Venta: " + ventaDto.getNumeroVenta());
		System.out.println("Número Venta: " + ventaDto.getUsuario());
		System.out.println("Número Venta: " + ventaDto.getPersona());
		System.out.println("Número Venta: " + ventaDto.getCelular());
		System.out.println("Número Venta: " + ventaDto.getCantidad());
	}

	public void imprimirVentaNumero(String numeroVenta) {
		for (VentaDto ventaDto2 : ventas) {
			System.out.println("Número Venta: " + ventaDto2.getNumeroVenta());
			System.out.println("Número Venta: " + ventaDto2.getUsuario());
			System.out.println("Número Venta: " + ventaDto2.getPersona());
			System.out.println("Número Venta: " + ventaDto2.getCelular());
			System.out.println("Número Venta: " + ventaDto2.getCantidad());
		}
	}

	public void imprimirVentaDocumento(String documento) {
	//	PersonaDto personaDto = new PersonaDto();

	}
}
