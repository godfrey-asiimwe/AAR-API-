package com.API.Final.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "CORPORATE")
public class Contract {
	private int CORP_ID;
	private String CORPORATE;
	private String POLICY_NO;
	private Date START_DATE;
	private Date END_DATE;

	public Contract() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getCORP_ID() {
		return CORP_ID;
	}

	public void setCORP_ID(int cORP_ID) {
		CORP_ID = cORP_ID;
	}

	public String getCORPORATE() {
		return CORPORATE;
	}

	public void setCORPORATE(String cORPORATE) {
		CORPORATE = cORPORATE;
	}

	
	public String getPOLICY_NO() {
		return POLICY_NO;
	}

	public void setPOLICY_NO(String pOLICY_NO) {
		POLICY_NO = pOLICY_NO;
	}

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd")
	public Date getSTART_DATE() {
		return START_DATE;
	}

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd")
	public void setSTART_DATE(Date sTART_DATE) {
		START_DATE = sTART_DATE;
	}

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd")
	public Date getEND_DATE() {
		return END_DATE;
	}

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd")
	public void setEND_DATE(Date eND_DATE) {
		END_DATE = eND_DATE;
	}

}
