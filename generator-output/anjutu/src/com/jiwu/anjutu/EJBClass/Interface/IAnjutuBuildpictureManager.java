package com.jiwu.anjutu.service;

import java.util.HashMap;
import java.util.List;
import com.jilaidai.entity.AnjutuBuildpicture;
/**
 * description anjutubuildpicture EJB Interface
 * 2014-8-19 10:17:57
 * @author jiwurapid
 */
public interface IAnjutuBuildpictureManager {
	
	public AnjutuBuildpicture save(AnjutuBuildpicture entity);
	
	public void delete(AnjutuBuildpicture entity);
	
	public AnjutuBuildpicture update(AnjutuBuildpicture entity);

	public AnjutuBuildpicture findById(int id);
	
	public List<AnjutuBuildpicture> findAll();
	
	public List<AnjutuBuildpicture> getAnjutuBuildpictureList(HashMap<String, Object> params);
	
	public int countAnjutuBuildpicture(HashMap<String, Object> params);
}