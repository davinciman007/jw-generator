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
 * description anjutucusment Entity
 * 2014-8-19 10:18:17
 * @author jiwurapid
 */
@Entity
@Table(name = "anjutu_cusment", catalog = "anjutu_flat")



public class AnjutuCusment{
	
	//columns START
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "cusId", unique = true, nullable = false)
	private int cusId;
	private String cusNumber;
	private String name;
	private String mobile;
	private String email;
	private String sex;
	private String type;
	private String qudaoSource;
	private String cusTrade;
	private String cusLevel;
	private int cityId;
	private String cityName;
	private int districtId;
	private String districtName;
	private int streetId;
	private String streetName;
	private String direction;
	private java.lang.Double buildArea;
	private int unitPrice;
	private java.lang.Double totalPrice;
	private int storey;
	private int buildAge;
	private int decoration;
	private int status;
	private int paymentWay;
	private String remark;
	private Date ctime;
	private Date utime;
	private int operateId;
	private String operateName;
	//columns END


	public void setCusId(int value) {
		this.cusId = value;
	}
	
	public int getCusId() {
		return this.cusId;
	}
	public void setCusNumber(String value) {
		this.cusNumber = value;
	}
	
	public String getCusNumber() {
		return this.cusNumber;
	}
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return this.name;
	}
	public void setMobile(String value) {
		this.mobile = value;
	}
	
	public String getMobile() {
		return this.mobile;
	}
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setSex(String value) {
		this.sex = value;
	}
	
	public String getSex() {
		return this.sex;
	}
	public void setType(String value) {
		this.type = value;
	}
	
	public String getType() {
		return this.type;
	}
	public void setQudaoSource(String value) {
		this.qudaoSource = value;
	}
	
	public String getQudaoSource() {
		return this.qudaoSource;
	}
	public void setCusTrade(String value) {
		this.cusTrade = value;
	}
	
	public String getCusTrade() {
		return this.cusTrade;
	}
	public void setCusLevel(String value) {
		this.cusLevel = value;
	}
	
	public String getCusLevel() {
		return this.cusLevel;
	}
	public void setCityId(int value) {
		this.cityId = value;
	}
	
	public int getCityId() {
		return this.cityId;
	}
	public void setCityName(String value) {
		this.cityName = value;
	}
	
	public String getCityName() {
		return this.cityName;
	}
	public void setDistrictId(int value) {
		this.districtId = value;
	}
	
	public int getDistrictId() {
		return this.districtId;
	}
	public void setDistrictName(String value) {
		this.districtName = value;
	}
	
	public String getDistrictName() {
		return this.districtName;
	}
	public void setStreetId(int value) {
		this.streetId = value;
	}
	
	public int getStreetId() {
		return this.streetId;
	}
	public void setStreetName(String value) {
		this.streetName = value;
	}
	
	public String getStreetName() {
		return this.streetName;
	}
	public void setDirection(String value) {
		this.direction = value;
	}
	
	public String getDirection() {
		return this.direction;
	}
	public void setBuildArea(java.lang.Double value) {
		this.buildArea = value;
	}
	
	public java.lang.Double getBuildArea() {
		return this.buildArea;
	}
	public void setUnitPrice(int value) {
		this.unitPrice = value;
	}
	
	public int getUnitPrice() {
		return this.unitPrice;
	}
	public void setTotalPrice(java.lang.Double value) {
		this.totalPrice = value;
	}
	
	public java.lang.Double getTotalPrice() {
		return this.totalPrice;
	}
	public void setStorey(int value) {
		this.storey = value;
	}
	
	public int getStorey() {
		return this.storey;
	}
	public void setBuildAge(int value) {
		this.buildAge = value;
	}
	
	public int getBuildAge() {
		return this.buildAge;
	}
	public void setDecoration(int value) {
		this.decoration = value;
	}
	
	public int getDecoration() {
		return this.decoration;
	}
	public void setStatus(int value) {
		this.status = value;
	}
	
	public int getStatus() {
		return this.status;
	}
	public void setPaymentWay(int value) {
		this.paymentWay = value;
	}
	
	public int getPaymentWay() {
		return this.paymentWay;
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

