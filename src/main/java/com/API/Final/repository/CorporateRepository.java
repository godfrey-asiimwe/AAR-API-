package com.API.Final.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.API.Final.Model.Contract;

public interface CorporateRepository extends JpaRepository<Contract, Integer>{
	@Query(value = "SELECT CORPORATE.CORP_ID,CORPORATE.CORPORATE,CORPORATE.POLICY_NO,CORP_ANNIVERSARY.START_DATE,CORP_ANNIVERSARY.END_DATE   FROM CORPORATE FULL JOIN CORP_ANNIVERSARY\r\n"
			+ "ON  CORP_ANNIVERSARY.CORP_ID=CORPORATE.CORP_ID  WHERE  CORPORATE.POLICY_NO=?1", nativeQuery = true)
	Contract findByCORP_ID(String CORP_ID);

}
