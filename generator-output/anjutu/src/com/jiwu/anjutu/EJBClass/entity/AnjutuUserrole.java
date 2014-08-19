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
 * description anjutuuserrole Entity
 * 2014-8-19 10:19:27
 * @author jiwurapid
 */
@Entity
@Table(name = "anjutu_userrole", catalog = "anjutu_flat")



public class AnjutuUserrole{
	
	//columns START
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "roleId", unique = true, nullable = false)
	private int roleId;
	private String roleName;
	private int status;
	private int type;
	private String ucode;
	//columns END


	public void setRoleId(int value) {
		this.roleId = value;
	}
	
	public int getRoleId() {
		return this.roleId;
	}
	public void setRoleName(String value) {
		this.roleName = value;
	}
	
	public String getRoleName() {
		return this.roleName;
	}
	public void setStatus(int value) {
		this.status = value;
	}
	
	public int getStatus() {
		return this.status;
	}
	public void setType(int value) {
		this.type = value;
	}
	
	public int getType() {
		return this.type;
	}
	public void setUcode(String value) {
		this.ucode = value;
	}
	
	public String getUcode() {
		return this.ucode;
	}


}

