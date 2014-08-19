<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign classNameLowerCase = className?lower_case> 
package ${basepackage}.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * description ${classNameLowerCase} Entity
 * ${.now}
 * @author ${author}
 */
@Entity
@Table(name = "${table.sqlName}", catalog = "${dbName}")



public class ${className}{
	
	//columns START
	<#list table.columns as column>
	<#if column_index == 0>
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "${column.columnNameLower}", unique = true, nullable = false)
	private ${column.javaType} ${column.columnNameLower};
	<#else>
	private ${column.javaType} ${column.columnNameLower};
	</#if>
	</#list>
	//columns END


<@generateJavaColumns/>


}

<#macro generateJavaColumns>
	<#list table.columns as column>
	public void set${column.columnName}(${column.javaType} value) {
		this.${column.columnNameLower} = value;
	}
	
	public ${column.javaType} get${column.columnName}() {
		return this.${column.columnNameLower};
	}
	</#list>
</#macro>

