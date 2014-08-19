/**
 * description anjutuuserrole 业务处理
 * 2014-8-19 10:19:27
 * @author jiwurapid
 */

package com.jiwu.anjutu.service;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jiwu.anjutu.entity.AnjutuUserrole;

@Component
public class AnjutuUserroleService {
	
	@Resource
	private IAnjutuUserroleManager anjutuuserroleManager;
	
	/**
	 * description anjutuuserrole 查找
	 * 2014-8-19 10:19:27
	 * @author jiwurapid
	 */
	public AnjutuUserrole findById(int id){
		return anjutuuserroleManager.findById(id);
	}
	
	/**
	 * description anjutuuserrole 添加
	 * 2014-8-19 10:19:27
	 * @author jiwurapid
	 */
	public void add(AnjutuUserrole anjutuuserrole){
		anjutuuserroleManager.save(anjutuuserrole);
	}
	
	/**
	 * description anjutuuserrole 修改
	 * 2014-8-19 10:19:27
	 * @author jiwurapid
	 */
	public AnjutuUserrole update(AnjutuUserrole anjutuuserrole){
		return anjutuuserroleManager.update(anjutuuserrole);
	}
	
	/**
	 * description anjutuuserrole 删除
	 * 2014-8-19 10:19:27
	 * @author jiwurapid
	 */
	public void delete(int id){
		AnjutuUserrole anjutuuserrole = anjutuuserroleManager.findById(id);
		anjutuuserroleManager.delete(anjutuuserrole);
	}
	
	/**
	 * description 查找 anjutuuserrole 列表
	 * 2014-8-19 10:19:27
	 * @author jiwurapid
	 */
	public List<AnjutuUserrole> getAnjutuUserrolelist(int page, int size){
		HashMap<String, Object> params_anjutuuserrole = new HashMap<String, Object>();
		params_anjutuuserrole.put("index", (page-1)*size);
		params_anjutuuserrole.put("size", size);
		return anjutuuserroleManager.getAnjutuUserroleList(params_anjutuuserrole);
	}

}
