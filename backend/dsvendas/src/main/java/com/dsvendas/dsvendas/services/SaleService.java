package com.dsvendas.dsvendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dsvendas.dsvendas.dto.SaleDTO;
import com.dsvendas.dsvendas.entities.Sale;
import com.dsvendas.dsvendas.repositories.SaleRepository;
import com.dsvendas.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repo;
	
	@Autowired
	private SellerRepository sellerRepo;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepo.findAll();
		Page<Sale> result = repo.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
}