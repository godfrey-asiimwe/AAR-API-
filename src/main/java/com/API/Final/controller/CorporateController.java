package com.API.Final.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.API.Final.Model.Contract;
import com.API.Final.service.CorporateService;

@RestController
@RequestMapping(value = "/corp")
public class CorporateController {

	@Autowired
	private CorporateService corporateService;
	
	@GetMapping("/{CORP_ID}")
	public Contract contracts(@PathVariable String CORP_ID) {
		 return corporateService.getContract(CORP_ID);
	}
}
