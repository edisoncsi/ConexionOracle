package com.ejm.ec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejm.ec.model.Ciudad;

public interface CantonRepository extends JpaRepository<Ciudad, Long> {

}
