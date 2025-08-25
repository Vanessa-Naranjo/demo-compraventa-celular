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
		PersonaDto personaDto = new PersonaDto();
		personaDto.setDocumento(documento);
		personaDto.setNombreCompleto(nombreCompleto);
		for (PersonaDto personaDto1 : personas) {
			if (personaDto1.getDocumento().equals(documento)) {
				System.out.println("El documento ya existe");
			}
			this.personas.add(personaDto);
		}

	}

}
