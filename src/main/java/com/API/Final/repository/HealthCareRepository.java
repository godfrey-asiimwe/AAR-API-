package com.API.Final.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.API.Final.Model.HealthCare;

public interface HealthCareRepository extends JpaRepository<HealthCare, Integer>{
	@Query(value = "SELECT BILLS.id, BILLS.CLAIM_NO,PROVIDER.PROVIDER,BILLS.AMOUNT_PAYABLE,BILLS.INVOICE_NO,BILLS.INVOICE_DATE,BILLS.BATCH_NO,BILLS.MEMBER_NO  FROM BILLS INNER JOIN PROVIDER ON PROVIDER.CODE=BILLS.PROVIDER  WHERE  BILLS.claim_NO=?1 AND BILLS.AMOUNT_PAYABLE=?2", nativeQuery = true)
	HealthCare findByClaim_NO(String claim_NO,BigDecimal AMOUNT_PAYABLE);
}
