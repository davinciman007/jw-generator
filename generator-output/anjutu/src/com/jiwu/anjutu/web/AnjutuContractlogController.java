package com.jiwu.anjutu.web;
/**
 * description anjutucontractlog 控制器
 * 2014-8-19 10:18:10
 * @author jiwurapid
 */


import javax.annotation.Resource;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jiwu.anjutu.entity.AnjutuContractlog;
import com.jiwu.anjutu.service.AnjutuContractlogService;

@Controller
@RequestMapping("/anjutucontractlog")
public class AnjutuContractlogController {
	
	@Resource
	private AnjutuContractlogService anjutucontractlogService;
	
	/**
	 * description anjutucontractlog 添加页面
	 * 2014-8-19 10:18:10
	 * @author jiwurapid
	 */
	@RequestMapping("/add")
	public String add(){
		return "/anjutucontractlog/anjutucontractlog_addoredit";
	}
	
	/**
	 * description anjutucontractlog 修改页面
	 * 2014-8-19 10:18:10
	 * @author jiwurapid
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(int id){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutucontractlog", anjutucontractlogService.findById(id));
		view.setViewName("/anjutucontractlog/anjutucontractlog_addoredit");
		return view;
	}
	
	/**
	 * description anjutucontractlog 删除
	 * 2014-8-19 10:18:10
	 * @author jiwurapid
	 */
	@RequestMapping("/delete")
	public ModelAndView delete(int id){
		ModelAndView view = new ModelAndView();
		anjutucontractlogService.delete(id);
		view.addObject("anjutucontractloglist", anjutucontractlogService.getAnjutuContractloglist(0, 10));
		view.setViewName("/anjutucontractlog/anjutucontractlog_list");
		return view;
	}
	
	/**
	 * description anjutucontractlog 保存
	 * 2014-8-19 10:18:10
	 * @author jiwurapid
	 */
	@RequestMapping(value="/addoredit",method=RequestMethod.POST)
	public ModelAndView addoredit(AnjutuContractlog anjutucontractlog){
		ModelAndView view = new ModelAndView();
		if(anjutucontractlog.getId() > 0){
			anjutucontractlogService.update(anjutucontractlog);
		}else{
			anjutucontractlogService.add(anjutucontractlog);
		}
		view.addObject("anjutucontractloglist", anjutucontractlogService.getAnjutuContractloglist(0, 10));
		view.setViewName("/anjutucontractlog/anjutucontractlog_list");
		return view;
	}
	
	/**
	 * description anjutucontractlog 列表
	 * 2014-8-19 10:18:10
	 * @author jiwurapid
	 */
	@RequestMapping(value="/list")
	public ModelAndView list(){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutucontractloglist", anjutucontractlogService.getAnjutuContractloglist(0, 10));
		view.setViewName("/anjutucontractlog/anjutucontractlog_list");
		return view;
	}
	
}
