package com.jiwu.anjutu.service;

import java.util.HashMap;
import java.util.List;
import com.jilaidai.entity.AnjutuEsfhouse;
/**
 * description anjutuesfhouse EJB Interface
 * 2014-8-19 10:18:44
 * @author jiwurapid
 */
public interface IAnjutuEsfhouseManager {
	
	public AnjutuEsfhouse save(AnjutuEsfhouse entity);
	
	public void delete(AnjutuEsfhouse entity);
	
	public AnjutuEsfhouse update(AnjutuEsfhouse entity);

	public AnjutuEsfhouse findById(int id);
	
	public List<AnjutuEsfhouse> findAll();
	
	public List<AnjutuEsfhouse> getAnjutuEsfhouseList(HashMap<String, Object> params);
	
	public int countAnjutuEsfhouse(HashMap<String, Object> params);
}