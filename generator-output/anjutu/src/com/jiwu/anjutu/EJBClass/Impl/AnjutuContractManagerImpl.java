package com.jiwu.anjutu.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.jiwu.anjutu.dao.IGenericDAO;
import com.jiwu.anjutu.service.IAnjutuContractManager;
import com.jiwu.anjutu.utils.StringUtil;

/**
 * description anjutucontract EJB Impl
 * 2014-8-19 10:18:03
 * @author jiwurapid
 */
@Stateless(name = "anjutucontractManager")
@Remote(IAnjutuContractManager.class)

public class AnjutuContractManagerImpl implements IAnjutuContractManager {
	@EJB(beanName = "anjutucontractDAO")
	private IGenericDAO<AnjutuContract, Integer> anjutucontractDAO;
	
	public AnjutuContract save(AnjutuContract entity) {
		LogUtil.log("saving Object instance", Level.INFO, null);
		try {
			return anjutucontractDAO.create(entity);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	public void delete(AnjutuContract entity) {
		LogUtil.log("deleting Object instance", Level.INFO, null);
		try {
			anjutucontractDAO.delete(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuContract update(AnjutuContract entity) {
		LogUtil.log("updating Object instance", Level.INFO, null);
		try {
			AnjutuContract result = anjutucontractDAO.update(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuContract findById(int id) {
		LogUtil.log("finding Object instance with id: " + id, Level.INFO, null);
		try {
			AnjutuContract instance = anjutucontractDAO.findById(id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<AnjutuContract> findAll() {
		LogUtil.log("finding all Object instances", Level.INFO, null);
		try {
			return null;
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	/**
	 * description anjutucontract 列表分页查询
	 * 2014-8-19 10:18:03
	 * @author jiwurapid
	 */
	public List<AnjutuContract> getAnjutuContractList(HashMap<String, Object> params){
		String hql = "from AnjutuContract where 1=1 ";
		int index = 0;
		int size = 0;
		if(params.containsKey("index")){
			index = Integer.parseInt(params.get("index").toString());
		}
		if(params.containsKey("size")){
			size = Integer.parseInt(params.get("size").toString());
		}
		hql+= StringUtil.getIntMapValue("contractId", params, "=");
		hql+= StringUtil.getIntMapValue("contractNumber", params, "=");
		hql+= StringUtil.getIntMapValue("houseId", params, "=");
		hql+= StringUtil.getIntMapValue("houseNumber", params, "=");
		hql+= StringUtil.getIntMapValue("bid", params, "=");
		hql+= StringUtil.getIntMapValue("bname", params, "=");
		hql+= StringUtil.getIntMapValue("building", params, "=");
		hql+= StringUtil.getIntMapValue("buildUnit", params, "=");
		hql+= StringUtil.getIntMapValue("doorNumber", params, "=");
		hql+= StringUtil.getIntMapValue("buildLevel", params, "=");
		hql+= StringUtil.getIntMapValue("flat", params, "=");
		hql+= StringUtil.getIntMapValue("saleModeNumber", params, "=");
		hql+= StringUtil.getIntMapValue("ownerName", params, "=");
		hql+= StringUtil.getIntMapValue("ownerPhone", params, "=");
		hql+= StringUtil.getIntMapValue("ownerTelephone", params, "=");
		hql+= StringUtil.getIntMapValue("ownerIdCardNumber", params, "=");
		hql+= StringUtil.getIntMapValue("ownerAddress", params, "=");
		hql+= StringUtil.getIntMapValue("cusId", params, "=");
		hql+= StringUtil.getIntMapValue("cusNumber", params, "=");
		hql+= StringUtil.getIntMapValue("cusName", params, "=");
		hql+= StringUtil.getIntMapValue("cusMobile", params, "=");
		hql+= StringUtil.getIntMapValue("cusTelePhone", params, "=");
		hql+= StringUtil.getIntMapValue("cusIdCardNumber", params, "=");
		hql+= StringUtil.getIntMapValue("cusAddress", params, "=");
		hql+= StringUtil.getIntMapValue("signName", params, "=");
		hql+= StringUtil.getIntMapValue("signTime", params, "=");
		hql+= StringUtil.getIntMapValue("turnoverPrice", params, "=");
		hql+= StringUtil.getIntMapValue("turnoveWay", params, "=");
		hql+= StringUtil.getIntMapValue("housePayment", params, "=");
		hql+= StringUtil.getIntMapValue("flatId", params, "=");
		hql+= StringUtil.getIntMapValue("flatName", params, "=");
		hql+= StringUtil.getIntMapValue("cstatus", params, "=");
		hql+= StringUtil.getIntMapValue("type", params, "=");
		hql+= StringUtil.getIntMapValue("ctime", params, "=");
		hql+= StringUtil.getIntMapValue("utime", params, "=");
		hql+= StringUtil.getIntMapValue("operateId", params, "=");
		hql+= StringUtil.getIntMapValue("operateName", params, "=");
		return anjutucontractDAO.findPaged(hql, index, size);
	}
	
	/**
	 * description anjutucontract 统计个数
	 * 2014-8-19 10:18:03
	 * @author jiwurapid
	 */
	public int countAnjutuContract(HashMap<String, Object> params){
		String sql = "select count(*) from AnjutuContract where 1=1 ";
		sql+= StringUtil.getIntMapValue("contractId", params, "=");
		sql+= StringUtil.getIntMapValue("contractNumber", params, "=");
		sql+= StringUtil.getIntMapValue("houseId", params, "=");
		sql+= StringUtil.getIntMapValue("houseNumber", params, "=");
		sql+= StringUtil.getIntMapValue("bid", params, "=");
		sql+= StringUtil.getIntMapValue("bname", params, "=");
		sql+= StringUtil.getIntMapValue("building", params, "=");
		sql+= StringUtil.getIntMapValue("buildUnit", params, "=");
		sql+= StringUtil.getIntMapValue("doorNumber", params, "=");
		sql+= StringUtil.getIntMapValue("buildLevel", params, "=");
		sql+= StringUtil.getIntMapValue("flat", params, "=");
		sql+= StringUtil.getIntMapValue("saleModeNumber", params, "=");
		sql+= StringUtil.getIntMapValue("ownerName", params, "=");
		sql+= StringUtil.getIntMapValue("ownerPhone", params, "=");
		sql+= StringUtil.getIntMapValue("ownerTelephone", params, "=");
		sql+= StringUtil.getIntMapValue("ownerIdCardNumber", params, "=");
		sql+= StringUtil.getIntMapValue("ownerAddress", params, "=");
		sql+= StringUtil.getIntMapValue("cusId", params, "=");
		sql+= StringUtil.getIntMapValue("cusNumber", params, "=");
		sql+= StringUtil.getIntMapValue("cusName", params, "=");
		sql+= StringUtil.getIntMapValue("cusMobile", params, "=");
		sql+= StringUtil.getIntMapValue("cusTelePhone", params, "=");
		sql+= StringUtil.getIntMapValue("cusIdCardNumber", params, "=");
		sql+= StringUtil.getIntMapValue("cusAddress", params, "=");
		sql+= StringUtil.getIntMapValue("signName", params, "=");
		sql+= StringUtil.getIntMapValue("signTime", params, "=");
		sql+= StringUtil.getIntMapValue("turnoverPrice", params, "=");
		sql+= StringUtil.getIntMapValue("turnoveWay", params, "=");
		sql+= StringUtil.getIntMapValue("housePayment", params, "=");
		sql+= StringUtil.getIntMapValue("flatId", params, "=");
		sql+= StringUtil.getIntMapValue("flatName", params, "=");
		sql+= StringUtil.getIntMapValue("cstatus", params, "=");
		sql+= StringUtil.getIntMapValue("type", params, "=");
		sql+= StringUtil.getIntMapValue("ctime", params, "=");
		sql+= StringUtil.getIntMapValue("utime", params, "=");
		sql+= StringUtil.getIntMapValue("operateId", params, "=");
		sql+= StringUtil.getIntMapValue("operateName", params, "=");
		return anjutucontractDAO.countRows(sql).intValue();
	}

}