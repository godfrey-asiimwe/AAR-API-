package com.API.Final.controller;

import java.math.BigDecimal;
import java.util.Date;
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
	
	@GetMapping("/{CLAIM_NO}")
	public Claim Claims(@PathVariable String CLAIM_NO) {
		
		List<Claim> claimList=claimsService.getClaim(CLAIM_NO);
		
		Claim claimDTO=new Claim();
		
		Double totalamount=0.0;
		Double totalamount2=0.0;
		
		for(Claim claim:claimList) {
			
			totalamount +=claim.getAMOUNT_PAYABLE();
			
			totalamount2 +=claim.getINVOICED_AMOUNT();
			
			claimDTO.setAMOUNT_PAYABLE(totalamount);
			claimDTO.setCHEQUE_NO(claim.getCHEQUE_NO());
			claimDTO.setCLAIM_NO(claim.getCLAIM_NO());
			claimDTO.setId(claim.getId());
			claimDTO.setINVOICE_DATE(claim.getINVOICE_DATE());
			claimDTO.setINVOICED_AMOUNT(totalamount2);
			claimDTO.setPROVIDER(claim.getPROVIDER());
			claimDTO.setINVOICE_NO(claim.getINVOICE_NO());
			claimDTO.setMEMBER_NO(claim.getMEMBER_NO());
			
		}
		
		 return claimDTO;
	}
	
	 
}
