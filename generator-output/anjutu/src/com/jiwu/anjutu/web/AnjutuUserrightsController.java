package com.jiwu.anjutu.web;
/**
 * description anjutuuserrights 控制器
 * 2014-8-19 10:19:21
 * @author jiwurapid
 */


import javax.annotation.Resource;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jiwu.anjutu.entity.AnjutuUserrights;
import com.jiwu.anjutu.service.AnjutuUserrightsService;

@Controller
@RequestMapping("/anjutuuserrights")
public class AnjutuUserrightsController {
	
	@Resource
	private AnjutuUserrightsService anjutuuserrightsService;
	
	/**
	 * description anjutuuserrights 添加页面
	 * 2014-8-19 10:19:21
	 * @author jiwurapid
	 */
	@RequestMapping("/add")
	public String add(){
		return "/anjutuuserrights/anjutuuserrights_addoredit";
	}
	
	/**
	 * description anjutuuserrights 修改页面
	 * 2014-8-19 10:19:21
	 * @author jiwurapid
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(int id){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutuuserrights", anjutuuserrightsService.findById(id));
		view.setViewName("/anjutuuserrights/anjutuuserrights_addoredit");
		return view;
	}
	
	/**
	 * description anjutuuserrights 删除
	 * 2014-8-19 10:19:21
	 * @author jiwurapid
	 */
	@RequestMapping("/delete")
	public ModelAndView delete(int id){
		ModelAndView view = new ModelAndView();
		anjutuuserrightsService.delete(id);
		view.addObject("anjutuuserrightslist", anjutuuserrightsService.getAnjutuUserrightslist(0, 10));
		view.setViewName("/anjutuuserrights/anjutuuserrights_list");
		return view;
	}
	
	/**
	 * description anjutuuserrights 保存
	 * 2014-8-19 10:19:21
	 * @author jiwurapid
	 */
	@RequestMapping(value="/addoredit",method=RequestMethod.POST)
	public ModelAndView addoredit(AnjutuUserrights anjutuuserrights){
		ModelAndView view = new ModelAndView();
		if(anjutuuserrights.getUrid() > 0){
			anjutuuserrightsService.update(anjutuuserrights);
		}else{
			anjutuuserrightsService.add(anjutuuserrights);
		}
		view.addObject("anjutuuserrightslist", anjutuuserrightsService.getAnjutuUserrightslist(0, 10));
		view.setViewName("/anjutuuserrights/anjutuuserrights_list");
		return view;
	}
	
	/**
	 * description anjutuuserrights 列表
	 * 2014-8-19 10:19:21
	 * @author jiwurapid
	 */
	@RequestMapping(value="/list")
	public ModelAndView list(){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutuuserrightslist", anjutuuserrightsService.getAnjutuUserrightslist(0, 10));
		view.setViewName("/anjutuuserrights/anjutuuserrights_list");
		return view;
	}
	
}
