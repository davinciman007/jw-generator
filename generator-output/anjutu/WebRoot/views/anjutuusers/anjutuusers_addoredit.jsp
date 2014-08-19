<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuUsers添加编辑</H1>
	<form action="<c:url value="/anjutuusers/addoredit"/>" method="post">
		<input type="hidden" name="uid" id="uid"
		value='<c:out value="${anjutuusers.uid}" default="0" />'/>
		<table>
						<tr><td>jobNumber:<input type="input" name="jobNumber" id="jobNumber" value="${anjutuusers.jobNumber }"/></td></tr>
						<tr><td>username:<input type="input" name="username" id="username" value="${anjutuusers.username }"/></td></tr>
						<tr><td>password:<input type="input" name="password" id="password" value="${anjutuusers.password }"/></td></tr>
						<tr><td>cityId:<input type="input" name="cityId" id="cityId" value="${anjutuusers.cityId }"/></td></tr>
						<tr><td>cityName:<input type="input" name="cityName" id="cityName" value="${anjutuusers.cityName }"/></td></tr>
						<tr><td>districtId:<input type="input" name="districtId" id="districtId" value="${anjutuusers.districtId }"/></td></tr>
						<tr><td>districtName:<input type="input" name="districtName" id="districtName" value="${anjutuusers.districtName }"/></td></tr>
						<tr><td>streetId:<input type="input" name="streetId" id="streetId" value="${anjutuusers.streetId }"/></td></tr>
						<tr><td>streetName:<input type="input" name="streetName" id="streetName" value="${anjutuusers.streetName }"/></td></tr>
						<tr><td>trueName:<input type="input" name="trueName" id="trueName" value="${anjutuusers.trueName }"/></td></tr>
						<tr><td>companyName:<input type="input" name="companyName" id="companyName" value="${anjutuusers.companyName }"/></td></tr>
						<tr><td>mobile:<input type="input" name="mobile" id="mobile" value="${anjutuusers.mobile }"/></td></tr>
						<tr><td>sex:<input type="input" name="sex" id="sex" value="${anjutuusers.sex }"/></td></tr>
						<tr><td>personPath:<input type="input" name="personPath" id="personPath" value="${anjutuusers.personPath }"/></td></tr>
						<tr><td>idCardNumber:<input type="input" name="idCardNumber" id="idCardNumber" value="${anjutuusers.idCardNumber }"/></td></tr>
						<tr><td>type:<input type="input" name="type" id="type" value="${anjutuusers.type }"/></td></tr>
						<tr><td>level:<input type="input" name="level" id="level" value="${anjutuusers.level }"/></td></tr>
						<tr><td>parentId:<input type="input" name="parentId" id="parentId" value="${anjutuusers.parentId }"/></td></tr>
						<tr><td>workAge:<input type="input" name="workAge" id="workAge" value="${anjutuusers.workAge }"/></td></tr>
						<tr><td>appKey:<input type="input" name="appKey" id="appKey" value="${anjutuusers.appKey }"/></td></tr>
						<tr><td>roleId:<input type="input" name="roleId" id="roleId" value="${anjutuusers.roleId }"/></td></tr>
						<tr><td>status:<input type="input" name="status" id="status" value="${anjutuusers.status }"/></td></tr>
						<tr><td>ctime:<input type="input" name="ctime" id="ctime" value="${anjutuusers.ctime }"/></td></tr>
						<tr><td>utime:<input type="input" name="utime" id="utime" value="${anjutuusers.utime }"/></td></tr>
						<tr><td>loginTime:<input type="input" name="loginTime" id="loginTime" value="${anjutuusers.loginTime }"/></td></tr>
			<tr><td><input type="submit" value="保存"/></td></tr>
		</table>
	</form>
<%@ include file="../footer.jsp" %>
