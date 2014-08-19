package com.jiwu.anjutu.web;
/**
 * description anjutucusment 控制器
 * 2014-8-19 10:18:17
 * @author jiwurapid
 */


import javax.annotation.Resource;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jiwu.anjutu.entity.AnjutuCusment;
import com.jiwu.anjutu.service.AnjutuCusmentService;

@Controller
@RequestMapping("/anjutucusment")
public class AnjutuCusmentController {
	
	@Resource
	private AnjutuCusmentService anjutucusmentService;
	
	/**
	 * description anjutucusment 添加页面
	 * 2014-8-19 10:18:17
	 * @author jiwurapid
	 */
	@RequestMapping("/add")
	public String add(){
		return "/anjutucusment/anjutucusment_addoredit";
	}
	
	/**
	 * description anjutucusment 修改页面
	 * 2014-8-19 10:18:17
	 * @author jiwurapid
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(int id){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutucusment", anjutucusmentService.findById(id));
		view.setViewName("/anjutucusment/anjutucusment_addoredit");
		return view;
	}
	
	/**
	 * description anjutucusment 删除
	 * 2014-8-19 10:18:17
	 * @author jiwurapid
	 */
	@RequestMapping("/delete")
	public ModelAndView delete(int id){
		ModelAndView view = new ModelAndView();
		anjutucusmentService.delete(id);
		view.addObject("anjutucusmentlist", anjutucusmentService.getAnjutuCusmentlist(0, 10));
		view.setViewName("/anjutucusment/anjutucusment_list");
		return view;
	}
	
	/**
	 * description anjutucusment 保存
	 * 2014-8-19 10:18:17
	 * @author jiwurapid
	 */
	@RequestMapping(value="/addoredit",method=RequestMethod.POST)
	public ModelAndView addoredit(AnjutuCusment anjutucusment){
		ModelAndView view = new ModelAndView();
		if(anjutucusment.getCusid() > 0){
			anjutucusmentService.update(anjutucusment);
		}else{
			anjutucusmentService.add(anjutucusment);
		}
		view.addObject("anjutucusmentlist", anjutucusmentService.getAnjutuCusmentlist(0, 10));
		view.setViewName("/anjutucusment/anjutucusment_list");
		return view;
	}
	
	/**
	 * description anjutucusment 列表
	 * 2014-8-19 10:18:17
	 * @author jiwurapid
	 */
	@RequestMapping(value="/list")
	public ModelAndView list(){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutucusmentlist", anjutucusmentService.getAnjutuCusmentlist(0, 10));
		view.setViewName("/anjutucusment/anjutucusment_list");
		return view;
	}
	
}
