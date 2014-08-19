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
 * description anjutuflatconfig Entity
 * 2014-8-19 10:19:08
 * @author jiwurapid
 */
@Entity
@Table(name = "anjutu_flatconfig", catalog = "anjutu_flat")



public class AnjutuFlatconfig{
	
	//columns START
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "flatId", unique = true, nullable = false)
	private int flatId;
	private int cityId;
	private String name;
	private int businessType;
	private String typeName;
	private String column1;
	private String column2;
	private String column3;
	private String column4;
	private String column5;
	private String remark;
	private int status;
	private Date ctime;
	private Date utime;
	private String operateId;
	private String operateName;
	private int type;
	//columns END


	public void setFlatId(int value) {
		this.flatId = value;
	}
	
	public int getFlatId() {
		return this.flatId;
	}
	public void setCityId(int value) {
		this.cityId = value;
	}
	
	public int getCityId() {
		return this.cityId;
	}
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	public void setBusinessType(int value) {
		this.businessType = value;
	}
	
	public int getBusinessType() {
		return this.businessType;
	}
	public void setTypeName(String value) {
		this.typeName = value;
	}
	
	public String getTypeName() {
		return this.typeName;
	}
	public void setColumn1(String value) {
		this.column1 = value;
	}
	
	public String getColumn1() {
		return this.column1;
	}
	public void setColumn2(String value) {
		this.column2 = value;
	}
	
	public String getColumn2() {
		return this.column2;
	}
	public void setColumn3(String value) {
		this.column3 = value;
	}
	
	public String getColumn3() {
		return this.column3;
	}
	public void setColumn4(String value) {
		this.column4 = value;
	}
	
	public String getColumn4() {
		return this.column4;
	}
	public void setColumn5(String value) {
		this.column5 = value;
	}
	
	public String getColumn5() {
		return this.column5;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	public void setStatus(int value) {
		this.status = value;
	}
	
	public int getStatus() {
		return this.status;
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
	public void setType(int value) {
		this.type = value;
	}
	
	public int getType() {
		return this.type;
	}


}

