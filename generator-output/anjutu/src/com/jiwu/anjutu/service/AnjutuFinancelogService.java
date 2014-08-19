/**
 * description anjutufinancelog 业务处理
 * 2014-8-19 10:19:02
 * @author jiwurapid
 */

package com.jiwu.anjutu.service;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jiwu.anjutu.entity.AnjutuFinancelog;

@Component
public class AnjutuFinancelogService {
	
	@Resource
	private IAnjutuFinancelogManager anjutufinancelogManager;
	
	/**
	 * description anjutufinancelog 查找
	 * 2014-8-19 10:19:02
	 * @author jiwurapid
	 */
	public AnjutuFinancelog findById(int id){
		return anjutufinancelogManager.findById(id);
	}
	
	/**
	 * description anjutufinancelog 添加
	 * 2014-8-19 10:19:02
	 * @author jiwurapid
	 */
	public void add(AnjutuFinancelog anjutufinancelog){
		anjutufinancelogManager.save(anjutufinancelog);
	}
	
	/**
	 * description anjutufinancelog 修改
	 * 2014-8-19 10:19:02
	 * @author jiwurapid
	 */
	public AnjutuFinancelog update(AnjutuFinancelog anjutufinancelog){
		return anjutufinancelogManager.update(anjutufinancelog);
	}
	
	/**
	 * description anjutufinancelog 删除
	 * 2014-8-19 10:19:02
	 * @author jiwurapid
	 */
	public void delete(int id){
		AnjutuFinancelog anjutufinancelog = anjutufinancelogManager.findById(id);
		anjutufinancelogManager.delete(anjutufinancelog);
	}
	
	/**
	 * description 查找 anjutufinancelog 列表
	 * 2014-8-19 10:19:02
	 * @author jiwurapid
	 */
	public List<AnjutuFinancelog> getAnjutuFinanceloglist(int page, int size){
		HashMap<String, Object> params_anjutufinancelog = new HashMap<String, Object>();
		params_anjutufinancelog.put("index", (page-1)*size);
		params_anjutufinancelog.put("size", size);
		return anjutufinancelogManager.getAnjutuFinancelogList(params_anjutufinancelog);
	}

}
