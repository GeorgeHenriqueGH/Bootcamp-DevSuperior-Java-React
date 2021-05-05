package com.dsvendas.dsvendas.dto;

import java.io.Serializable;

import com.dsvendas.dsvendas.entities.Seller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
@NoArgsConstructor
public class SaleSumDTO implements Serializable {
	
	private String sallerName;
	private Double sum;
	
	public SaleSumDTO(Seller seller, Double sum) {
		this.sallerName = seller.getName();
		this.sum = sum;
	}
}
