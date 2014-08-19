/**
 * description anjutusinglefinance 业务处理
 * 2014-8-19 10:19:14
 * @author jiwurapid
 */

package com.jiwu.anjutu.service;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jiwu.anjutu.entity.AnjutuSinglefinance;

@Component
public class AnjutuSinglefinanceService {
	
	@Resource
	private IAnjutuSinglefinanceManager anjutusinglefinanceManager;
	
	/**
	 * description anjutusinglefinance 查找
	 * 2014-8-19 10:19:14
	 * @author jiwurapid
	 */
	public AnjutuSinglefinance findById(int id){
		return anjutusinglefinanceManager.findById(id);
	}
	
	/**
	 * description anjutusinglefinance 添加
	 * 2014-8-19 10:19:14
	 * @author jiwurapid
	 */
	public void add(AnjutuSinglefinance anjutusinglefinance){
		anjutusinglefinanceManager.save(anjutusinglefinance);
	}
	
	/**
	 * description anjutusinglefinance 修改
	 * 2014-8-19 10:19:14
	 * @author jiwurapid
	 */
	public AnjutuSinglefinance update(AnjutuSinglefinance anjutusinglefinance){
		return anjutusinglefinanceManager.update(anjutusinglefinance);
	}
	
	/**
	 * description anjutusinglefinance 删除
	 * 2014-8-19 10:19:14
	 * @author jiwurapid
	 */
	public void delete(int id){
		AnjutuSinglefinance anjutusinglefinance = anjutusinglefinanceManager.findById(id);
		anjutusinglefinanceManager.delete(anjutusinglefinance);
	}
	
	/**
	 * description 查找 anjutusinglefinance 列表
	 * 2014-8-19 10:19:14
	 * @author jiwurapid
	 */
	public List<AnjutuSinglefinance> getAnjutuSinglefinancelist(int page, int size){
		HashMap<String, Object> params_anjutusinglefinance = new HashMap<String, Object>();
		params_anjutusinglefinance.put("index", (page-1)*size);
		params_anjutusinglefinance.put("size", size);
		return anjutusinglefinanceManager.getAnjutuSinglefinanceList(params_anjutusinglefinance);
	}

}
