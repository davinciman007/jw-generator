<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuCusmentlog添加编辑</H1>
	<form action="<c:url value="/anjutucusmentlog/addoredit"/>" method="post">
		<input type="hidden" name="id" id="id"
		value='<c:out value="${anjutucusmentlog.id}" default="0" />'/>
		<table>
						<tr><td>kid:<input type="input" name="kid" id="kid" value="${anjutucusmentlog.kid }"/></td></tr>
						<tr><td>type:<input type="input" name="type" id="type" value="${anjutucusmentlog.type }"/></td></tr>
						<tr><td>remark:<input type="input" name="remark" id="remark" value="${anjutucusmentlog.remark }"/></td></tr>
						<tr><td>operateId:<input type="input" name="operateId" id="operateId" value="${anjutucusmentlog.operateId }"/></td></tr>
						<tr><td>operateName:<input type="input" name="operateName" id="operateName" value="${anjutucusmentlog.operateName }"/></td></tr>
						<tr><td>statusBefore:<input type="input" name="statusBefore" id="statusBefore" value="${anjutucusmentlog.statusBefore }"/></td></tr>
						<tr><td>statusBack:<input type="input" name="statusBack" id="statusBack" value="${anjutucusmentlog.statusBack }"/></td></tr>
						<tr><td>ctime:<input type="input" name="ctime" id="ctime" value="${anjutucusmentlog.ctime }"/></td></tr>
			<tr><td><input type="submit" value="保存"/></td></tr>
		</table>
	</form>
<%@ include file="../footer.jsp" %>
