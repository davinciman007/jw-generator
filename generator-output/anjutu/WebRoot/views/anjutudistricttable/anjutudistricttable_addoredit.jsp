<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuDistricttable添加编辑</H1>
	<form action="<c:url value="/anjutudistricttable/addoredit"/>" method="post">
		<input type="hidden" name="dtid" id="dtid"
		value='<c:out value="${anjutudistricttable.dtid}" default="0" />'/>
		<table>
						<tr><td>name:<input type="input" name="name" id="name" value="${anjutudistricttable.name }"/></td></tr>
						<tr><td>remark:<input type="input" name="remark" id="remark" value="${anjutudistricttable.remark }"/></td></tr>
						<tr><td>parentId:<input type="input" name="parentId" id="parentId" value="${anjutudistricttable.parentId }"/></td></tr>
						<tr><td>status:<input type="input" name="status" id="status" value="${anjutudistricttable.status }"/></td></tr>
						<tr><td>orderNum:<input type="input" name="orderNum" id="orderNum" value="${anjutudistricttable.orderNum }"/></td></tr>
						<tr><td>minValue:<input type="input" name="minValue" id="minValue" value="${anjutudistricttable.minValue }"/></td></tr>
						<tr><td>maxValue:<input type="input" name="maxValue" id="maxValue" value="${anjutudistricttable.maxValue }"/></td></tr>
						<tr><td>size:<input type="input" name="size" id="size" value="${anjutudistricttable.size }"/></td></tr>
						<tr><td>manpower:<input type="input" name="manpower" id="manpower" value="${anjutudistricttable.manpower }"/></td></tr>
						<tr><td>code:<input type="input" name="code" id="code" value="${anjutudistricttable.code }"/></td></tr>
						<tr><td>centerPhone:<input type="input" name="centerPhone" id="centerPhone" value="${anjutudistricttable.centerPhone }"/></td></tr>
						<tr><td>startNumber:<input type="input" name="startNumber" id="startNumber" value="${anjutudistricttable.startNumber }"/></td></tr>
						<tr><td>endNumber:<input type="input" name="endNumber" id="endNumber" value="${anjutudistricttable.endNumber }"/></td></tr>
						<tr><td>jwParentId:<input type="input" name="jwParentId" id="jwParentId" value="${anjutudistricttable.jwParentId }"/></td></tr>
			<tr><td><input type="submit" value="保存"/></td></tr>
		</table>
	</form>
<%@ include file="../footer.jsp" %>
