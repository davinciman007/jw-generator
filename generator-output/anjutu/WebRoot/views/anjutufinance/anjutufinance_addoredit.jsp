<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuFinance添加编辑</H1>
	<form action="<c:url value="/anjutufinance/addoredit"/>" method="post">
		<input type="hidden" name="id" id="id"
		value='<c:out value="${anjutufinance.id}" default="0" />'/>
		<table>
						<tr><td>contractNumber:<input type="input" name="contractNumber" id="contractNumber" value="${anjutufinance.contractNumber }"/></td></tr>
						<tr><td>contractId:<input type="input" name="contractId" id="contractId" value="${anjutufinance.contractId }"/></td></tr>
						<tr><td>flatId:<input type="input" name="flatId" id="flatId" value="${anjutufinance.flatId }"/></td></tr>
						<tr><td>paymentType:<input type="input" name="paymentType" id="paymentType" value="${anjutufinance.paymentType }"/></td></tr>
						<tr><td>paymentName:<input type="input" name="paymentName" id="paymentName" value="${anjutufinance.paymentName }"/></td></tr>
						<tr><td>paymentMobile:<input type="input" name="paymentMobile" id="paymentMobile" value="${anjutufinance.paymentMobile }"/></td></tr>
						<tr><td>paymentTime:<input type="input" name="paymentTime" id="paymentTime" value="${anjutufinance.paymentTime }"/></td></tr>
						<tr><td>paymentMoney:<input type="input" name="paymentMoney" id="paymentMoney" value="${anjutufinance.paymentMoney }"/></td></tr>
						<tr><td>remark:<input type="input" name="remark" id="remark" value="${anjutufinance.remark }"/></td></tr>
						<tr><td>ctime:<input type="input" name="ctime" id="ctime" value="${anjutufinance.ctime }"/></td></tr>
						<tr><td>utime:<input type="input" name="utime" id="utime" value="${anjutufinance.utime }"/></td></tr>
						<tr><td>operateId:<input type="input" name="operateId" id="operateId" value="${anjutufinance.operateId }"/></td></tr>
						<tr><td>operateName:<input type="input" name="operateName" id="operateName" value="${anjutufinance.operateName }"/></td></tr>
			<tr><td><input type="submit" value="保存"/></td></tr>
		</table>
	</form>
<%@ include file="../footer.jsp" %>
