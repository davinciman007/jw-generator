<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuContract添加编辑</H1><H1><a href="/anjutucontract/add" target="_blank">添加</a></H1>
		<table>
			<tr>
				<th>contractId</th>
				<th>contractNumber</th>
				<th>houseId</th>
				<th>houseNumber</th>
				<th>bid</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${anjutucontractlist}" var="anjutucontract">
				<tr>
							<td>${anjutucontract.contractId}</td>
							<td>${anjutucontract.contractNumber}</td>
							<td>${anjutucontract.houseId}</td>
							<td>${anjutucontract.houseNumber}</td>
							<td>${anjutucontract.bid}</td>
				<td><a href="/anjutucontract/edit?id=${anjutucontract.contractid}" target="_blank">编辑</a>
							<a href="/anjutucontract/delete?id=${anjutucontract.contractid}" target="_blank">删除</a></td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>
