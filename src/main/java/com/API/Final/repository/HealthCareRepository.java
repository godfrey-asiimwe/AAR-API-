package com.API.Final.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.API.Final.Model.HealthCare;

public interface HealthCareRepository extends JpaRepository<HealthCare, Integer>{
	@Query(value = "SELECT BILLS.id, BILLS.CLAIM_NO,BILLS.PROVIDER,BILLS.AMOUNT_PAYABLE,BILLS.INVOICE_NO,BILLS.INVOICE_DATE,BILLS.BATCH_NO,BILLS.MEMBER_NO  FROM BILLS  WHERE  BILLS.claim_NO=?1 AND BILLS.AMOUNT_PAYABLE=?2", nativeQuery = true)
	List<HealthCare> findByClaim_NO(String claim_NO,BigDecimal AMOUNT_PAYABLE);
}
