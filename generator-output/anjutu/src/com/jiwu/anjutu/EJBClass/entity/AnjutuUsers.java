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
 * description anjutuusers Entity
 * 2014-8-19 10:19:34
 * @author jiwurapid
 */
@Entity
@Table(name = "anjutu_users", catalog = "anjutu_flat")



public class AnjutuUsers{
	
	//columns START
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "uid", unique = true, nullable = false)
	private int uid;
	private String jobNumber;
	private String username;
	private String password;
	private int cityId;
	private String cityName;
	private int districtId;
	private String districtName;
	private String streetId;
	private String streetName;
	private String trueName;
	private String companyName;
	private String mobile;
	private int sex;
	private String personPath;
	private String idCardNumber;
	private String type;
	private int level;
	private int parentId;
	private String workAge;
	private String appKey;
	private String roleId;
	private int status;
	private Date ctime;
	private Date utime;
	private Date loginTime;
	//columns END


	public void setUid(int value) {
		this.uid = value;
	}
	
	public int getUid() {
		return this.uid;
	}
	public void setJobNumber(String value) {
		this.jobNumber = value;
	}
	
	public String getJobNumber() {
		return this.jobNumber;
	}
	public void setUsername(String value) {
		this.username = value;
	}
	
	public String getUsername() {
		return this.username;
	}
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return this.password;
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
	public void setStreetId(String value) {
		this.streetId = value;
	}
	
	public String getStreetId() {
		return this.streetId;
	}
	public void setStreetName(String value) {
		this.streetName = value;
	}
	
	public String getStreetName() {
		return this.streetName;
	}
	public void setTrueName(String value) {
		this.trueName = value;
	}
	
	public String getTrueName() {
		return this.trueName;
	}
	public void setCompanyName(String value) {
		this.companyName = value;
	}
	
	public String getCompanyName() {
		return this.companyName;
	}
	public void setMobile(String value) {
		this.mobile = value;
	}
	
	public String getMobile() {
		return this.mobile;
	}
	public void setSex(int value) {
		this.sex = value;
	}
	
	public int getSex() {
		return this.sex;
	}
	public void setPersonPath(String value) {
		this.personPath = value;
	}
	
	public String getPersonPath() {
		return this.personPath;
	}
	public void setIdCardNumber(String value) {
		this.idCardNumber = value;
	}
	
	public String getIdCardNumber() {
		return this.idCardNumber;
	}
	public void setType(String value) {
		this.type = value;
	}
	
	public String getType() {
		return this.type;
	}
	public void setLevel(int value) {
		this.level = value;
	}
	
	public int getLevel() {
		return this.level;
	}
	public void setParentId(int value) {
		this.parentId = value;
	}
	
	public int getParentId() {
		return this.parentId;
	}
	public void setWorkAge(String value) {
		this.workAge = value;
	}
	
	public String getWorkAge() {
		return this.workAge;
	}
	public void setAppKey(String value) {
		this.appKey = value;
	}
	
	public String getAppKey() {
		return this.appKey;
	}
	public void setRoleId(String value) {
		this.roleId = value;
	}
	
	public String getRoleId() {
		return this.roleId;
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
	public void setLoginTime(Date value) {
		this.loginTime = value;
	}
	
	public Date getLoginTime() {
		return this.loginTime;
	}


}

