package com.API.Final.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.API.Final.Model.Membership;
import com.API.Final.service.MemberService;

@RestController
@RequestMapping(value = "/member")
public class MemberController {
	@Autowired
	private MemberService memberService;

	@SuppressWarnings("deprecation")
	@GetMapping("/{MEMBER_NO}")
	public Membership memberships(@PathVariable String MEMBER_NO) {
		
		 Membership data = memberService.getMember(MEMBER_NO);
		 
		 Membership member =new Membership();
		 member.setMEMBER_NO(data.getMEMBER_NO());
		 member.setFAMILY_NO(data.getFAMILY_NO());
		 member.setFIRST_NAME(data.getFIRST_NAME());
		 member.setOTHER_NAMES(data.getOTHER_NAMES());
		 member.setSURNAME(data.getSURNAME());
		 member.setMonth(data.getDATE_ENTERED().getMonth()+1);
		 member.setYear(data.getDATE_ENTERED().getYear()+1900);
		 member.setDATE_ENTERED(data.getDATE_ENTERED());
		 member.setCORPORATE(data.getCORPORATE());
		  
		 return member;
	}

}
