package com.lvnr.demo.objetos.service;

import java.util.ArrayList;
import java.util.List;

import com.lvnr.demo.objetos.dto.CelularDto;
import com.lvnr.demo.objetos.dto.PersonaDto;
import com.lvnr.demo.objetos.dto.UsuarioDto;
import com.lvnr.demo.objetos.dto.VentaDto;

public class VentaService {

	private List<VentaDto> ventas = new ArrayList<>();

	public void crearVenta(UsuarioDto usuario, PersonaDto persona, CelularDto celular, int cantidad) {
		VentaDto ventaDto = new VentaDto();
		int numeroVenta = ventas.size() + 1;
		ventaDto.setNumeroVenta(numeroVenta);
		ventaDto.setUsuario(usuario);
		ventaDto.setPersona(persona);
		ventaDto.setCelular(celular);
		ventaDto.setCantidad(cantidad);
		this.ventas.add(ventaDto);
	}

	public VentaDto consultarVenta(String marca, String modelo) {
		for (VentaDto ventaDto : ventas) {
			CelularDto celularDto = ventaDto.getCelular();
			if (celularDto.getMarca().equals(marca) && (celularDto.getModelo().equals(modelo))) {
				return ventaDto;
			}
		}
		return null;
	}

	public void imprimirVentas() {
		for (VentaDto ventaDto : ventas) {
			imprimirVenta(ventaDto);
		}

	}

	public void imprimirVentaNumero(int numeroVenta) {
		for (VentaDto ventaDto : ventas) {
			if (ventaDto.getNumeroVenta() == numeroVenta) {
				imprimirVenta(ventaDto);
			}

		}
	}

	public void imprimirVentaDocumento(String documento) {
		for (VentaDto ventaDto : ventas) {
			PersonaDto personaDto = ventaDto.getPersona();
			if (personaDto.getDocumento().equals(documento)) {
				imprimirVenta(ventaDto);
			}

		}

	}

	public void imprimirVenta(VentaDto ventaDto) {
		UsuarioDto usuarioDto = ventaDto.getUsuario();
		CelularDto celularDto = ventaDto.getCelular();
		PersonaDto personaDto = ventaDto.getPersona();
		System.out.println("Codigo Usuario: " + usuarioDto.getCodigo());
		System.out.println("Documento Cliente: " + personaDto.getDocumento());
		System.out.println("Nombre Cliente: " + personaDto.getNombreCompleto());
		System.out.println("Nombre Usuario: " + usuarioDto.getNombreCompleto());
		System.out.println("Numero de Venta: " + ventaDto.getNumeroVenta());
		System.out.println("Marca Celular: " + celularDto.getMarca());
		System.out.println("Modelo Celular: " + celularDto.getModelo());
		System.out.println("Valor Celular: " + celularDto.getValor());
		System.out.println("Cantidad de celulares: " + ventaDto.getCantidad());

	}
}
