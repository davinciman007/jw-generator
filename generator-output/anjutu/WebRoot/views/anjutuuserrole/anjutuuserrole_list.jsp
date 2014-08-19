<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuUserrole添加编辑</H1><H1><a href="/anjutuuserrole/add" target="_blank">添加</a></H1>
		<table>
			<tr>
				<th>roleId</th>
				<th>roleName</th>
				<th>status</th>
				<th>type</th>
				<th>ucode</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${anjutuuserrolelist}" var="anjutuuserrole">
				<tr>
							<td>${anjutuuserrole.roleId}</td>
							<td>${anjutuuserrole.roleName}</td>
							<td>${anjutuuserrole.status}</td>
							<td>${anjutuuserrole.type}</td>
							<td>${anjutuuserrole.ucode}</td>
				<td><a href="/anjutuuserrole/edit?id=${anjutuuserrole.roleid}" target="_blank">编辑</a>
							<a href="/anjutuuserrole/delete?id=${anjutuuserrole.roleid}" target="_blank">删除</a></td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>
