package com.API.Final.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.API.Final.Model.Claim;
import com.API.Final.repository.ClaimRepository;

import java.math.BigDecimal;
import java.util.List;

@Service
@Transactional
public class ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    public List<Claim> getClaim(String  CLAIM_NO) {
        return claimRepository.findByClaim_NO(CLAIM_NO);
    }
   
    

}
