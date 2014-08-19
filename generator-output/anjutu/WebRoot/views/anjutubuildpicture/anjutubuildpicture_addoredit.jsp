<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuBuildpicture添加编辑</H1>
	<form action="<c:url value="/anjutubuildpicture/addoredit"/>" method="post">
		<input type="hidden" name="bpid" id="bpid"
		value='<c:out value="${anjutubuildpicture.bpid}" default="0" />'/>
		<table>
						<tr><td>bid:<input type="input" name="bid" id="bid" value="${anjutubuildpicture.bid }"/></td></tr>
						<tr><td>fileName:<input type="input" name="fileName" id="fileName" value="${anjutubuildpicture.fileName }"/></td></tr>
						<tr><td>path:<input type="input" name="path" id="path" value="${anjutubuildpicture.path }"/></td></tr>
						<tr><td>ctime:<input type="input" name="ctime" id="ctime" value="${anjutubuildpicture.ctime }"/></td></tr>
						<tr><td>remark:<input type="input" name="remark" id="remark" value="${anjutubuildpicture.remark }"/></td></tr>
						<tr><td>status:<input type="input" name="status" id="status" value="${anjutubuildpicture.status }"/></td></tr>
						<tr><td>isCover:<input type="input" name="isCover" id="isCover" value="${anjutubuildpicture.isCover }"/></td></tr>
						<tr><td>vtimes:<input type="input" name="vtimes" id="vtimes" value="${anjutubuildpicture.vtimes }"/></td></tr>
						<tr><td>type:<input type="input" name="type" id="type" value="${anjutubuildpicture.type }"/></td></tr>
			<tr><td><input type="submit" value="保存"/></td></tr>
		</table>
	</form>
<%@ include file="../footer.jsp" %>
