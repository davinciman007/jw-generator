<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuFinancelog添加编辑</H1>
	<form action="<c:url value="/anjutufinancelog/addoredit"/>" method="post">
		<input type="hidden" name="id" id="id"
		value='<c:out value="${anjutufinancelog.id}" default="0" />'/>
		<table>
						<tr><td>contractNumber:<input type="input" name="contractNumber" id="contractNumber" value="${anjutufinancelog.contractNumber }"/></td></tr>
						<tr><td>contractId:<input type="input" name="contractId" id="contractId" value="${anjutufinancelog.contractId }"/></td></tr>
						<tr><td>flatId:<input type="input" name="flatId" id="flatId" value="${anjutufinancelog.flatId }"/></td></tr>
						<tr><td>paymentType:<input type="input" name="paymentType" id="paymentType" value="${anjutufinancelog.paymentType }"/></td></tr>
						<tr><td>paymentName:<input type="input" name="paymentName" id="paymentName" value="${anjutufinancelog.paymentName }"/></td></tr>
						<tr><td>paymentMobile:<input type="input" name="paymentMobile" id="paymentMobile" value="${anjutufinancelog.paymentMobile }"/></td></tr>
						<tr><td>paymentTime:<input type="input" name="paymentTime" id="paymentTime" value="${anjutufinancelog.paymentTime }"/></td></tr>
						<tr><td>paymentMoney:<input type="input" name="paymentMoney" id="paymentMoney" value="${anjutufinancelog.paymentMoney }"/></td></tr>
						<tr><td>remark:<input type="input" name="remark" id="remark" value="${anjutufinancelog.remark }"/></td></tr>
						<tr><td>ctime:<input type="input" name="ctime" id="ctime" value="${anjutufinancelog.ctime }"/></td></tr>
						<tr><td>operateId:<input type="input" name="operateId" id="operateId" value="${anjutufinancelog.operateId }"/></td></tr>
						<tr><td>operateName:<input type="input" name="operateName" id="operateName" value="${anjutufinancelog.operateName }"/></td></tr>
						<tr><td>beforeMessage:<input type="input" name="beforeMessage" id="beforeMessage" value="${anjutufinancelog.beforeMessage }"/></td></tr>
			<tr><td><input type="submit" value="保存"/></td></tr>
		</table>
	</form>
<%@ include file="../footer.jsp" %>
