<#assign className = table.className>
<#assign pkName = table.primaryKeyColumns[0]?uncap_first>
<#assign classNameFirstLower = className?uncap_first>   
<#assign classNameLowerCase = className?lower_case> 
package ${basepackage}.web;
/**
 * description ${classNameLowerCase} 控制器
 * ${.now}
 * @author ${author}
 */


import javax.annotation.Resource;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ${basepackage}.entity.${className};
import ${basepackage}.service.${className}Service;

@Controller
@RequestMapping("/${classNameLowerCase}")
public class ${className}Controller {
	
	@Resource
	private ${className}Service ${classNameLowerCase}Service;
	
	/**
	 * description ${classNameLowerCase} 添加页面
	 * ${.now}
	 * @author ${author}
	 */
	@RequestMapping("/add")
	public String add(){
		return "/${classNameLowerCase}/${classNameLowerCase}_addoredit";
	}
	
	/**
	 * description ${classNameLowerCase} 修改页面
	 * ${.now}
	 * @author ${author}
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(int id){
		ModelAndView view = new ModelAndView();
		view.addObject("${classNameLowerCase}", ${classNameLowerCase}Service.findById(id));
		view.setViewName("/${classNameLowerCase}/${classNameLowerCase}_addoredit");
		return view;
	}
	
	/**
	 * description ${classNameLowerCase} 删除
	 * ${.now}
	 * @author ${author}
	 */
	@RequestMapping("/delete")
	public ModelAndView delete(int id){
		ModelAndView view = new ModelAndView();
		${classNameLowerCase}Service.delete(id);
		view.addObject("${classNameLowerCase}list", ${classNameLowerCase}Service.get${className}list(0, 10));
		view.setViewName("/${classNameLowerCase}/${classNameLowerCase}_list");
		return view;
	}
	
	/**
	 * description ${classNameLowerCase} 保存
	 * ${.now}
	 * @author ${author}
	 */
	@RequestMapping(value="/addoredit",method=RequestMethod.POST)
	public ModelAndView addoredit(${className} ${classNameLowerCase}){
		ModelAndView view = new ModelAndView();
		if(${classNameLowerCase}.get${pkName}() > 0){
			${classNameLowerCase}Service.update(${classNameLowerCase});
		}else{
			${classNameLowerCase}Service.add(${classNameLowerCase});
		}
		view.addObject("${classNameLowerCase}list", ${classNameLowerCase}Service.get${className}list(0, 10));
		view.setViewName("/${classNameLowerCase}/${classNameLowerCase}_list");
		return view;
	}
	
	/**
	 * description ${classNameLowerCase} 列表
	 * ${.now}
	 * @author ${author}
	 */
	@RequestMapping(value="/list")
	public ModelAndView list(){
		ModelAndView view = new ModelAndView();
		view.addObject("${classNameLowerCase}list", ${classNameLowerCase}Service.get${className}list(0, 10));
		view.setViewName("/${classNameLowerCase}/${classNameLowerCase}_list");
		return view;
	}
	
}
