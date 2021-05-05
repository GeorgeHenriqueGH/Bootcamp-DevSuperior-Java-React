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
public class SaleSuccessDTO implements Serializable {
	
	private String sallerName;
	private Long visited;
	private Long deals;
	
	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		sallerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}
}
