/**
 * description anjutuesfhouse 业务处理
 * 2014-8-19 10:18:44
 * @author jiwurapid
 */

package com.jiwu.anjutu.service;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jiwu.anjutu.entity.AnjutuEsfhouse;

@Component
public class AnjutuEsfhouseService {
	
	@Resource
	private IAnjutuEsfhouseManager anjutuesfhouseManager;
	
	/**
	 * description anjutuesfhouse 查找
	 * 2014-8-19 10:18:44
	 * @author jiwurapid
	 */
	public AnjutuEsfhouse findById(int id){
		return anjutuesfhouseManager.findById(id);
	}
	
	/**
	 * description anjutuesfhouse 添加
	 * 2014-8-19 10:18:44
	 * @author jiwurapid
	 */
	public void add(AnjutuEsfhouse anjutuesfhouse){
		anjutuesfhouseManager.save(anjutuesfhouse);
	}
	
	/**
	 * description anjutuesfhouse 修改
	 * 2014-8-19 10:18:44
	 * @author jiwurapid
	 */
	public AnjutuEsfhouse update(AnjutuEsfhouse anjutuesfhouse){
		return anjutuesfhouseManager.update(anjutuesfhouse);
	}
	
	/**
	 * description anjutuesfhouse 删除
	 * 2014-8-19 10:18:44
	 * @author jiwurapid
	 */
	public void delete(int id){
		AnjutuEsfhouse anjutuesfhouse = anjutuesfhouseManager.findById(id);
		anjutuesfhouseManager.delete(anjutuesfhouse);
	}
	
	/**
	 * description 查找 anjutuesfhouse 列表
	 * 2014-8-19 10:18:44
	 * @author jiwurapid
	 */
	public List<AnjutuEsfhouse> getAnjutuEsfhouselist(int page, int size){
		HashMap<String, Object> params_anjutuesfhouse = new HashMap<String, Object>();
		params_anjutuesfhouse.put("index", (page-1)*size);
		params_anjutuesfhouse.put("size", size);
		return anjutuesfhouseManager.getAnjutuEsfhouseList(params_anjutuesfhouse);
	}

}
