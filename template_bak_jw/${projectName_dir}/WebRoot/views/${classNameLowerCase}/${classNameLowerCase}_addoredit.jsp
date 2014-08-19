<#assign pkName = table.primaryKeyColumns[0]>
<#assign className = table.className>   
<#assign classNameFirstLower = className?uncap_first>   
<#assign classNameLowerCase = className?lower_case> 
<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>${className}添加编辑</H1>
	<form action="<c:url value="/${classNameLowerCase}/addoredit"/>" method="post">
		<input type="hidden" name="${pkName?lower_case}" id="${pkName?lower_case}"
		value='<c:out value="${'$'}{${classNameLowerCase}.${pkName?lower_case}}" default="0" />'/>
		<table>
			<#list table.columns as column>
				<#if column_index gt 0>
					<#if column.javaType == 'java.util.Date'>
						<tr><td>${column.columnNameLower }:<input onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" type="input" name="${column.columnNameLower }" id="${column.columnNameLower }" value="${'$'}{${classNameLowerCase}.${column.columnNameLower } }"/></td></tr>
					<#else>
						<tr><td>${column.columnNameLower }:<input type="input" name="${column.columnNameLower }" id="${column.columnNameLower }" value="${'$'}{${classNameLowerCase}.${column.columnNameLower } }"/></td></tr>
					</#if>
				</#if>
			</#list>
			<tr><td><input type="submit" value="保存"/></td></tr>
		</table>
	</form>
<%@ include file="../footer.jsp" %>
