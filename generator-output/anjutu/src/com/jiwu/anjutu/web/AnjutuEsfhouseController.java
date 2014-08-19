package com.jiwu.anjutu.web;
/**
 * description anjutuesfhouse 控制器
 * 2014-8-19 10:18:44
 * @author jiwurapid
 */


import javax.annotation.Resource;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jiwu.anjutu.entity.AnjutuEsfhouse;
import com.jiwu.anjutu.service.AnjutuEsfhouseService;

@Controller
@RequestMapping("/anjutuesfhouse")
public class AnjutuEsfhouseController {
	
	@Resource
	private AnjutuEsfhouseService anjutuesfhouseService;
	
	/**
	 * description anjutuesfhouse 添加页面
	 * 2014-8-19 10:18:44
	 * @author jiwurapid
	 */
	@RequestMapping("/add")
	public String add(){
		return "/anjutuesfhouse/anjutuesfhouse_addoredit";
	}
	
	/**
	 * description anjutuesfhouse 修改页面
	 * 2014-8-19 10:18:44
	 * @author jiwurapid
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(int id){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutuesfhouse", anjutuesfhouseService.findById(id));
		view.setViewName("/anjutuesfhouse/anjutuesfhouse_addoredit");
		return view;
	}
	
	/**
	 * description anjutuesfhouse 删除
	 * 2014-8-19 10:18:44
	 * @author jiwurapid
	 */
	@RequestMapping("/delete")
	public ModelAndView delete(int id){
		ModelAndView view = new ModelAndView();
		anjutuesfhouseService.delete(id);
		view.addObject("anjutuesfhouselist", anjutuesfhouseService.getAnjutuEsfhouselist(0, 10));
		view.setViewName("/anjutuesfhouse/anjutuesfhouse_list");
		return view;
	}
	
	/**
	 * description anjutuesfhouse 保存
	 * 2014-8-19 10:18:44
	 * @author jiwurapid
	 */
	@RequestMapping(value="/addoredit",method=RequestMethod.POST)
	public ModelAndView addoredit(AnjutuEsfhouse anjutuesfhouse){
		ModelAndView view = new ModelAndView();
		if(anjutuesfhouse.getHouseid() > 0){
			anjutuesfhouseService.update(anjutuesfhouse);
		}else{
			anjutuesfhouseService.add(anjutuesfhouse);
		}
		view.addObject("anjutuesfhouselist", anjutuesfhouseService.getAnjutuEsfhouselist(0, 10));
		view.setViewName("/anjutuesfhouse/anjutuesfhouse_list");
		return view;
	}
	
	/**
	 * description anjutuesfhouse 列表
	 * 2014-8-19 10:18:44
	 * @author jiwurapid
	 */
	@RequestMapping(value="/list")
	public ModelAndView list(){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutuesfhouselist", anjutuesfhouseService.getAnjutuEsfhouselist(0, 10));
		view.setViewName("/anjutuesfhouse/anjutuesfhouse_list");
		return view;
	}
	
}
