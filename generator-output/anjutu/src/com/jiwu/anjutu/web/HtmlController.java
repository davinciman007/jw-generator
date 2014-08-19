/**
 * description 公共控制器
 * 2014-8-18
 * @author jwjw233233@163.com
 */
package com.jiwu.anjutu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HtmlController {
	
	/**
	 * description 首页
	 * 2014-8-19 10:17:43
	 * @author jiwurapid
	 */
	@RequestMapping("/index")
	public ModelAndView index(){
		ModelAndView view = new ModelAndView();
		view.setViewName("index");
		return view;
	}
	
}
