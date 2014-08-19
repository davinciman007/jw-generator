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
 * description anjutuesfhouse Entity
 * 2014-8-19 10:18:44
 * @author jiwurapid
 */
@Entity
@Table(name = "anjutu_esfhouse", catalog = "anjutu_flat")



public class AnjutuEsfhouse{
	
	//columns START
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "houseId", unique = true, nullable = false)
	private int houseId;
	private String houseNumber;
	private int bid;
	private String bname;
	private int cityId;
	private String cityName;
	private int districtId;
	private String districtName;
	private int streetId;
	private String streetName;
	private String building;
	private String buildUnit;
	private String doorNumber;
	private String uniqueMark;
	private int room;
	private int hall;
	private int toilet;
	private int veranda;
	private java.lang.Double buildArea;
	private String storey;
	private String buildNature;
	private String direction;
	private String buildAge;
	private String buildLevel;
	private String ladder;
	private String decoration;
	private String path;
	private String structure;
	private String propertyType;
	private java.lang.Double totalPrice;
	private java.lang.Double averagePrice;
	private int flatId;
	private String saleModeNumber;
	private String remark;
	private String ownerName;
	private int ownerSex;
	private String ownerPhone;
	private String paymentWay;
	private int type;
	private int isPrivate;
	private int status;
	private Date ctime;
	private Date utime;
	private int operateId;
	private String operateName;
	//columns END


	public void setHouseId(int value) {
		this.houseId = value;
	}
	
	public int getHouseId() {
		return this.houseId;
	}
	public void setHouseNumber(String value) {
		this.houseNumber = value;
	}
	
	public String getHouseNumber() {
		return this.houseNumber;
	}
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
	public void setBuilding(String value) {
		this.building = value;
	}
	
	public String getBuilding() {
		return this.building;
	}
	public void setBuildUnit(String value) {
		this.buildUnit = value;
	}
	
	public String getBuildUnit() {
		return this.buildUnit;
	}
	public void setDoorNumber(String value) {
		this.doorNumber = value;
	}
	
	public String getDoorNumber() {
		return this.doorNumber;
	}
	public void setUniqueMark(String value) {
		this.uniqueMark = value;
	}
	
	public String getUniqueMark() {
		return this.uniqueMark;
	}
	public void setRoom(int value) {
		this.room = value;
	}
	
	public int getRoom() {
		return this.room;
	}
	public void setHall(int value) {
		this.hall = value;
	}
	
	public int getHall() {
		return this.hall;
	}
	public void setToilet(int value) {
		this.toilet = value;
	}
	
	public int getToilet() {
		return this.toilet;
	}
	public void setVeranda(int value) {
		this.veranda = value;
	}
	
	public int getVeranda() {
		return this.veranda;
	}
	public void setBuildArea(java.lang.Double value) {
		this.buildArea = value;
	}
	
	public java.lang.Double getBuildArea() {
		return this.buildArea;
	}
	public void setStorey(String value) {
		this.storey = value;
	}
	
	public String getStorey() {
		return this.storey;
	}
	public void setBuildNature(String value) {
		this.buildNature = value;
	}
	
	public String getBuildNature() {
		return this.buildNature;
	}
	public void setDirection(String value) {
		this.direction = value;
	}
	
	public String getDirection() {
		return this.direction;
	}
	public void setBuildAge(String value) {
		this.buildAge = value;
	}
	
	public String getBuildAge() {
		return this.buildAge;
	}
	public void setBuildLevel(String value) {
		this.buildLevel = value;
	}
	
	public String getBuildLevel() {
		return this.buildLevel;
	}
	public void setLadder(String value) {
		this.ladder = value;
	}
	
	public String getLadder() {
		return this.ladder;
	}
	public void setDecoration(String value) {
		this.decoration = value;
	}
	
	public String getDecoration() {
		return this.decoration;
	}
	public void setPath(String value) {
		this.path = value;
	}
	
	public String getPath() {
		return this.path;
	}
	public void setStructure(String value) {
		this.structure = value;
	}
	
	public String getStructure() {
		return this.structure;
	}
	public void setPropertyType(String value) {
		this.propertyType = value;
	}
	
	public String getPropertyType() {
		return this.propertyType;
	}
	public void setTotalPrice(java.lang.Double value) {
		this.totalPrice = value;
	}
	
	public java.lang.Double getTotalPrice() {
		return this.totalPrice;
	}
	public void setAveragePrice(java.lang.Double value) {
		this.averagePrice = value;
	}
	
	public java.lang.Double getAveragePrice() {
		return this.averagePrice;
	}
	public void setFlatId(int value) {
		this.flatId = value;
	}
	
	public int getFlatId() {
		return this.flatId;
	}
	public void setSaleModeNumber(String value) {
		this.saleModeNumber = value;
	}
	
	public String getSaleModeNumber() {
		return this.saleModeNumber;
	}
	public void setRemark(String value) {
		this.remark = value;
	}
	
	public String getRemark() {
		return this.remark;
	}
	public void setOwnerName(String value) {
		this.ownerName = value;
	}
	
	public String getOwnerName() {
		return this.ownerName;
	}
	public void setOwnerSex(int value) {
		this.ownerSex = value;
	}
	
	public int getOwnerSex() {
		return this.ownerSex;
	}
	public void setOwnerPhone(String value) {
		this.ownerPhone = value;
	}
	
	public String getOwnerPhone() {
		return this.ownerPhone;
	}
	public void setPaymentWay(String value) {
		this.paymentWay = value;
	}
	
	public String getPaymentWay() {
		return this.paymentWay;
	}
	public void setType(int value) {
		this.type = value;
	}
	
	public int getType() {
		return this.type;
	}
	public void setIsPrivate(int value) {
		this.isPrivate = value;
	}
	
	public int getIsPrivate() {
		return this.isPrivate;
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

