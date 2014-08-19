/**
 * description anjutucusmentlog 业务处理
 * 2014-8-19 10:18:31
 * @author jiwurapid
 */

package com.jiwu.anjutu.service;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jiwu.anjutu.entity.AnjutuCusmentlog;

@Component
public class AnjutuCusmentlogService {
	
	@Resource
	private IAnjutuCusmentlogManager anjutucusmentlogManager;
	
	/**
	 * description anjutucusmentlog 查找
	 * 2014-8-19 10:18:31
	 * @author jiwurapid
	 */
	public AnjutuCusmentlog findById(int id){
		return anjutucusmentlogManager.findById(id);
	}
	
	/**
	 * description anjutucusmentlog 添加
	 * 2014-8-19 10:18:31
	 * @author jiwurapid
	 */
	public void add(AnjutuCusmentlog anjutucusmentlog){
		anjutucusmentlogManager.save(anjutucusmentlog);
	}
	
	/**
	 * description anjutucusmentlog 修改
	 * 2014-8-19 10:18:31
	 * @author jiwurapid
	 */
	public AnjutuCusmentlog update(AnjutuCusmentlog anjutucusmentlog){
		return anjutucusmentlogManager.update(anjutucusmentlog);
	}
	
	/**
	 * description anjutucusmentlog 删除
	 * 2014-8-19 10:18:31
	 * @author jiwurapid
	 */
	public void delete(int id){
		AnjutuCusmentlog anjutucusmentlog = anjutucusmentlogManager.findById(id);
		anjutucusmentlogManager.delete(anjutucusmentlog);
	}
	
	/**
	 * description 查找 anjutucusmentlog 列表
	 * 2014-8-19 10:18:31
	 * @author jiwurapid
	 */
	public List<AnjutuCusmentlog> getAnjutuCusmentloglist(int page, int size){
		HashMap<String, Object> params_anjutucusmentlog = new HashMap<String, Object>();
		params_anjutucusmentlog.put("index", (page-1)*size);
		params_anjutucusmentlog.put("size", size);
		return anjutucusmentlogManager.getAnjutuCusmentlogList(params_anjutucusmentlog);
	}

}
