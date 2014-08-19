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
 * description anjutucusmentlog Entity
 * 2014-8-19 10:18:31
 * @author jiwurapid
 */
@Entity
@Table(name = "anjutu_cusmentlog", catalog = "anjutu_flat")



public class AnjutuCusmentlog{
	
	//columns START
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	private int kid;
	private int type;
	private String remark;
	private int operateId;
	private String operateName;
	private String statusBefore;
	private int statusBack;
	private Date ctime;
	//columns END


	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return this.id;
	}
	public void setKid(int value) {
		this.kid = value;
	}
	
	public int getKid() {
		return this.kid;
	}
	public void setType(int value) {
		this.type = value;
	}
	
	public int getType() {
		return this.type;
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
	public void setStatusBefore(String value) {
		this.statusBefore = value;
	}
	
	public String getStatusBefore() {
		return this.statusBefore;
	}
	public void setStatusBack(int value) {
		this.statusBack = value;
	}
	
	public int getStatusBack() {
		return this.statusBack;
	}
	public void setCtime(Date value) {
		this.ctime = value;
	}
	
	public Date getCtime() {
		return this.ctime;
	}


}

