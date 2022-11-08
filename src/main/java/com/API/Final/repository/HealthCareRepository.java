package com.API.Final.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.API.Final.Model.HealthCare;

public interface HealthCareRepository extends JpaRepository<HealthCare, Integer>{
	@Query(value = "SELECT BILLS.id, BILLS.CLAIM_NO,PROVIDER.PROVIDER,BILLS.AMOUNT_PAYABLE,BILLS.INVOICE_NO,BILLS.INVOICED_AMOUNT,BILLS.INVOICE_DATE,BILLS.BATCH_NO,BILLS.MEMBER_NO  FROM BILLS INNER JOIN PROVIDER ON PROVIDER.CODE=BILLS.PROVIDER  WHERE  BILLS.claim_NO LIKE ?1", nativeQuery = true)
	List<HealthCare> findByClaim_NO(String claim_NO);
}
