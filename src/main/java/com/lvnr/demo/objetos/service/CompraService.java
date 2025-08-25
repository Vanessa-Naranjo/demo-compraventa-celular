package com.lvnr.demo.objetos.service;

import java.util.ArrayList;
import java.util.List;

import com.lvnr.demo.objetos.dto.CelularDto;
import com.lvnr.demo.objetos.dto.CompraDto;

public class CompraService {

	private List<CompraDto> compras = new ArrayList<>();

	public void crearCompra(String numeroCompra, String usuario, String celular, int cantidad) {
		CompraDto compraDto = new CompraDto();
		compraDto.setNumeroCompra(numeroCompra);
		compraDto.setUsuario(usuario);
		compraDto.setCelular(celular);
		compraDto.setCantidad(cantidad);
		this.compras.add(compraDto);

	}

	public CelularDto consultarCompra(String marca, String modelo) {
		CelularDto celularDto = new CelularDto();
		if (celularDto.getMarca().equals(marca) && (celularDto.getModelo().equals(modelo))) {
			return celularDto;
		}
		return null;
	}

	public void imprimirCompra() {
		CompraDto compraDto = new CompraDto();
		System.out.println("Numero de compra: " + compraDto.getNumeroCompra());
		System.out.println("Usuario: " + compraDto.getUsuario());
		System.out.println("Numer: " + compraDto.getCelular());
		System.out.println("Numero de compra: " + compraDto.getCantidad());

	}

	public void imprimirPorNumeroCompra(String numeroCompra) {
		for (CompraDto compraDto : compras) {
			System.out.println("Numero de compra: " + compraDto.getNumeroCompra());
			System.out.println("Usuario: " + compraDto.getUsuario());
			System.out.println("Numer: " + compraDto.getCelular());
			System.out.println("Numero de compra: " + compraDto.getCantidad());
		}
	}

}
