package com.jiwu.anjutu.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.jiwu.anjutu.dao.IGenericDAO;
import com.jiwu.anjutu.service.IAnjutuSinglefinanceManager;
import com.jiwu.anjutu.utils.StringUtil;

/**
 * description anjutusinglefinance EJB Impl
 * 2014-8-19 10:19:14
 * @author jiwurapid
 */
@Stateless(name = "anjutusinglefinanceManager")
@Remote(IAnjutuSinglefinanceManager.class)

public class AnjutuSinglefinanceManagerImpl implements IAnjutuSinglefinanceManager {
	@EJB(beanName = "anjutusinglefinanceDAO")
	private IGenericDAO<AnjutuSinglefinance, Integer> anjutusinglefinanceDAO;
	
	public AnjutuSinglefinance save(AnjutuSinglefinance entity) {
		LogUtil.log("saving Object instance", Level.INFO, null);
		try {
			return anjutusinglefinanceDAO.create(entity);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	public void delete(AnjutuSinglefinance entity) {
		LogUtil.log("deleting Object instance", Level.INFO, null);
		try {
			anjutusinglefinanceDAO.delete(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuSinglefinance update(AnjutuSinglefinance entity) {
		LogUtil.log("updating Object instance", Level.INFO, null);
		try {
			AnjutuSinglefinance result = anjutusinglefinanceDAO.update(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuSinglefinance findById(int id) {
		LogUtil.log("finding Object instance with id: " + id, Level.INFO, null);
		try {
			AnjutuSinglefinance instance = anjutusinglefinanceDAO.findById(id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<AnjutuSinglefinance> findAll() {
		LogUtil.log("finding all Object instances", Level.INFO, null);
		try {
			return null;
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	/**
	 * description anjutusinglefinance 列表分页查询
	 * 2014-8-19 10:19:14
	 * @author jiwurapid
	 */
	public List<AnjutuSinglefinance> getAnjutuSinglefinanceList(HashMap<String, Object> params){
		String hql = "from AnjutuSinglefinance where 1=1 ";
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
		hql+= StringUtil.getIntMapValue("totalCommission", params, "=");
		hql+= StringUtil.getIntMapValue("singleCommission", params, "=");
		hql+= StringUtil.getIntMapValue("remark", params, "=");
		hql+= StringUtil.getIntMapValue("reason", params, "=");
		hql+= StringUtil.getIntMapValue("commissionId", params, "=");
		hql+= StringUtil.getIntMapValue("commissionName", params, "=");
		hql+= StringUtil.getIntMapValue("ctime", params, "=");
		hql+= StringUtil.getIntMapValue("utime", params, "=");
		hql+= StringUtil.getIntMapValue("status", params, "=");
		hql+= StringUtil.getIntMapValue("operateId", params, "=");
		hql+= StringUtil.getIntMapValue("operateName", params, "=");
		return anjutusinglefinanceDAO.findPaged(hql, index, size);
	}
	
	/**
	 * description anjutusinglefinance 统计个数
	 * 2014-8-19 10:19:14
	 * @author jiwurapid
	 */
	public int countAnjutuSinglefinance(HashMap<String, Object> params){
		String sql = "select count(*) from AnjutuSinglefinance where 1=1 ";
		sql+= StringUtil.getIntMapValue("id", params, "=");
		sql+= StringUtil.getIntMapValue("contractId", params, "=");
		sql+= StringUtil.getIntMapValue("contractNumber", params, "=");
		sql+= StringUtil.getIntMapValue("totalCommission", params, "=");
		sql+= StringUtil.getIntMapValue("singleCommission", params, "=");
		sql+= StringUtil.getIntMapValue("remark", params, "=");
		sql+= StringUtil.getIntMapValue("reason", params, "=");
		sql+= StringUtil.getIntMapValue("commissionId", params, "=");
		sql+= StringUtil.getIntMapValue("commissionName", params, "=");
		sql+= StringUtil.getIntMapValue("ctime", params, "=");
		sql+= StringUtil.getIntMapValue("utime", params, "=");
		sql+= StringUtil.getIntMapValue("status", params, "=");
		sql+= StringUtil.getIntMapValue("operateId", params, "=");
		sql+= StringUtil.getIntMapValue("operateName", params, "=");
		return anjutusinglefinanceDAO.countRows(sql).intValue();
	}

}