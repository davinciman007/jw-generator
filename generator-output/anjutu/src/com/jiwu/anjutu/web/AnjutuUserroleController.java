package com.jiwu.anjutu.web;
/**
 * description anjutuuserrole 控制器
 * 2014-8-19 10:19:27
 * @author jiwurapid
 */


import javax.annotation.Resource;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jiwu.anjutu.entity.AnjutuUserrole;
import com.jiwu.anjutu.service.AnjutuUserroleService;

@Controller
@RequestMapping("/anjutuuserrole")
public class AnjutuUserroleController {
	
	@Resource
	private AnjutuUserroleService anjutuuserroleService;
	
	/**
	 * description anjutuuserrole 添加页面
	 * 2014-8-19 10:19:27
	 * @author jiwurapid
	 */
	@RequestMapping("/add")
	public String add(){
		return "/anjutuuserrole/anjutuuserrole_addoredit";
	}
	
	/**
	 * description anjutuuserrole 修改页面
	 * 2014-8-19 10:19:27
	 * @author jiwurapid
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(int id){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutuuserrole", anjutuuserroleService.findById(id));
		view.setViewName("/anjutuuserrole/anjutuuserrole_addoredit");
		return view;
	}
	
	/**
	 * description anjutuuserrole 删除
	 * 2014-8-19 10:19:27
	 * @author jiwurapid
	 */
	@RequestMapping("/delete")
	public ModelAndView delete(int id){
		ModelAndView view = new ModelAndView();
		anjutuuserroleService.delete(id);
		view.addObject("anjutuuserrolelist", anjutuuserroleService.getAnjutuUserrolelist(0, 10));
		view.setViewName("/anjutuuserrole/anjutuuserrole_list");
		return view;
	}
	
	/**
	 * description anjutuuserrole 保存
	 * 2014-8-19 10:19:27
	 * @author jiwurapid
	 */
	@RequestMapping(value="/addoredit",method=RequestMethod.POST)
	public ModelAndView addoredit(AnjutuUserrole anjutuuserrole){
		ModelAndView view = new ModelAndView();
		if(anjutuuserrole.getRoleid() > 0){
			anjutuuserroleService.update(anjutuuserrole);
		}else{
			anjutuuserroleService.add(anjutuuserrole);
		}
		view.addObject("anjutuuserrolelist", anjutuuserroleService.getAnjutuUserrolelist(0, 10));
		view.setViewName("/anjutuuserrole/anjutuuserrole_list");
		return view;
	}
	
	/**
	 * description anjutuuserrole 列表
	 * 2014-8-19 10:19:27
	 * @author jiwurapid
	 */
	@RequestMapping(value="/list")
	public ModelAndView list(){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutuuserrolelist", anjutuuserroleService.getAnjutuUserrolelist(0, 10));
		view.setViewName("/anjutuuserrole/anjutuuserrole_list");
		return view;
	}
	
}
