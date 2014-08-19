/**
 * description anjutuflatconfig 业务处理
 * 2014-8-19 10:19:08
 * @author jiwurapid
 */

package com.jiwu.anjutu.service;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jiwu.anjutu.entity.AnjutuFlatconfig;

@Component
public class AnjutuFlatconfigService {
	
	@Resource
	private IAnjutuFlatconfigManager anjutuflatconfigManager;
	
	/**
	 * description anjutuflatconfig 查找
	 * 2014-8-19 10:19:08
	 * @author jiwurapid
	 */
	public AnjutuFlatconfig findById(int id){
		return anjutuflatconfigManager.findById(id);
	}
	
	/**
	 * description anjutuflatconfig 添加
	 * 2014-8-19 10:19:08
	 * @author jiwurapid
	 */
	public void add(AnjutuFlatconfig anjutuflatconfig){
		anjutuflatconfigManager.save(anjutuflatconfig);
	}
	
	/**
	 * description anjutuflatconfig 修改
	 * 2014-8-19 10:19:08
	 * @author jiwurapid
	 */
	public AnjutuFlatconfig update(AnjutuFlatconfig anjutuflatconfig){
		return anjutuflatconfigManager.update(anjutuflatconfig);
	}
	
	/**
	 * description anjutuflatconfig 删除
	 * 2014-8-19 10:19:08
	 * @author jiwurapid
	 */
	public void delete(int id){
		AnjutuFlatconfig anjutuflatconfig = anjutuflatconfigManager.findById(id);
		anjutuflatconfigManager.delete(anjutuflatconfig);
	}
	
	/**
	 * description 查找 anjutuflatconfig 列表
	 * 2014-8-19 10:19:08
	 * @author jiwurapid
	 */
	public List<AnjutuFlatconfig> getAnjutuFlatconfiglist(int page, int size){
		HashMap<String, Object> params_anjutuflatconfig = new HashMap<String, Object>();
		params_anjutuflatconfig.put("index", (page-1)*size);
		params_anjutuflatconfig.put("size", size);
		return anjutuflatconfigManager.getAnjutuFlatconfigList(params_anjutuflatconfig);
	}

}
