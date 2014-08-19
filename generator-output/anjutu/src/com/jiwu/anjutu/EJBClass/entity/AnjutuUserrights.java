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
 * description anjutuuserrights Entity
 * 2014-8-19 10:19:21
 * @author jiwurapid
 */
@Entity
@Table(name = "anjutu_userrights", catalog = "anjutu_flat")



public class AnjutuUserrights{
	
	//columns START
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "urid", unique = true, nullable = false)
	private int urid;
	private String urname;
	private int status;
	private String actionName;
	private int type;
	private int parentId;
	private String code;
	private int orderNum;
	private int sysType;
	//columns END


	public void setUrid(int value) {
		this.urid = value;
	}
	
	public int getUrid() {
		return this.urid;
	}
	public void setUrname(String value) {
		this.urname = value;
	}
	
	public String getUrname() {
		return this.urname;
	}
	public void setStatus(int value) {
		this.status = value;
	}
	
	public int getStatus() {
		return this.status;
	}
	public void setActionName(String value) {
		this.actionName = value;
	}
	
	public String getActionName() {
		return this.actionName;
	}
	public void setType(int value) {
		this.type = value;
	}
	
	public int getType() {
		return this.type;
	}
	public void setParentId(int value) {
		this.parentId = value;
	}
	
	public int getParentId() {
		return this.parentId;
	}
	public void setCode(String value) {
		this.code = value;
	}
	
	public String getCode() {
		return this.code;
	}
	public void setOrderNum(int value) {
		this.orderNum = value;
	}
	
	public int getOrderNum() {
		return this.orderNum;
	}
	public void setSysType(int value) {
		this.sysType = value;
	}
	
	public int getSysType() {
		return this.sysType;
	}


}

