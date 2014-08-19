package com.jiwu.anjutu.web;
/**
 * description anjutucusmentdetail 控制器
 * 2014-8-19 10:18:24
 * @author jiwurapid
 */


import javax.annotation.Resource;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jiwu.anjutu.entity.AnjutuCusmentdetail;
import com.jiwu.anjutu.service.AnjutuCusmentdetailService;

@Controller
@RequestMapping("/anjutucusmentdetail")
public class AnjutuCusmentdetailController {
	
	@Resource
	private AnjutuCusmentdetailService anjutucusmentdetailService;
	
	/**
	 * description anjutucusmentdetail 添加页面
	 * 2014-8-19 10:18:24
	 * @author jiwurapid
	 */
	@RequestMapping("/add")
	public String add(){
		return "/anjutucusmentdetail/anjutucusmentdetail_addoredit";
	}
	
	/**
	 * description anjutucusmentdetail 修改页面
	 * 2014-8-19 10:18:24
	 * @author jiwurapid
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(int id){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutucusmentdetail", anjutucusmentdetailService.findById(id));
		view.setViewName("/anjutucusmentdetail/anjutucusmentdetail_addoredit");
		return view;
	}
	
	/**
	 * description anjutucusmentdetail 删除
	 * 2014-8-19 10:18:24
	 * @author jiwurapid
	 */
	@RequestMapping("/delete")
	public ModelAndView delete(int id){
		ModelAndView view = new ModelAndView();
		anjutucusmentdetailService.delete(id);
		view.addObject("anjutucusmentdetaillist", anjutucusmentdetailService.getAnjutuCusmentdetaillist(0, 10));
		view.setViewName("/anjutucusmentdetail/anjutucusmentdetail_list");
		return view;
	}
	
	/**
	 * description anjutucusmentdetail 保存
	 * 2014-8-19 10:18:24
	 * @author jiwurapid
	 */
	@RequestMapping(value="/addoredit",method=RequestMethod.POST)
	public ModelAndView addoredit(AnjutuCusmentdetail anjutucusmentdetail){
		ModelAndView view = new ModelAndView();
		if(anjutucusmentdetail.getCid() > 0){
			anjutucusmentdetailService.update(anjutucusmentdetail);
		}else{
			anjutucusmentdetailService.add(anjutucusmentdetail);
		}
		view.addObject("anjutucusmentdetaillist", anjutucusmentdetailService.getAnjutuCusmentdetaillist(0, 10));
		view.setViewName("/anjutucusmentdetail/anjutucusmentdetail_list");
		return view;
	}
	
	/**
	 * description anjutucusmentdetail 列表
	 * 2014-8-19 10:18:24
	 * @author jiwurapid
	 */
	@RequestMapping(value="/list")
	public ModelAndView list(){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutucusmentdetaillist", anjutucusmentdetailService.getAnjutuCusmentdetaillist(0, 10));
		view.setViewName("/anjutucusmentdetail/anjutucusmentdetail_list");
		return view;
	}
	
}
