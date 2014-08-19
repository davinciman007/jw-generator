/**
 * description anjutufinance 业务处理
 * 2014-8-19 10:18:56
 * @author jiwurapid
 */

package com.jiwu.anjutu.service;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jiwu.anjutu.entity.AnjutuFinance;

@Component
public class AnjutuFinanceService {
	
	@Resource
	private IAnjutuFinanceManager anjutufinanceManager;
	
	/**
	 * description anjutufinance 查找
	 * 2014-8-19 10:18:56
	 * @author jiwurapid
	 */
	public AnjutuFinance findById(int id){
		return anjutufinanceManager.findById(id);
	}
	
	/**
	 * description anjutufinance 添加
	 * 2014-8-19 10:18:56
	 * @author jiwurapid
	 */
	public void add(AnjutuFinance anjutufinance){
		anjutufinanceManager.save(anjutufinance);
	}
	
	/**
	 * description anjutufinance 修改
	 * 2014-8-19 10:18:56
	 * @author jiwurapid
	 */
	public AnjutuFinance update(AnjutuFinance anjutufinance){
		return anjutufinanceManager.update(anjutufinance);
	}
	
	/**
	 * description anjutufinance 删除
	 * 2014-8-19 10:18:56
	 * @author jiwurapid
	 */
	public void delete(int id){
		AnjutuFinance anjutufinance = anjutufinanceManager.findById(id);
		anjutufinanceManager.delete(anjutufinance);
	}
	
	/**
	 * description 查找 anjutufinance 列表
	 * 2014-8-19 10:18:56
	 * @author jiwurapid
	 */
	public List<AnjutuFinance> getAnjutuFinancelist(int page, int size){
		HashMap<String, Object> params_anjutufinance = new HashMap<String, Object>();
		params_anjutufinance.put("index", (page-1)*size);
		params_anjutufinance.put("size", size);
		return anjutufinanceManager.getAnjutuFinanceList(params_anjutufinance);
	}

}
