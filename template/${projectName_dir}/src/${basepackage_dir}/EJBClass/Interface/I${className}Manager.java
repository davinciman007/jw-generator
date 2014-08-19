<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign classNameLowerCase = className?lower_case>
package ${basepackage}.service;

import java.util.HashMap;
import java.util.List;
import com.jilaidai.entity.${className};
/**
 * description ${classNameLowerCase} EJB Interface
 * ${.now}
 * @author ${author}
 */
public interface I${className}Manager {
	
	public ${className} save(${className} entity);
	
	public void delete(${className} entity);
	
	public ${className} update(${className} entity);

	public ${className} findById(int id);
	
	public List<${className}> findAll();
	
	public List<${className}> get${className}List(HashMap<String, Object> params);
	
	public int count${className}(HashMap<String, Object> params);
}