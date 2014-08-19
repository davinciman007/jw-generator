package com.jiwu.anjutu.service;

import java.util.HashMap;
import java.util.List;
import com.jilaidai.entity.AnjutuDistricttable;
/**
 * description anjutudistricttable EJB Interface
 * 2014-8-19 10:18:38
 * @author jiwurapid
 */
public interface IAnjutuDistricttableManager {
	
	public AnjutuDistricttable save(AnjutuDistricttable entity);
	
	public void delete(AnjutuDistricttable entity);
	
	public AnjutuDistricttable update(AnjutuDistricttable entity);

	public AnjutuDistricttable findById(int id);
	
	public List<AnjutuDistricttable> findAll();
	
	public List<AnjutuDistricttable> getAnjutuDistricttableList(HashMap<String, Object> params);
	
	public int countAnjutuDistricttable(HashMap<String, Object> params);
}