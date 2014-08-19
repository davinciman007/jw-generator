package com.jiwu.anjutu.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.jiwu.anjutu.dao.IGenericDAO;
import com.jiwu.anjutu.service.IAnjutuUsersManager;
import com.jiwu.anjutu.utils.StringUtil;

/**
 * description anjutuusers EJB Impl
 * 2014-8-19 10:19:34
 * @author jiwurapid
 */
@Stateless(name = "anjutuusersManager")
@Remote(IAnjutuUsersManager.class)

public class AnjutuUsersManagerImpl implements IAnjutuUsersManager {
	@EJB(beanName = "anjutuusersDAO")
	private IGenericDAO<AnjutuUsers, Integer> anjutuusersDAO;
	
	public AnjutuUsers save(AnjutuUsers entity) {
		LogUtil.log("saving Object instance", Level.INFO, null);
		try {
			return anjutuusersDAO.create(entity);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	public void delete(AnjutuUsers entity) {
		LogUtil.log("deleting Object instance", Level.INFO, null);
		try {
			anjutuusersDAO.delete(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuUsers update(AnjutuUsers entity) {
		LogUtil.log("updating Object instance", Level.INFO, null);
		try {
			AnjutuUsers result = anjutuusersDAO.update(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuUsers findById(int id) {
		LogUtil.log("finding Object instance with id: " + id, Level.INFO, null);
		try {
			AnjutuUsers instance = anjutuusersDAO.findById(id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<AnjutuUsers> findAll() {
		LogUtil.log("finding all Object instances", Level.INFO, null);
		try {
			return null;
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	/**
	 * description anjutuusers 列表分页查询
	 * 2014-8-19 10:19:34
	 * @author jiwurapid
	 */
	public List<AnjutuUsers> getAnjutuUsersList(HashMap<String, Object> params){
		String hql = "from AnjutuUsers where 1=1 ";
		int index = 0;
		int size = 0;
		if(params.containsKey("index")){
			index = Integer.parseInt(params.get("index").toString());
		}
		if(params.containsKey("size")){
			size = Integer.parseInt(params.get("size").toString());
		}
		hql+= StringUtil.getIntMapValue("uid", params, "=");
		hql+= StringUtil.getIntMapValue("jobNumber", params, "=");
		hql+= StringUtil.getIntMapValue("username", params, "=");
		hql+= StringUtil.getIntMapValue("password", params, "=");
		hql+= StringUtil.getIntMapValue("cityId", params, "=");
		hql+= StringUtil.getIntMapValue("cityName", params, "=");
		hql+= StringUtil.getIntMapValue("districtId", params, "=");
		hql+= StringUtil.getIntMapValue("districtName", params, "=");
		hql+= StringUtil.getIntMapValue("streetId", params, "=");
		hql+= StringUtil.getIntMapValue("streetName", params, "=");
		hql+= StringUtil.getIntMapValue("trueName", params, "=");
		hql+= StringUtil.getIntMapValue("companyName", params, "=");
		hql+= StringUtil.getIntMapValue("mobile", params, "=");
		hql+= StringUtil.getIntMapValue("sex", params, "=");
		hql+= StringUtil.getIntMapValue("personPath", params, "=");
		hql+= StringUtil.getIntMapValue("idCardNumber", params, "=");
		hql+= StringUtil.getIntMapValue("type", params, "=");
		hql+= StringUtil.getIntMapValue("level", params, "=");
		hql+= StringUtil.getIntMapValue("parentId", params, "=");
		hql+= StringUtil.getIntMapValue("workAge", params, "=");
		hql+= StringUtil.getIntMapValue("appKey", params, "=");
		hql+= StringUtil.getIntMapValue("roleId", params, "=");
		hql+= StringUtil.getIntMapValue("status", params, "=");
		hql+= StringUtil.getIntMapValue("ctime", params, "=");
		hql+= StringUtil.getIntMapValue("utime", params, "=");
		hql+= StringUtil.getIntMapValue("loginTime", params, "=");
		return anjutuusersDAO.findPaged(hql, index, size);
	}
	
	/**
	 * description anjutuusers 统计个数
	 * 2014-8-19 10:19:34
	 * @author jiwurapid
	 */
	public int countAnjutuUsers(HashMap<String, Object> params){
		String sql = "select count(*) from AnjutuUsers where 1=1 ";
		sql+= StringUtil.getIntMapValue("uid", params, "=");
		sql+= StringUtil.getIntMapValue("jobNumber", params, "=");
		sql+= StringUtil.getIntMapValue("username", params, "=");
		sql+= StringUtil.getIntMapValue("password", params, "=");
		sql+= StringUtil.getIntMapValue("cityId", params, "=");
		sql+= StringUtil.getIntMapValue("cityName", params, "=");
		sql+= StringUtil.getIntMapValue("districtId", params, "=");
		sql+= StringUtil.getIntMapValue("districtName", params, "=");
		sql+= StringUtil.getIntMapValue("streetId", params, "=");
		sql+= StringUtil.getIntMapValue("streetName", params, "=");
		sql+= StringUtil.getIntMapValue("trueName", params, "=");
		sql+= StringUtil.getIntMapValue("companyName", params, "=");
		sql+= StringUtil.getIntMapValue("mobile", params, "=");
		sql+= StringUtil.getIntMapValue("sex", params, "=");
		sql+= StringUtil.getIntMapValue("personPath", params, "=");
		sql+= StringUtil.getIntMapValue("idCardNumber", params, "=");
		sql+= StringUtil.getIntMapValue("type", params, "=");
		sql+= StringUtil.getIntMapValue("level", params, "=");
		sql+= StringUtil.getIntMapValue("parentId", params, "=");
		sql+= StringUtil.getIntMapValue("workAge", params, "=");
		sql+= StringUtil.getIntMapValue("appKey", params, "=");
		sql+= StringUtil.getIntMapValue("roleId", params, "=");
		sql+= StringUtil.getIntMapValue("status", params, "=");
		sql+= StringUtil.getIntMapValue("ctime", params, "=");
		sql+= StringUtil.getIntMapValue("utime", params, "=");
		sql+= StringUtil.getIntMapValue("loginTime", params, "=");
		return anjutuusersDAO.countRows(sql).intValue();
	}

}