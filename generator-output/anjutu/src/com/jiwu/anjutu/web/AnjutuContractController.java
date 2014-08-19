package com.jiwu.anjutu.web;
/**
 * description anjutucontract 控制器
 * 2014-8-19 10:18:03
 * @author jiwurapid
 */


import javax.annotation.Resource;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jiwu.anjutu.entity.AnjutuContract;
import com.jiwu.anjutu.service.AnjutuContractService;

@Controller
@RequestMapping("/anjutucontract")
public class AnjutuContractController {
	
	@Resource
	private AnjutuContractService anjutucontractService;
	
	/**
	 * description anjutucontract 添加页面
	 * 2014-8-19 10:18:03
	 * @author jiwurapid
	 */
	@RequestMapping("/add")
	public String add(){
		return "/anjutucontract/anjutucontract_addoredit";
	}
	
	/**
	 * description anjutucontract 修改页面
	 * 2014-8-19 10:18:03
	 * @author jiwurapid
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(int id){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutucontract", anjutucontractService.findById(id));
		view.setViewName("/anjutucontract/anjutucontract_addoredit");
		return view;
	}
	
	/**
	 * description anjutucontract 删除
	 * 2014-8-19 10:18:03
	 * @author jiwurapid
	 */
	@RequestMapping("/delete")
	public ModelAndView delete(int id){
		ModelAndView view = new ModelAndView();
		anjutucontractService.delete(id);
		view.addObject("anjutucontractlist", anjutucontractService.getAnjutuContractlist(0, 10));
		view.setViewName("/anjutucontract/anjutucontract_list");
		return view;
	}
	
	/**
	 * description anjutucontract 保存
	 * 2014-8-19 10:18:03
	 * @author jiwurapid
	 */
	@RequestMapping(value="/addoredit",method=RequestMethod.POST)
	public ModelAndView addoredit(AnjutuContract anjutucontract){
		ModelAndView view = new ModelAndView();
		if(anjutucontract.getContractid() > 0){
			anjutucontractService.update(anjutucontract);
		}else{
			anjutucontractService.add(anjutucontract);
		}
		view.addObject("anjutucontractlist", anjutucontractService.getAnjutuContractlist(0, 10));
		view.setViewName("/anjutucontract/anjutucontract_list");
		return view;
	}
	
	/**
	 * description anjutucontract 列表
	 * 2014-8-19 10:18:03
	 * @author jiwurapid
	 */
	@RequestMapping(value="/list")
	public ModelAndView list(){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutucontractlist", anjutucontractService.getAnjutuContractlist(0, 10));
		view.setViewName("/anjutucontract/anjutucontract_list");
		return view;
	}
	
}
