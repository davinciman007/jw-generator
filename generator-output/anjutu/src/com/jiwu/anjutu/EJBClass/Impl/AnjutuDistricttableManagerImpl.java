package com.jiwu.anjutu.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.jiwu.anjutu.dao.IGenericDAO;
import com.jiwu.anjutu.service.IAnjutuDistricttableManager;
import com.jiwu.anjutu.utils.StringUtil;

/**
 * description anjutudistricttable EJB Impl
 * 2014-8-19 10:18:38
 * @author jiwurapid
 */
@Stateless(name = "anjutudistricttableManager")
@Remote(IAnjutuDistricttableManager.class)

public class AnjutuDistricttableManagerImpl implements IAnjutuDistricttableManager {
	@EJB(beanName = "anjutudistricttableDAO")
	private IGenericDAO<AnjutuDistricttable, Integer> anjutudistricttableDAO;
	
	public AnjutuDistricttable save(AnjutuDistricttable entity) {
		LogUtil.log("saving Object instance", Level.INFO, null);
		try {
			return anjutudistricttableDAO.create(entity);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	public void delete(AnjutuDistricttable entity) {
		LogUtil.log("deleting Object instance", Level.INFO, null);
		try {
			anjutudistricttableDAO.delete(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuDistricttable update(AnjutuDistricttable entity) {
		LogUtil.log("updating Object instance", Level.INFO, null);
		try {
			AnjutuDistricttable result = anjutudistricttableDAO.update(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuDistricttable findById(int id) {
		LogUtil.log("finding Object instance with id: " + id, Level.INFO, null);
		try {
			AnjutuDistricttable instance = anjutudistricttableDAO.findById(id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<AnjutuDistricttable> findAll() {
		LogUtil.log("finding all Object instances", Level.INFO, null);
		try {
			return null;
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	/**
	 * description anjutudistricttable 列表分页查询
	 * 2014-8-19 10:18:38
	 * @author jiwurapid
	 */
	public List<AnjutuDistricttable> getAnjutuDistricttableList(HashMap<String, Object> params){
		String hql = "from AnjutuDistricttable where 1=1 ";
		int index = 0;
		int size = 0;
		if(params.containsKey("index")){
			index = Integer.parseInt(params.get("index").toString());
		}
		if(params.containsKey("size")){
			size = Integer.parseInt(params.get("size").toString());
		}
		hql+= StringUtil.getIntMapValue("dtid", params, "=");
		hql+= StringUtil.getIntMapValue("name", params, "=");
		hql+= StringUtil.getIntMapValue("remark", params, "=");
		hql+= StringUtil.getIntMapValue("parentId", params, "=");
		hql+= StringUtil.getIntMapValue("status", params, "=");
		hql+= StringUtil.getIntMapValue("orderNum", params, "=");
		hql+= StringUtil.getIntMapValue("minValue", params, "=");
		hql+= StringUtil.getIntMapValue("maxValue", params, "=");
		hql+= StringUtil.getIntMapValue("size", params, "=");
		hql+= StringUtil.getIntMapValue("manpower", params, "=");
		hql+= StringUtil.getIntMapValue("code", params, "=");
		hql+= StringUtil.getIntMapValue("centerPhone", params, "=");
		hql+= StringUtil.getIntMapValue("startNumber", params, "=");
		hql+= StringUtil.getIntMapValue("endNumber", params, "=");
		hql+= StringUtil.getIntMapValue("jwParentId", params, "=");
		return anjutudistricttableDAO.findPaged(hql, index, size);
	}
	
	/**
	 * description anjutudistricttable 统计个数
	 * 2014-8-19 10:18:38
	 * @author jiwurapid
	 */
	public int countAnjutuDistricttable(HashMap<String, Object> params){
		String sql = "select count(*) from AnjutuDistricttable where 1=1 ";
		sql+= StringUtil.getIntMapValue("dtid", params, "=");
		sql+= StringUtil.getIntMapValue("name", params, "=");
		sql+= StringUtil.getIntMapValue("remark", params, "=");
		sql+= StringUtil.getIntMapValue("parentId", params, "=");
		sql+= StringUtil.getIntMapValue("status", params, "=");
		sql+= StringUtil.getIntMapValue("orderNum", params, "=");
		sql+= StringUtil.getIntMapValue("minValue", params, "=");
		sql+= StringUtil.getIntMapValue("maxValue", params, "=");
		sql+= StringUtil.getIntMapValue("size", params, "=");
		sql+= StringUtil.getIntMapValue("manpower", params, "=");
		sql+= StringUtil.getIntMapValue("code", params, "=");
		sql+= StringUtil.getIntMapValue("centerPhone", params, "=");
		sql+= StringUtil.getIntMapValue("startNumber", params, "=");
		sql+= StringUtil.getIntMapValue("endNumber", params, "=");
		sql+= StringUtil.getIntMapValue("jwParentId", params, "=");
		return anjutudistricttableDAO.countRows(sql).intValue();
	}

}