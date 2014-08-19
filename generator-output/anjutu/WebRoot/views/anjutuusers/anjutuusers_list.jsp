<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuUsers添加编辑</H1><H1><a href="/anjutuusers/add" target="_blank">添加</a></H1>
		<table>
			<tr>
				<th>uid</th>
				<th>jobNumber</th>
				<th>username</th>
				<th>password</th>
				<th>cityId</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${anjutuuserslist}" var="anjutuusers">
				<tr>
							<td>${anjutuusers.uid}</td>
							<td>${anjutuusers.jobNumber}</td>
							<td>${anjutuusers.username}</td>
							<td>${anjutuusers.password}</td>
							<td>${anjutuusers.cityId}</td>
				<td><a href="/anjutuusers/edit?id=${anjutuusers.uid}" target="_blank">编辑</a>
							<a href="/anjutuusers/delete?id=${anjutuusers.uid}" target="_blank">删除</a></td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>
