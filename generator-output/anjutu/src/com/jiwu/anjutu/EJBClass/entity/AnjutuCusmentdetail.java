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
 * description anjutucusmentdetail Entity
 * 2014-8-19 10:18:24
 * @author jiwurapid
 */
@Entity
@Table(name = "anjutu_cusmentdetail", catalog = "anjutu_flat")



public class AnjutuCusmentdetail{
	
	//columns START
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "cid", unique = true, nullable = false)
	private int cid;
	private String cusNumber;
	private String mobile;
	private String name;
	//columns END


	public void setCid(int value) {
		this.cid = value;
	}
	
	public int getCid() {
		return this.cid;
	}
	public void setCusNumber(String value) {
		this.cusNumber = value;
	}
	
	public String getCusNumber() {
		return this.cusNumber;
	}
	public void setMobile(String value) {
		this.mobile = value;
	}
	
	public String getMobile() {
		return this.mobile;
	}
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}


}

