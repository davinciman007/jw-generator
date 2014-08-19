/**
 * description anjutubuildpicture 业务处理
 * 2014-8-19 10:17:57
 * @author jiwurapid
 */

package com.jiwu.anjutu.service;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.jiwu.anjutu.entity.AnjutuBuildpicture;

@Component
public class AnjutuBuildpictureService {
	
	@Resource
	private IAnjutuBuildpictureManager anjutubuildpictureManager;
	
	/**
	 * description anjutubuildpicture 查找
	 * 2014-8-19 10:17:57
	 * @author jiwurapid
	 */
	public AnjutuBuildpicture findById(int id){
		return anjutubuildpictureManager.findById(id);
	}
	
	/**
	 * description anjutubuildpicture 添加
	 * 2014-8-19 10:17:57
	 * @author jiwurapid
	 */
	public void add(AnjutuBuildpicture anjutubuildpicture){
		anjutubuildpictureManager.save(anjutubuildpicture);
	}
	
	/**
	 * description anjutubuildpicture 修改
	 * 2014-8-19 10:17:57
	 * @author jiwurapid
	 */
	public AnjutuBuildpicture update(AnjutuBuildpicture anjutubuildpicture){
		return anjutubuildpictureManager.update(anjutubuildpicture);
	}
	
	/**
	 * description anjutubuildpicture 删除
	 * 2014-8-19 10:17:57
	 * @author jiwurapid
	 */
	public void delete(int id){
		AnjutuBuildpicture anjutubuildpicture = anjutubuildpictureManager.findById(id);
		anjutubuildpictureManager.delete(anjutubuildpicture);
	}
	
	/**
	 * description 查找 anjutubuildpicture 列表
	 * 2014-8-19 10:17:57
	 * @author jiwurapid
	 */
	public List<AnjutuBuildpicture> getAnjutuBuildpicturelist(int page, int size){
		HashMap<String, Object> params_anjutubuildpicture = new HashMap<String, Object>();
		params_anjutubuildpicture.put("index", (page-1)*size);
		params_anjutubuildpicture.put("size", size);
		return anjutubuildpictureManager.getAnjutuBuildpictureList(params_anjutubuildpicture);
	}

}
