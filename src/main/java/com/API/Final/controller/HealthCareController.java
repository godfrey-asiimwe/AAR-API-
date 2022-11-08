package com.API.Final.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.API.Final.Model.HealthCare;
import com.API.Final.service.HealthService;

@RestController
@RequestMapping(value = "/health")
public class HealthCareController {

	@Autowired
	private HealthService healthService;
	
	
	
	@SuppressWarnings("deprecation")
	@GetMapping("/{CLAIM_NO}")
	public HealthCare healthCares(@PathVariable String CLAIM_NO) {
		   
		     List<HealthCare> healthCare =healthService.getHealthCares(CLAIM_NO);
	
		     HealthCare healthCareDTO =new HealthCare();
		     
		     Double totalamount=0.0;
		     Double totalamount2=0.0;
		     
		     for(HealthCare healthCareD:healthCare) {
			 
			 
			 
			 totalamount +=healthCareD.getAMOUNT_PAYABLE();
			 totalamount2 +=healthCareD.getINVOICED_AMOUNT();
			 
			 healthCareDTO.setId(healthCareD.getId());
			 healthCareDTO.setCLAIM_NO(healthCareD.getCLAIM_NO());
			 healthCareDTO.setPROVIDER(healthCareD.getPROVIDER());
			 healthCareDTO.setAMOUNT_PAYABLE(totalamount);
			 healthCareDTO.setINVOICE_NO(healthCareD.getINVOICE_NO());
			 healthCareDTO.setINVOICE_DATE(healthCareD.getINVOICE_DATE());
			 healthCareDTO.setMEMBER_NO(healthCareD.getMEMBER_NO());
			 healthCareDTO.setBATCH_NO(healthCareD.getBATCH_NO());
			 healthCareDTO.setMonth(healthCareD.getINVOICE_DATE().getMonth()+1);
			 healthCareDTO.setYear(healthCareD.getINVOICE_DATE().getYear()+1900);
			 healthCareDTO.setINVOICED_AMOUNT(totalamount2);
			 
		     }
		  
		 return healthCareDTO;
	}
}
