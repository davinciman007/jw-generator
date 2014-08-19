package com.jiwu.anjutu.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.jiwu.anjutu.dao.IGenericDAO;
import com.jiwu.anjutu.service.IAnjutuFinanceManager;
import com.jiwu.anjutu.utils.StringUtil;

/**
 * description anjutufinance EJB Impl
 * 2014-8-19 10:18:56
 * @author jiwurapid
 */
@Stateless(name = "anjutufinanceManager")
@Remote(IAnjutuFinanceManager.class)

public class AnjutuFinanceManagerImpl implements IAnjutuFinanceManager {
	@EJB(beanName = "anjutufinanceDAO")
	private IGenericDAO<AnjutuFinance, Integer> anjutufinanceDAO;
	
	public AnjutuFinance save(AnjutuFinance entity) {
		LogUtil.log("saving Object instance", Level.INFO, null);
		try {
			return anjutufinanceDAO.create(entity);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	public void delete(AnjutuFinance entity) {
		LogUtil.log("deleting Object instance", Level.INFO, null);
		try {
			anjutufinanceDAO.delete(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuFinance update(AnjutuFinance entity) {
		LogUtil.log("updating Object instance", Level.INFO, null);
		try {
			AnjutuFinance result = anjutufinanceDAO.update(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuFinance findById(int id) {
		LogUtil.log("finding Object instance with id: " + id, Level.INFO, null);
		try {
			AnjutuFinance instance = anjutufinanceDAO.findById(id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<AnjutuFinance> findAll() {
		LogUtil.log("finding all Object instances", Level.INFO, null);
		try {
			return null;
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	/**
	 * description anjutufinance 列表分页查询
	 * 2014-8-19 10:18:56
	 * @author jiwurapid
	 */
	public List<AnjutuFinance> getAnjutuFinanceList(HashMap<String, Object> params){
		String hql = "from AnjutuFinance where 1=1 ";
		int index = 0;
		int size = 0;
		if(params.containsKey("index")){
			index = Integer.parseInt(params.get("index").toString());
		}
		if(params.containsKey("size")){
			size = Integer.parseInt(params.get("size").toString());
		}
		hql+= StringUtil.getIntMapValue("id", params, "=");
		hql+= StringUtil.getIntMapValue("contractNumber", params, "=");
		hql+= StringUtil.getIntMapValue("contractId", params, "=");
		hql+= StringUtil.getIntMapValue("flatId", params, "=");
		hql+= StringUtil.getIntMapValue("paymentType", params, "=");
		hql+= StringUtil.getIntMapValue("paymentName", params, "=");
		hql+= StringUtil.getIntMapValue("paymentMobile", params, "=");
		hql+= StringUtil.getIntMapValue("paymentTime", params, "=");
		hql+= StringUtil.getIntMapValue("paymentMoney", params, "=");
		hql+= StringUtil.getIntMapValue("remark", params, "=");
		hql+= StringUtil.getIntMapValue("ctime", params, "=");
		hql+= StringUtil.getIntMapValue("utime", params, "=");
		hql+= StringUtil.getIntMapValue("operateId", params, "=");
		hql+= StringUtil.getIntMapValue("operateName", params, "=");
		return anjutufinanceDAO.findPaged(hql, index, size);
	}
	
	/**
	 * description anjutufinance 统计个数
	 * 2014-8-19 10:18:56
	 * @author jiwurapid
	 */
	public int countAnjutuFinance(HashMap<String, Object> params){
		String sql = "select count(*) from AnjutuFinance where 1=1 ";
		sql+= StringUtil.getIntMapValue("id", params, "=");
		sql+= StringUtil.getIntMapValue("contractNumber", params, "=");
		sql+= StringUtil.getIntMapValue("contractId", params, "=");
		sql+= StringUtil.getIntMapValue("flatId", params, "=");
		sql+= StringUtil.getIntMapValue("paymentType", params, "=");
		sql+= StringUtil.getIntMapValue("paymentName", params, "=");
		sql+= StringUtil.getIntMapValue("paymentMobile", params, "=");
		sql+= StringUtil.getIntMapValue("paymentTime", params, "=");
		sql+= StringUtil.getIntMapValue("paymentMoney", params, "=");
		sql+= StringUtil.getIntMapValue("remark", params, "=");
		sql+= StringUtil.getIntMapValue("ctime", params, "=");
		sql+= StringUtil.getIntMapValue("utime", params, "=");
		sql+= StringUtil.getIntMapValue("operateId", params, "=");
		sql+= StringUtil.getIntMapValue("operateName", params, "=");
		return anjutufinanceDAO.countRows(sql).intValue();
	}

}