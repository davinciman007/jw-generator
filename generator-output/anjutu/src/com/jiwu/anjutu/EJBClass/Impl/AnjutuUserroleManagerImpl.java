package com.jiwu.anjutu.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.jiwu.anjutu.dao.IGenericDAO;
import com.jiwu.anjutu.service.IAnjutuUserroleManager;
import com.jiwu.anjutu.utils.StringUtil;

/**
 * description anjutuuserrole EJB Impl
 * 2014-8-19 10:19:27
 * @author jiwurapid
 */
@Stateless(name = "anjutuuserroleManager")
@Remote(IAnjutuUserroleManager.class)

public class AnjutuUserroleManagerImpl implements IAnjutuUserroleManager {
	@EJB(beanName = "anjutuuserroleDAO")
	private IGenericDAO<AnjutuUserrole, Integer> anjutuuserroleDAO;
	
	public AnjutuUserrole save(AnjutuUserrole entity) {
		LogUtil.log("saving Object instance", Level.INFO, null);
		try {
			return anjutuuserroleDAO.create(entity);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	public void delete(AnjutuUserrole entity) {
		LogUtil.log("deleting Object instance", Level.INFO, null);
		try {
			anjutuuserroleDAO.delete(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuUserrole update(AnjutuUserrole entity) {
		LogUtil.log("updating Object instance", Level.INFO, null);
		try {
			AnjutuUserrole result = anjutuuserroleDAO.update(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuUserrole findById(int id) {
		LogUtil.log("finding Object instance with id: " + id, Level.INFO, null);
		try {
			AnjutuUserrole instance = anjutuuserroleDAO.findById(id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<AnjutuUserrole> findAll() {
		LogUtil.log("finding all Object instances", Level.INFO, null);
		try {
			return null;
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	/**
	 * description anjutuuserrole 列表分页查询
	 * 2014-8-19 10:19:27
	 * @author jiwurapid
	 */
	public List<AnjutuUserrole> getAnjutuUserroleList(HashMap<String, Object> params){
		String hql = "from AnjutuUserrole where 1=1 ";
		int index = 0;
		int size = 0;
		if(params.containsKey("index")){
			index = Integer.parseInt(params.get("index").toString());
		}
		if(params.containsKey("size")){
			size = Integer.parseInt(params.get("size").toString());
		}
		hql+= StringUtil.getIntMapValue("roleId", params, "=");
		hql+= StringUtil.getIntMapValue("roleName", params, "=");
		hql+= StringUtil.getIntMapValue("status", params, "=");
		hql+= StringUtil.getIntMapValue("type", params, "=");
		hql+= StringUtil.getIntMapValue("ucode", params, "=");
		return anjutuuserroleDAO.findPaged(hql, index, size);
	}
	
	/**
	 * description anjutuuserrole 统计个数
	 * 2014-8-19 10:19:27
	 * @author jiwurapid
	 */
	public int countAnjutuUserrole(HashMap<String, Object> params){
		String sql = "select count(*) from AnjutuUserrole where 1=1 ";
		sql+= StringUtil.getIntMapValue("roleId", params, "=");
		sql+= StringUtil.getIntMapValue("roleName", params, "=");
		sql+= StringUtil.getIntMapValue("status", params, "=");
		sql+= StringUtil.getIntMapValue("type", params, "=");
		sql+= StringUtil.getIntMapValue("ucode", params, "=");
		return anjutuuserroleDAO.countRows(sql).intValue();
	}

}