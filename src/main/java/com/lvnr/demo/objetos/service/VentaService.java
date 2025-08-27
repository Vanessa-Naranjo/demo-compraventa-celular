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
		System.out.println("Nombre Usuario: " + usuarioDto.getNombreCompleto());
		System.out.println("Documento Cliente: " + personaDto.getDocumento());
		System.out.println("Nombre Cliente: " + personaDto.getNombreCompleto());
		System.out.println("Tipo Cliente: " + personaDto.getTipoPersona());
		System.out.println("Numero de Venta: " + ventaDto.getNumeroVenta());
		System.out.println("Marca Celular: " + celularDto.getMarca());
		System.out.println("Modelo Celular: " + celularDto.getModelo());
		System.out.println("Valor Celular: " + celularDto.getValor());
		System.out.println("Cantidad de celulares: " + ventaDto.getCantidad());
		int subtotal = (celularDto.getValor() * ventaDto.getCantidad());
		System.out.println("Subtotal de la venta: " + subtotal);

		double descuentoInvitado = 0.05;
		double descuentoPremium = 0.1;
		double descuentoVip = 0.2;

		double valorDescontar;
		double total;
		if (personaDto.getTipoPersona().equals("VIP")) {
			valorDescontar = subtotal * descuentoVip;
			total = subtotal - valorDescontar;
			System.out.println("El Valor a descontar VIP es: " + valorDescontar);
			System.out.println("El total de la venta es: " + total);
		} else if (personaDto.getTipoPersona().equals("PREMIUM")) {
			valorDescontar = subtotal * descuentoPremium;
			total = subtotal - valorDescontar;
			System.out.println("El Valor a descontar PREMIUM es: " + valorDescontar);
			System.out.println("El total de la venta es: " + total);
		} else if (personaDto.getTipoPersona().equals("INVITADO")) {
			valorDescontar = subtotal * descuentoInvitado;
			total = subtotal - valorDescontar;
			System.out.println("El Valor a descontar INVITADO es: " + valorDescontar);
			System.out.println("El total de la venta es: " + total);
		}

		System.out.println("***********SWITCH************");

		valorDescontar = 0.0;

		switch (personaDto.getTipoPersona()) {
		case "VIP":
			valorDescontar = subtotal * descuentoVip;
			break;

		case "PREMIUM":
			valorDescontar = subtotal * descuentoPremium;
			break;

		case "INVITADO":
			valorDescontar = subtotal * descuentoInvitado;
			break;
		default:
			break;
		}

		total = subtotal - valorDescontar;

		System.out.println("El valor a descontar " + personaDto.getTipoPersona() + " es: " + valorDescontar);
		System.out.println("El valor total de la venta es: " + total);

	}
}
