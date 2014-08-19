<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuFinance添加编辑</H1><H1><a href="/anjutufinance/add" target="_blank">添加</a></H1>
		<table>
			<tr>
				<th>id</th>
				<th>contractNumber</th>
				<th>contractId</th>
				<th>flatId</th>
				<th>paymentType</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${anjutufinancelist}" var="anjutufinance">
				<tr>
							<td>${anjutufinance.id}</td>
							<td>${anjutufinance.contractNumber}</td>
							<td>${anjutufinance.contractId}</td>
							<td>${anjutufinance.flatId}</td>
							<td>${anjutufinance.paymentType}</td>
				<td><a href="/anjutufinance/edit?id=${anjutufinance.id}" target="_blank">编辑</a>
							<a href="/anjutufinance/delete?id=${anjutufinance.id}" target="_blank">删除</a></td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>
