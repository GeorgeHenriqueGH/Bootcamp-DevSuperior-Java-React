package com.dsvendas.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsvendas.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> { }