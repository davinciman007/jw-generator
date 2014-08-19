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
 * description anjutucontractlog Entity
 * 2014-8-19 10:18:10
 * @author jiwurapid
 */
@Entity
@Table(name = "anjutu_contractlog", catalog = "anjutu_flat")



public class AnjutuContractlog{
	
	//columns START
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	private int contractId;
	private String contractNumber;
	private int statusBefore;
	private int statusAfter;
	private Date ctime;
	private String remark;
	private int operateId;
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
	public void setStatusBefore(int value) {
		this.statusBefore = value;
	}
	
	public int getStatusBefore() {
		return this.statusBefore;
	}
	public void setStatusAfter(int value) {
		this.statusAfter = value;
	}
	
	public int getStatusAfter() {
		return this.statusAfter;
	}
	public void setCtime(Date value) {
		this.ctime = value;
	}
	
	public Date getCtime() {
		return this.ctime;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
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

