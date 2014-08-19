<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuAreaconfig添加编辑</H1>
	<form action="<c:url value="/anjutuareaconfig/addoredit"/>" method="post">
		<input type="hidden" name="acid" id="acid"
		value='<c:out value="${anjutuareaconfig.acid}" default="0" />'/>
		<table>
						<tr><td>tag:<input type="input" name="tag" id="tag" value="${anjutuareaconfig.tag }"/></td></tr>
						<tr><td>status:<input type="input" name="status" id="status" value="${anjutuareaconfig.status }"/></td></tr>
						<tr><td>areaName:<input type="input" name="areaName" id="areaName" value="${anjutuareaconfig.areaName }"/></td></tr>
						<tr><td>cityId:<input type="input" name="cityId" id="cityId" value="${anjutuareaconfig.cityId }"/></td></tr>
						<tr><td>orderNum:<input type="input" name="orderNum" id="orderNum" value="${anjutuareaconfig.orderNum }"/></td></tr>
						<tr><td>parentId:<input type="input" name="parentId" id="parentId" value="${anjutuareaconfig.parentId }"/></td></tr>
						<tr><td>minValue:<input type="input" name="minValue" id="minValue" value="${anjutuareaconfig.minValue }"/></td></tr>
						<tr><td>maxValue:<input type="input" name="maxValue" id="maxValue" value="${anjutuareaconfig.maxValue }"/></td></tr>
						<tr><td>districtCityId:<input type="input" name="districtCityId" id="districtCityId" value="${anjutuareaconfig.districtCityId }"/></td></tr>
			<tr><td><input type="submit" value="保存"/></td></tr>
		</table>
	</form>
<%@ include file="../footer.jsp" %>
