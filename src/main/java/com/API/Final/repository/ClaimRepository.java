package com.API.Final.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.API.Final.Model.Claim;

public interface ClaimRepository extends JpaRepository<Claim, Integer>{
	@Query(value = "SELECT BILLS.id, BILLS.CLAIM_NO,BILLS.PROVIDER,BILLS.AMOUNT_PAYABLE,BILLS.INVOICE_NO,BILLS.INVOICE_DATE,BILLS_PAYMENT.CHEQUE_NO,BILLS.MEMBER_NO  FROM BILLS INNER JOIN BILLS_PAYMENT\r\n"
			+ "ON BILLS.PAYMENT_NO = BILLS_PAYMENT.PAYMENT_NO  WHERE  BILLS.claim_NO=?1 AND BILLS.AMOUNT_PAYABLE=?2", nativeQuery = true)
	List<Claim> findByClaim_NO(String claim_NO, BigDecimal AMOUNT_PAYABLE );
	
	@Query(value = "SELECT BILLS.id, BILLS.CLAIM_NO,BILLS.PROVIDER,BILLS.AMOUNT_PAYABLE,BILLS.INVOICE_NO,BILLS.INVOICE_DATE,BILLS_PAYMENT.CHEQUE_NO,BILLS.MEMBER_NO  FROM BILLS INNER JOIN BILLS_PAYMENT\r\n"
			+ "ON BILLS.PAYMENT_NO = BILLS_PAYMENT.PAYMENT_NO  WHERE  BILLS.claim_NO=?1", nativeQuery = true)
	Claim findByClaim(String claim_NO);

}