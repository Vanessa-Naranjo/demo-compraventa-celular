package com.lvnr.demo.objetos.service;

import java.util.ArrayList;
import java.util.List;

import com.lvnr.demo.objetos.dto.CelularDto;

public class CelularService {
	
	private List<CelularDto> celulares=new ArrayList<>();
	
	public void crearCelular (String marca, String modelo, int valor) {
		CelularDto celularDto=new CelularDto();
		celularDto.setMarca(marca);
		celularDto.setModelo(modelo);
		celularDto.setValor(valor);
		this.celulares.add(celularDto);
		
	}
			

}
