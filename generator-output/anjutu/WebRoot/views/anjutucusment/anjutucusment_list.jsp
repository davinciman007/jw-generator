<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuCusment添加编辑</H1><H1><a href="/anjutucusment/add" target="_blank">添加</a></H1>
		<table>
			<tr>
				<th>cusId</th>
				<th>cusNumber</th>
				<th>name</th>
				<th>mobile</th>
				<th>email</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${anjutucusmentlist}" var="anjutucusment">
				<tr>
							<td>${anjutucusment.cusId}</td>
							<td>${anjutucusment.cusNumber}</td>
							<td>${anjutucusment.name}</td>
							<td>${anjutucusment.mobile}</td>
							<td>${anjutucusment.email}</td>
				<td><a href="/anjutucusment/edit?id=${anjutucusment.cusid}" target="_blank">编辑</a>
							<a href="/anjutucusment/delete?id=${anjutucusment.cusid}" target="_blank">删除</a></td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>
