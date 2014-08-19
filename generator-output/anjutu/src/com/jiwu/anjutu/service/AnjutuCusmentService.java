/**
 * description anjutucusment 业务处理
 * 2014-8-19 10:18:17
 * @author jiwurapid
 */

package com.jiwu.anjutu.service;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jiwu.anjutu.entity.AnjutuCusment;

@Component
public class AnjutuCusmentService {
	
	@Resource
	private IAnjutuCusmentManager anjutucusmentManager;
	
	/**
	 * description anjutucusment 查找
	 * 2014-8-19 10:18:17
	 * @author jiwurapid
	 */
	public AnjutuCusment findById(int id){
		return anjutucusmentManager.findById(id);
	}
	
	/**
	 * description anjutucusment 添加
	 * 2014-8-19 10:18:17
	 * @author jiwurapid
	 */
	public void add(AnjutuCusment anjutucusment){
		anjutucusmentManager.save(anjutucusment);
	}
	
	/**
	 * description anjutucusment 修改
	 * 2014-8-19 10:18:17
	 * @author jiwurapid
	 */
	public AnjutuCusment update(AnjutuCusment anjutucusment){
		return anjutucusmentManager.update(anjutucusment);
	}
	
	/**
	 * description anjutucusment 删除
	 * 2014-8-19 10:18:17
	 * @author jiwurapid
	 */
	public void delete(int id){
		AnjutuCusment anjutucusment = anjutucusmentManager.findById(id);
		anjutucusmentManager.delete(anjutucusment);
	}
	
	/**
	 * description 查找 anjutucusment 列表
	 * 2014-8-19 10:18:17
	 * @author jiwurapid
	 */
	public List<AnjutuCusment> getAnjutuCusmentlist(int page, int size){
		HashMap<String, Object> params_anjutucusment = new HashMap<String, Object>();
		params_anjutucusment.put("index", (page-1)*size);
		params_anjutucusment.put("size", size);
		return anjutucusmentManager.getAnjutuCusmentList(params_anjutucusment);
	}

}
