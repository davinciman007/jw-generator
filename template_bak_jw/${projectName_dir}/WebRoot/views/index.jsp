<#assign pkName = table.primaryKeyColumns[0]>
<#assign className = table.className>   
<#assign classNameFirstLower = className?uncap_first>   
<#assign classNameLowerCase = className?lower_case> 
<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="header.jsp" %>
	<H1>项目首页</H1>
	<table>
		<#list tables as table>
			<tr><td><a href="/${table.className?lower_case }/list" target="_blank">${table.className }</a></td></tr>
		</#list>
	</table>
<%@ include file="footer.jsp" %>
