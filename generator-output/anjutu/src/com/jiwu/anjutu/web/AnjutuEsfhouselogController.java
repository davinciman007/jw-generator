package com.jiwu.anjutu.web;
/**
 * description anjutuesfhouselog 控制器
 * 2014-8-19 10:18:50
 * @author jiwurapid
 */


import javax.annotation.Resource;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jiwu.anjutu.entity.AnjutuEsfhouselog;
import com.jiwu.anjutu.service.AnjutuEsfhouselogService;

@Controller
@RequestMapping("/anjutuesfhouselog")
public class AnjutuEsfhouselogController {
	
	@Resource
	private AnjutuEsfhouselogService anjutuesfhouselogService;
	
	/**
	 * description anjutuesfhouselog 添加页面
	 * 2014-8-19 10:18:50
	 * @author jiwurapid
	 */
	@RequestMapping("/add")
	public String add(){
		return "/anjutuesfhouselog/anjutuesfhouselog_addoredit";
	}
	
	/**
	 * description anjutuesfhouselog 修改页面
	 * 2014-8-19 10:18:50
	 * @author jiwurapid
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(int id){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutuesfhouselog", anjutuesfhouselogService.findById(id));
		view.setViewName("/anjutuesfhouselog/anjutuesfhouselog_addoredit");
		return view;
	}
	
	/**
	 * description anjutuesfhouselog 删除
	 * 2014-8-19 10:18:50
	 * @author jiwurapid
	 */
	@RequestMapping("/delete")
	public ModelAndView delete(int id){
		ModelAndView view = new ModelAndView();
		anjutuesfhouselogService.delete(id);
		view.addObject("anjutuesfhouseloglist", anjutuesfhouselogService.getAnjutuEsfhouseloglist(0, 10));
		view.setViewName("/anjutuesfhouselog/anjutuesfhouselog_list");
		return view;
	}
	
	/**
	 * description anjutuesfhouselog 保存
	 * 2014-8-19 10:18:50
	 * @author jiwurapid
	 */
	@RequestMapping(value="/addoredit",method=RequestMethod.POST)
	public ModelAndView addoredit(AnjutuEsfhouselog anjutuesfhouselog){
		ModelAndView view = new ModelAndView();
		if(anjutuesfhouselog.getId() > 0){
			anjutuesfhouselogService.update(anjutuesfhouselog);
		}else{
			anjutuesfhouselogService.add(anjutuesfhouselog);
		}
		view.addObject("anjutuesfhouseloglist", anjutuesfhouselogService.getAnjutuEsfhouseloglist(0, 10));
		view.setViewName("/anjutuesfhouselog/anjutuesfhouselog_list");
		return view;
	}
	
	/**
	 * description anjutuesfhouselog 列表
	 * 2014-8-19 10:18:50
	 * @author jiwurapid
	 */
	@RequestMapping(value="/list")
	public ModelAndView list(){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutuesfhouseloglist", anjutuesfhouselogService.getAnjutuEsfhouseloglist(0, 10));
		view.setViewName("/anjutuesfhouselog/anjutuesfhouselog_list");
		return view;
	}
	
}
