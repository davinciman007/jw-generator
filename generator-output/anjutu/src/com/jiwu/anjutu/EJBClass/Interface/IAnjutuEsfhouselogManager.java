package com.jiwu.anjutu.service;

import java.util.HashMap;
import java.util.List;
import com.jilaidai.entity.AnjutuEsfhouselog;
/**
 * description anjutuesfhouselog EJB Interface
 * 2014-8-19 10:18:50
 * @author jiwurapid
 */
public interface IAnjutuEsfhouselogManager {
	
	public AnjutuEsfhouselog save(AnjutuEsfhouselog entity);
	
	public void delete(AnjutuEsfhouselog entity);
	
	public AnjutuEsfhouselog update(AnjutuEsfhouselog entity);

	public AnjutuEsfhouselog findById(int id);
	
	public List<AnjutuEsfhouselog> findAll();
	
	public List<AnjutuEsfhouselog> getAnjutuEsfhouselogList(HashMap<String, Object> params);
	
	public int countAnjutuEsfhouselog(HashMap<String, Object> params);
}