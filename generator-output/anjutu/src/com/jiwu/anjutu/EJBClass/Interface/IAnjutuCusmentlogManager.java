package com.jiwu.anjutu.service;

import java.util.HashMap;
import java.util.List;
import com.jilaidai.entity.AnjutuCusmentlog;
/**
 * description anjutucusmentlog EJB Interface
 * 2014-8-19 10:18:31
 * @author jiwurapid
 */
public interface IAnjutuCusmentlogManager {
	
	public AnjutuCusmentlog save(AnjutuCusmentlog entity);
	
	public void delete(AnjutuCusmentlog entity);
	
	public AnjutuCusmentlog update(AnjutuCusmentlog entity);

	public AnjutuCusmentlog findById(int id);
	
	public List<AnjutuCusmentlog> findAll();
	
	public List<AnjutuCusmentlog> getAnjutuCusmentlogList(HashMap<String, Object> params);
	
	public int countAnjutuCusmentlog(HashMap<String, Object> params);
}