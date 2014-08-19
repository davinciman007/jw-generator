<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuCusmentdetail添加编辑</H1><H1><a href="/anjutucusmentdetail/add" target="_blank">添加</a></H1>
		<table>
			<tr>
				<th>cid</th>
				<th>cusNumber</th>
				<th>mobile</th>
				<th>name</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${anjutucusmentdetaillist}" var="anjutucusmentdetail">
				<tr>
							<td>${anjutucusmentdetail.cid}</td>
							<td>${anjutucusmentdetail.cusNumber}</td>
							<td>${anjutucusmentdetail.mobile}</td>
							<td>${anjutucusmentdetail.name}</td>
				<td><a href="/anjutucusmentdetail/edit?id=${anjutucusmentdetail.cid}" target="_blank">编辑</a>
							<a href="/anjutucusmentdetail/delete?id=${anjutucusmentdetail.cid}" target="_blank">删除</a></td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>
