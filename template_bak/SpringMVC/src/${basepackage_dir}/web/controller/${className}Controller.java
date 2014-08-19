<#include "/custom.include">
<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameFirstLower = className?uncap_first>   
<#assign classNameLowerCase = className?lower_case>     

package ${basepackage}.web.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ${basepackage}.domain.${className};
import ${basepackage}.util.DateUtil;
import com.sourceframework.domain.JsonResult;

@Controller
@RequestMapping("/${classNameLowerCase}")
public class ${className}Controller extends BaseController {


	@RequestMapping(value="/list",method=RequestMethod.GET)   
	public String list(Model model,HttpServletRequest request){
		return "/${classNameLowerCase}/list";
	}

	@RequestMapping(value="/queryList",method=RequestMethod.POST)
	public ModelMap queryList(${className} ${classNameFirstLower},ModelMap model) {
		int total =service.get("get${className}ListCount",${classNameFirstLower});
		Collection<${className}> data =service.getAll("get${className}List",${classNameFirstLower},${classNameFirstLower}.getOffset(),${classNameFirstLower}.getLimit());
		model.addAttribute("total", total);
		model.addAttribute("rows", data);
		return model;
	}
	
	
	@RequestMapping(value="/popWindow",method=RequestMethod.GET)
	public String popWindow(Model model){
		return "/${classNameLowerCase}/popWindow";
	}
	
	@RequestMapping(value="/addOrUpdate",method=RequestMethod.POST)
	public ModelAndView addOrUpdate(${className} ${classNameFirstLower}){
		JsonResult<String> result = new JsonResult<String>();		
		try {
		
				service.update("update${className}", ${classNameFirstLower});
		
				service.insert("insert${className}", ${classNameFirstLower});
	
			result.setMessage("操作成功");
		} catch (Exception e) {
			result.setSuccess(false);
			result.setMessage(e.getMessage());
		}
		
		return new ModelAndView("jsonView", result);
	}
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public ModelAndView delete(@RequestParam Integer id){
		JsonResult<String> result = new JsonResult<String>();
		try {
			service.delete("delete${className}", id);
			result.setMessage("操作成功");
		} catch (Exception e) {
			result.setSuccess(false);
			result.setMessage(e.getMessage());
		}
		
		return new ModelAndView("jsonView", result);
	}
}

