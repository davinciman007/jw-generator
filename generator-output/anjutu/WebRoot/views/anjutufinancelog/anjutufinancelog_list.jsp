<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuFinancelog添加编辑</H1><H1><a href="/anjutufinancelog/add" target="_blank">添加</a></H1>
		<table>
			<tr>
				<th>id</th>
				<th>contractNumber</th>
				<th>contractId</th>
				<th>flatId</th>
				<th>paymentType</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${anjutufinanceloglist}" var="anjutufinancelog">
				<tr>
							<td>${anjutufinancelog.id}</td>
							<td>${anjutufinancelog.contractNumber}</td>
							<td>${anjutufinancelog.contractId}</td>
							<td>${anjutufinancelog.flatId}</td>
							<td>${anjutufinancelog.paymentType}</td>
				<td><a href="/anjutufinancelog/edit?id=${anjutufinancelog.id}" target="_blank">编辑</a>
							<a href="/anjutufinancelog/delete?id=${anjutufinancelog.id}" target="_blank">删除</a></td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>
