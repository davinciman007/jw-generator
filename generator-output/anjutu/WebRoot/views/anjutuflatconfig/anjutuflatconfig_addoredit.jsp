<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuFlatconfig添加编辑</H1>
	<form action="<c:url value="/anjutuflatconfig/addoredit"/>" method="post">
		<input type="hidden" name="flatid" id="flatid"
		value='<c:out value="${anjutuflatconfig.flatid}" default="0" />'/>
		<table>
						<tr><td>cityId:<input type="input" name="cityId" id="cityId" value="${anjutuflatconfig.cityId }"/></td></tr>
						<tr><td>name:<input type="input" name="name" id="name" value="${anjutuflatconfig.name }"/></td></tr>
						<tr><td>businessType:<input type="input" name="businessType" id="businessType" value="${anjutuflatconfig.businessType }"/></td></tr>
						<tr><td>typeName:<input type="input" name="typeName" id="typeName" value="${anjutuflatconfig.typeName }"/></td></tr>
						<tr><td>column1:<input type="input" name="column1" id="column1" value="${anjutuflatconfig.column1 }"/></td></tr>
						<tr><td>column2:<input type="input" name="column2" id="column2" value="${anjutuflatconfig.column2 }"/></td></tr>
						<tr><td>column3:<input type="input" name="column3" id="column3" value="${anjutuflatconfig.column3 }"/></td></tr>
						<tr><td>column4:<input type="input" name="column4" id="column4" value="${anjutuflatconfig.column4 }"/></td></tr>
						<tr><td>column5:<input type="input" name="column5" id="column5" value="${anjutuflatconfig.column5 }"/></td></tr>
						<tr><td>remark:<input type="input" name="remark" id="remark" value="${anjutuflatconfig.remark }"/></td></tr>
						<tr><td>status:<input type="input" name="status" id="status" value="${anjutuflatconfig.status }"/></td></tr>
						<tr><td>ctime:<input type="input" name="ctime" id="ctime" value="${anjutuflatconfig.ctime }"/></td></tr>
						<tr><td>utime:<input type="input" name="utime" id="utime" value="${anjutuflatconfig.utime }"/></td></tr>
						<tr><td>operateId:<input type="input" name="operateId" id="operateId" value="${anjutuflatconfig.operateId }"/></td></tr>
						<tr><td>operateName:<input type="input" name="operateName" id="operateName" value="${anjutuflatconfig.operateName }"/></td></tr>
						<tr><td>type:<input type="input" name="type" id="type" value="${anjutuflatconfig.type }"/></td></tr>
			<tr><td><input type="submit" value="保存"/></td></tr>
		</table>
	</form>
<%@ include file="../footer.jsp" %>
