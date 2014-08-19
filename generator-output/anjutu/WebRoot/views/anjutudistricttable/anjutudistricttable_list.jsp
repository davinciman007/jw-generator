<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuDistricttable添加编辑</H1><H1><a href="/anjutudistricttable/add" target="_blank">添加</a></H1>
		<table>
			<tr>
				<th>dtid</th>
				<th>name</th>
				<th>remark</th>
				<th>parentId</th>
				<th>status</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${anjutudistricttablelist}" var="anjutudistricttable">
				<tr>
							<td>${anjutudistricttable.dtid}</td>
							<td>${anjutudistricttable.name}</td>
							<td>${anjutudistricttable.remark}</td>
							<td>${anjutudistricttable.parentId}</td>
							<td>${anjutudistricttable.status}</td>
				<td><a href="/anjutudistricttable/edit?id=${anjutudistricttable.dtid}" target="_blank">编辑</a>
							<a href="/anjutudistricttable/delete?id=${anjutudistricttable.dtid}" target="_blank">删除</a></td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>
