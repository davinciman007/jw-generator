/**
 * description anjutudistricttable 业务处理
 * 2014-8-19 10:18:38
 * @author jiwurapid
 */

package com.jiwu.anjutu.service;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jiwu.anjutu.entity.AnjutuDistricttable;

@Component
public class AnjutuDistricttableService {
	
	@Resource
	private IAnjutuDistricttableManager anjutudistricttableManager;
	
	/**
	 * description anjutudistricttable 查找
	 * 2014-8-19 10:18:38
	 * @author jiwurapid
	 */
	public AnjutuDistricttable findById(int id){
		return anjutudistricttableManager.findById(id);
	}
	
	/**
	 * description anjutudistricttable 添加
	 * 2014-8-19 10:18:38
	 * @author jiwurapid
	 */
	public void add(AnjutuDistricttable anjutudistricttable){
		anjutudistricttableManager.save(anjutudistricttable);
	}
	
	/**
	 * description anjutudistricttable 修改
	 * 2014-8-19 10:18:38
	 * @author jiwurapid
	 */
	public AnjutuDistricttable update(AnjutuDistricttable anjutudistricttable){
		return anjutudistricttableManager.update(anjutudistricttable);
	}
	
	/**
	 * description anjutudistricttable 删除
	 * 2014-8-19 10:18:38
	 * @author jiwurapid
	 */
	public void delete(int id){
		AnjutuDistricttable anjutudistricttable = anjutudistricttableManager.findById(id);
		anjutudistricttableManager.delete(anjutudistricttable);
	}
	
	/**
	 * description 查找 anjutudistricttable 列表
	 * 2014-8-19 10:18:38
	 * @author jiwurapid
	 */
	public List<AnjutuDistricttable> getAnjutuDistricttablelist(int page, int size){
		HashMap<String, Object> params_anjutudistricttable = new HashMap<String, Object>();
		params_anjutudistricttable.put("index", (page-1)*size);
		params_anjutudistricttable.put("size", size);
		return anjutudistricttableManager.getAnjutuDistricttableList(params_anjutudistricttable);
	}

}
