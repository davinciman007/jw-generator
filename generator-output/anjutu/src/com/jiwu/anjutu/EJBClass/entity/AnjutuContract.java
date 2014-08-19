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
 * description anjutucontract Entity
 * 2014-8-19 10:18:03
 * @author jiwurapid
 */
@Entity
@Table(name = "anjutu_contract", catalog = "anjutu_flat")



public class AnjutuContract{
	
	//columns START
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "contractId", unique = true, nullable = false)
	private int contractId;
	private String contractNumber;
	private int houseId;
	private String houseNumber;
	private int bid;
	private String bname;
	private String building;
	private String buildUnit;
	private String doorNumber;
	private String buildLevel;
	private int flat;
	private String saleModeNumber;
	private String ownerName;
	private String ownerPhone;
	private String ownerTelephone;
	private String ownerIdCardNumber;
	private String ownerAddress;
	private int cusId;
	private String cusNumber;
	private String cusName;
	private String cusMobile;
	private String cusTelePhone;
	private String cusIdCardNumber;
	private String cusAddress;
	private String signName;
	private Date signTime;
	private java.lang.Double turnoverPrice;
	private String turnoveWay;
	private String housePayment;
	private int flatId;
	private String flatName;
	private String cstatus;
	private int type;
	private Date ctime;
	private Date utime;
	private int operateId;
	private String operateName;
	//columns END


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
	public void setBuildLevel(String value) {
		this.buildLevel = value;
	}
	
	public String getBuildLevel() {
		return this.buildLevel;
	}
	public void setFlat(int value) {
		this.flat = value;
	}
	
	public int getFlat() {
		return this.flat;
	}
	public void setSaleModeNumber(String value) {
		this.saleModeNumber = value;
	}
	
	public String getSaleModeNumber() {
		return this.saleModeNumber;
	}
	public void setOwnerName(String value) {
		this.ownerName = value;
	}
	
	public String getOwnerName() {
		return this.ownerName;
	}
	public void setOwnerPhone(String value) {
		this.ownerPhone = value;
	}
	
	public String getOwnerPhone() {
		return this.ownerPhone;
	}
	public void setOwnerTelephone(String value) {
		this.ownerTelephone = value;
	}
	
	public String getOwnerTelephone() {
		return this.ownerTelephone;
	}
	public void setOwnerIdCardNumber(String value) {
		this.ownerIdCardNumber = value;
	}
	
	public String getOwnerIdCardNumber() {
		return this.ownerIdCardNumber;
	}
	public void setOwnerAddress(String value) {
		this.ownerAddress = value;
	}
	
	public String getOwnerAddress() {
		return this.ownerAddress;
	}
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
	public void setCusName(String value) {
		this.cusName = value;
	}
	
	public String getCusName() {
		return this.cusName;
	}
	public void setCusMobile(String value) {
		this.cusMobile = value;
	}
	
	public String getCusMobile() {
		return this.cusMobile;
	}
	public void setCusTelePhone(String value) {
		this.cusTelePhone = value;
	}
	
	public String getCusTelePhone() {
		return this.cusTelePhone;
	}
	public void setCusIdCardNumber(String value) {
		this.cusIdCardNumber = value;
	}
	
	public String getCusIdCardNumber() {
		return this.cusIdCardNumber;
	}
	public void setCusAddress(String value) {
		this.cusAddress = value;
	}
	
	public String getCusAddress() {
		return this.cusAddress;
	}
	public void setSignName(String value) {
		this.signName = value;
	}
	
	public String getSignName() {
		return this.signName;
	}
	public void setSignTime(Date value) {
		this.signTime = value;
	}
	
	public Date getSignTime() {
		return this.signTime;
	}
	public void setTurnoverPrice(java.lang.Double value) {
		this.turnoverPrice = value;
	}
	
	public java.lang.Double getTurnoverPrice() {
		return this.turnoverPrice;
	}
	public void setTurnoveWay(String value) {
		this.turnoveWay = value;
	}
	
	public String getTurnoveWay() {
		return this.turnoveWay;
	}
	public void setHousePayment(String value) {
		this.housePayment = value;
	}
	
	public String getHousePayment() {
		return this.housePayment;
	}
	public void setFlatId(int value) {
		this.flatId = value;
	}
	
	public int getFlatId() {
		return this.flatId;
	}
	public void setFlatName(String value) {
		this.flatName = value;
	}
	
	public String getFlatName() {
		return this.flatName;
	}
	public void setCstatus(String value) {
		this.cstatus = value;
	}
	
	public String getCstatus() {
		return this.cstatus;
	}
	public void setType(int value) {
		this.type = value;
	}
	
	public int getType() {
		return this.type;
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

