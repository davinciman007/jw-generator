<#assign pkName = table.primaryKeyColumns[0]>
<#assign className = table.className>   
<#assign classNameFirstLower = className?uncap_first>   
<#assign classNameLowerCase = className?lower_case>
<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>${className}添加编辑</H1><H1><a href="/${classNameLowerCase }/add" target="_blank">添加</a></H1>
		<table>
			<tr>
				<#list table.columns as column>
				<#if column_index lt 5>
				<th>${column.columnNameLower }</th>
				</#if>
				</#list>
				<th>操作</th>
			</tr>
			<c:forEach items="${'$'}{${classNameLowerCase}list}" var="${classNameLowerCase}">
				<tr>
				<#list table.columns as column>
					<#if column_index lt 5>
							<td>${'$'}{${classNameLowerCase}.${column.columnNameLower}}</td>
					</#if>
				</#list>
				<td><a href="/${classNameLowerCase }/edit?id=${'$'}{${classNameLowerCase}.${pkName?lower_case}}" target="_blank">编辑</a>
							<a href="/${classNameLowerCase }/delete?id=${'$'}{${classNameLowerCase}.${pkName?lower_case}}" target="_blank">删除</a></td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>
