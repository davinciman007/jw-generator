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
 * description anjutudistricttable Entity
 * 2014-8-19 10:18:38
 * @author jiwurapid
 */
@Entity
@Table(name = "anjutu_districttable", catalog = "anjutu_flat")



public class AnjutuDistricttable{
	
	//columns START
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "dtid", unique = true, nullable = false)
	private int dtid;
	private String name;
	private String remark;
	private int parentId;
	private int status;
	private int orderNum;
	private java.lang.Double minValue;
	private java.lang.Double maxValue;
	private int size;
	private int manpower;
	private String code;
	private String centerPhone;
	private int startNumber;
	private int endNumber;
	private String jwParentId;
	//columns END


	public void setDtid(int value) {
		this.dtid = value;
	}
	
	public int getDtid() {
		return this.dtid;
	}
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	public void setParentId(int value) {
		this.parentId = value;
	}
	
	public int getParentId() {
		return this.parentId;
	}
	public void setStatus(int value) {
		this.status = value;
	}
	
	public int getStatus() {
		return this.status;
	}
	public void setOrderNum(int value) {
		this.orderNum = value;
	}
	
	public int getOrderNum() {
		return this.orderNum;
	}
	public void setMinValue(java.lang.Double value) {
		this.minValue = value;
	}
	
	public java.lang.Double getMinValue() {
		return this.minValue;
	}
	public void setMaxValue(java.lang.Double value) {
		this.maxValue = value;
	}
	
	public java.lang.Double getMaxValue() {
		return this.maxValue;
	}
	public void setSize(int value) {
		this.size = value;
	}
	
	public int getSize() {
		return this.size;
	}
	public void setManpower(int value) {
		this.manpower = value;
	}
	
	public int getManpower() {
		return this.manpower;
	}
	public void setCode(String value) {
		this.code = value;
	}
	
	public String getCode() {
		return this.code;
	}
	public void setCenterPhone(String value) {
		this.centerPhone = value;
	}
	
	public String getCenterPhone() {
		return this.centerPhone;
	}
	public void setStartNumber(int value) {
		this.startNumber = value;
	}
	
	public int getStartNumber() {
		return this.startNumber;
	}
	public void setEndNumber(int value) {
		this.endNumber = value;
	}
	
	public int getEndNumber() {
		return this.endNumber;
	}
	public void setJwParentId(String value) {
		this.jwParentId = value;
	}
	
	public String getJwParentId() {
		return this.jwParentId;
	}


}

