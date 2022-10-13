package com.API.Final.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.API.Final.Model.Membership;

public interface MembershipRepository extends JpaRepository<Membership, String>{
	@Query(value = "SELECT * FROM MEMBER_INFO  WHERE  MEMBER_INFO.MEMBER_NO=?1", nativeQuery = true)
	List<Membership> findByMember_NO(String MEMBER_NO);

}
