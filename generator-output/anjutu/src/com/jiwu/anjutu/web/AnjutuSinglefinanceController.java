package com.jiwu.anjutu.web;
/**
 * description anjutusinglefinance 控制器
 * 2014-8-19 10:19:14
 * @author jiwurapid
 */


import javax.annotation.Resource;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jiwu.anjutu.entity.AnjutuSinglefinance;
import com.jiwu.anjutu.service.AnjutuSinglefinanceService;

@Controller
@RequestMapping("/anjutusinglefinance")
public class AnjutuSinglefinanceController {
	
	@Resource
	private AnjutuSinglefinanceService anjutusinglefinanceService;
	
	/**
	 * description anjutusinglefinance 添加页面
	 * 2014-8-19 10:19:14
	 * @author jiwurapid
	 */
	@RequestMapping("/add")
	public String add(){
		return "/anjutusinglefinance/anjutusinglefinance_addoredit";
	}
	
	/**
	 * description anjutusinglefinance 修改页面
	 * 2014-8-19 10:19:14
	 * @author jiwurapid
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(int id){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutusinglefinance", anjutusinglefinanceService.findById(id));
		view.setViewName("/anjutusinglefinance/anjutusinglefinance_addoredit");
		return view;
	}
	
	/**
	 * description anjutusinglefinance 删除
	 * 2014-8-19 10:19:14
	 * @author jiwurapid
	 */
	@RequestMapping("/delete")
	public ModelAndView delete(int id){
		ModelAndView view = new ModelAndView();
		anjutusinglefinanceService.delete(id);
		view.addObject("anjutusinglefinancelist", anjutusinglefinanceService.getAnjutuSinglefinancelist(0, 10));
		view.setViewName("/anjutusinglefinance/anjutusinglefinance_list");
		return view;
	}
	
	/**
	 * description anjutusinglefinance 保存
	 * 2014-8-19 10:19:14
	 * @author jiwurapid
	 */
	@RequestMapping(value="/addoredit",method=RequestMethod.POST)
	public ModelAndView addoredit(AnjutuSinglefinance anjutusinglefinance){
		ModelAndView view = new ModelAndView();
		if(anjutusinglefinance.getId() > 0){
			anjutusinglefinanceService.update(anjutusinglefinance);
		}else{
			anjutusinglefinanceService.add(anjutusinglefinance);
		}
		view.addObject("anjutusinglefinancelist", anjutusinglefinanceService.getAnjutuSinglefinancelist(0, 10));
		view.setViewName("/anjutusinglefinance/anjutusinglefinance_list");
		return view;
	}
	
	/**
	 * description anjutusinglefinance 列表
	 * 2014-8-19 10:19:14
	 * @author jiwurapid
	 */
	@RequestMapping(value="/list")
	public ModelAndView list(){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutusinglefinancelist", anjutusinglefinanceService.getAnjutuSinglefinancelist(0, 10));
		view.setViewName("/anjutusinglefinance/anjutusinglefinance_list");
		return view;
	}
	
}
