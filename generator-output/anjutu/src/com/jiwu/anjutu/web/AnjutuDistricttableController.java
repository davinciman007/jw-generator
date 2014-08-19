package com.jiwu.anjutu.web;
/**
 * description anjutudistricttable 控制器
 * 2014-8-19 10:18:38
 * @author jiwurapid
 */


import javax.annotation.Resource;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jiwu.anjutu.entity.AnjutuDistricttable;
import com.jiwu.anjutu.service.AnjutuDistricttableService;

@Controller
@RequestMapping("/anjutudistricttable")
public class AnjutuDistricttableController {
	
	@Resource
	private AnjutuDistricttableService anjutudistricttableService;
	
	/**
	 * description anjutudistricttable 添加页面
	 * 2014-8-19 10:18:38
	 * @author jiwurapid
	 */
	@RequestMapping("/add")
	public String add(){
		return "/anjutudistricttable/anjutudistricttable_addoredit";
	}
	
	/**
	 * description anjutudistricttable 修改页面
	 * 2014-8-19 10:18:38
	 * @author jiwurapid
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(int id){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutudistricttable", anjutudistricttableService.findById(id));
		view.setViewName("/anjutudistricttable/anjutudistricttable_addoredit");
		return view;
	}
	
	/**
	 * description anjutudistricttable 删除
	 * 2014-8-19 10:18:38
	 * @author jiwurapid
	 */
	@RequestMapping("/delete")
	public ModelAndView delete(int id){
		ModelAndView view = new ModelAndView();
		anjutudistricttableService.delete(id);
		view.addObject("anjutudistricttablelist", anjutudistricttableService.getAnjutuDistricttablelist(0, 10));
		view.setViewName("/anjutudistricttable/anjutudistricttable_list");
		return view;
	}
	
	/**
	 * description anjutudistricttable 保存
	 * 2014-8-19 10:18:38
	 * @author jiwurapid
	 */
	@RequestMapping(value="/addoredit",method=RequestMethod.POST)
	public ModelAndView addoredit(AnjutuDistricttable anjutudistricttable){
		ModelAndView view = new ModelAndView();
		if(anjutudistricttable.getDtid() > 0){
			anjutudistricttableService.update(anjutudistricttable);
		}else{
			anjutudistricttableService.add(anjutudistricttable);
		}
		view.addObject("anjutudistricttablelist", anjutudistricttableService.getAnjutuDistricttablelist(0, 10));
		view.setViewName("/anjutudistricttable/anjutudistricttable_list");
		return view;
	}
	
	/**
	 * description anjutudistricttable 列表
	 * 2014-8-19 10:18:38
	 * @author jiwurapid
	 */
	@RequestMapping(value="/list")
	public ModelAndView list(){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutudistricttablelist", anjutudistricttableService.getAnjutuDistricttablelist(0, 10));
		view.setViewName("/anjutudistricttable/anjutudistricttable_list");
		return view;
	}
	
}
