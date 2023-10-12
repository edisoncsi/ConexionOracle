package com.ejm.ec.controller;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejm.ec.model.Ciudad;
import com.ejm.ec.services.CiudadService;

@RestController
public class CantonController {

	@Autowired
	private CiudadService ciudadService;
	
	 @GetMapping("/canton")
	 private List<Ciudad> getAllCityTest(Model model) {
	        return ciudadService.getAllCity().stream().filter(city -> city.getCod_canton() < 500).collect(Collectors.toList());
	    }
}
