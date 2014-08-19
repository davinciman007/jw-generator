package com.jiwu.anjutu.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.jiwu.anjutu.dao.IGenericDAO;
import com.jiwu.anjutu.service.IAnjutuEsfhouselogManager;
import com.jiwu.anjutu.utils.StringUtil;

/**
 * description anjutuesfhouselog EJB Impl
 * 2014-8-19 10:18:50
 * @author jiwurapid
 */
@Stateless(name = "anjutuesfhouselogManager")
@Remote(IAnjutuEsfhouselogManager.class)

public class AnjutuEsfhouselogManagerImpl implements IAnjutuEsfhouselogManager {
	@EJB(beanName = "anjutuesfhouselogDAO")
	private IGenericDAO<AnjutuEsfhouselog, Integer> anjutuesfhouselogDAO;
	
	public AnjutuEsfhouselog save(AnjutuEsfhouselog entity) {
		LogUtil.log("saving Object instance", Level.INFO, null);
		try {
			return anjutuesfhouselogDAO.create(entity);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	public void delete(AnjutuEsfhouselog entity) {
		LogUtil.log("deleting Object instance", Level.INFO, null);
		try {
			anjutuesfhouselogDAO.delete(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuEsfhouselog update(AnjutuEsfhouselog entity) {
		LogUtil.log("updating Object instance", Level.INFO, null);
		try {
			AnjutuEsfhouselog result = anjutuesfhouselogDAO.update(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuEsfhouselog findById(int id) {
		LogUtil.log("finding Object instance with id: " + id, Level.INFO, null);
		try {
			AnjutuEsfhouselog instance = anjutuesfhouselogDAO.findById(id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<AnjutuEsfhouselog> findAll() {
		LogUtil.log("finding all Object instances", Level.INFO, null);
		try {
			return null;
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	/**
	 * description anjutuesfhouselog 列表分页查询
	 * 2014-8-19 10:18:50
	 * @author jiwurapid
	 */
	public List<AnjutuEsfhouselog> getAnjutuEsfhouselogList(HashMap<String, Object> params){
		String hql = "from AnjutuEsfhouselog where 1=1 ";
		int index = 0;
		int size = 0;
		if(params.containsKey("index")){
			index = Integer.parseInt(params.get("index").toString());
		}
		if(params.containsKey("size")){
			size = Integer.parseInt(params.get("size").toString());
		}
		hql+= StringUtil.getIntMapValue("id", params, "=");
		hql+= StringUtil.getIntMapValue("houseId", params, "=");
		hql+= StringUtil.getIntMapValue("type", params, "=");
		hql+= StringUtil.getIntMapValue("remark", params, "=");
		hql+= StringUtil.getIntMapValue("operateId", params, "=");
		hql+= StringUtil.getIntMapValue("operateName", params, "=");
		hql+= StringUtil.getIntMapValue("ctime", params, "=");
		return anjutuesfhouselogDAO.findPaged(hql, index, size);
	}
	
	/**
	 * description anjutuesfhouselog 统计个数
	 * 2014-8-19 10:18:50
	 * @author jiwurapid
	 */
	public int countAnjutuEsfhouselog(HashMap<String, Object> params){
		String sql = "select count(*) from AnjutuEsfhouselog where 1=1 ";
		sql+= StringUtil.getIntMapValue("id", params, "=");
		sql+= StringUtil.getIntMapValue("houseId", params, "=");
		sql+= StringUtil.getIntMapValue("type", params, "=");
		sql+= StringUtil.getIntMapValue("remark", params, "=");
		sql+= StringUtil.getIntMapValue("operateId", params, "=");
		sql+= StringUtil.getIntMapValue("operateName", params, "=");
		sql+= StringUtil.getIntMapValue("ctime", params, "=");
		return anjutuesfhouselogDAO.countRows(sql).intValue();
	}

}