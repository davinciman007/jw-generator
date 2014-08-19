/**
 * description anjutubuild 业务处理
 * 2014-8-19 10:17:49
 * @author jiwurapid
 */

package com.jiwu.anjutu.service;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jiwu.anjutu.entity.AnjutuBuild;

@Component
public class AnjutuBuildService {
	
	@Resource
	private IAnjutuBuildManager anjutubuildManager;
	
	/**
	 * description anjutubuild 查找
	 * 2014-8-19 10:17:49
	 * @author jiwurapid
	 */
	public AnjutuBuild findById(int id){
		return anjutubuildManager.findById(id);
	}
	
	/**
	 * description anjutubuild 添加
	 * 2014-8-19 10:17:49
	 * @author jiwurapid
	 */
	public void add(AnjutuBuild anjutubuild){
		anjutubuildManager.save(anjutubuild);
	}
	
	/**
	 * description anjutubuild 修改
	 * 2014-8-19 10:17:49
	 * @author jiwurapid
	 */
	public AnjutuBuild update(AnjutuBuild anjutubuild){
		return anjutubuildManager.update(anjutubuild);
	}
	
	/**
	 * description anjutubuild 删除
	 * 2014-8-19 10:17:49
	 * @author jiwurapid
	 */
	public void delete(int id){
		AnjutuBuild anjutubuild = anjutubuildManager.findById(id);
		anjutubuildManager.delete(anjutubuild);
	}
	
	/**
	 * description 查找 anjutubuild 列表
	 * 2014-8-19 10:17:49
	 * @author jiwurapid
	 */
	public List<AnjutuBuild> getAnjutuBuildlist(int page, int size){
		HashMap<String, Object> params_anjutubuild = new HashMap<String, Object>();
		params_anjutubuild.put("index", (page-1)*size);
		params_anjutubuild.put("size", size);
		return anjutubuildManager.getAnjutuBuildList(params_anjutubuild);
	}

}
