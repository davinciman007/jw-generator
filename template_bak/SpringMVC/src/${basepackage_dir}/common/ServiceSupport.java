package com.ghome.smart.common;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.sourceframework.service.SourceServiceSupport;

public class ServiceSupport extends SourceServiceSupport {

	
	public Object insertGet(String insertName, Object v){
		try {
			return this.ibatisDao.getSqlMapClient().insert(insertName, v);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public  boolean authCheck(int roleId,String url){
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("roleId", roleId);
		map.put("url", url);
		int flag = this.get("getIsExistSysUserPerm",map);
		if(flag==1){
			return true;
		}else{
			return false;
		}
	}
	
	
	

}
