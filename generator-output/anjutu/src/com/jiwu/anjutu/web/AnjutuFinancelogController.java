package com.jiwu.anjutu.web;
/**
 * description anjutufinancelog 控制器
 * 2014-8-19 10:19:02
 * @author jiwurapid
 */


import javax.annotation.Resource;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jiwu.anjutu.entity.AnjutuFinancelog;
import com.jiwu.anjutu.service.AnjutuFinancelogService;

@Controller
@RequestMapping("/anjutufinancelog")
public class AnjutuFinancelogController {
	
	@Resource
	private AnjutuFinancelogService anjutufinancelogService;
	
	/**
	 * description anjutufinancelog 添加页面
	 * 2014-8-19 10:19:02
	 * @author jiwurapid
	 */
	@RequestMapping("/add")
	public String add(){
		return "/anjutufinancelog/anjutufinancelog_addoredit";
	}
	
	/**
	 * description anjutufinancelog 修改页面
	 * 2014-8-19 10:19:02
	 * @author jiwurapid
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(int id){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutufinancelog", anjutufinancelogService.findById(id));
		view.setViewName("/anjutufinancelog/anjutufinancelog_addoredit");
		return view;
	}
	
	/**
	 * description anjutufinancelog 删除
	 * 2014-8-19 10:19:02
	 * @author jiwurapid
	 */
	@RequestMapping("/delete")
	public ModelAndView delete(int id){
		ModelAndView view = new ModelAndView();
		anjutufinancelogService.delete(id);
		view.addObject("anjutufinanceloglist", anjutufinancelogService.getAnjutuFinanceloglist(0, 10));
		view.setViewName("/anjutufinancelog/anjutufinancelog_list");
		return view;
	}
	
	/**
	 * description anjutufinancelog 保存
	 * 2014-8-19 10:19:02
	 * @author jiwurapid
	 */
	@RequestMapping(value="/addoredit",method=RequestMethod.POST)
	public ModelAndView addoredit(AnjutuFinancelog anjutufinancelog){
		ModelAndView view = new ModelAndView();
		if(anjutufinancelog.getId() > 0){
			anjutufinancelogService.update(anjutufinancelog);
		}else{
			anjutufinancelogService.add(anjutufinancelog);
		}
		view.addObject("anjutufinanceloglist", anjutufinancelogService.getAnjutuFinanceloglist(0, 10));
		view.setViewName("/anjutufinancelog/anjutufinancelog_list");
		return view;
	}
	
	/**
	 * description anjutufinancelog 列表
	 * 2014-8-19 10:19:02
	 * @author jiwurapid
	 */
	@RequestMapping(value="/list")
	public ModelAndView list(){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutufinanceloglist", anjutufinancelogService.getAnjutuFinanceloglist(0, 10));
		view.setViewName("/anjutufinancelog/anjutufinancelog_list");
		return view;
	}
	
}
