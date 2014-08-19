/**
 * description anjutucusmentdetail 业务处理
 * 2014-8-19 10:18:24
 * @author jiwurapid
 */

package com.jiwu.anjutu.service;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jiwu.anjutu.entity.AnjutuCusmentdetail;

@Component
public class AnjutuCusmentdetailService {
	
	@Resource
	private IAnjutuCusmentdetailManager anjutucusmentdetailManager;
	
	/**
	 * description anjutucusmentdetail 查找
	 * 2014-8-19 10:18:24
	 * @author jiwurapid
	 */
	public AnjutuCusmentdetail findById(int id){
		return anjutucusmentdetailManager.findById(id);
	}
	
	/**
	 * description anjutucusmentdetail 添加
	 * 2014-8-19 10:18:24
	 * @author jiwurapid
	 */
	public void add(AnjutuCusmentdetail anjutucusmentdetail){
		anjutucusmentdetailManager.save(anjutucusmentdetail);
	}
	
	/**
	 * description anjutucusmentdetail 修改
	 * 2014-8-19 10:18:24
	 * @author jiwurapid
	 */
	public AnjutuCusmentdetail update(AnjutuCusmentdetail anjutucusmentdetail){
		return anjutucusmentdetailManager.update(anjutucusmentdetail);
	}
	
	/**
	 * description anjutucusmentdetail 删除
	 * 2014-8-19 10:18:24
	 * @author jiwurapid
	 */
	public void delete(int id){
		AnjutuCusmentdetail anjutucusmentdetail = anjutucusmentdetailManager.findById(id);
		anjutucusmentdetailManager.delete(anjutucusmentdetail);
	}
	
	/**
	 * description 查找 anjutucusmentdetail 列表
	 * 2014-8-19 10:18:24
	 * @author jiwurapid
	 */
	public List<AnjutuCusmentdetail> getAnjutuCusmentdetaillist(int page, int size){
		HashMap<String, Object> params_anjutucusmentdetail = new HashMap<String, Object>();
		params_anjutucusmentdetail.put("index", (page-1)*size);
		params_anjutucusmentdetail.put("size", size);
		return anjutucusmentdetailManager.getAnjutuCusmentdetailList(params_anjutucusmentdetail);
	}

}
