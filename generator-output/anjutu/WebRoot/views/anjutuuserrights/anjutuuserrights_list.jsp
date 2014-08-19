<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuUserrights添加编辑</H1><H1><a href="/anjutuuserrights/add" target="_blank">添加</a></H1>
		<table>
			<tr>
				<th>urid</th>
				<th>urname</th>
				<th>status</th>
				<th>actionName</th>
				<th>type</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${anjutuuserrightslist}" var="anjutuuserrights">
				<tr>
							<td>${anjutuuserrights.urid}</td>
							<td>${anjutuuserrights.urname}</td>
							<td>${anjutuuserrights.status}</td>
							<td>${anjutuuserrights.actionName}</td>
							<td>${anjutuuserrights.type}</td>
				<td><a href="/anjutuuserrights/edit?id=${anjutuuserrights.urid}" target="_blank">编辑</a>
							<a href="/anjutuuserrights/delete?id=${anjutuuserrights.urid}" target="_blank">删除</a></td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>
