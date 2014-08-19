package com.jiwu.anjutu.service;

import java.util.HashMap;
import java.util.List;
import com.jilaidai.entity.AnjutuBuild;
/**
 * description anjutubuild EJB Interface
 * 2014-8-19 10:17:49
 * @author jiwurapid
 */
public interface IAnjutuBuildManager {
	
	public AnjutuBuild save(AnjutuBuild entity);
	
	public void delete(AnjutuBuild entity);
	
	public AnjutuBuild update(AnjutuBuild entity);

	public AnjutuBuild findById(int id);
	
	public List<AnjutuBuild> findAll();
	
	public List<AnjutuBuild> getAnjutuBuildList(HashMap<String, Object> params);
	
	public int countAnjutuBuild(HashMap<String, Object> params);
}