package com.ghome.smart.util;

import javax.servlet.http.HttpServletRequest;

public class Constants {
	public final static String  OPERATE_TYPE_ADD = "0";
	public final static String  OPERATE_TYPE_UPDATE = "1";
	public final static String  OPERATE_TYPE_DELETE = "2";
	
	public final static String  RESULT_FAILED = "0";
	public final static String  RESULT_SUCCESS = "1";
	
	public final static String SYSUSER_INFO_SESSION = "SysUserSessionInfo";
	
	public final static String USER_INFO_SESSION = "userSessionInfo";
	
	public final static String UPLOAD_PATH = "UpLoadFiles/template";
	public final static String User_PATH = "UpLoadFiles/user";
	
	private  static String SERVER_PATH = null;
	
	public static void setServerPath(String path){
		if(SERVER_PATH ==null){
			SERVER_PATH = path;
		}
	}
	
	public static String getServerPath(){
		return SERVER_PATH;
	}
	
	
	public final static String[] PUBLIC_URL = {"/sys/login",
		"/sys/loginPut","/sys","/register",
		"/registerPut",
		"/sys/module/popWindow",
		"/sys/pss/popWindow",
		"/sys/role/popWindow",
		"/sys/sysUser/popWindow",
		"/sys/tmp/template/popWindow",
		"/sys/tmp/size/popWindow",
		"/sys/tmp/type/popWindow",
		"/sys/user/popWindow"};
	
	public static String getRequestPath(HttpServletRequest request) {
		String requestPath = request.getRequestURI(); //+ "?" + request.getQueryString();
		//if (requestPath.indexOf("&") > -1) {// 去掉其他参数
		//	requestPath = requestPath.substring(0, requestPath.indexOf("&"));
		//}
		requestPath = requestPath.substring(request.getContextPath().length());// 去掉项目路径
		return requestPath;
	}
	
	private final static String BAR_ADD ="{text:'新增',iconCls:'icon-add',handler:function(){addrow();}},'-',{text:'更新',iconCls:'icon-edit',handler:function(){updaterow();}},'-'";
	private final static String BAR_DEL ="{text:'删除',iconCls:'icon-remove',handler:function(){deleterow();}},'-'";
	
	public final static String[] TOOL_BAR = {BAR_ADD,BAR_DEL};
	
}
