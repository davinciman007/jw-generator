package com.jiwu.anjutu.web;
/**
 * description anjutubuildpicture 控制器
 * 2014-8-19 10:17:57
 * @author jiwurapid
 */


import javax.annotation.Resource;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jiwu.anjutu.entity.AnjutuBuildpicture;
import com.jiwu.anjutu.service.AnjutuBuildpictureService;

@Controller
@RequestMapping("/anjutubuildpicture")
public class AnjutuBuildpictureController {
	
	@Resource
	private AnjutuBuildpictureService anjutubuildpictureService;
	
	/**
	 * description anjutubuildpicture 添加页面
	 * 2014-8-19 10:17:57
	 * @author jiwurapid
	 */
	@RequestMapping("/add")
	public String add(){
		return "/anjutubuildpicture/anjutubuildpicture_addoredit";
	}
	
	/**
	 * description anjutubuildpicture 修改页面
	 * 2014-8-19 10:17:57
	 * @author jiwurapid
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(int id){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutubuildpicture", anjutubuildpictureService.findById(id));
		view.setViewName("/anjutubuildpicture/anjutubuildpicture_addoredit");
		return view;
	}
	
	/**
	 * description anjutubuildpicture 删除
	 * 2014-8-19 10:17:57
	 * @author jiwurapid
	 */
	@RequestMapping("/delete")
	public ModelAndView delete(int id){
		ModelAndView view = new ModelAndView();
		anjutubuildpictureService.delete(id);
		view.addObject("anjutubuildpicturelist", anjutubuildpictureService.getAnjutuBuildpicturelist(0, 10));
		view.setViewName("/anjutubuildpicture/anjutubuildpicture_list");
		return view;
	}
	
	/**
	 * description anjutubuildpicture 保存
	 * 2014-8-19 10:17:57
	 * @author jiwurapid
	 */
	@RequestMapping(value="/addoredit",method=RequestMethod.POST)
	public ModelAndView addoredit(AnjutuBuildpicture anjutubuildpicture){
		ModelAndView view = new ModelAndView();
		if(anjutubuildpicture.getBpid() > 0){
			anjutubuildpictureService.update(anjutubuildpicture);
		}else{
			anjutubuildpictureService.add(anjutubuildpicture);
		}
		view.addObject("anjutubuildpicturelist", anjutubuildpictureService.getAnjutuBuildpicturelist(0, 10));
		view.setViewName("/anjutubuildpicture/anjutubuildpicture_list");
		return view;
	}
	
	/**
	 * description anjutubuildpicture 列表
	 * 2014-8-19 10:17:57
	 * @author jiwurapid
	 */
	@RequestMapping(value="/list")
	public ModelAndView list(){
		ModelAndView view = new ModelAndView();
		view.addObject("anjutubuildpicturelist", anjutubuildpictureService.getAnjutuBuildpicturelist(0, 10));
		view.setViewName("/anjutubuildpicture/anjutubuildpicture_list");
		return view;
	}
	
}
