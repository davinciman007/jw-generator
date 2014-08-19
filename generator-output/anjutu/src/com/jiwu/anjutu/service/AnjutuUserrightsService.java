/**
 * description anjutuuserrights 业务处理
 * 2014-8-19 10:19:21
 * @author jiwurapid
 */

package com.jiwu.anjutu.service;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jiwu.anjutu.entity.AnjutuUserrights;

@Component
public class AnjutuUserrightsService {
	
	@Resource
	private IAnjutuUserrightsManager anjutuuserrightsManager;
	
	/**
	 * description anjutuuserrights 查找
	 * 2014-8-19 10:19:21
	 * @author jiwurapid
	 */
	public AnjutuUserrights findById(int id){
		return anjutuuserrightsManager.findById(id);
	}
	
	/**
	 * description anjutuuserrights 添加
	 * 2014-8-19 10:19:21
	 * @author jiwurapid
	 */
	public void add(AnjutuUserrights anjutuuserrights){
		anjutuuserrightsManager.save(anjutuuserrights);
	}
	
	/**
	 * description anjutuuserrights 修改
	 * 2014-8-19 10:19:21
	 * @author jiwurapid
	 */
	public AnjutuUserrights update(AnjutuUserrights anjutuuserrights){
		return anjutuuserrightsManager.update(anjutuuserrights);
	}
	
	/**
	 * description anjutuuserrights 删除
	 * 2014-8-19 10:19:21
	 * @author jiwurapid
	 */
	public void delete(int id){
		AnjutuUserrights anjutuuserrights = anjutuuserrightsManager.findById(id);
		anjutuuserrightsManager.delete(anjutuuserrights);
	}
	
	/**
	 * description 查找 anjutuuserrights 列表
	 * 2014-8-19 10:19:21
	 * @author jiwurapid
	 */
	public List<AnjutuUserrights> getAnjutuUserrightslist(int page, int size){
		HashMap<String, Object> params_anjutuuserrights = new HashMap<String, Object>();
		params_anjutuuserrights.put("index", (page-1)*size);
		params_anjutuuserrights.put("size", size);
		return anjutuuserrightsManager.getAnjutuUserrightsList(params_anjutuuserrights);
	}

}
