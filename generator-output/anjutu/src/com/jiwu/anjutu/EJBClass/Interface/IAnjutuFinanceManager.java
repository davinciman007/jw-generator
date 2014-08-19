package com.jiwu.anjutu.service;

import java.util.HashMap;
import java.util.List;
import com.jilaidai.entity.AnjutuFinance;
/**
 * description anjutufinance EJB Interface
 * 2014-8-19 10:18:56
 * @author jiwurapid
 */
public interface IAnjutuFinanceManager {
	
	public AnjutuFinance save(AnjutuFinance entity);
	
	public void delete(AnjutuFinance entity);
	
	public AnjutuFinance update(AnjutuFinance entity);

	public AnjutuFinance findById(int id);
	
	public List<AnjutuFinance> findAll();
	
	public List<AnjutuFinance> getAnjutuFinanceList(HashMap<String, Object> params);
	
	public int countAnjutuFinance(HashMap<String, Object> params);
}