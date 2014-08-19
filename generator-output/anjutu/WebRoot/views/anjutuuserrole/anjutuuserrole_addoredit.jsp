<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuUserrole添加编辑</H1>
	<form action="<c:url value="/anjutuuserrole/addoredit"/>" method="post">
		<input type="hidden" name="roleid" id="roleid"
		value='<c:out value="${anjutuuserrole.roleid}" default="0" />'/>
		<table>
						<tr><td>roleName:<input type="input" name="roleName" id="roleName" value="${anjutuuserrole.roleName }"/></td></tr>
						<tr><td>status:<input type="input" name="status" id="status" value="${anjutuuserrole.status }"/></td></tr>
						<tr><td>type:<input type="input" name="type" id="type" value="${anjutuuserrole.type }"/></td></tr>
						<tr><td>ucode:<input type="input" name="ucode" id="ucode" value="${anjutuuserrole.ucode }"/></td></tr>
			<tr><td><input type="submit" value="保存"/></td></tr>
		</table>
	</form>
<%@ include file="../footer.jsp" %>
