package com.dsvendas.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsvendas.dsvendas.dto.SellerDTO;
import com.dsvendas.dsvendas.entities.Seller;
import com.dsvendas.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository repo;
	
	public List<SellerDTO> findAll() {
		List<Seller> result = repo.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
	
}