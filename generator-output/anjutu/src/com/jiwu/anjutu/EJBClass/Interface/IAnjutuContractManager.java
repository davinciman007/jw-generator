package com.jiwu.anjutu.service;

import java.util.HashMap;
import java.util.List;
import com.jilaidai.entity.AnjutuContract;
/**
 * description anjutucontract EJB Interface
 * 2014-8-19 10:18:03
 * @author jiwurapid
 */
public interface IAnjutuContractManager {
	
	public AnjutuContract save(AnjutuContract entity);
	
	public void delete(AnjutuContract entity);
	
	public AnjutuContract update(AnjutuContract entity);

	public AnjutuContract findById(int id);
	
	public List<AnjutuContract> findAll();
	
	public List<AnjutuContract> getAnjutuContractList(HashMap<String, Object> params);
	
	public int countAnjutuContract(HashMap<String, Object> params);
}