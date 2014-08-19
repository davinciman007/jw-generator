<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuEsfhouselog添加编辑</H1><H1><a href="/anjutuesfhouselog/add" target="_blank">添加</a></H1>
		<table>
			<tr>
				<th>id</th>
				<th>houseId</th>
				<th>type</th>
				<th>remark</th>
				<th>operateId</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${anjutuesfhouseloglist}" var="anjutuesfhouselog">
				<tr>
							<td>${anjutuesfhouselog.id}</td>
							<td>${anjutuesfhouselog.houseId}</td>
							<td>${anjutuesfhouselog.type}</td>
							<td>${anjutuesfhouselog.remark}</td>
							<td>${anjutuesfhouselog.operateId}</td>
				<td><a href="/anjutuesfhouselog/edit?id=${anjutuesfhouselog.id}" target="_blank">编辑</a>
							<a href="/anjutuesfhouselog/delete?id=${anjutuesfhouselog.id}" target="_blank">删除</a></td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>
