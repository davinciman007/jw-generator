package com.jiwu.anjutu.service;

import java.util.HashMap;
import java.util.List;
import com.jilaidai.entity.AnjutuFlatconfig;
/**
 * description anjutuflatconfig EJB Interface
 * 2014-8-19 10:19:08
 * @author jiwurapid
 */
public interface IAnjutuFlatconfigManager {
	
	public AnjutuFlatconfig save(AnjutuFlatconfig entity);
	
	public void delete(AnjutuFlatconfig entity);
	
	public AnjutuFlatconfig update(AnjutuFlatconfig entity);

	public AnjutuFlatconfig findById(int id);
	
	public List<AnjutuFlatconfig> findAll();
	
	public List<AnjutuFlatconfig> getAnjutuFlatconfigList(HashMap<String, Object> params);
	
	public int countAnjutuFlatconfig(HashMap<String, Object> params);
}