package com.API.Final.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.API.Final.Model.Membership;
import com.API.Final.repository.MembershipRepository;

@Service
@Transactional
public class MemberService {
	
	@Autowired
	private MembershipRepository membershipRepository;

	public Membership getMember(String  MEMBER_NO) {
        return membershipRepository.findByMember_NO(MEMBER_NO);
    }

}
