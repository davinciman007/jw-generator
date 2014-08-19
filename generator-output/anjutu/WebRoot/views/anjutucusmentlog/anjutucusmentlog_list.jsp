<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuCusmentlog添加编辑</H1><H1><a href="/anjutucusmentlog/add" target="_blank">添加</a></H1>
		<table>
			<tr>
				<th>id</th>
				<th>kid</th>
				<th>type</th>
				<th>remark</th>
				<th>operateId</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${anjutucusmentloglist}" var="anjutucusmentlog">
				<tr>
							<td>${anjutucusmentlog.id}</td>
							<td>${anjutucusmentlog.kid}</td>
							<td>${anjutucusmentlog.type}</td>
							<td>${anjutucusmentlog.remark}</td>
							<td>${anjutucusmentlog.operateId}</td>
				<td><a href="/anjutucusmentlog/edit?id=${anjutucusmentlog.id}" target="_blank">编辑</a>
							<a href="/anjutucusmentlog/delete?id=${anjutucusmentlog.id}" target="_blank">删除</a></td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>
