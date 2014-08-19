package com.jiwu.anjutu.service;

import java.util.HashMap;
import java.util.List;
import com.jilaidai.entity.AnjutuUserrole;
/**
 * description anjutuuserrole EJB Interface
 * 2014-8-19 10:19:27
 * @author jiwurapid
 */
public interface IAnjutuUserroleManager {
	
	public AnjutuUserrole save(AnjutuUserrole entity);
	
	public void delete(AnjutuUserrole entity);
	
	public AnjutuUserrole update(AnjutuUserrole entity);

	public AnjutuUserrole findById(int id);
	
	public List<AnjutuUserrole> findAll();
	
	public List<AnjutuUserrole> getAnjutuUserroleList(HashMap<String, Object> params);
	
	public int countAnjutuUserrole(HashMap<String, Object> params);
}