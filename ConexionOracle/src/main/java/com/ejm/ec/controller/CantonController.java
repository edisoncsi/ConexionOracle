package com.ejm.ec.controller;

import java.util.List;

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
	        return ciudadService.getAllCity();
	    }
}
