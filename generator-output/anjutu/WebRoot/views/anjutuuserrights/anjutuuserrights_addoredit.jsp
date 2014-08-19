<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuUserrights添加编辑</H1>
	<form action="<c:url value="/anjutuuserrights/addoredit"/>" method="post">
		<input type="hidden" name="urid" id="urid"
		value='<c:out value="${anjutuuserrights.urid}" default="0" />'/>
		<table>
						<tr><td>urname:<input type="input" name="urname" id="urname" value="${anjutuuserrights.urname }"/></td></tr>
						<tr><td>status:<input type="input" name="status" id="status" value="${anjutuuserrights.status }"/></td></tr>
						<tr><td>actionName:<input type="input" name="actionName" id="actionName" value="${anjutuuserrights.actionName }"/></td></tr>
						<tr><td>type:<input type="input" name="type" id="type" value="${anjutuuserrights.type }"/></td></tr>
						<tr><td>parentId:<input type="input" name="parentId" id="parentId" value="${anjutuuserrights.parentId }"/></td></tr>
						<tr><td>code:<input type="input" name="code" id="code" value="${anjutuuserrights.code }"/></td></tr>
						<tr><td>orderNum:<input type="input" name="orderNum" id="orderNum" value="${anjutuuserrights.orderNum }"/></td></tr>
						<tr><td>sysType:<input type="input" name="sysType" id="sysType" value="${anjutuuserrights.sysType }"/></td></tr>
			<tr><td><input type="submit" value="保存"/></td></tr>
		</table>
	</form>
<%@ include file="../footer.jsp" %>
