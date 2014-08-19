package com.jiwu.anjutu.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.jiwu.anjutu.dao.IGenericDAO;
import com.jiwu.anjutu.service.IAnjutuBuildpictureManager;
import com.jiwu.anjutu.utils.StringUtil;

/**
 * description anjutubuildpicture EJB Impl
 * 2014-8-19 10:17:56
 * @author jiwurapid
 */
@Stateless(name = "anjutubuildpictureManager")
@Remote(IAnjutuBuildpictureManager.class)

public class AnjutuBuildpictureManagerImpl implements IAnjutuBuildpictureManager {
	@EJB(beanName = "anjutubuildpictureDAO")
	private IGenericDAO<AnjutuBuildpicture, Integer> anjutubuildpictureDAO;
	
	public AnjutuBuildpicture save(AnjutuBuildpicture entity) {
		LogUtil.log("saving Object instance", Level.INFO, null);
		try {
			return anjutubuildpictureDAO.create(entity);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	public void delete(AnjutuBuildpicture entity) {
		LogUtil.log("deleting Object instance", Level.INFO, null);
		try {
			anjutubuildpictureDAO.delete(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuBuildpicture update(AnjutuBuildpicture entity) {
		LogUtil.log("updating Object instance", Level.INFO, null);
		try {
			AnjutuBuildpicture result = anjutubuildpictureDAO.update(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuBuildpicture findById(int id) {
		LogUtil.log("finding Object instance with id: " + id, Level.INFO, null);
		try {
			AnjutuBuildpicture instance = anjutubuildpictureDAO.findById(id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<AnjutuBuildpicture> findAll() {
		LogUtil.log("finding all Object instances", Level.INFO, null);
		try {
			return null;
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	/**
	 * description anjutubuildpicture 列表分页查询
	 * 2014-8-19 10:17:56
	 * @author jiwurapid
	 */
	public List<AnjutuBuildpicture> getAnjutuBuildpictureList(HashMap<String, Object> params){
		String hql = "from AnjutuBuildpicture where 1=1 ";
		int index = 0;
		int size = 0;
		if(params.containsKey("index")){
			index = Integer.parseInt(params.get("index").toString());
		}
		if(params.containsKey("size")){
			size = Integer.parseInt(params.get("size").toString());
		}
		hql+= StringUtil.getIntMapValue("bpid", params, "=");
		hql+= StringUtil.getIntMapValue("bid", params, "=");
		hql+= StringUtil.getIntMapValue("fileName", params, "=");
		hql+= StringUtil.getIntMapValue("path", params, "=");
		hql+= StringUtil.getIntMapValue("ctime", params, "=");
		hql+= StringUtil.getIntMapValue("remark", params, "=");
		hql+= StringUtil.getIntMapValue("status", params, "=");
		hql+= StringUtil.getIntMapValue("isCover", params, "=");
		hql+= StringUtil.getIntMapValue("vtimes", params, "=");
		hql+= StringUtil.getIntMapValue("type", params, "=");
		return anjutubuildpictureDAO.findPaged(hql, index, size);
	}
	
	/**
	 * description anjutubuildpicture 统计个数
	 * 2014-8-19 10:17:56
	 * @author jiwurapid
	 */
	public int countAnjutuBuildpicture(HashMap<String, Object> params){
		String sql = "select count(*) from AnjutuBuildpicture where 1=1 ";
		sql+= StringUtil.getIntMapValue("bpid", params, "=");
		sql+= StringUtil.getIntMapValue("bid", params, "=");
		sql+= StringUtil.getIntMapValue("fileName", params, "=");
		sql+= StringUtil.getIntMapValue("path", params, "=");
		sql+= StringUtil.getIntMapValue("ctime", params, "=");
		sql+= StringUtil.getIntMapValue("remark", params, "=");
		sql+= StringUtil.getIntMapValue("status", params, "=");
		sql+= StringUtil.getIntMapValue("isCover", params, "=");
		sql+= StringUtil.getIntMapValue("vtimes", params, "=");
		sql+= StringUtil.getIntMapValue("type", params, "=");
		return anjutubuildpictureDAO.countRows(sql).intValue();
	}

}