<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuAreaconfig添加编辑</H1><H1><a href="/anjutuareaconfig/add" target="_blank">添加</a></H1>
		<table>
			<tr>
				<th>acid</th>
				<th>tag</th>
				<th>status</th>
				<th>areaName</th>
				<th>cityId</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${anjutuareaconfiglist}" var="anjutuareaconfig">
				<tr>
							<td>${anjutuareaconfig.acid}</td>
							<td>${anjutuareaconfig.tag}</td>
							<td>${anjutuareaconfig.status}</td>
							<td>${anjutuareaconfig.areaName}</td>
							<td>${anjutuareaconfig.cityId}</td>
				<td><a href="/anjutuareaconfig/edit?id=${anjutuareaconfig.acid}" target="_blank">编辑</a>
							<a href="/anjutuareaconfig/delete?id=${anjutuareaconfig.acid}" target="_blank">删除</a></td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>
