package com.API.Final.Model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "BILLS")
public class Claim {
	/**
	 * 
	 */
	private int id;
	private String CLAIM_NO;
	private String PROVIDER;
	private BigDecimal AMOUNT_PAYABLE;
	private String INVOICE_NO;
	private Date INVOICE_DATE;
	private String CHEQUE_NO;
	private String MEMBER_NO;
    
    public Claim() {
    }

	public Claim(int id,String CLAIM_NO,String PROVIDER,BigDecimal AMOUNT_PAYABLE,String INVOICE_NO,Date INVOICE_DATE) {
		this.id=id;
		this.CLAIM_NO=CLAIM_NO;
		this.PROVIDER=PROVIDER;
		this.AMOUNT_PAYABLE=AMOUNT_PAYABLE;
		this.INVOICE_NO=INVOICE_NO;
		this.INVOICE_DATE=INVOICE_DATE;	
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	@Column(name = "CLAIM_NO")
	public String getCLAIM_NO() {
		return CLAIM_NO;
	}

	public void setCLAIM_NO(String cLAIM_NO) {
		CLAIM_NO = cLAIM_NO;
	}

	public String getPROVIDER() {
		return PROVIDER;
	}

	public void setPROVIDER(String pROVIDER) {
		PROVIDER = pROVIDER;
	}

	public BigDecimal getAMOUNT_PAYABLE() {
		return AMOUNT_PAYABLE;
	}

	public void setAMOUNT_PAYABLE(BigDecimal aMOUNT_PAYABLE) {
		AMOUNT_PAYABLE = aMOUNT_PAYABLE;
	}
	
	
	public String getINVOICE_NO() {
		return INVOICE_NO;
	}

	public void setINVOICE_NO(String iNVOICE_NO) {
		INVOICE_NO = iNVOICE_NO;
	}

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd")
	public Date getINVOICE_DATE() {
		return INVOICE_DATE;
	}

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd")
	public void setINVOICE_DATE(Date iNVOICE_DATE) {
		INVOICE_DATE = iNVOICE_DATE;
	}

	public String getCHEQUE_NO() {
		return CHEQUE_NO;
	}

	public void setCHEQUE_NO(String cHEQUE_NO) {
		CHEQUE_NO = cHEQUE_NO;
	}

	public String getMEMBER_NO() {
		return MEMBER_NO;
	}

	public void setMEMBER_NO(String mEMBER_NO) {
		MEMBER_NO = mEMBER_NO;
	}
	

	


}
