<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuCusment添加编辑</H1>
	<form action="<c:url value="/anjutucusment/addoredit"/>" method="post">
		<input type="hidden" name="cusid" id="cusid"
		value='<c:out value="${anjutucusment.cusid}" default="0" />'/>
		<table>
						<tr><td>cusNumber:<input type="input" name="cusNumber" id="cusNumber" value="${anjutucusment.cusNumber }"/></td></tr>
						<tr><td>name:<input type="input" name="name" id="name" value="${anjutucusment.name }"/></td></tr>
						<tr><td>mobile:<input type="input" name="mobile" id="mobile" value="${anjutucusment.mobile }"/></td></tr>
						<tr><td>email:<input type="input" name="email" id="email" value="${anjutucusment.email }"/></td></tr>
						<tr><td>sex:<input type="input" name="sex" id="sex" value="${anjutucusment.sex }"/></td></tr>
						<tr><td>type:<input type="input" name="type" id="type" value="${anjutucusment.type }"/></td></tr>
						<tr><td>qudaoSource:<input type="input" name="qudaoSource" id="qudaoSource" value="${anjutucusment.qudaoSource }"/></td></tr>
						<tr><td>cusTrade:<input type="input" name="cusTrade" id="cusTrade" value="${anjutucusment.cusTrade }"/></td></tr>
						<tr><td>cusLevel:<input type="input" name="cusLevel" id="cusLevel" value="${anjutucusment.cusLevel }"/></td></tr>
						<tr><td>cityId:<input type="input" name="cityId" id="cityId" value="${anjutucusment.cityId }"/></td></tr>
						<tr><td>cityName:<input type="input" name="cityName" id="cityName" value="${anjutucusment.cityName }"/></td></tr>
						<tr><td>districtId:<input type="input" name="districtId" id="districtId" value="${anjutucusment.districtId }"/></td></tr>
						<tr><td>districtName:<input type="input" name="districtName" id="districtName" value="${anjutucusment.districtName }"/></td></tr>
						<tr><td>streetId:<input type="input" name="streetId" id="streetId" value="${anjutucusment.streetId }"/></td></tr>
						<tr><td>streetName:<input type="input" name="streetName" id="streetName" value="${anjutucusment.streetName }"/></td></tr>
						<tr><td>direction:<input type="input" name="direction" id="direction" value="${anjutucusment.direction }"/></td></tr>
						<tr><td>buildArea:<input type="input" name="buildArea" id="buildArea" value="${anjutucusment.buildArea }"/></td></tr>
						<tr><td>unitPrice:<input type="input" name="unitPrice" id="unitPrice" value="${anjutucusment.unitPrice }"/></td></tr>
						<tr><td>totalPrice:<input type="input" name="totalPrice" id="totalPrice" value="${anjutucusment.totalPrice }"/></td></tr>
						<tr><td>storey:<input type="input" name="storey" id="storey" value="${anjutucusment.storey }"/></td></tr>
						<tr><td>buildAge:<input type="input" name="buildAge" id="buildAge" value="${anjutucusment.buildAge }"/></td></tr>
						<tr><td>decoration:<input type="input" name="decoration" id="decoration" value="${anjutucusment.decoration }"/></td></tr>
						<tr><td>status:<input type="input" name="status" id="status" value="${anjutucusment.status }"/></td></tr>
						<tr><td>paymentWay:<input type="input" name="paymentWay" id="paymentWay" value="${anjutucusment.paymentWay }"/></td></tr>
						<tr><td>remark:<input type="input" name="remark" id="remark" value="${anjutucusment.remark }"/></td></tr>
						<tr><td>ctime:<input type="input" name="ctime" id="ctime" value="${anjutucusment.ctime }"/></td></tr>
						<tr><td>utime:<input type="input" name="utime" id="utime" value="${anjutucusment.utime }"/></td></tr>
						<tr><td>operateId:<input type="input" name="operateId" id="operateId" value="${anjutucusment.operateId }"/></td></tr>
						<tr><td>operateName:<input type="input" name="operateName" id="operateName" value="${anjutucusment.operateName }"/></td></tr>
			<tr><td><input type="submit" value="保存"/></td></tr>
		</table>
	</form>
<%@ include file="../footer.jsp" %>
