/**
 * description anjutucontract 业务处理
 * 2014-8-19 10:18:03
 * @author jiwurapid
 */

package com.jiwu.anjutu.service;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jiwu.anjutu.entity.AnjutuContract;

@Component
public class AnjutuContractService {
	
	@Resource
	private IAnjutuContractManager anjutucontractManager;
	
	/**
	 * description anjutucontract 查找
	 * 2014-8-19 10:18:03
	 * @author jiwurapid
	 */
	public AnjutuContract findById(int id){
		return anjutucontractManager.findById(id);
	}
	
	/**
	 * description anjutucontract 添加
	 * 2014-8-19 10:18:03
	 * @author jiwurapid
	 */
	public void add(AnjutuContract anjutucontract){
		anjutucontractManager.save(anjutucontract);
	}
	
	/**
	 * description anjutucontract 修改
	 * 2014-8-19 10:18:03
	 * @author jiwurapid
	 */
	public AnjutuContract update(AnjutuContract anjutucontract){
		return anjutucontractManager.update(anjutucontract);
	}
	
	/**
	 * description anjutucontract 删除
	 * 2014-8-19 10:18:03
	 * @author jiwurapid
	 */
	public void delete(int id){
		AnjutuContract anjutucontract = anjutucontractManager.findById(id);
		anjutucontractManager.delete(anjutucontract);
	}
	
	/**
	 * description 查找 anjutucontract 列表
	 * 2014-8-19 10:18:03
	 * @author jiwurapid
	 */
	public List<AnjutuContract> getAnjutuContractlist(int page, int size){
		HashMap<String, Object> params_anjutucontract = new HashMap<String, Object>();
		params_anjutucontract.put("index", (page-1)*size);
		params_anjutucontract.put("size", size);
		return anjutucontractManager.getAnjutuContractList(params_anjutucontract);
	}

}
