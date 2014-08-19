package com.jiwu.anjutu.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.jiwu.anjutu.dao.IGenericDAO;
import com.jiwu.anjutu.service.IAnjutuCusmentlogManager;
import com.jiwu.anjutu.utils.StringUtil;

/**
 * description anjutucusmentlog EJB Impl
 * 2014-8-19 10:18:31
 * @author jiwurapid
 */
@Stateless(name = "anjutucusmentlogManager")
@Remote(IAnjutuCusmentlogManager.class)

public class AnjutuCusmentlogManagerImpl implements IAnjutuCusmentlogManager {
	@EJB(beanName = "anjutucusmentlogDAO")
	private IGenericDAO<AnjutuCusmentlog, Integer> anjutucusmentlogDAO;
	
	public AnjutuCusmentlog save(AnjutuCusmentlog entity) {
		LogUtil.log("saving Object instance", Level.INFO, null);
		try {
			return anjutucusmentlogDAO.create(entity);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	public void delete(AnjutuCusmentlog entity) {
		LogUtil.log("deleting Object instance", Level.INFO, null);
		try {
			anjutucusmentlogDAO.delete(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuCusmentlog update(AnjutuCusmentlog entity) {
		LogUtil.log("updating Object instance", Level.INFO, null);
		try {
			AnjutuCusmentlog result = anjutucusmentlogDAO.update(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuCusmentlog findById(int id) {
		LogUtil.log("finding Object instance with id: " + id, Level.INFO, null);
		try {
			AnjutuCusmentlog instance = anjutucusmentlogDAO.findById(id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<AnjutuCusmentlog> findAll() {
		LogUtil.log("finding all Object instances", Level.INFO, null);
		try {
			return null;
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	/**
	 * description anjutucusmentlog 列表分页查询
	 * 2014-8-19 10:18:31
	 * @author jiwurapid
	 */
	public List<AnjutuCusmentlog> getAnjutuCusmentlogList(HashMap<String, Object> params){
		String hql = "from AnjutuCusmentlog where 1=1 ";
		int index = 0;
		int size = 0;
		if(params.containsKey("index")){
			index = Integer.parseInt(params.get("index").toString());
		}
		if(params.containsKey("size")){
			size = Integer.parseInt(params.get("size").toString());
		}
		hql+= StringUtil.getIntMapValue("id", params, "=");
		hql+= StringUtil.getIntMapValue("kid", params, "=");
		hql+= StringUtil.getIntMapValue("type", params, "=");
		hql+= StringUtil.getIntMapValue("remark", params, "=");
		hql+= StringUtil.getIntMapValue("operateId", params, "=");
		hql+= StringUtil.getIntMapValue("operateName", params, "=");
		hql+= StringUtil.getIntMapValue("statusBefore", params, "=");
		hql+= StringUtil.getIntMapValue("statusBack", params, "=");
		hql+= StringUtil.getIntMapValue("ctime", params, "=");
		return anjutucusmentlogDAO.findPaged(hql, index, size);
	}
	
	/**
	 * description anjutucusmentlog 统计个数
	 * 2014-8-19 10:18:31
	 * @author jiwurapid
	 */
	public int countAnjutuCusmentlog(HashMap<String, Object> params){
		String sql = "select count(*) from AnjutuCusmentlog where 1=1 ";
		sql+= StringUtil.getIntMapValue("id", params, "=");
		sql+= StringUtil.getIntMapValue("kid", params, "=");
		sql+= StringUtil.getIntMapValue("type", params, "=");
		sql+= StringUtil.getIntMapValue("remark", params, "=");
		sql+= StringUtil.getIntMapValue("operateId", params, "=");
		sql+= StringUtil.getIntMapValue("operateName", params, "=");
		sql+= StringUtil.getIntMapValue("statusBefore", params, "=");
		sql+= StringUtil.getIntMapValue("statusBack", params, "=");
		sql+= StringUtil.getIntMapValue("ctime", params, "=");
		return anjutucusmentlogDAO.countRows(sql).intValue();
	}

}