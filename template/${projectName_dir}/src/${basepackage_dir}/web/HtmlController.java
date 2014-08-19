/**
 * description 公共控制器
 * 2014-8-18
 * @author jwjw233233@163.com
 */
package ${basepackage}.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HtmlController {
	
	/**
	 * description 首页
	 * ${.now}
	 * @author ${author}
	 */
	@RequestMapping("/index")
	public ModelAndView index(){
		ModelAndView view = new ModelAndView();
		view.setViewName("index");
		return view;
	}
	
}
