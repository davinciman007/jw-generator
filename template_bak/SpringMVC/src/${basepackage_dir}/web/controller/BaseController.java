package ${basepackage}.web.controller;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ${basepackage}.common.ServiceSupport;

import ${basepackage}.util.Constants;
import com.sourceframework.service.SourceServiceSupport;



@Controller
public class BaseController {
	
	@Autowired
	protected SourceServiceSupport service;
	
	@Autowired
	protected ServiceSupport serviceStrong;
	
	protected String buildToolBar(HttpServletRequest request,String[] urls){
		/*SysUser u = (SysUser)request.getSession().getAttribute(Constants.SYSUSER_INFO_SESSION);		
		StringBuffer bf = new StringBuffer();
		for(int i = 0 ;i< urls.length; i ++){
			boolean flag = serviceStrong.authCheck(u.getRoleId(), urls[i]);
			if(flag){
				if(bf.length()>0){
					bf.append(","+Constants.TOOL_BAR[i]);
				}else{
					bf.append(Constants.TOOL_BAR[i]);
				}
			}
		}
		return "["+bf.toString()+"]";*/
		return null;
	}
	
	
}
