<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuBuild添加编辑</H1><H1><a href="/anjutubuild/add" target="_blank">添加</a></H1>
		<table>
			<tr>
				<th>bid</th>
				<th>bname</th>
				<th>title</th>
				<th>averagePrice</th>
				<th>path</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${anjutubuildlist}" var="anjutubuild">
				<tr>
							<td>${anjutubuild.bid}</td>
							<td>${anjutubuild.bname}</td>
							<td>${anjutubuild.title}</td>
							<td>${anjutubuild.averagePrice}</td>
							<td>${anjutubuild.path}</td>
				<td><a href="/anjutubuild/edit?id=${anjutubuild.bid}" target="_blank">编辑</a>
							<a href="/anjutubuild/delete?id=${anjutubuild.bid}" target="_blank">删除</a></td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>
