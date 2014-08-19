package com.jiwu.anjutu.service;

import java.util.HashMap;
import java.util.List;
import com.jilaidai.entity.AnjutuFinancelog;
/**
 * description anjutufinancelog EJB Interface
 * 2014-8-19 10:19:02
 * @author jiwurapid
 */
public interface IAnjutuFinancelogManager {
	
	public AnjutuFinancelog save(AnjutuFinancelog entity);
	
	public void delete(AnjutuFinancelog entity);
	
	public AnjutuFinancelog update(AnjutuFinancelog entity);

	public AnjutuFinancelog findById(int id);
	
	public List<AnjutuFinancelog> findAll();
	
	public List<AnjutuFinancelog> getAnjutuFinancelogList(HashMap<String, Object> params);
	
	public int countAnjutuFinancelog(HashMap<String, Object> params);
}