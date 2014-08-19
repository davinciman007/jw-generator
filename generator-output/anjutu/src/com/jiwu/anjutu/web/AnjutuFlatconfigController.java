package com.jiwu.anjutu.web;
/**
 * description anjutuflatconfig 控制器
 * 2014-8-19 10:19:08
 * @author jiwurapid
 */


import javax.annotation.Resource;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jiwu.anjutu.entity.AnjutuFlatconfig;
import com.jiwu.anjutu.service.AnjutuFlatconfigService;

@Controller
@RequestMapping("/anjutuflatconfig")
public class AnjutuFlatconfigController {
	
	@Resource
	private AnjutuFlatconfigService anjutuflatconfigService;
	
	/**
	 * description anjutuflatconfig 添加页面
	 * 2014-8-19 10:19:08
	 * @author jiwurapid
	 */
	@RequestMapping("/add")
	public String add(){
		return "/anjutuflatconfig/anjutuflatconfig_addoredit";
	}
	
	/**
	 * description anjutuflatconfig 修改页面
	 * 2014-8-19 10:19:08
	 * @author jiwurapid
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(int id){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutuflatconfig", anjutuflatconfigService.findById(id));
		view.setViewName("/anjutuflatconfig/anjutuflatconfig_addoredit");
		return view;
	}
	
	/**
	 * description anjutuflatconfig 删除
	 * 2014-8-19 10:19:08
	 * @author jiwurapid
	 */
	@RequestMapping("/delete")
	public ModelAndView delete(int id){
		ModelAndView view = new ModelAndView();
		anjutuflatconfigService.delete(id);
		view.addObject("anjutuflatconfiglist", anjutuflatconfigService.getAnjutuFlatconfiglist(0, 10));
		view.setViewName("/anjutuflatconfig/anjutuflatconfig_list");
		return view;
	}
	
	/**
	 * description anjutuflatconfig 保存
	 * 2014-8-19 10:19:08
	 * @author jiwurapid
	 */
	@RequestMapping(value="/addoredit",method=RequestMethod.POST)
	public ModelAndView addoredit(AnjutuFlatconfig anjutuflatconfig){
		ModelAndView view = new ModelAndView();
		if(anjutuflatconfig.getFlatid() > 0){
			anjutuflatconfigService.update(anjutuflatconfig);
		}else{
			anjutuflatconfigService.add(anjutuflatconfig);
		}
		view.addObject("anjutuflatconfiglist", anjutuflatconfigService.getAnjutuFlatconfiglist(0, 10));
		view.setViewName("/anjutuflatconfig/anjutuflatconfig_list");
		return view;
	}
	
	/**
	 * description anjutuflatconfig 列表
	 * 2014-8-19 10:19:08
	 * @author jiwurapid
	 */
	@RequestMapping(value="/list")
	public ModelAndView list(){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutuflatconfiglist", anjutuflatconfigService.getAnjutuFlatconfiglist(0, 10));
		view.setViewName("/anjutuflatconfig/anjutuflatconfig_list");
		return view;
	}
	
}
