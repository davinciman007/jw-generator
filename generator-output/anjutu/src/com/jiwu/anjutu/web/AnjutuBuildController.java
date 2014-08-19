package com.jiwu.anjutu.web;
/**
 * description anjutubuild 控制器
 * 2014-8-19 10:17:49
 * @author jiwurapid
 */


import javax.annotation.Resource;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jiwu.anjutu.entity.AnjutuBuild;
import com.jiwu.anjutu.service.AnjutuBuildService;

@Controller
@RequestMapping("/anjutubuild")
public class AnjutuBuildController {
	
	@Resource
	private AnjutuBuildService anjutubuildService;
	
	/**
	 * description anjutubuild 添加页面
	 * 2014-8-19 10:17:49
	 * @author jiwurapid
	 */
	@RequestMapping("/add")
	public String add(){
		return "/anjutubuild/anjutubuild_addoredit";
	}
	
	/**
	 * description anjutubuild 修改页面
	 * 2014-8-19 10:17:49
	 * @author jiwurapid
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(int id){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutubuild", anjutubuildService.findById(id));
		view.setViewName("/anjutubuild/anjutubuild_addoredit");
		return view;
	}
	
	/**
	 * description anjutubuild 删除
	 * 2014-8-19 10:17:49
	 * @author jiwurapid
	 */
	@RequestMapping("/delete")
	public ModelAndView delete(int id){
		ModelAndView view = new ModelAndView();
		anjutubuildService.delete(id);
		view.addObject("anjutubuildlist", anjutubuildService.getAnjutuBuildlist(0, 10));
		view.setViewName("/anjutubuild/anjutubuild_list");
		return view;
	}
	
	/**
	 * description anjutubuild 保存
	 * 2014-8-19 10:17:49
	 * @author jiwurapid
	 */
	@RequestMapping(value="/addoredit",method=RequestMethod.POST)
	public ModelAndView addoredit(AnjutuBuild anjutubuild){
		ModelAndView view = new ModelAndView();
		if(anjutubuild.getBid() > 0){
			anjutubuildService.update(anjutubuild);
		}else{
			anjutubuildService.add(anjutubuild);
		}
		view.addObject("anjutubuildlist", anjutubuildService.getAnjutuBuildlist(0, 10));
		view.setViewName("/anjutubuild/anjutubuild_list");
		return view;
	}
	
	/**
	 * description anjutubuild 列表
	 * 2014-8-19 10:17:49
	 * @author jiwurapid
	 */
	@RequestMapping(value="/list")
	public ModelAndView list(){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutubuildlist", anjutubuildService.getAnjutuBuildlist(0, 10));
		view.setViewName("/anjutubuild/anjutubuild_list");
		return view;
	}
	
}
