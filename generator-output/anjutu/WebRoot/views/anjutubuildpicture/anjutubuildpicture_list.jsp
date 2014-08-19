<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuBuildpicture添加编辑</H1><H1><a href="/anjutubuildpicture/add" target="_blank">添加</a></H1>
		<table>
			<tr>
				<th>bpid</th>
				<th>bid</th>
				<th>fileName</th>
				<th>path</th>
				<th>ctime</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${anjutubuildpicturelist}" var="anjutubuildpicture">
				<tr>
							<td>${anjutubuildpicture.bpid}</td>
							<td>${anjutubuildpicture.bid}</td>
							<td>${anjutubuildpicture.fileName}</td>
							<td>${anjutubuildpicture.path}</td>
							<td>${anjutubuildpicture.ctime}</td>
				<td><a href="/anjutubuildpicture/edit?id=${anjutubuildpicture.bpid}" target="_blank">编辑</a>
							<a href="/anjutubuildpicture/delete?id=${anjutubuildpicture.bpid}" target="_blank">删除</a></td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>
