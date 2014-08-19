<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuCusmentdetail添加编辑</H1>
	<form action="<c:url value="/anjutucusmentdetail/addoredit"/>" method="post">
		<input type="hidden" name="cid" id="cid"
		value='<c:out value="${anjutucusmentdetail.cid}" default="0" />'/>
		<table>
						<tr><td>cusNumber:<input type="input" name="cusNumber" id="cusNumber" value="${anjutucusmentdetail.cusNumber }"/></td></tr>
						<tr><td>mobile:<input type="input" name="mobile" id="mobile" value="${anjutucusmentdetail.mobile }"/></td></tr>
						<tr><td>name:<input type="input" name="name" id="name" value="${anjutucusmentdetail.name }"/></td></tr>
			<tr><td><input type="submit" value="保存"/></td></tr>
		</table>
	</form>
<%@ include file="../footer.jsp" %>
