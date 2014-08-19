<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuContractlog添加编辑</H1><H1><a href="/anjutucontractlog/add" target="_blank">添加</a></H1>
		<table>
			<tr>
				<th>id</th>
				<th>contractId</th>
				<th>contractNumber</th>
				<th>statusBefore</th>
				<th>statusAfter</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${anjutucontractloglist}" var="anjutucontractlog">
				<tr>
							<td>${anjutucontractlog.id}</td>
							<td>${anjutucontractlog.contractId}</td>
							<td>${anjutucontractlog.contractNumber}</td>
							<td>${anjutucontractlog.statusBefore}</td>
							<td>${anjutucontractlog.statusAfter}</td>
				<td><a href="/anjutucontractlog/edit?id=${anjutucontractlog.id}" target="_blank">编辑</a>
							<a href="/anjutucontractlog/delete?id=${anjutucontractlog.id}" target="_blank">删除</a></td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>
