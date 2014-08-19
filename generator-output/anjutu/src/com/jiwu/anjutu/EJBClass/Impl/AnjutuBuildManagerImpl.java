package com.jiwu.anjutu.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.jiwu.anjutu.dao.IGenericDAO;
import com.jiwu.anjutu.service.IAnjutuBuildManager;
import com.jiwu.anjutu.utils.StringUtil;

/**
 * description anjutubuild EJB Impl
 * 2014-8-19 10:17:49
 * @author jiwurapid
 */
@Stateless(name = "anjutubuildManager")
@Remote(IAnjutuBuildManager.class)

public class AnjutuBuildManagerImpl implements IAnjutuBuildManager {
	@EJB(beanName = "anjutubuildDAO")
	private IGenericDAO<AnjutuBuild, Integer> anjutubuildDAO;
	
	public AnjutuBuild save(AnjutuBuild entity) {
		LogUtil.log("saving Object instance", Level.INFO, null);
		try {
			return anjutubuildDAO.create(entity);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	public void delete(AnjutuBuild entity) {
		LogUtil.log("deleting Object instance", Level.INFO, null);
		try {
			anjutubuildDAO.delete(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuBuild update(AnjutuBuild entity) {
		LogUtil.log("updating Object instance", Level.INFO, null);
		try {
			AnjutuBuild result = anjutubuildDAO.update(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuBuild findById(int id) {
		LogUtil.log("finding Object instance with id: " + id, Level.INFO, null);
		try {
			AnjutuBuild instance = anjutubuildDAO.findById(id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<AnjutuBuild> findAll() {
		LogUtil.log("finding all Object instances", Level.INFO, null);
		try {
			return null;
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	/**
	 * description anjutubuild 列表分页查询
	 * 2014-8-19 10:17:49
	 * @author jiwurapid
	 */
	public List<AnjutuBuild> getAnjutuBuildList(HashMap<String, Object> params){
		String hql = "from AnjutuBuild where 1=1 ";
		int index = 0;
		int size = 0;
		if(params.containsKey("index")){
			index = Integer.parseInt(params.get("index").toString());
		}
		if(params.containsKey("size")){
			size = Integer.parseInt(params.get("size").toString());
		}
		hql+= StringUtil.getIntMapValue("bid", params, "=");
		hql+= StringUtil.getIntMapValue("bname", params, "=");
		hql+= StringUtil.getIntMapValue("title", params, "=");
		hql+= StringUtil.getIntMapValue("averagePrice", params, "=");
		hql+= StringUtil.getIntMapValue("path", params, "=");
		hql+= StringUtil.getIntMapValue("cityId", params, "=");
		hql+= StringUtil.getIntMapValue("districtCityId", params, "=");
		hql+= StringUtil.getIntMapValue("streetId", params, "=");
		hql+= StringUtil.getIntMapValue("busName", params, "=");
		hql+= StringUtil.getIntMapValue("utime", params, "=");
		hql+= StringUtil.getIntMapValue("level", params, "=");
		hql+= StringUtil.getIntMapValue("ctime", params, "=");
		hql+= StringUtil.getIntMapValue("status", params, "=");
		hql+= StringUtil.getIntMapValue("pictureNum", params, "=");
		hql+= StringUtil.getIntMapValue("grade", params, "=");
		hql+= StringUtil.getIntMapValue("vtimes", params, "=");
		hql+= StringUtil.getIntMapValue("address", params, "=");
		hql+= StringUtil.getIntMapValue("features", params, "=");
		hql+= StringUtil.getIntMapValue("saleAddress", params, "=");
		hql+= StringUtil.getIntMapValue("agentPhone", params, "=");
		hql+= StringUtil.getIntMapValue("centerPhone", params, "=");
		hql+= StringUtil.getIntMapValue("longitude", params, "=");
		hql+= StringUtil.getIntMapValue("latitude", params, "=");
		hql+= StringUtil.getIntMapValue("propertyType", params, "=");
		hql+= StringUtil.getIntMapValue("buildType", params, "=");
		hql+= StringUtil.getIntMapValue("decoration", params, "=");
		hql+= StringUtil.getIntMapValue("mprice", params, "=");
		hql+= StringUtil.getIntMapValue("saleStatus", params, "=");
		hql+= StringUtil.getIntMapValue("adviserNum", params, "=");
		hql+= StringUtil.getIntMapValue("jiwuId", params, "=");
		return anjutubuildDAO.findPaged(hql, index, size);
	}
	
	/**
	 * description anjutubuild 统计个数
	 * 2014-8-19 10:17:49
	 * @author jiwurapid
	 */
	public int countAnjutuBuild(HashMap<String, Object> params){
		String sql = "select count(*) from AnjutuBuild where 1=1 ";
		sql+= StringUtil.getIntMapValue("bid", params, "=");
		sql+= StringUtil.getIntMapValue("bname", params, "=");
		sql+= StringUtil.getIntMapValue("title", params, "=");
		sql+= StringUtil.getIntMapValue("averagePrice", params, "=");
		sql+= StringUtil.getIntMapValue("path", params, "=");
		sql+= StringUtil.getIntMapValue("cityId", params, "=");
		sql+= StringUtil.getIntMapValue("districtCityId", params, "=");
		sql+= StringUtil.getIntMapValue("streetId", params, "=");
		sql+= StringUtil.getIntMapValue("busName", params, "=");
		sql+= StringUtil.getIntMapValue("utime", params, "=");
		sql+= StringUtil.getIntMapValue("level", params, "=");
		sql+= StringUtil.getIntMapValue("ctime", params, "=");
		sql+= StringUtil.getIntMapValue("status", params, "=");
		sql+= StringUtil.getIntMapValue("pictureNum", params, "=");
		sql+= StringUtil.getIntMapValue("grade", params, "=");
		sql+= StringUtil.getIntMapValue("vtimes", params, "=");
		sql+= StringUtil.getIntMapValue("address", params, "=");
		sql+= StringUtil.getIntMapValue("features", params, "=");
		sql+= StringUtil.getIntMapValue("saleAddress", params, "=");
		sql+= StringUtil.getIntMapValue("agentPhone", params, "=");
		sql+= StringUtil.getIntMapValue("centerPhone", params, "=");
		sql+= StringUtil.getIntMapValue("longitude", params, "=");
		sql+= StringUtil.getIntMapValue("latitude", params, "=");
		sql+= StringUtil.getIntMapValue("propertyType", params, "=");
		sql+= StringUtil.getIntMapValue("buildType", params, "=");
		sql+= StringUtil.getIntMapValue("decoration", params, "=");
		sql+= StringUtil.getIntMapValue("mprice", params, "=");
		sql+= StringUtil.getIntMapValue("saleStatus", params, "=");
		sql+= StringUtil.getIntMapValue("adviserNum", params, "=");
		sql+= StringUtil.getIntMapValue("jiwuId", params, "=");
		return anjutubuildDAO.countRows(sql).intValue();
	}

}