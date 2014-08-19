package com.jiwu.anjutu.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.jiwu.anjutu.dao.IGenericDAO;
import com.jiwu.anjutu.service.IAnjutuFlatconfigManager;
import com.jiwu.anjutu.utils.StringUtil;

/**
 * description anjutuflatconfig EJB Impl
 * 2014-8-19 10:19:08
 * @author jiwurapid
 */
@Stateless(name = "anjutuflatconfigManager")
@Remote(IAnjutuFlatconfigManager.class)

public class AnjutuFlatconfigManagerImpl implements IAnjutuFlatconfigManager {
	@EJB(beanName = "anjutuflatconfigDAO")
	private IGenericDAO<AnjutuFlatconfig, Integer> anjutuflatconfigDAO;
	
	public AnjutuFlatconfig save(AnjutuFlatconfig entity) {
		LogUtil.log("saving Object instance", Level.INFO, null);
		try {
			return anjutuflatconfigDAO.create(entity);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	public void delete(AnjutuFlatconfig entity) {
		LogUtil.log("deleting Object instance", Level.INFO, null);
		try {
			anjutuflatconfigDAO.delete(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuFlatconfig update(AnjutuFlatconfig entity) {
		LogUtil.log("updating Object instance", Level.INFO, null);
		try {
			AnjutuFlatconfig result = anjutuflatconfigDAO.update(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuFlatconfig findById(int id) {
		LogUtil.log("finding Object instance with id: " + id, Level.INFO, null);
		try {
			AnjutuFlatconfig instance = anjutuflatconfigDAO.findById(id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<AnjutuFlatconfig> findAll() {
		LogUtil.log("finding all Object instances", Level.INFO, null);
		try {
			return null;
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	/**
	 * description anjutuflatconfig 列表分页查询
	 * 2014-8-19 10:19:08
	 * @author jiwurapid
	 */
	public List<AnjutuFlatconfig> getAnjutuFlatconfigList(HashMap<String, Object> params){
		String hql = "from AnjutuFlatconfig where 1=1 ";
		int index = 0;
		int size = 0;
		if(params.containsKey("index")){
			index = Integer.parseInt(params.get("index").toString());
		}
		if(params.containsKey("size")){
			size = Integer.parseInt(params.get("size").toString());
		}
		hql+= StringUtil.getIntMapValue("flatId", params, "=");
		hql+= StringUtil.getIntMapValue("cityId", params, "=");
		hql+= StringUtil.getIntMapValue("name", params, "=");
		hql+= StringUtil.getIntMapValue("businessType", params, "=");
		hql+= StringUtil.getIntMapValue("typeName", params, "=");
		hql+= StringUtil.getIntMapValue("column1", params, "=");
		hql+= StringUtil.getIntMapValue("column2", params, "=");
		hql+= StringUtil.getIntMapValue("column3", params, "=");
		hql+= StringUtil.getIntMapValue("column4", params, "=");
		hql+= StringUtil.getIntMapValue("column5", params, "=");
		hql+= StringUtil.getIntMapValue("remark", params, "=");
		hql+= StringUtil.getIntMapValue("status", params, "=");
		hql+= StringUtil.getIntMapValue("ctime", params, "=");
		hql+= StringUtil.getIntMapValue("utime", params, "=");
		hql+= StringUtil.getIntMapValue("operateId", params, "=");
		hql+= StringUtil.getIntMapValue("operateName", params, "=");
		hql+= StringUtil.getIntMapValue("type", params, "=");
		return anjutuflatconfigDAO.findPaged(hql, index, size);
	}
	
	/**
	 * description anjutuflatconfig 统计个数
	 * 2014-8-19 10:19:08
	 * @author jiwurapid
	 */
	public int countAnjutuFlatconfig(HashMap<String, Object> params){
		String sql = "select count(*) from AnjutuFlatconfig where 1=1 ";
		sql+= StringUtil.getIntMapValue("flatId", params, "=");
		sql+= StringUtil.getIntMapValue("cityId", params, "=");
		sql+= StringUtil.getIntMapValue("name", params, "=");
		sql+= StringUtil.getIntMapValue("businessType", params, "=");
		sql+= StringUtil.getIntMapValue("typeName", params, "=");
		sql+= StringUtil.getIntMapValue("column1", params, "=");
		sql+= StringUtil.getIntMapValue("column2", params, "=");
		sql+= StringUtil.getIntMapValue("column3", params, "=");
		sql+= StringUtil.getIntMapValue("column4", params, "=");
		sql+= StringUtil.getIntMapValue("column5", params, "=");
		sql+= StringUtil.getIntMapValue("remark", params, "=");
		sql+= StringUtil.getIntMapValue("status", params, "=");
		sql+= StringUtil.getIntMapValue("ctime", params, "=");
		sql+= StringUtil.getIntMapValue("utime", params, "=");
		sql+= StringUtil.getIntMapValue("operateId", params, "=");
		sql+= StringUtil.getIntMapValue("operateName", params, "=");
		sql+= StringUtil.getIntMapValue("type", params, "=");
		return anjutuflatconfigDAO.countRows(sql).intValue();
	}

}