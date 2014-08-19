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
 * description anjutubuild Entity
 * 2014-8-19 10:17:49
 * @author jiwurapid
 */
@Entity
@Table(name = "anjutu_build", catalog = "anjutu_flat")



public class AnjutuBuild{
	
	//columns START
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "bid", unique = true, nullable = false)
	private int bid;
	private String bname;
	private String title;
	private int averagePrice;
	private String path;
	private int cityId;
	private int districtCityId;
	private int streetId;
	private String busName;
	private Date utime;
	private int level;
	private Date ctime;
	private int status;
	private int pictureNum;
	private java.lang.Double grade;
	private int vtimes;
	private String address;
	private String features;
	private String saleAddress;
	private String agentPhone;
	private String centerPhone;
	private long longitude;
	private long latitude;
	private String propertyType;
	private String buildType;
	private String decoration;
	private String mprice;
	private int saleStatus;
	private int adviserNum;
	private String jiwuId;
	//columns END


	public void setBid(int value) {
		this.bid = value;
	}
	
	public int getBid() {
		return this.bid;
	}
	public void setBname(String value) {
		this.bname = value;
	}
	
	public String getBname() {
		return this.bname;
	}
	public void setTitle(String value) {
		this.title = value;
	}
	
	public String getTitle() {
		return this.title;
	}
	public void setAveragePrice(int value) {
		this.averagePrice = value;
	}
	
	public int getAveragePrice() {
		return this.averagePrice;
	}
	public void setPath(String value) {
		this.path = value;
	}
	
	public String getPath() {
		return this.path;
	}
	public void setCityId(int value) {
		this.cityId = value;
	}
	
	public int getCityId() {
		return this.cityId;
	}
	public void setDistrictCityId(int value) {
		this.districtCityId = value;
	}
	
	public int getDistrictCityId() {
		return this.districtCityId;
	}
	public void setStreetId(int value) {
		this.streetId = value;
	}
	
	public int getStreetId() {
		return this.streetId;
	}
	public void setBusName(String value) {
		this.busName = value;
	}
	
	public String getBusName() {
		return this.busName;
	}
	public void setUtime(Date value) {
		this.utime = value;
	}
	
	public Date getUtime() {
		return this.utime;
	}
	public void setLevel(int value) {
		this.level = value;
	}
	
	public int getLevel() {
		return this.level;
	}
	public void setCtime(Date value) {
		this.ctime = value;
	}
	
	public Date getCtime() {
		return this.ctime;
	}
	public void setStatus(int value) {
		this.status = value;
	}
	
	public int getStatus() {
		return this.status;
	}
	public void setPictureNum(int value) {
		this.pictureNum = value;
	}
	
	public int getPictureNum() {
		return this.pictureNum;
	}
	public void setGrade(java.lang.Double value) {
		this.grade = value;
	}
	
	public java.lang.Double getGrade() {
		return this.grade;
	}
	public void setVtimes(int value) {
		this.vtimes = value;
	}
	
	public int getVtimes() {
		return this.vtimes;
	}
	public void setAddress(String value) {
		this.address = value;
	}
	
	public String getAddress() {
		return this.address;
	}
	public void setFeatures(String value) {
		this.features = value;
	}
	
	public String getFeatures() {
		return this.features;
	}
	public void setSaleAddress(String value) {
		this.saleAddress = value;
	}
	
	public String getSaleAddress() {
		return this.saleAddress;
	}
	public void setAgentPhone(String value) {
		this.agentPhone = value;
	}
	
	public String getAgentPhone() {
		return this.agentPhone;
	}
	public void setCenterPhone(String value) {
		this.centerPhone = value;
	}
	
	public String getCenterPhone() {
		return this.centerPhone;
	}
	public void setLongitude(long value) {
		this.longitude = value;
	}
	
	public long getLongitude() {
		return this.longitude;
	}
	public void setLatitude(long value) {
		this.latitude = value;
	}
	
	public long getLatitude() {
		return this.latitude;
	}
	public void setPropertyType(String value) {
		this.propertyType = value;
	}
	
	public String getPropertyType() {
		return this.propertyType;
	}
	public void setBuildType(String value) {
		this.buildType = value;
	}
	
	public String getBuildType() {
		return this.buildType;
	}
	public void setDecoration(String value) {
		this.decoration = value;
	}
	
	public String getDecoration() {
		return this.decoration;
	}
	public void setMprice(String value) {
		this.mprice = value;
	}
	
	public String getMprice() {
		return this.mprice;
	}
	public void setSaleStatus(int value) {
		this.saleStatus = value;
	}
	
	public int getSaleStatus() {
		return this.saleStatus;
	}
	public void setAdviserNum(int value) {
		this.adviserNum = value;
	}
	
	public int getAdviserNum() {
		return this.adviserNum;
	}
	public void setJiwuId(String value) {
		this.jiwuId = value;
	}
	
	public String getJiwuId() {
		return this.jiwuId;
	}


}

