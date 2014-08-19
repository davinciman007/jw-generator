package com.jiwu.anjutu.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.jiwu.anjutu.dao.IGenericDAO;
import com.jiwu.anjutu.service.IAnjutuUserrightsManager;
import com.jiwu.anjutu.utils.StringUtil;

/**
 * description anjutuuserrights EJB Impl
 * 2014-8-19 10:19:21
 * @author jiwurapid
 */
@Stateless(name = "anjutuuserrightsManager")
@Remote(IAnjutuUserrightsManager.class)

public class AnjutuUserrightsManagerImpl implements IAnjutuUserrightsManager {
	@EJB(beanName = "anjutuuserrightsDAO")
	private IGenericDAO<AnjutuUserrights, Integer> anjutuuserrightsDAO;
	
	public AnjutuUserrights save(AnjutuUserrights entity) {
		LogUtil.log("saving Object instance", Level.INFO, null);
		try {
			return anjutuuserrightsDAO.create(entity);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	public void delete(AnjutuUserrights entity) {
		LogUtil.log("deleting Object instance", Level.INFO, null);
		try {
			anjutuuserrightsDAO.delete(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuUserrights update(AnjutuUserrights entity) {
		LogUtil.log("updating Object instance", Level.INFO, null);
		try {
			AnjutuUserrights result = anjutuuserrightsDAO.update(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuUserrights findById(int id) {
		LogUtil.log("finding Object instance with id: " + id, Level.INFO, null);
		try {
			AnjutuUserrights instance = anjutuuserrightsDAO.findById(id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<AnjutuUserrights> findAll() {
		LogUtil.log("finding all Object instances", Level.INFO, null);
		try {
			return null;
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	/**
	 * description anjutuuserrights 列表分页查询
	 * 2014-8-19 10:19:21
	 * @author jiwurapid
	 */
	public List<AnjutuUserrights> getAnjutuUserrightsList(HashMap<String, Object> params){
		String hql = "from AnjutuUserrights where 1=1 ";
		int index = 0;
		int size = 0;
		if(params.containsKey("index")){
			index = Integer.parseInt(params.get("index").toString());
		}
		if(params.containsKey("size")){
			size = Integer.parseInt(params.get("size").toString());
		}
		hql+= StringUtil.getIntMapValue("urid", params, "=");
		hql+= StringUtil.getIntMapValue("urname", params, "=");
		hql+= StringUtil.getIntMapValue("status", params, "=");
		hql+= StringUtil.getIntMapValue("actionName", params, "=");
		hql+= StringUtil.getIntMapValue("type", params, "=");
		hql+= StringUtil.getIntMapValue("parentId", params, "=");
		hql+= StringUtil.getIntMapValue("code", params, "=");
		hql+= StringUtil.getIntMapValue("orderNum", params, "=");
		hql+= StringUtil.getIntMapValue("sysType", params, "=");
		return anjutuuserrightsDAO.findPaged(hql, index, size);
	}
	
	/**
	 * description anjutuuserrights 统计个数
	 * 2014-8-19 10:19:21
	 * @author jiwurapid
	 */
	public int countAnjutuUserrights(HashMap<String, Object> params){
		String sql = "select count(*) from AnjutuUserrights where 1=1 ";
		sql+= StringUtil.getIntMapValue("urid", params, "=");
		sql+= StringUtil.getIntMapValue("urname", params, "=");
		sql+= StringUtil.getIntMapValue("status", params, "=");
		sql+= StringUtil.getIntMapValue("actionName", params, "=");
		sql+= StringUtil.getIntMapValue("type", params, "=");
		sql+= StringUtil.getIntMapValue("parentId", params, "=");
		sql+= StringUtil.getIntMapValue("code", params, "=");
		sql+= StringUtil.getIntMapValue("orderNum", params, "=");
		sql+= StringUtil.getIntMapValue("sysType", params, "=");
		return anjutuuserrightsDAO.countRows(sql).intValue();
	}

}