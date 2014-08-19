package com.jiwu.anjutu.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.jiwu.anjutu.dao.IGenericDAO;
import com.jiwu.anjutu.service.IAnjutuCusmentManager;
import com.jiwu.anjutu.utils.StringUtil;

/**
 * description anjutucusment EJB Impl
 * 2014-8-19 10:18:17
 * @author jiwurapid
 */
@Stateless(name = "anjutucusmentManager")
@Remote(IAnjutuCusmentManager.class)

public class AnjutuCusmentManagerImpl implements IAnjutuCusmentManager {
	@EJB(beanName = "anjutucusmentDAO")
	private IGenericDAO<AnjutuCusment, Integer> anjutucusmentDAO;
	
	public AnjutuCusment save(AnjutuCusment entity) {
		LogUtil.log("saving Object instance", Level.INFO, null);
		try {
			return anjutucusmentDAO.create(entity);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	public void delete(AnjutuCusment entity) {
		LogUtil.log("deleting Object instance", Level.INFO, null);
		try {
			anjutucusmentDAO.delete(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuCusment update(AnjutuCusment entity) {
		LogUtil.log("updating Object instance", Level.INFO, null);
		try {
			AnjutuCusment result = anjutucusmentDAO.update(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AnjutuCusment findById(int id) {
		LogUtil.log("finding Object instance with id: " + id, Level.INFO, null);
		try {
			AnjutuCusment instance = anjutucusmentDAO.findById(id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<AnjutuCusment> findAll() {
		LogUtil.log("finding all Object instances", Level.INFO, null);
		try {
			return null;
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	/**
	 * description anjutucusment 列表分页查询
	 * 2014-8-19 10:18:17
	 * @author jiwurapid
	 */
	public List<AnjutuCusment> getAnjutuCusmentList(HashMap<String, Object> params){
		String hql = "from AnjutuCusment where 1=1 ";
		int index = 0;
		int size = 0;
		if(params.containsKey("index")){
			index = Integer.parseInt(params.get("index").toString());
		}
		if(params.containsKey("size")){
			size = Integer.parseInt(params.get("size").toString());
		}
		hql+= StringUtil.getIntMapValue("cusId", params, "=");
		hql+= StringUtil.getIntMapValue("cusNumber", params, "=");
		hql+= StringUtil.getIntMapValue("name", params, "=");
		hql+= StringUtil.getIntMapValue("mobile", params, "=");
		hql+= StringUtil.getIntMapValue("email", params, "=");
		hql+= StringUtil.getIntMapValue("sex", params, "=");
		hql+= StringUtil.getIntMapValue("type", params, "=");
		hql+= StringUtil.getIntMapValue("qudaoSource", params, "=");
		hql+= StringUtil.getIntMapValue("cusTrade", params, "=");
		hql+= StringUtil.getIntMapValue("cusLevel", params, "=");
		hql+= StringUtil.getIntMapValue("cityId", params, "=");
		hql+= StringUtil.getIntMapValue("cityName", params, "=");
		hql+= StringUtil.getIntMapValue("districtId", params, "=");
		hql+= StringUtil.getIntMapValue("districtName", params, "=");
		hql+= StringUtil.getIntMapValue("streetId", params, "=");
		hql+= StringUtil.getIntMapValue("streetName", params, "=");
		hql+= StringUtil.getIntMapValue("direction", params, "=");
		hql+= StringUtil.getIntMapValue("buildArea", params, "=");
		hql+= StringUtil.getIntMapValue("unitPrice", params, "=");
		hql+= StringUtil.getIntMapValue("totalPrice", params, "=");
		hql+= StringUtil.getIntMapValue("storey", params, "=");
		hql+= StringUtil.getIntMapValue("buildAge", params, "=");
		hql+= StringUtil.getIntMapValue("decoration", params, "=");
		hql+= StringUtil.getIntMapValue("status", params, "=");
		hql+= StringUtil.getIntMapValue("paymentWay", params, "=");
		hql+= StringUtil.getIntMapValue("remark", params, "=");
		hql+= StringUtil.getIntMapValue("ctime", params, "=");
		hql+= StringUtil.getIntMapValue("utime", params, "=");
		hql+= StringUtil.getIntMapValue("operateId", params, "=");
		hql+= StringUtil.getIntMapValue("operateName", params, "=");
		return anjutucusmentDAO.findPaged(hql, index, size);
	}
	
	/**
	 * description anjutucusment 统计个数
	 * 2014-8-19 10:18:17
	 * @author jiwurapid
	 */
	public int countAnjutuCusment(HashMap<String, Object> params){
		String sql = "select count(*) from AnjutuCusment where 1=1 ";
		sql+= StringUtil.getIntMapValue("cusId", params, "=");
		sql+= StringUtil.getIntMapValue("cusNumber", params, "=");
		sql+= StringUtil.getIntMapValue("name", params, "=");
		sql+= StringUtil.getIntMapValue("mobile", params, "=");
		sql+= StringUtil.getIntMapValue("email", params, "=");
		sql+= StringUtil.getIntMapValue("sex", params, "=");
		sql+= StringUtil.getIntMapValue("type", params, "=");
		sql+= StringUtil.getIntMapValue("qudaoSource", params, "=");
		sql+= StringUtil.getIntMapValue("cusTrade", params, "=");
		sql+= StringUtil.getIntMapValue("cusLevel", params, "=");
		sql+= StringUtil.getIntMapValue("cityId", params, "=");
		sql+= StringUtil.getIntMapValue("cityName", params, "=");
		sql+= StringUtil.getIntMapValue("districtId", params, "=");
		sql+= StringUtil.getIntMapValue("districtName", params, "=");
		sql+= StringUtil.getIntMapValue("streetId", params, "=");
		sql+= StringUtil.getIntMapValue("streetName", params, "=");
		sql+= StringUtil.getIntMapValue("direction", params, "=");
		sql+= StringUtil.getIntMapValue("buildArea", params, "=");
		sql+= StringUtil.getIntMapValue("unitPrice", params, "=");
		sql+= StringUtil.getIntMapValue("totalPrice", params, "=");
		sql+= StringUtil.getIntMapValue("storey", params, "=");
		sql+= StringUtil.getIntMapValue("buildAge", params, "=");
		sql+= StringUtil.getIntMapValue("decoration", params, "=");
		sql+= StringUtil.getIntMapValue("status", params, "=");
		sql+= StringUtil.getIntMapValue("paymentWay", params, "=");
		sql+= StringUtil.getIntMapValue("remark", params, "=");
		sql+= StringUtil.getIntMapValue("ctime", params, "=");
		sql+= StringUtil.getIntMapValue("utime", params, "=");
		sql+= StringUtil.getIntMapValue("operateId", params, "=");
		sql+= StringUtil.getIntMapValue("operateName", params, "=");
		return anjutucusmentDAO.countRows(sql).intValue();
	}

}