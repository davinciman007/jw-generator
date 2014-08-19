package com.jiwu.anjutu.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.jiwu.anjutu.dao.IGenericDAO;
import com.jiwu.anjutu.service.IAnjutuAreaconfigManager;
import com.jiwu.anjutu.utils.StringUtil;

/**
 * description anjutuareaconfig EJB Impl
 * 2014-8-19 10:17:43
 * @author jiwurapid
 */
@Stateless(name = "anjutuareaconfigManager")
@Remote(IAnjutuAreaconfigManager.class)

public class AnjutuAreaconfigManagerImpl implements IAnjutuAreaconfigManager {
	@EJB(beanName = "anjutuareaconfigDAO")
	private IGenericDAO<AnjutuAreaconfig, Integer> anjutuareaconfigDAO;
	
	public AnjutuAreaconfig save(AnjutuAreaconfig entity) {
		LogUtil.log("saving Object instance", Level.INFO, null);
		try {
			return anjutuareaconfigDAO.create(entity);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	public void delete(AnjutuAreaconfig entity) {
		LogUtil.log("deleting Object instance", Level.INFO, null);
		try {
			anjutuareaconfigDAO.delete(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuAreaconfig update(AnjutuAreaconfig entity) {
		LogUtil.log("updating Object instance", Level.INFO, null);
		try {
			AnjutuAreaconfig result = anjutuareaconfigDAO.update(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuAreaconfig findById(int id) {
		LogUtil.log("finding Object instance with id: " + id, Level.INFO, null);
		try {
			AnjutuAreaconfig instance = anjutuareaconfigDAO.findById(id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<AnjutuAreaconfig> findAll() {
		LogUtil.log("finding all Object instances", Level.INFO, null);
		try {
			return null;
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	/**
	 * description anjutuareaconfig 列表分页查询
	 * 2014-8-19 10:17:43
	 * @author jiwurapid
	 */
	public List<AnjutuAreaconfig> getAnjutuAreaconfigList(HashMap<String, Object> params){
		String hql = "from AnjutuAreaconfig where 1=1 ";
		int index = 0;
		int size = 0;
		if(params.containsKey("index")){
			index = Integer.parseInt(params.get("index").toString());
		}
		if(params.containsKey("size")){
			size = Integer.parseInt(params.get("size").toString());
		}
		hql+= StringUtil.getIntMapValue("acid", params, "=");
		hql+= StringUtil.getIntMapValue("tag", params, "=");
		hql+= StringUtil.getIntMapValue("status", params, "=");
		hql+= StringUtil.getIntMapValue("areaName", params, "=");
		hql+= StringUtil.getIntMapValue("cityId", params, "=");
		hql+= StringUtil.getIntMapValue("orderNum", params, "=");
		hql+= StringUtil.getIntMapValue("parentId", params, "=");
		hql+= StringUtil.getIntMapValue("minValue", params, "=");
		hql+= StringUtil.getIntMapValue("maxValue", params, "=");
		hql+= StringUtil.getIntMapValue("districtCityId", params, "=");
		return anjutuareaconfigDAO.findPaged(hql, index, size);
	}
	
	/**
	 * description anjutuareaconfig 统计个数
	 * 2014-8-19 10:17:43
	 * @author jiwurapid
	 */
	public int countAnjutuAreaconfig(HashMap<String, Object> params){
		String sql = "select count(*) from AnjutuAreaconfig where 1=1 ";
		sql+= StringUtil.getIntMapValue("acid", params, "=");
		sql+= StringUtil.getIntMapValue("tag", params, "=");
		sql+= StringUtil.getIntMapValue("status", params, "=");
		sql+= StringUtil.getIntMapValue("areaName", params, "=");
		sql+= StringUtil.getIntMapValue("cityId", params, "=");
		sql+= StringUtil.getIntMapValue("orderNum", params, "=");
		sql+= StringUtil.getIntMapValue("parentId", params, "=");
		sql+= StringUtil.getIntMapValue("minValue", params, "=");
		sql+= StringUtil.getIntMapValue("maxValue", params, "=");
		sql+= StringUtil.getIntMapValue("districtCityId", params, "=");
		return anjutuareaconfigDAO.countRows(sql).intValue();
	}

}