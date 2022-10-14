package com.API.Final.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.API.Final.Model.Claim;
import com.API.Final.repository.ClaimRepository;

import java.math.BigDecimal;

@Service
@Transactional
public class ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    public Claim getClaim(String  CLAIM_NO, BigDecimal AMOUNT_PAYABLE) {
        return claimRepository.findByClaim_NO(CLAIM_NO, AMOUNT_PAYABLE);
    }
    
    public Claim getClaim(String  CLAIM_NO) {
        return claimRepository.findByClaim(CLAIM_NO);
    }
    

}
