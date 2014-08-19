<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuSinglefinance添加编辑</H1><H1><a href="/anjutusinglefinance/add" target="_blank">添加</a></H1>
		<table>
			<tr>
				<th>id</th>
				<th>contractId</th>
				<th>contractNumber</th>
				<th>totalCommission</th>
				<th>singleCommission</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${anjutusinglefinancelist}" var="anjutusinglefinance">
				<tr>
							<td>${anjutusinglefinance.id}</td>
							<td>${anjutusinglefinance.contractId}</td>
							<td>${anjutusinglefinance.contractNumber}</td>
							<td>${anjutusinglefinance.totalCommission}</td>
							<td>${anjutusinglefinance.singleCommission}</td>
				<td><a href="/anjutusinglefinance/edit?id=${anjutusinglefinance.id}" target="_blank">编辑</a>
							<a href="/anjutusinglefinance/delete?id=${anjutusinglefinance.id}" target="_blank">删除</a></td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>
