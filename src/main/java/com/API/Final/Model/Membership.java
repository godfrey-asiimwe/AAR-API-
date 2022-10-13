package com.API.Final.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MEMBER_INFO")
public class Membership {
	private String MEMBER_NO;
	private String SURNAME;
	private String FIRST_NAME;
	private String OTHER_NAMES;
	private String FAMILY_NO;
	private Date DATE_ENTERED;

	public Membership() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public String getMEMBER_NO() {
		return MEMBER_NO;
	}

	public void setMEMBER_NO(String mEMBER_NO) {
		MEMBER_NO = mEMBER_NO;
	}
	
	public String getSURNAME() {
		return SURNAME;
	}

	public void setSURNAME(String sURNAME) {
		SURNAME = sURNAME;
	}

	public String getFIRST_NAME() {
		return FIRST_NAME;
	}

	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}

	public String getOTHER_NAMES() {
		return OTHER_NAMES;
	}

	public void setOTHER_NAMES(String oTHER_NAMES) {
		OTHER_NAMES = oTHER_NAMES;
	}

	public String getFAMILY_NO() {
		return FAMILY_NO;
	}

	public void setFAMILY_NO(String fAMILY_NO) {
		FAMILY_NO = fAMILY_NO;
	}

	public Date getDATE_ENTERED() {
		return DATE_ENTERED;
	}

	public void setDATE_ENTERED(Date dATE_ENTERED) {
		DATE_ENTERED = dATE_ENTERED;
	}

}
