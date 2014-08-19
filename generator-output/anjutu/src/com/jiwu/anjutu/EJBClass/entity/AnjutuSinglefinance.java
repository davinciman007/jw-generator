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
 * description anjutusinglefinance Entity
 * 2014-8-19 10:19:14
 * @author jiwurapid
 */
@Entity
@Table(name = "anjutu_singlefinance", catalog = "anjutu_flat")



public class AnjutuSinglefinance{
	
	//columns START
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	private int contractId;
	private String contractNumber;
	private String totalCommission;
	private String singleCommission;
	private String remark;
	private String reason;
	private int commissionId;
	private String commissionName;
	private Date ctime;
	private Date utime;
	private int status;
	private String operateId;
	private String operateName;
	//columns END


	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return this.id;
	}
	public void setContractId(int value) {
		this.contractId = value;
	}
	
	public int getContractId() {
		return this.contractId;
	}
	public void setContractNumber(String value) {
		this.contractNumber = value;
	}
	
	public String getContractNumber() {
		return this.contractNumber;
	}
	public void setTotalCommission(String value) {
		this.totalCommission = value;
	}
	
	public String getTotalCommission() {
		return this.totalCommission;
	}
	public void setSingleCommission(String value) {
		this.singleCommission = value;
	}
	
	public String getSingleCommission() {
		return this.singleCommission;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	public void setReason(String value) {
		this.reason = value;
	}
	
	public String getReason() {
		return this.reason;
	}
	public void setCommissionId(int value) {
		this.commissionId = value;
	}
	
	public int getCommissionId() {
		return this.commissionId;
	}
	public void setCommissionName(String value) {
		this.commissionName = value;
	}
	
	public String getCommissionName() {
		return this.commissionName;
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
	public void setStatus(int value) {
		this.status = value;
	}
	
	public int getStatus() {
		return this.status;
	}
	public void setOperateId(String value) {
		this.operateId = value;
	}
	
	public String getOperateId() {
		return this.operateId;
	}
	public void setOperateName(String value) {
		this.operateName = value;
	}
	
	public String getOperateName() {
		return this.operateName;
	}


}

