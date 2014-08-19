package com.jiwu.anjutu.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * description anjutufinance Entity
 * 2014-8-19 10:18:56
 * @author jiwurapid
 */
@Entity
@Table(name = "anjutu_finance", catalog = "anjutu_flat")



public class AnjutuFinance{
	
	//columns START
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	private int contractNumber;
	private int contractId;
	private int flatId;
	private int paymentType;
	private String paymentName;
	private String paymentMobile;
	private Date paymentTime;
	private java.lang.Double paymentMoney;
	private String remark;
	private Date ctime;
	private Date utime;
	private int operateId;
	private String operateName;
	//columns END


	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return this.id;
	}
	public void setContractNumber(int value) {
		this.contractNumber = value;
	}
	
	public int getContractNumber() {
		return this.contractNumber;
	}
	public void setContractId(int value) {
		this.contractId = value;
	}
	
	public int getContractId() {
		return this.contractId;
	}
	public void setFlatId(int value) {
		this.flatId = value;
	}
	
	public int getFlatId() {
		return this.flatId;
	}
	public void setPaymentType(int value) {
		this.paymentType = value;
	}
	
	public int getPaymentType() {
		return this.paymentType;
	}
	public void setPaymentName(String value) {
		this.paymentName = value;
	}
	
	public String getPaymentName() {
		return this.paymentName;
	}
	public void setPaymentMobile(String value) {
		this.paymentMobile = value;
	}
	
	public String getPaymentMobile() {
		return this.paymentMobile;
	}
	public void setPaymentTime(Date value) {
		this.paymentTime = value;
	}
	
	public Date getPaymentTime() {
		return this.paymentTime;
	}
	public void setPaymentMoney(java.lang.Double value) {
		this.paymentMoney = value;
	}
	
	public java.lang.Double getPaymentMoney() {
		return this.paymentMoney;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	public void setCtime(Date value) {
		this.ctime = value;
	}
	
	public Date getCtime() {
		return this.ctime;
	}
	public void setUtime(Date value) {
		this.utime = value;
	}
	
	public Date getUtime() {
		return this.utime;
	}
	public void setOperateId(int value) {
		this.operateId = value;
	}
	
	public int getOperateId() {
		return this.operateId;
	}
	public void setOperateName(String value) {
		this.operateName = value;
	}
	
	public String getOperateName() {
		return this.operateName;
	}


}

