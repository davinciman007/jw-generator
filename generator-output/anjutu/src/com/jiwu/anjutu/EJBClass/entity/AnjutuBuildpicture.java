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
 * description anjutubuildpicture Entity
 * 2014-8-19 10:17:57
 * @author jiwurapid
 */
@Entity
@Table(name = "anjutu_buildpicture", catalog = "anjutu_flat")



public class AnjutuBuildpicture{
	
	//columns START
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "bpid", unique = true, nullable = false)
	private int bpid;
	private int bid;
	private String fileName;
	private String path;
	private Date ctime;
	private String remark;
	private int status;
	private int isCover;
	private int vtimes;
	private int type;
	//columns END


	public void setBpid(int value) {
		this.bpid = value;
	}
	
	public int getBpid() {
		return this.bpid;
	}
	public void setBid(int value) {
		this.bid = value;
	}
	
	public int getBid() {
		return this.bid;
	}
	public void setFileName(String value) {
		this.fileName = value;
	}
	
	public String getFileName() {
		return this.fileName;
	}
	public void setPath(String value) {
		this.path = value;
	}
	
	public String getPath() {
		return this.path;
	}
	public void setCtime(Date value) {
		this.ctime = value;
	}
	
	public Date getCtime() {
		return this.ctime;
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
	public void setIsCover(int value) {
		this.isCover = value;
	}
	
	public int getIsCover() {
		return this.isCover;
	}
	public void setVtimes(int value) {
		this.vtimes = value;
	}
	
	public int getVtimes() {
		return this.vtimes;
	}
	public void setType(int value) {
		this.type = value;
	}
	
	public int getType() {
		return this.type;
	}


}

