package com.jiwu.anjutu.service;

import java.util.HashMap;
import java.util.List;
import com.jilaidai.entity.AnjutuSinglefinance;
/**
 * description anjutusinglefinance EJB Interface
 * 2014-8-19 10:19:14
 * @author jiwurapid
 */
public interface IAnjutuSinglefinanceManager {
	
	public AnjutuSinglefinance save(AnjutuSinglefinance entity);
	
	public void delete(AnjutuSinglefinance entity);
	
	public AnjutuSinglefinance update(AnjutuSinglefinance entity);

	public AnjutuSinglefinance findById(int id);
	
	public List<AnjutuSinglefinance> findAll();
	
	public List<AnjutuSinglefinance> getAnjutuSinglefinanceList(HashMap<String, Object> params);
	
	public int countAnjutuSinglefinance(HashMap<String, Object> params);
}