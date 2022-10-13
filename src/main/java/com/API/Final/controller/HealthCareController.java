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
	
	@GetMapping("/{CLAIM_NO}/{AMOUNT_PAYABLE}")
	public List<HealthCare> healthCares(@PathVariable String CLAIM_NO,@PathVariable BigDecimal AMOUNT_PAYABLE) {
		 return healthService.getHealthCares(CLAIM_NO,AMOUNT_PAYABLE);
	}
}
