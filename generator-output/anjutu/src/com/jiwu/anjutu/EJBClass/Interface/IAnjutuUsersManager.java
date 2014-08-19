package com.jiwu.anjutu.service;

import java.util.HashMap;
import java.util.List;
import com.jilaidai.entity.AnjutuUsers;
/**
 * description anjutuusers EJB Interface
 * 2014-8-19 10:19:34
 * @author jiwurapid
 */
public interface IAnjutuUsersManager {
	
	public AnjutuUsers save(AnjutuUsers entity);
	
	public void delete(AnjutuUsers entity);
	
	public AnjutuUsers update(AnjutuUsers entity);

	public AnjutuUsers findById(int id);
	
	public List<AnjutuUsers> findAll();
	
	public List<AnjutuUsers> getAnjutuUsersList(HashMap<String, Object> params);
	
	public int countAnjutuUsers(HashMap<String, Object> params);
}