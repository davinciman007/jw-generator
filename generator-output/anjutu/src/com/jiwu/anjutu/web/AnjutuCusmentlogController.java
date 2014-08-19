package com.jiwu.anjutu.web;
/**
 * description anjutucusmentlog 控制器
 * 2014-8-19 10:18:31
 * @author jiwurapid
 */


import javax.annotation.Resource;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jiwu.anjutu.entity.AnjutuCusmentlog;
import com.jiwu.anjutu.service.AnjutuCusmentlogService;

@Controller
@RequestMapping("/anjutucusmentlog")
public class AnjutuCusmentlogController {
	
	@Resource
	private AnjutuCusmentlogService anjutucusmentlogService;
	
	/**
	 * description anjutucusmentlog 添加页面
	 * 2014-8-19 10:18:31
	 * @author jiwurapid
	 */
	@RequestMapping("/add")
	public String add(){
		return "/anjutucusmentlog/anjutucusmentlog_addoredit";
	}
	
	/**
	 * description anjutucusmentlog 修改页面
	 * 2014-8-19 10:18:31
	 * @author jiwurapid
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(int id){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutucusmentlog", anjutucusmentlogService.findById(id));
		view.setViewName("/anjutucusmentlog/anjutucusmentlog_addoredit");
		return view;
	}
	
	/**
	 * description anjutucusmentlog 删除
	 * 2014-8-19 10:18:31
	 * @author jiwurapid
	 */
	@RequestMapping("/delete")
	public ModelAndView delete(int id){
		ModelAndView view = new ModelAndView();
		anjutucusmentlogService.delete(id);
		view.addObject("anjutucusmentloglist", anjutucusmentlogService.getAnjutuCusmentloglist(0, 10));
		view.setViewName("/anjutucusmentlog/anjutucusmentlog_list");
		return view;
	}
	
	/**
	 * description anjutucusmentlog 保存
	 * 2014-8-19 10:18:31
	 * @author jiwurapid
	 */
	@RequestMapping(value="/addoredit",method=RequestMethod.POST)
	public ModelAndView addoredit(AnjutuCusmentlog anjutucusmentlog){
		ModelAndView view = new ModelAndView();
		if(anjutucusmentlog.getId() > 0){
			anjutucusmentlogService.update(anjutucusmentlog);
		}else{
			anjutucusmentlogService.add(anjutucusmentlog);
		}
		view.addObject("anjutucusmentloglist", anjutucusmentlogService.getAnjutuCusmentloglist(0, 10));
		view.setViewName("/anjutucusmentlog/anjutucusmentlog_list");
		return view;
	}
	
	/**
	 * description anjutucusmentlog 列表
	 * 2014-8-19 10:18:31
	 * @author jiwurapid
	 */
	@RequestMapping(value="/list")
	public ModelAndView list(){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutucusmentloglist", anjutucusmentlogService.getAnjutuCusmentloglist(0, 10));
		view.setViewName("/anjutucusmentlog/anjutucusmentlog_list");
		return view;
	}
	
}
