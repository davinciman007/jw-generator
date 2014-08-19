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
public class PublicInterceptor implements HandlerInterceptor {

	@Autowired
	private SourceServiceSupport service;

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
		


		/*User session = (User) request.getSession().getAttribute(Constants.USER_INFO_SESSION);
		if (session == null) {// 没有登录系统，或登录超时
			request.getRequestDispatcher("/login").forward(request,response);
			return false;
		}else{
			return true;
		}*/
		return true;
	}

	private void forward(String msg, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("msg", msg);
		request.getRequestDispatcher("error/authMsg.jsp").forward(request, response);
	}

}
