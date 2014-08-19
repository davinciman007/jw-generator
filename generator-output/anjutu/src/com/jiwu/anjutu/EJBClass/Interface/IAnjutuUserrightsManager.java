package com.jiwu.anjutu.service;

import java.util.HashMap;
import java.util.List;
import com.jilaidai.entity.AnjutuUserrights;
/**
 * description anjutuuserrights EJB Interface
 * 2014-8-19 10:19:21
 * @author jiwurapid
 */
public interface IAnjutuUserrightsManager {
	
	public AnjutuUserrights save(AnjutuUserrights entity);
	
	public void delete(AnjutuUserrights entity);
	
	public AnjutuUserrights update(AnjutuUserrights entity);

	public AnjutuUserrights findById(int id);
	
	public List<AnjutuUserrights> findAll();
	
	public List<AnjutuUserrights> getAnjutuUserrightsList(HashMap<String, Object> params);
	
	public int countAnjutuUserrights(HashMap<String, Object> params);
}