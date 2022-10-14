package com.API.Final.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.API.Final.Model.Membership;

public interface MembershipRepository extends JpaRepository<Membership, String>{
	@Query(value = "SELECT  MEMBER_INFO.MEMBER_NO, MEMBER_INFO.SURNAME,MEMBER_INFO.FIRST_NAME,MEMBER_INFO.OTHER_NAMES,MEMBER_INFO.FAMILY_NO,MEMBER_INFO.DATE_ENTERED,CORPORATE.CORPORATE FROM MEMBER_INFO FULL JOIN CORPORATE ON  MEMBER_INFO.CORP_ID=CORPORATE.CORP_ID WHERE  MEMBER_INFO.MEMBER_NO=?1", nativeQuery = true)
	Membership findByMember_NO(String MEMBER_NO);

}
