/**
 * description anjutuareaconfig 业务处理
 * 2014-8-19 10:17:43
 * @author jiwurapid
 */

package com.jiwu.anjutu.service;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jiwu.anjutu.entity.AnjutuAreaconfig;

@Component
public class AnjutuAreaconfigService {
	
	@Resource
	private IAnjutuAreaconfigManager anjutuareaconfigManager;
	
	/**
	 * description anjutuareaconfig 查找
	 * 2014-8-19 10:17:43
	 * @author jiwurapid
	 */
	public AnjutuAreaconfig findById(int id){
		return anjutuareaconfigManager.findById(id);
	}
	
	/**
	 * description anjutuareaconfig 添加
	 * 2014-8-19 10:17:43
	 * @author jiwurapid
	 */
	public void add(AnjutuAreaconfig anjutuareaconfig){
		anjutuareaconfigManager.save(anjutuareaconfig);
	}
	
	/**
	 * description anjutuareaconfig 修改
	 * 2014-8-19 10:17:43
	 * @author jiwurapid
	 */
	public AnjutuAreaconfig update(AnjutuAreaconfig anjutuareaconfig){
		return anjutuareaconfigManager.update(anjutuareaconfig);
	}
	
	/**
	 * description anjutuareaconfig 删除
	 * 2014-8-19 10:17:43
	 * @author jiwurapid
	 */
	public void delete(int id){
		AnjutuAreaconfig anjutuareaconfig = anjutuareaconfigManager.findById(id);
		anjutuareaconfigManager.delete(anjutuareaconfig);
	}
	
	/**
	 * description 查找 anjutuareaconfig 列表
	 * 2014-8-19 10:17:43
	 * @author jiwurapid
	 */
	public List<AnjutuAreaconfig> getAnjutuAreaconfiglist(int page, int size){
		HashMap<String, Object> params_anjutuareaconfig = new HashMap<String, Object>();
		params_anjutuareaconfig.put("index", (page-1)*size);
		params_anjutuareaconfig.put("size", size);
		return anjutuareaconfigManager.getAnjutuAreaconfigList(params_anjutuareaconfig);
	}

}
