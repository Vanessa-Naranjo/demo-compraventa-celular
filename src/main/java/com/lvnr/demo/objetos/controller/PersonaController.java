package com.lvnr.demo.objetos.controller;

import com.lvnr.demo.objetos.service.PersonaService;

public class PersonaController {
	public static void main(String[] args) {

		PersonaService personaService = new PersonaService();
		
		personaService.createPersona("34234j", "Carlos MOrales");
		personaService.createPersona("34234ij", "Carlos MOrales");
		
		
		personaService.getByDocumento("34234j");
	}
}
