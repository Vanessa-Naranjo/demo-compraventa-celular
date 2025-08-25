package com.lvnr.demo.objetos.service;

import java.util.ArrayList;
import java.util.List;

import com.lvnr.demo.objetos.dto.PersonaDto;

public class PersonaService {

	private List<PersonaDto> personas = new ArrayList<>();

	public List<PersonaDto> getAll() {
		return personas;
	}

	public PersonaDto getByDocumento(String documento) {
		for (PersonaDto personaDto : personas) {
			if (personaDto.getDocumento().equals(documento)) {
				return personaDto;
			}

		}
		return null;
	}

	public void createPersona(String documento, String nombreCompleto) {
		PersonaDto personaExiste = getByDocumento(documento);

		if (personaExiste == null) {
			PersonaDto personaDto = new PersonaDto();
			personaDto.setDocumento(documento);
			personaDto.setNombreCompleto(nombreCompleto);
			this.personas.add(personaDto);
		} else {

			System.out.println("El documento ya existe");
		}

	}

}
