package com.jiwu.anjutu.web;
/**
 * description anjutufinance 控制器
 * 2014-8-19 10:18:56
 * @author jiwurapid
 */


import javax.annotation.Resource;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jiwu.anjutu.entity.AnjutuFinance;
import com.jiwu.anjutu.service.AnjutuFinanceService;

@Controller
@RequestMapping("/anjutufinance")
public class AnjutuFinanceController {
	
	@Resource
	private AnjutuFinanceService anjutufinanceService;
	
	/**
	 * description anjutufinance 添加页面
	 * 2014-8-19 10:18:56
	 * @author jiwurapid
	 */
	@RequestMapping("/add")
	public String add(){
		return "/anjutufinance/anjutufinance_addoredit";
	}
	
	/**
	 * description anjutufinance 修改页面
	 * 2014-8-19 10:18:56
	 * @author jiwurapid
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(int id){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutufinance", anjutufinanceService.findById(id));
		view.setViewName("/anjutufinance/anjutufinance_addoredit");
		return view;
	}
	
	/**
	 * description anjutufinance 删除
	 * 2014-8-19 10:18:56
	 * @author jiwurapid
	 */
	@RequestMapping("/delete")
	public ModelAndView delete(int id){
		ModelAndView view = new ModelAndView();
		anjutufinanceService.delete(id);
		view.addObject("anjutufinancelist", anjutufinanceService.getAnjutuFinancelist(0, 10));
		view.setViewName("/anjutufinance/anjutufinance_list");
		return view;
	}
	
	/**
	 * description anjutufinance 保存
	 * 2014-8-19 10:18:56
	 * @author jiwurapid
	 */
	@RequestMapping(value="/addoredit",method=RequestMethod.POST)
	public ModelAndView addoredit(AnjutuFinance anjutufinance){
		ModelAndView view = new ModelAndView();
		if(anjutufinance.getId() > 0){
			anjutufinanceService.update(anjutufinance);
		}else{
			anjutufinanceService.add(anjutufinance);
		}
		view.addObject("anjutufinancelist", anjutufinanceService.getAnjutuFinancelist(0, 10));
		view.setViewName("/anjutufinance/anjutufinance_list");
		return view;
	}
	
	/**
	 * description anjutufinance 列表
	 * 2014-8-19 10:18:56
	 * @author jiwurapid
	 */
	@RequestMapping(value="/list")
	public ModelAndView list(){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutufinancelist", anjutufinanceService.getAnjutuFinancelist(0, 10));
		view.setViewName("/anjutufinance/anjutufinance_list");
		return view;
	}
	
}
