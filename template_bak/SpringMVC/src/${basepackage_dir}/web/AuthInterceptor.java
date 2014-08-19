package ${basepackage}.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import ${basepackage}.common.ServiceSupport;
//import com.ghome.smart.domain.SysUser;
//import com.ghome.smart.domain.User;
import ${basepackage}.util.Constants;
import com.sourceframework.service.SourceServiceSupport;


/**
 * 权限拦截器
 * 
 * @author llj
 * 
 */
public class AuthInterceptor implements HandlerInterceptor {

	@Autowired
	private ServiceSupport serviceStrong;

	/**
	 * 完成页面的render后调用
	 */
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception exception) throws Exception {
	}

	/**
	 * 在调用controller具体方法后拦截
	 */
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView modelAndView) throws Exception {

	}

	/**
	 * 在调用controller具体方法前拦截
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {

		String requestPath = Constants.getRequestPath(request);// 用户访问的资源地址

		boolean b = false;
		// 不需要权限验证的资源集合
		for (String url : Constants.PUBLIC_URL) {
			if (url.equals(requestPath)) {
				b = true;
				break;
			}
		}
		if (b) {
			return true;// 当前访问资源地址是不需要验证的资源
		}

		/*Syresources syresources = authService.getSyresourcesByRequestPath(requestPath);
		if (syresources == null) {// 当前访问资源地址没有在数据库中存在
			forward("请执行【" + request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/init.jsp" + "】页面修复数据库！数据库缺失【" + requestPath + "】资源！", request, response);
			return false;
		}*/

		/*SysUser sessionInfo = (SysUser) request.getSession().getAttribute(Constants.SYSUSER_INFO_SESSION);
		if (sessionInfo == null) {// 没有登录系统，或登录超时
			request.getRequestDispatcher("/sys/login").forward(request,response);
			return false;
		}else{
			if("/sys/main".equals(requestPath)){
				return true;
			}
		}

		if (sessionInfo.getUserId()==1&&sessionInfo.getRoleId()==1) {// 超级管理员不需要验证权限
			return true;
		}
		
		
		boolean flag= serviceStrong.authCheck(sessionInfo.getRoleId(), requestPath);
		if (flag) {// 验证当前用户是否有权限访问此资源
			return true;
		} else {
			forward("您没有权限，请联系管理员给您赋予相应权限！", request, response);
			return false;
		}*/
		return false;
	}

	private void forward(String msg, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("msg", msg);
		request.getRequestDispatcher("/error/authMsg.jsp").forward(request, response);
	}

}
