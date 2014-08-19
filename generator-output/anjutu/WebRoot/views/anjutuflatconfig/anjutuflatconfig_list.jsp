<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuFlatconfig添加编辑</H1><H1><a href="/anjutuflatconfig/add" target="_blank">添加</a></H1>
		<table>
			<tr>
				<th>flatId</th>
				<th>cityId</th>
				<th>name</th>
				<th>businessType</th>
				<th>typeName</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${anjutuflatconfiglist}" var="anjutuflatconfig">
				<tr>
							<td>${anjutuflatconfig.flatId}</td>
							<td>${anjutuflatconfig.cityId}</td>
							<td>${anjutuflatconfig.name}</td>
							<td>${anjutuflatconfig.businessType}</td>
							<td>${anjutuflatconfig.typeName}</td>
				<td><a href="/anjutuflatconfig/edit?id=${anjutuflatconfig.flatid}" target="_blank">编辑</a>
							<a href="/anjutuflatconfig/delete?id=${anjutuflatconfig.flatid}" target="_blank">删除</a></td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>
