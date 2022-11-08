package com.API.Final.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.API.Final.Model.Contract;

public interface CorporateRepository extends JpaRepository<Contract, String>{
	@Query(value = "SELECT policy_doc.CORP_ID,CORPORATE.CORPORATE,policy_doc.POLICY_NO,CORP_ANNIVERSARY.START_DATE,CORP_ANNIVERSARY.END_DATE,policy_doc.member_no   FROM policy_doc INNER JOIN CORP_ANNIVERSARY\r\n"
			+ "ON  CORP_ANNIVERSARY.CORP_ID=policy_doc.CORP_ID INNER JOIN CORPORATE ON  CORPORATE.CORP_ID=policy_doc.CORP_ID   WHERE  policy_doc.POLICY_NO LIKE ?1", nativeQuery = true)
	Contract findByCORP_ID(String CORP_ID);
	
	//@Query(value = "SELECT policy_doc.CORP_ID,policy_doc.POLICY_NO,policy_doc.member_no,member_anniversary.start_date,member_anniversary.end_date   FROM policy_doc INNER JOIN member_anniversary ON  policy_doc.member_no=member_anniversary.member_no", nativeQuery = true)
	
	  @Query(value = "\r\n" +
	  "SELECT policy_doc.POLICY_NO,member_anniversary.START_DATE,member_anniversary.END_DATE, policy_doc.member_no  FROM policy_doc INNER JOIN member_anniversary as member_anniversary ON  member_anniversary.member_no=policy_doc.member_no WHERE  policy_doc.member_no LIKE 'UG137137-00'"
	  , nativeQuery = true)
	Contract findByMEMBER_NO(String member_no);

}
