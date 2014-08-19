/**
 * description anjutuusers 业务处理
 * 2014-8-19 10:19:34
 * @author jiwurapid
 */

package com.jiwu.anjutu.service;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jiwu.anjutu.entity.AnjutuUsers;

@Component
public class AnjutuUsersService {
	
	@Resource
	private IAnjutuUsersManager anjutuusersManager;
	
	/**
	 * description anjutuusers 查找
	 * 2014-8-19 10:19:34
	 * @author jiwurapid
	 */
	public AnjutuUsers findById(int id){
		return anjutuusersManager.findById(id);
	}
	
	/**
	 * description anjutuusers 添加
	 * 2014-8-19 10:19:34
	 * @author jiwurapid
	 */
	public void add(AnjutuUsers anjutuusers){
		anjutuusersManager.save(anjutuusers);
	}
	
	/**
	 * description anjutuusers 修改
	 * 2014-8-19 10:19:34
	 * @author jiwurapid
	 */
	public AnjutuUsers update(AnjutuUsers anjutuusers){
		return anjutuusersManager.update(anjutuusers);
	}
	
	/**
	 * description anjutuusers 删除
	 * 2014-8-19 10:19:34
	 * @author jiwurapid
	 */
	public void delete(int id){
		AnjutuUsers anjutuusers = anjutuusersManager.findById(id);
		anjutuusersManager.delete(anjutuusers);
	}
	
	/**
	 * description 查找 anjutuusers 列表
	 * 2014-8-19 10:19:34
	 * @author jiwurapid
	 */
	public List<AnjutuUsers> getAnjutuUserslist(int page, int size){
		HashMap<String, Object> params_anjutuusers = new HashMap<String, Object>();
		params_anjutuusers.put("index", (page-1)*size);
		params_anjutuusers.put("size", size);
		return anjutuusersManager.getAnjutuUsersList(params_anjutuusers);
	}

}
