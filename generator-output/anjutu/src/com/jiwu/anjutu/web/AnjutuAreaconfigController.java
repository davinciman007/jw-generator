package com.jiwu.anjutu.web;
/**
 * description anjutuareaconfig 控制器
 * 2014-8-19 10:17:43
 * @author jiwurapid
 */


import javax.annotation.Resource;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jiwu.anjutu.entity.AnjutuAreaconfig;
import com.jiwu.anjutu.service.AnjutuAreaconfigService;

@Controller
@RequestMapping("/anjutuareaconfig")
public class AnjutuAreaconfigController {
	
	@Resource
	private AnjutuAreaconfigService anjutuareaconfigService;
	
	/**
	 * description anjutuareaconfig 添加页面
	 * 2014-8-19 10:17:43
	 * @author jiwurapid
	 */
	@RequestMapping("/add")
	public String add(){
		return "/anjutuareaconfig/anjutuareaconfig_addoredit";
	}
	
	/**
	 * description anjutuareaconfig 修改页面
	 * 2014-8-19 10:17:43
	 * @author jiwurapid
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(int id){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutuareaconfig", anjutuareaconfigService.findById(id));
		view.setViewName("/anjutuareaconfig/anjutuareaconfig_addoredit");
		return view;
	}
	
	/**
	 * description anjutuareaconfig 删除
	 * 2014-8-19 10:17:43
	 * @author jiwurapid
	 */
	@RequestMapping("/delete")
	public ModelAndView delete(int id){
		ModelAndView view = new ModelAndView();
		anjutuareaconfigService.delete(id);
		view.addObject("anjutuareaconfiglist", anjutuareaconfigService.getAnjutuAreaconfiglist(0, 10));
		view.setViewName("/anjutuareaconfig/anjutuareaconfig_list");
		return view;
	}
	
	/**
	 * description anjutuareaconfig 保存
	 * 2014-8-19 10:17:43
	 * @author jiwurapid
	 */
	@RequestMapping(value="/addoredit",method=RequestMethod.POST)
	public ModelAndView addoredit(AnjutuAreaconfig anjutuareaconfig){
		ModelAndView view = new ModelAndView();
		if(anjutuareaconfig.getAcid() > 0){
			anjutuareaconfigService.update(anjutuareaconfig);
		}else{
			anjutuareaconfigService.add(anjutuareaconfig);
		}
		view.addObject("anjutuareaconfiglist", anjutuareaconfigService.getAnjutuAreaconfiglist(0, 10));
		view.setViewName("/anjutuareaconfig/anjutuareaconfig_list");
		return view;
	}
	
	/**
	 * description anjutuareaconfig 列表
	 * 2014-8-19 10:17:43
	 * @author jiwurapid
	 */
	@RequestMapping(value="/list")
	public ModelAndView list(){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutuareaconfiglist", anjutuareaconfigService.getAnjutuAreaconfiglist(0, 10));
		view.setViewName("/anjutuareaconfig/anjutuareaconfig_list");
		return view;
	}
	
}
