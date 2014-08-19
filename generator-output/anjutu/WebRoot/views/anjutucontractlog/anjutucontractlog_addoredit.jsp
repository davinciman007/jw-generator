<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuContractlog添加编辑</H1>
	<form action="<c:url value="/anjutucontractlog/addoredit"/>" method="post">
		<input type="hidden" name="id" id="id"
		value='<c:out value="${anjutucontractlog.id}" default="0" />'/>
		<table>
						<tr><td>contractId:<input type="input" name="contractId" id="contractId" value="${anjutucontractlog.contractId }"/></td></tr>
						<tr><td>contractNumber:<input type="input" name="contractNumber" id="contractNumber" value="${anjutucontractlog.contractNumber }"/></td></tr>
						<tr><td>statusBefore:<input type="input" name="statusBefore" id="statusBefore" value="${anjutucontractlog.statusBefore }"/></td></tr>
						<tr><td>statusAfter:<input type="input" name="statusAfter" id="statusAfter" value="${anjutucontractlog.statusAfter }"/></td></tr>
						<tr><td>ctime:<input type="input" name="ctime" id="ctime" value="${anjutucontractlog.ctime }"/></td></tr>
						<tr><td>remark:<input type="input" name="remark" id="remark" value="${anjutucontractlog.remark }"/></td></tr>
						<tr><td>operateId:<input type="input" name="operateId" id="operateId" value="${anjutucontractlog.operateId }"/></td></tr>
						<tr><td>operateName:<input type="input" name="operateName" id="operateName" value="${anjutucontractlog.operateName }"/></td></tr>
			<tr><td><input type="submit" value="保存"/></td></tr>
		</table>
	</form>
<%@ include file="../footer.jsp" %>
