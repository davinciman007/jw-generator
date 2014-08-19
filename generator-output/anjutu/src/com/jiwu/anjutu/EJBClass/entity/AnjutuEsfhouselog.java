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
 * description anjutuesfhouselog Entity
 * 2014-8-19 10:18:50
 * @author jiwurapid
 */
@Entity
@Table(name = "anjutu_esfhouselog", catalog = "anjutu_flat")



public class AnjutuEsfhouselog{
	
	//columns START
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	private int houseId;
	private int type;
	private String remark;
	private String operateId;
	private String operateName;
	private Date ctime;
	//columns END


	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return this.id;
	}
	public void setHouseId(int value) {
		this.houseId = value;
	}
	
	public int getHouseId() {
		return this.houseId;
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
	public void setCtime(Date value) {
		this.ctime = value;
	}
	
	public Date getCtime() {
		return this.ctime;
	}


}

