/**
 * description anjutuesfhouselog 业务处理
 * 2014-8-19 10:18:50
 * @author jiwurapid
 */

package com.jiwu.anjutu.service;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jiwu.anjutu.entity.AnjutuEsfhouselog;

@Component
public class AnjutuEsfhouselogService {
	
	@Resource
	private IAnjutuEsfhouselogManager anjutuesfhouselogManager;
	
	/**
	 * description anjutuesfhouselog 查找
	 * 2014-8-19 10:18:50
	 * @author jiwurapid
	 */
	public AnjutuEsfhouselog findById(int id){
		return anjutuesfhouselogManager.findById(id);
	}
	
	/**
	 * description anjutuesfhouselog 添加
	 * 2014-8-19 10:18:50
	 * @author jiwurapid
	 */
	public void add(AnjutuEsfhouselog anjutuesfhouselog){
		anjutuesfhouselogManager.save(anjutuesfhouselog);
	}
	
	/**
	 * description anjutuesfhouselog 修改
	 * 2014-8-19 10:18:50
	 * @author jiwurapid
	 */
	public AnjutuEsfhouselog update(AnjutuEsfhouselog anjutuesfhouselog){
		return anjutuesfhouselogManager.update(anjutuesfhouselog);
	}
	
	/**
	 * description anjutuesfhouselog 删除
	 * 2014-8-19 10:18:50
	 * @author jiwurapid
	 */
	public void delete(int id){
		AnjutuEsfhouselog anjutuesfhouselog = anjutuesfhouselogManager.findById(id);
		anjutuesfhouselogManager.delete(anjutuesfhouselog);
	}
	
	/**
	 * description 查找 anjutuesfhouselog 列表
	 * 2014-8-19 10:18:50
	 * @author jiwurapid
	 */
	public List<AnjutuEsfhouselog> getAnjutuEsfhouseloglist(int page, int size){
		HashMap<String, Object> params_anjutuesfhouselog = new HashMap<String, Object>();
		params_anjutuesfhouselog.put("index", (page-1)*size);
		params_anjutuesfhouselog.put("size", size);
		return anjutuesfhouselogManager.getAnjutuEsfhouselogList(params_anjutuesfhouselog);
	}

}
