<#assign className = table.className>   
<#assign classNameFirstLower = className?uncap_first>   
<#assign classNameLowerCase = className?lower_case> 
/**
 * description ${classNameLowerCase} 业务处理
 * ${.now}
 * @author ${author}
 */

package ${basepackage}.service;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import ${basepackage}.entity.${className};

@Component
public class ${className}Service {
	
	@Resource
	private I${className}Manager ${classNameLowerCase}Manager;
	
	/**
	 * description ${classNameLowerCase} 查找
	 * ${.now}
	 * @author ${author}
	 */
	public ${className} findById(int id){
		return ${classNameLowerCase}Manager.findById(id);
	}
	
	/**
	 * description ${classNameLowerCase} 添加
	 * ${.now}
	 * @author ${author}
	 */
	public void add(${className} ${classNameLowerCase}){
		${classNameLowerCase}Manager.save(${classNameLowerCase});
	}
	
	/**
	 * description ${classNameLowerCase} 修改
	 * ${.now}
	 * @author ${author}
	 */
	public ${className} update(${className} ${classNameLowerCase}){
		return ${classNameLowerCase}Manager.update(${classNameLowerCase});
	}
	
	/**
	 * description ${classNameLowerCase} 删除
	 * ${.now}
	 * @author ${author}
	 */
	public void delete(int id){
		${className} ${classNameLowerCase} = ${classNameLowerCase}Manager.findById(id);
		${classNameLowerCase}Manager.delete(${classNameLowerCase});
	}
	
	/**
	 * description 查找 ${classNameLowerCase} 列表
	 * ${.now}
	 * @author ${author}
	 */
	public List<${className}> get${className}list(int page, int size){
		HashMap<String, Object> params_${classNameLowerCase} = new HashMap<String, Object>();
		params_${classNameLowerCase}.put("index", (page-1)*size);
		params_${classNameLowerCase}.put("size", size);
		return ${classNameLowerCase}Manager.get${className}List(params_${classNameLowerCase});
	}

}
