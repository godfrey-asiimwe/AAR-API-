package com.API.Final.controller;

import java.math.BigDecimal;
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
	@GetMapping("/{CLAIM_NO}/{AMOUNT_PAYABLE}")
	public HealthCare healthCares(@PathVariable String CLAIM_NO,@PathVariable BigDecimal AMOUNT_PAYABLE) {
		     HealthCare healthCare =healthService.getHealthCares(CLAIM_NO,AMOUNT_PAYABLE);
	
			 HealthCare healthCareDTO =new HealthCare();
			 
			 healthCareDTO.setId(healthCare.getId());
			 healthCareDTO.setCLAIM_NO(healthCare.getCLAIM_NO());
			 healthCareDTO.setPROVIDER(healthCare.getPROVIDER());
			 healthCareDTO.setAMOUNT_PAYABLE(healthCare.getAMOUNT_PAYABLE());
			 healthCareDTO.setINVOICE_NO(healthCare.getINVOICE_NO());
			 healthCareDTO.setINVOICE_DATE(healthCare.getINVOICE_DATE());
			 healthCareDTO.setMEMBER_NO(healthCare.getMEMBER_NO());
			 healthCareDTO.setBATCH_NO(healthCare.getBATCH_NO());
			 healthCareDTO.setMonth(healthCare.getINVOICE_DATE().getMonth()+1);
			 healthCareDTO.setYear(healthCare.getINVOICE_DATE().getYear()+1900);
			 
		  
		 return healthCareDTO;
	}
}
