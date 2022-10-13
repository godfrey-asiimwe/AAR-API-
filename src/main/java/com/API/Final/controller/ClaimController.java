package com.API.Final.controller;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.API.Final.Model.Claim;
import com.API.Final.service.ClaimService;

@RestController
@RequestMapping(value = "/claims")
public class ClaimController {
	@Autowired
	ClaimService claimsService;
	
	@GetMapping("/{CLAIM_NO}/{AMOUNT_PAYABLE}")
	public List<Claim> Claims(@PathVariable String CLAIM_NO, @PathVariable BigDecimal AMOUNT_PAYABLE) {
		 return claimsService.getClaim(CLAIM_NO,AMOUNT_PAYABLE);
	}
	
	@GetMapping("/{CLAIM_NO}")
	public Claim Claims(@PathVariable String CLAIM_NO) {
		 return claimsService.getClaim(CLAIM_NO);
	}
	 
}
