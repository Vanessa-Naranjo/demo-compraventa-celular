package com.lvnr.demo.objetos.service;

import java.util.ArrayList;
import java.util.List;

import com.lvnr.demo.objetos.dto.CelularDto;
import com.lvnr.demo.objetos.dto.CompraDto;
import com.lvnr.demo.objetos.dto.UsuarioDto;

public class CompraService {

	private List<CompraDto> compras = new ArrayList<>();

	public void crearCompra(UsuarioDto usuario, CelularDto celular, int cantidad) {
		CompraDto compraDto = new CompraDto();
		int numeroCompra = compras.size() + 1;
		compraDto.setNumeroCompra(numeroCompra);
		compraDto.setUsuario(usuario);
		compraDto.setCelular(celular);
		compraDto.setCantidad(cantidad);
		this.compras.add(compraDto);

	}

	public CompraDto consultarCompraPorCelular(String marca, String modelo) {
		for (CompraDto compraDto : compras) {
			CelularDto celularDto = compraDto.getCelular();
			if (celularDto.getMarca().equals(marca) && (celularDto.getModelo().equals(modelo))) {
				return compraDto;
			}
		}
		return null;
	}

	public void imprimirCompras() {
		for (CompraDto compraDto : compras) {
			imprimirCompra(compraDto);

		}

	}

	public void imprimirPorNumeroCompra(int numeroCompra) {
		for (CompraDto compraDto : compras) {
			if (compraDto.getNumeroCompra() == numeroCompra) {
				imprimirCompra(compraDto);
			}
		}
	}

	public void imprimirCompra(CompraDto compraDto) {
		UsuarioDto usuarioDto = compraDto.getUsuario();
		CelularDto celularDto = compraDto.getCelular();
		System.out.println("Codigo Usuario: " + usuarioDto.getCodigo());
		System.out.println("Nombre Usuario: " + usuarioDto.getNombreCompleto());
		System.out.println("Numero de compra: " + compraDto.getNumeroCompra());
		System.out.println("Marca Celular: " + celularDto.getMarca());
		System.out.println("Modelo Celular: " + celularDto.getModelo());
		System.out.println("Valor Celular: " + celularDto.getValor());
		System.out.println("Cantidad de celulares: " + compraDto.getCantidad());
	}
}
