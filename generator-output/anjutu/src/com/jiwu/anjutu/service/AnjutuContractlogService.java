/**
 * description anjutucontractlog 业务处理
 * 2014-8-19 10:18:10
 * @author jiwurapid
 */

package com.jiwu.anjutu.service;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jiwu.anjutu.entity.AnjutuContractlog;

@Component
public class AnjutuContractlogService {
	
	@Resource
	private IAnjutuContractlogManager anjutucontractlogManager;
	
	/**
	 * description anjutucontractlog 查找
	 * 2014-8-19 10:18:10
	 * @author jiwurapid
	 */
	public AnjutuContractlog findById(int id){
		return anjutucontractlogManager.findById(id);
	}
	
	/**
	 * description anjutucontractlog 添加
	 * 2014-8-19 10:18:10
	 * @author jiwurapid
	 */
	public void add(AnjutuContractlog anjutucontractlog){
		anjutucontractlogManager.save(anjutucontractlog);
	}
	
	/**
	 * description anjutucontractlog 修改
	 * 2014-8-19 10:18:10
	 * @author jiwurapid
	 */
	public AnjutuContractlog update(AnjutuContractlog anjutucontractlog){
		return anjutucontractlogManager.update(anjutucontractlog);
	}
	
	/**
	 * description anjutucontractlog 删除
	 * 2014-8-19 10:18:10
	 * @author jiwurapid
	 */
	public void delete(int id){
		AnjutuContractlog anjutucontractlog = anjutucontractlogManager.findById(id);
		anjutucontractlogManager.delete(anjutucontractlog);
	}
	
	/**
	 * description 查找 anjutucontractlog 列表
	 * 2014-8-19 10:18:10
	 * @author jiwurapid
	 */
	public List<AnjutuContractlog> getAnjutuContractloglist(int page, int size){
		HashMap<String, Object> params_anjutucontractlog = new HashMap<String, Object>();
		params_anjutucontractlog.put("index", (page-1)*size);
		params_anjutucontractlog.put("size", size);
		return anjutucontractlogManager.getAnjutuContractlogList(params_anjutucontractlog);
	}

}
