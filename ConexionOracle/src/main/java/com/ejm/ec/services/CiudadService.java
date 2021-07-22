package com.ejm.ec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejm.ec.model.Ciudad;
import com.ejm.ec.repositories.CantonRepository;

@Service
public class CiudadService {
	@Autowired
	private CantonRepository cantonRepository;
	
	// Obtenga toda la información
    public List<Ciudad> getAllCity() {
        return cantonRepository.findAll();
    }

}
