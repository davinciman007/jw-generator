<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign classNameLowerCase = className?lower_case> 
package ${basepackage}.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import ${basepackage}.dao.IGenericDAO;
import ${basepackage}.service.I${className}Manager;
import ${basepackage}.utils.StringUtil;

/**
 * description ${classNameLowerCase} EJB Impl
 * ${.now}
 * @author ${author}
 */
@Stateless(name = "${classNameLowerCase}Manager")
@Remote(I${className}Manager.class)

public class ${className}ManagerImpl implements I${className}Manager {
	@EJB(beanName = "${classNameLowerCase}DAO")
	private IGenericDAO<${className}, Integer> ${classNameLowerCase}DAO;
	
	public ${className} save(${className} entity) {
		LogUtil.log("saving Object instance", Level.INFO, null);
		try {
			return ${classNameLowerCase}DAO.create(entity);
		} catch (RuntimeException re) {
			LogUtil.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	public void delete(${className} entity) {
		LogUtil.log("deleting Object instance", Level.INFO, null);
		try {
			${classNameLowerCase}DAO.delete(entity);
			LogUtil.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			LogUtil.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	public ${className} update(${className} entity) {
		LogUtil.log("updating Object instance", Level.INFO, null);
		try {
			${className} result = ${classNameLowerCase}DAO.update(entity);
			LogUtil.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			LogUtil.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public ${className} findById(int id) {
		LogUtil.log("finding Object instance with id: " + id, Level.INFO, null);
		try {
			${className} instance = ${classNameLowerCase}DAO.findById(id);
			return instance;
		} catch (RuntimeException re) {
			LogUtil.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<${className}> findAll() {
		LogUtil.log("finding all Object instances", Level.INFO, null);
		try {
			return null;
		} catch (RuntimeException re) {
			LogUtil.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	/**
	 * description ${classNameLowerCase} 列表分页查询
	 * ${.now}
	 * @author ${author}
	 */
	public List<${className}> get${className}List(HashMap<String, Object> params){
		String hql = "from ${className} where 1=1 ";
		int index = 0;
		int size = 0;
		if(params.containsKey("index")){
			index = Integer.parseInt(params.get("index").toString());
		}
		if(params.containsKey("size")){
			size = Integer.parseInt(params.get("size").toString());
		}
		<#list table.columns as column>
		hql+= StringUtil.getIntMapValue("${column.columnNameLower}", params, "=");
		</#list>
		return ${classNameLowerCase}DAO.findPaged(hql, index, size);
	}
	
	/**
	 * description ${classNameLowerCase} 统计个数
	 * ${.now}
	 * @author ${author}
	 */
	public int count${className}(HashMap<String, Object> params){
		String sql = "select count(*) from ${className} where 1=1 ";
		<#list table.columns as column>
		sql+= StringUtil.getIntMapValue("${column.columnNameLower}", params, "=");
		</#list>
		return ${classNameLowerCase}DAO.countRows(sql).intValue();
	}

}