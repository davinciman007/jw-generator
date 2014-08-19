package com.jiwu.anjutu.web;
/**
 * description anjutuusers 控制器
 * 2014-8-19 10:19:34
 * @author jiwurapid
 */


import javax.annotation.Resource;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jiwu.anjutu.entity.AnjutuUsers;
import com.jiwu.anjutu.service.AnjutuUsersService;

@Controller
@RequestMapping("/anjutuusers")
public class AnjutuUsersController {
	
	@Resource
	private AnjutuUsersService anjutuusersService;
	
	/**
	 * description anjutuusers 添加页面
	 * 2014-8-19 10:19:34
	 * @author jiwurapid
	 */
	@RequestMapping("/add")
	public String add(){
		return "/anjutuusers/anjutuusers_addoredit";
	}
	
	/**
	 * description anjutuusers 修改页面
	 * 2014-8-19 10:19:34
	 * @author jiwurapid
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(int id){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutuusers", anjutuusersService.findById(id));
		view.setViewName("/anjutuusers/anjutuusers_addoredit");
		return view;
	}
	
	/**
	 * description anjutuusers 删除
	 * 2014-8-19 10:19:34
	 * @author jiwurapid
	 */
	@RequestMapping("/delete")
	public ModelAndView delete(int id){
		ModelAndView view = new ModelAndView();
		anjutuusersService.delete(id);
		view.addObject("anjutuuserslist", anjutuusersService.getAnjutuUserslist(0, 10));
		view.setViewName("/anjutuusers/anjutuusers_list");
		return view;
	}
	
	/**
	 * description anjutuusers 保存
	 * 2014-8-19 10:19:34
	 * @author jiwurapid
	 */
	@RequestMapping(value="/addoredit",method=RequestMethod.POST)
	public ModelAndView addoredit(AnjutuUsers anjutuusers){
		ModelAndView view = new ModelAndView();
		if(anjutuusers.getUid() > 0){
			anjutuusersService.update(anjutuusers);
		}else{
			anjutuusersService.add(anjutuusers);
		}
		view.addObject("anjutuuserslist", anjutuusersService.getAnjutuUserslist(0, 10));
		view.setViewName("/anjutuusers/anjutuusers_list");
		return view;
	}
	
	/**
	 * description anjutuusers 列表
	 * 2014-8-19 10:19:34
	 * @author jiwurapid
	 */
	@RequestMapping(value="/list")
	public ModelAndView list(){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutuuserslist", anjutuusersService.getAnjutuUserslist(0, 10));
		view.setViewName("/anjutuusers/anjutuusers_list");
		return view;
	}
	
}
