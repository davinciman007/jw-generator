<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuEsfhouselog添加编辑</H1>
	<form action="<c:url value="/anjutuesfhouselog/addoredit"/>" method="post">
		<input type="hidden" name="id" id="id"
		value='<c:out value="${anjutuesfhouselog.id}" default="0" />'/>
		<table>
						<tr><td>houseId:<input type="input" name="houseId" id="houseId" value="${anjutuesfhouselog.houseId }"/></td></tr>
						<tr><td>type:<input type="input" name="type" id="type" value="${anjutuesfhouselog.type }"/></td></tr>
						<tr><td>remark:<input type="input" name="remark" id="remark" value="${anjutuesfhouselog.remark }"/></td></tr>
						<tr><td>operateId:<input type="input" name="operateId" id="operateId" value="${anjutuesfhouselog.operateId }"/></td></tr>
						<tr><td>operateName:<input type="input" name="operateName" id="operateName" value="${anjutuesfhouselog.operateName }"/></td></tr>
						<tr><td>ctime:<input type="input" name="ctime" id="ctime" value="${anjutuesfhouselog.ctime }"/></td></tr>
			<tr><td><input type="submit" value="保存"/></td></tr>
		</table>
	</form>
<%@ include file="../footer.jsp" %>
