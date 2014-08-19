<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuEsfhouse添加编辑</H1><H1><a href="/anjutuesfhouse/add" target="_blank">添加</a></H1>
		<table>
			<tr>
				<th>houseId</th>
				<th>houseNumber</th>
				<th>bid</th>
				<th>bname</th>
				<th>cityId</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${anjutuesfhouselist}" var="anjutuesfhouse">
				<tr>
							<td>${anjutuesfhouse.houseId}</td>
							<td>${anjutuesfhouse.houseNumber}</td>
							<td>${anjutuesfhouse.bid}</td>
							<td>${anjutuesfhouse.bname}</td>
							<td>${anjutuesfhouse.cityId}</td>
				<td><a href="/anjutuesfhouse/edit?id=${anjutuesfhouse.houseid}" target="_blank">编辑</a>
							<a href="/anjutuesfhouse/delete?id=${anjutuesfhouse.houseid}" target="_blank">删除</a></td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>
