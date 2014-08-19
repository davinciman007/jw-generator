package com.jiwu.anjutu.service;

import java.util.HashMap;
import java.util.List;
import com.jilaidai.entity.AnjutuCusmentdetail;
/**
 * description anjutucusmentdetail EJB Interface
 * 2014-8-19 10:18:24
 * @author jiwurapid
 */
public interface IAnjutuCusmentdetailManager {
	
	public AnjutuCusmentdetail save(AnjutuCusmentdetail entity);
	
	public void delete(AnjutuCusmentdetail entity);
	
	public AnjutuCusmentdetail update(AnjutuCusmentdetail entity);

	public AnjutuCusmentdetail findById(int id);
	
	public List<AnjutuCusmentdetail> findAll();
	
	public List<AnjutuCusmentdetail> getAnjutuCusmentdetailList(HashMap<String, Object> params);
	
	public int countAnjutuCusmentdetail(HashMap<String, Object> params);
}