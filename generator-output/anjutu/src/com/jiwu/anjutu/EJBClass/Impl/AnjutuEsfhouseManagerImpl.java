package com.jiwu.anjutu.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.jiwu.anjutu.dao.IGenericDAO;
import com.jiwu.anjutu.service.IAnjutuEsfhouseManager;
import com.jiwu.anjutu.utils.StringUtil;

/**
 * description anjutuesfhouse EJB Impl
 * 2014-8-19 10:18:44
 * @author jiwurapid
 */
@Stateless(name = "anjutuesfhouseManager")
@Remote(IAnjutuEsfhouseManager.class)

public class AnjutuEsfhouseManagerImpl implements IAnjutuEsfhouseManager {
	@EJB(beanName = "anjutuesfhouseDAO")
	private IGenericDAO<AnjutuEsfhouse, Integer> anjutuesfhouseDAO;
	
	public AnjutuEsfhouse save(AnjutuEsfhouse entity) {
		LogUtil.log("saving Object instance", Level.INFO, null);
		try {
			return anjutuesfhouseDAO.create(entity);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	public void delete(AnjutuEsfhouse entity) {
		LogUtil.log("deleting Object instance", Level.INFO, null);
		try {
			anjutuesfhouseDAO.delete(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuEsfhouse update(AnjutuEsfhouse entity) {
		LogUtil.log("updating Object instance", Level.INFO, null);
		try {
			AnjutuEsfhouse result = anjutuesfhouseDAO.update(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuEsfhouse findById(int id) {
		LogUtil.log("finding Object instance with id: " + id, Level.INFO, null);
		try {
			AnjutuEsfhouse instance = anjutuesfhouseDAO.findById(id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<AnjutuEsfhouse> findAll() {
		LogUtil.log("finding all Object instances", Level.INFO, null);
		try {
			return null;
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	/**
	 * description anjutuesfhouse 列表分页查询
	 * 2014-8-19 10:18:44
	 * @author jiwurapid
	 */
	public List<AnjutuEsfhouse> getAnjutuEsfhouseList(HashMap<String, Object> params){
		String hql = "from AnjutuEsfhouse where 1=1 ";
		int index = 0;
		int size = 0;
		if(params.containsKey("index")){
			index = Integer.parseInt(params.get("index").toString());
		}
		if(params.containsKey("size")){
			size = Integer.parseInt(params.get("size").toString());
		}
		hql+= StringUtil.getIntMapValue("houseId", params, "=");
		hql+= StringUtil.getIntMapValue("houseNumber", params, "=");
		hql+= StringUtil.getIntMapValue("bid", params, "=");
		hql+= StringUtil.getIntMapValue("bname", params, "=");
		hql+= StringUtil.getIntMapValue("cityId", params, "=");
		hql+= StringUtil.getIntMapValue("cityName", params, "=");
		hql+= StringUtil.getIntMapValue("districtId", params, "=");
		hql+= StringUtil.getIntMapValue("districtName", params, "=");
		hql+= StringUtil.getIntMapValue("streetId", params, "=");
		hql+= StringUtil.getIntMapValue("streetName", params, "=");
		hql+= StringUtil.getIntMapValue("building", params, "=");
		hql+= StringUtil.getIntMapValue("buildUnit", params, "=");
		hql+= StringUtil.getIntMapValue("doorNumber", params, "=");
		hql+= StringUtil.getIntMapValue("uniqueMark", params, "=");
		hql+= StringUtil.getIntMapValue("room", params, "=");
		hql+= StringUtil.getIntMapValue("hall", params, "=");
		hql+= StringUtil.getIntMapValue("toilet", params, "=");
		hql+= StringUtil.getIntMapValue("veranda", params, "=");
		hql+= StringUtil.getIntMapValue("buildArea", params, "=");
		hql+= StringUtil.getIntMapValue("storey", params, "=");
		hql+= StringUtil.getIntMapValue("buildNature", params, "=");
		hql+= StringUtil.getIntMapValue("direction", params, "=");
		hql+= StringUtil.getIntMapValue("buildAge", params, "=");
		hql+= StringUtil.getIntMapValue("buildLevel", params, "=");
		hql+= StringUtil.getIntMapValue("ladder", params, "=");
		hql+= StringUtil.getIntMapValue("decoration", params, "=");
		hql+= StringUtil.getIntMapValue("path", params, "=");
		hql+= StringUtil.getIntMapValue("structure", params, "=");
		hql+= StringUtil.getIntMapValue("propertyType", params, "=");
		hql+= StringUtil.getIntMapValue("totalPrice", params, "=");
		hql+= StringUtil.getIntMapValue("averagePrice", params, "=");
		hql+= StringUtil.getIntMapValue("flatId", params, "=");
		hql+= StringUtil.getIntMapValue("saleModeNumber", params, "=");
		hql+= StringUtil.getIntMapValue("remark", params, "=");
		hql+= StringUtil.getIntMapValue("ownerName", params, "=");
		hql+= StringUtil.getIntMapValue("ownerSex", params, "=");
		hql+= StringUtil.getIntMapValue("ownerPhone", params, "=");
		hql+= StringUtil.getIntMapValue("paymentWay", params, "=");
		hql+= StringUtil.getIntMapValue("type", params, "=");
		hql+= StringUtil.getIntMapValue("isPrivate", params, "=");
		hql+= StringUtil.getIntMapValue("status", params, "=");
		hql+= StringUtil.getIntMapValue("ctime", params, "=");
		hql+= StringUtil.getIntMapValue("utime", params, "=");
		hql+= StringUtil.getIntMapValue("operateId", params, "=");
		hql+= StringUtil.getIntMapValue("operateName", params, "=");
		return anjutuesfhouseDAO.findPaged(hql, index, size);
	}
	
	/**
	 * description anjutuesfhouse 统计个数
	 * 2014-8-19 10:18:44
	 * @author jiwurapid
	 */
	public int countAnjutuEsfhouse(HashMap<String, Object> params){
		String sql = "select count(*) from AnjutuEsfhouse where 1=1 ";
		sql+= StringUtil.getIntMapValue("houseId", params, "=");
		sql+= StringUtil.getIntMapValue("houseNumber", params, "=");
		sql+= StringUtil.getIntMapValue("bid", params, "=");
		sql+= StringUtil.getIntMapValue("bname", params, "=");
		sql+= StringUtil.getIntMapValue("cityId", params, "=");
		sql+= StringUtil.getIntMapValue("cityName", params, "=");
		sql+= StringUtil.getIntMapValue("districtId", params, "=");
		sql+= StringUtil.getIntMapValue("districtName", params, "=");
		sql+= StringUtil.getIntMapValue("streetId", params, "=");
		sql+= StringUtil.getIntMapValue("streetName", params, "=");
		sql+= StringUtil.getIntMapValue("building", params, "=");
		sql+= StringUtil.getIntMapValue("buildUnit", params, "=");
		sql+= StringUtil.getIntMapValue("doorNumber", params, "=");
		sql+= StringUtil.getIntMapValue("uniqueMark", params, "=");
		sql+= StringUtil.getIntMapValue("room", params, "=");
		sql+= StringUtil.getIntMapValue("hall", params, "=");
		sql+= StringUtil.getIntMapValue("toilet", params, "=");
		sql+= StringUtil.getIntMapValue("veranda", params, "=");
		sql+= StringUtil.getIntMapValue("buildArea", params, "=");
		sql+= StringUtil.getIntMapValue("storey", params, "=");
		sql+= StringUtil.getIntMapValue("buildNature", params, "=");
		sql+= StringUtil.getIntMapValue("direction", params, "=");
		sql+= StringUtil.getIntMapValue("buildAge", params, "=");
		sql+= StringUtil.getIntMapValue("buildLevel", params, "=");
		sql+= StringUtil.getIntMapValue("ladder", params, "=");
		sql+= StringUtil.getIntMapValue("decoration", params, "=");
		sql+= StringUtil.getIntMapValue("path", params, "=");
		sql+= StringUtil.getIntMapValue("structure", params, "=");
		sql+= StringUtil.getIntMapValue("propertyType", params, "=");
		sql+= StringUtil.getIntMapValue("totalPrice", params, "=");
		sql+= StringUtil.getIntMapValue("averagePrice", params, "=");
		sql+= StringUtil.getIntMapValue("flatId", params, "=");
		sql+= StringUtil.getIntMapValue("saleModeNumber", params, "=");
		sql+= StringUtil.getIntMapValue("remark", params, "=");
		sql+= StringUtil.getIntMapValue("ownerName", params, "=");
		sql+= StringUtil.getIntMapValue("ownerSex", params, "=");
		sql+= StringUtil.getIntMapValue("ownerPhone", params, "=");
		sql+= StringUtil.getIntMapValue("paymentWay", params, "=");
		sql+= StringUtil.getIntMapValue("type", params, "=");
		sql+= StringUtil.getIntMapValue("isPrivate", params, "=");
		sql+= StringUtil.getIntMapValue("status", params, "=");
		sql+= StringUtil.getIntMapValue("ctime", params, "=");
		sql+= StringUtil.getIntMapValue("utime", params, "=");
		sql+= StringUtil.getIntMapValue("operateId", params, "=");
		sql+= StringUtil.getIntMapValue("operateName", params, "=");
		return anjutuesfhouseDAO.countRows(sql).intValue();
	}

}