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
 * description anjutuareaconfig Entity
 * 2014-8-19 10:17:43
 * @author jiwurapid
 */
@Entity
@Table(name = "anjutu_areaconfig", catalog = "anjutu_flat")



public class AnjutuAreaconfig{
	
	//columns START
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "acid", unique = true, nullable = false)
	private int acid;
	private String tag;
	private int status;
	private String areaName;
	private int cityId;
	private int orderNum;
	private int parentId;
	private int minValue;
	private int maxValue;
	private int districtCityId;
	//columns END


	public void setAcid(int value) {
		this.acid = value;
	}
	
	public int getAcid() {
		return this.acid;
	}
	public void setTag(String value) {
		this.tag = value;
	}
	
	public String getTag() {
		return this.tag;
	}
	public void setStatus(int value) {
		this.status = value;
	}
	
	public int getStatus() {
		return this.status;
	}
	public void setAreaName(String value) {
		this.areaName = value;
	}
	
	public String getAreaName() {
		return this.areaName;
	}
	public void setCityId(int value) {
		this.cityId = value;
	}
	
	public int getCityId() {
		return this.cityId;
	}
	public void setOrderNum(int value) {
		this.orderNum = value;
	}
	
	public int getOrderNum() {
		return this.orderNum;
	}
	public void setParentId(int value) {
		this.parentId = value;
	}
	
	public int getParentId() {
		return this.parentId;
	}
	public void setMinValue(int value) {
		this.minValue = value;
	}
	
	public int getMinValue() {
		return this.minValue;
	}
	public void setMaxValue(int value) {
		this.maxValue = value;
	}
	
	public int getMaxValue() {
		return this.maxValue;
	}
	public void setDistrictCityId(int value) {
		this.districtCityId = value;
	}
	
	public int getDistrictCityId() {
		return this.districtCityId;
	}


}

