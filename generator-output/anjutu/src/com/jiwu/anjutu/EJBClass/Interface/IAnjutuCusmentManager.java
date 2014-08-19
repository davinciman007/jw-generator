package com.jiwu.anjutu.service;

import java.util.HashMap;
import java.util.List;
import com.jilaidai.entity.AnjutuCusment;
/**
 * description anjutucusment EJB Interface
 * 2014-8-19 10:18:17
 * @author jiwurapid
 */
public interface IAnjutuCusmentManager {
	
	public AnjutuCusment save(AnjutuCusment entity);
	
	public void delete(AnjutuCusment entity);
	
	public AnjutuCusment update(AnjutuCusment entity);

	public AnjutuCusment findById(int id);
	
	public List<AnjutuCusment> findAll();
	
	public List<AnjutuCusment> getAnjutuCusmentList(HashMap<String, Object> params);
	
	public int countAnjutuCusment(HashMap<String, Object> params);
}