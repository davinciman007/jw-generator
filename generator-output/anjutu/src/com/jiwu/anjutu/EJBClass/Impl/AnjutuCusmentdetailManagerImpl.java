package com.jiwu.anjutu.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.jiwu.anjutu.dao.IGenericDAO;
import com.jiwu.anjutu.service.IAnjutuCusmentdetailManager;
import com.jiwu.anjutu.utils.StringUtil;

/**
 * description anjutucusmentdetail EJB Impl
 * 2014-8-19 10:18:24
 * @author jiwurapid
 */
@Stateless(name = "anjutucusmentdetailManager")
@Remote(IAnjutuCusmentdetailManager.class)

public class AnjutuCusmentdetailManagerImpl implements IAnjutuCusmentdetailManager {
	@EJB(beanName = "anjutucusmentdetailDAO")
	private IGenericDAO<AnjutuCusmentdetail, Integer> anjutucusmentdetailDAO;
	
	public AnjutuCusmentdetail save(AnjutuCusmentdetail entity) {
		LogUtil.log("saving Object instance", Level.INFO, null);
		try {
			return anjutucusmentdetailDAO.create(entity);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	public void delete(AnjutuCusmentdetail entity) {
		LogUtil.log("deleting Object instance", Level.INFO, null);
		try {
			anjutucusmentdetailDAO.delete(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuCusmentdetail update(AnjutuCusmentdetail entity) {
		LogUtil.log("updating Object instance", Level.INFO, null);
		try {
			AnjutuCusmentdetail result = anjutucusmentdetailDAO.update(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuCusmentdetail findById(int id) {
		LogUtil.log("finding Object instance with id: " + id, Level.INFO, null);
		try {
			AnjutuCusmentdetail instance = anjutucusmentdetailDAO.findById(id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<AnjutuCusmentdetail> findAll() {
		LogUtil.log("finding all Object instances", Level.INFO, null);
		try {
			return null;
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	/**
	 * description anjutucusmentdetail 列表分页查询
	 * 2014-8-19 10:18:24
	 * @author jiwurapid
	 */
	public List<AnjutuCusmentdetail> getAnjutuCusmentdetailList(HashMap<String, Object> params){
		String hql = "from AnjutuCusmentdetail where 1=1 ";
		int index = 0;
		int size = 0;
		if(params.containsKey("index")){
			index = Integer.parseInt(params.get("index").toString());
		}
		if(params.containsKey("size")){
			size = Integer.parseInt(params.get("size").toString());
		}
		hql+= StringUtil.getIntMapValue("cid", params, "=");
		hql+= StringUtil.getIntMapValue("cusNumber", params, "=");
		hql+= StringUtil.getIntMapValue("mobile", params, "=");
		hql+= StringUtil.getIntMapValue("name", params, "=");
		return anjutucusmentdetailDAO.findPaged(hql, index, size);
	}
	
	/**
	 * description anjutucusmentdetail 统计个数
	 * 2014-8-19 10:18:24
	 * @author jiwurapid
	 */
	public int countAnjutuCusmentdetail(HashMap<String, Object> params){
		String sql = "select count(*) from AnjutuCusmentdetail where 1=1 ";
		sql+= StringUtil.getIntMapValue("cid", params, "=");
		sql+= StringUtil.getIntMapValue("cusNumber", params, "=");
		sql+= StringUtil.getIntMapValue("mobile", params, "=");
		sql+= StringUtil.getIntMapValue("name", params, "=");
		return anjutucusmentdetailDAO.countRows(sql).intValue();
	}

}