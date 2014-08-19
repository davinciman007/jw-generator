<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuSinglefinance添加编辑</H1>
	<form action="<c:url value="/anjutusinglefinance/addoredit"/>" method="post">
		<input type="hidden" name="id" id="id"
		value='<c:out value="${anjutusinglefinance.id}" default="0" />'/>
		<table>
						<tr><td>contractId:<input type="input" name="contractId" id="contractId" value="${anjutusinglefinance.contractId }"/></td></tr>
						<tr><td>contractNumber:<input type="input" name="contractNumber" id="contractNumber" value="${anjutusinglefinance.contractNumber }"/></td></tr>
						<tr><td>totalCommission:<input type="input" name="totalCommission" id="totalCommission" value="${anjutusinglefinance.totalCommission }"/></td></tr>
						<tr><td>singleCommission:<input type="input" name="singleCommission" id="singleCommission" value="${anjutusinglefinance.singleCommission }"/></td></tr>
						<tr><td>remark:<input type="input" name="remark" id="remark" value="${anjutusinglefinance.remark }"/></td></tr>
						<tr><td>reason:<input type="input" name="reason" id="reason" value="${anjutusinglefinance.reason }"/></td></tr>
						<tr><td>commissionId:<input type="input" name="commissionId" id="commissionId" value="${anjutusinglefinance.commissionId }"/></td></tr>
						<tr><td>commissionName:<input type="input" name="commissionName" id="commissionName" value="${anjutusinglefinance.commissionName }"/></td></tr>
						<tr><td>ctime:<input type="input" name="ctime" id="ctime" value="${anjutusinglefinance.ctime }"/></td></tr>
						<tr><td>utime:<input type="input" name="utime" id="utime" value="${anjutusinglefinance.utime }"/></td></tr>
						<tr><td>status:<input type="input" name="status" id="status" value="${anjutusinglefinance.status }"/></td></tr>
						<tr><td>operateId:<input type="input" name="operateId" id="operateId" value="${anjutusinglefinance.operateId }"/></td></tr>
						<tr><td>operateName:<input type="input" name="operateName" id="operateName" value="${anjutusinglefinance.operateName }"/></td></tr>
			<tr><td><input type="submit" value="保存"/></td></tr>
		</table>
	</form>
<%@ include file="../footer.jsp" %>
