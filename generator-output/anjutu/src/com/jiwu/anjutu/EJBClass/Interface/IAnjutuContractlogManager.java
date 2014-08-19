package com.jiwu.anjutu.service;

import java.util.HashMap;
import java.util.List;
import com.jilaidai.entity.AnjutuContractlog;
/**
 * description anjutucontractlog EJB Interface
 * 2014-8-19 10:18:10
 * @author jiwurapid
 */
public interface IAnjutuContractlogManager {
	
	public AnjutuContractlog save(AnjutuContractlog entity);
	
	public void delete(AnjutuContractlog entity);
	
	public AnjutuContractlog update(AnjutuContractlog entity);

	public AnjutuContractlog findById(int id);
	
	public List<AnjutuContractlog> findAll();
	
	public List<AnjutuContractlog> getAnjutuContractlogList(HashMap<String, Object> params);
	
	public int countAnjutuContractlog(HashMap<String, Object> params);
}