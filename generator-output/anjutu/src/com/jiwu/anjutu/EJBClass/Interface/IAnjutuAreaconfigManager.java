package com.jiwu.anjutu.service;

import java.util.HashMap;
import java.util.List;
import com.jilaidai.entity.AnjutuAreaconfig;
/**
 * description anjutuareaconfig EJB Interface
 * 2014-8-19 10:17:43
 * @author jiwurapid
 */
public interface IAnjutuAreaconfigManager {
	
	public AnjutuAreaconfig save(AnjutuAreaconfig entity);
	
	public void delete(AnjutuAreaconfig entity);
	
	public AnjutuAreaconfig update(AnjutuAreaconfig entity);

	public AnjutuAreaconfig findById(int id);
	
	public List<AnjutuAreaconfig> findAll();
	
	public List<AnjutuAreaconfig> getAnjutuAreaconfigList(HashMap<String, Object> params);
	
	public int countAnjutuAreaconfig(HashMap<String, Object> params);
}