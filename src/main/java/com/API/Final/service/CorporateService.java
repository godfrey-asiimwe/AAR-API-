package com.API.Final.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.API.Final.Model.Contract;
import com.API.Final.repository.CorporateRepository;

@Service
@Transactional
public class CorporateService {

	@Autowired
	private CorporateRepository corporateRepository;
	
	public Contract getContract(String  CORP_ID) {
        return corporateRepository.findByCORP_ID(CORP_ID);
    }
}
