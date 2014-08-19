package com.jiwu.anjutu.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.jiwu.anjutu.dao.IGenericDAO;
import com.jiwu.anjutu.service.IAnjutuContractlogManager;
import com.jiwu.anjutu.utils.StringUtil;

/**
 * description anjutucontractlog EJB Impl
 * 2014-8-19 10:18:10
 * @author jiwurapid
 */
@Stateless(name = "anjutucontractlogManager")
@Remote(IAnjutuContractlogManager.class)

public class AnjutuContractlogManagerImpl implements IAnjutuContractlogManager {
	@EJB(beanName = "anjutucontractlogDAO")
	private IGenericDAO<AnjutuContractlog, Integer> anjutucontractlogDAO;
	
	public AnjutuContractlog save(AnjutuContractlog entity) {
		LogUtil.log("saving Object instance", Level.INFO, null);
		try {
			return anjutucontractlogDAO.create(entity);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	public void delete(AnjutuContractlog entity) {
		LogUtil.log("deleting Object instance", Level.INFO, null);
		try {
			anjutucontractlogDAO.delete(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuContractlog update(AnjutuContractlog entity) {
		LogUtil.log("updating Object instance", Level.INFO, null);
		try {
			AnjutuContractlog result = anjutucontractlogDAO.update(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuContractlog findById(int id) {
		LogUtil.log("finding Object instance with id: " + id, Level.INFO, null);
		try {
			AnjutuContractlog instance = anjutucontractlogDAO.findById(id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<AnjutuContractlog> findAll() {
		LogUtil.log("finding all Object instances", Level.INFO, null);
		try {
			return null;
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	/**
	 * description anjutucontractlog 列表分页查询
	 * 2014-8-19 10:18:10
	 * @author jiwurapid
	 */
	public List<AnjutuContractlog> getAnjutuContractlogList(HashMap<String, Object> params){
		String hql = "from AnjutuContractlog where 1=1 ";
		int index = 0;
		int size = 0;
		if(params.containsKey("index")){
			index = Integer.parseInt(params.get("index").toString());
		}
		if(params.containsKey("size")){
			size = Integer.parseInt(params.get("size").toString());
		}
		hql+= StringUtil.getIntMapValue("id", params, "=");
		hql+= StringUtil.getIntMapValue("contractId", params, "=");
		hql+= StringUtil.getIntMapValue("contractNumber", params, "=");
		hql+= StringUtil.getIntMapValue("statusBefore", params, "=");
		hql+= StringUtil.getIntMapValue("statusAfter", params, "=");
		hql+= StringUtil.getIntMapValue("ctime", params, "=");
		hql+= StringUtil.getIntMapValue("remark", params, "=");
		hql+= StringUtil.getIntMapValue("operateId", params, "=");
		hql+= StringUtil.getIntMapValue("operateName", params, "=");
		return anjutucontractlogDAO.findPaged(hql, index, size);
	}
	
	/**
	 * description anjutucontractlog 统计个数
	 * 2014-8-19 10:18:10
	 * @author jiwurapid
	 */
	public int countAnjutuContractlog(HashMap<String, Object> params){
		String sql = "select count(*) from AnjutuContractlog where 1=1 ";
		sql+= StringUtil.getIntMapValue("id", params, "=");
		sql+= StringUtil.getIntMapValue("contractId", params, "=");
		sql+= StringUtil.getIntMapValue("contractNumber", params, "=");
		sql+= StringUtil.getIntMapValue("statusBefore", params, "=");
		sql+= StringUtil.getIntMapValue("statusAfter", params, "=");
		sql+= StringUtil.getIntMapValue("ctime", params, "=");
		sql+= StringUtil.getIntMapValue("remark", params, "=");
		sql+= StringUtil.getIntMapValue("operateId", params, "=");
		sql+= StringUtil.getIntMapValue("operateName", params, "=");
		return anjutucontractlogDAO.countRows(sql).intValue();
	}

}