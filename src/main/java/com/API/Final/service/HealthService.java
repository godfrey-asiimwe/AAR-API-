package com.API.Final.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.API.Final.Model.HealthCare;
import com.API.Final.repository.HealthCareRepository;

@Service
@Transactional
public class HealthService {
	@Autowired
	private HealthCareRepository healthCareRepository;
	
    public List<HealthCare> getHealthCares(String  CLAIM_NO, BigDecimal AMOUNT_PAYABLE) {
        return healthCareRepository.findByClaim_NO(CLAIM_NO,AMOUNT_PAYABLE);
    }

}
