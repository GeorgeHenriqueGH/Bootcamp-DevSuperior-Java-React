package com.dsvendas.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsvendas.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> { }