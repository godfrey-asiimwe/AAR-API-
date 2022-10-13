package com.API.Final.controller;

import java.util.List;

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

	@GetMapping("/{MEMBER_NO}")
	public List<Membership> memberships(@PathVariable String MEMBER_NO) {
		 return memberService.getMember(MEMBER_NO);
	}

}
