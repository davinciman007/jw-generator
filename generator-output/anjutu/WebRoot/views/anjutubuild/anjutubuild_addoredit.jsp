<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuBuild添加编辑</H1>
	<form action="<c:url value="/anjutubuild/addoredit"/>" method="post">
		<input type="hidden" name="bid" id="bid"
		value='<c:out value="${anjutubuild.bid}" default="0" />'/>
		<table>
						<tr><td>bname:<input type="input" name="bname" id="bname" value="${anjutubuild.bname }"/></td></tr>
						<tr><td>title:<input type="input" name="title" id="title" value="${anjutubuild.title }"/></td></tr>
						<tr><td>averagePrice:<input type="input" name="averagePrice" id="averagePrice" value="${anjutubuild.averagePrice }"/></td></tr>
						<tr><td>path:<input type="input" name="path" id="path" value="${anjutubuild.path }"/></td></tr>
						<tr><td>cityId:<input type="input" name="cityId" id="cityId" value="${anjutubuild.cityId }"/></td></tr>
						<tr><td>districtCityId:<input type="input" name="districtCityId" id="districtCityId" value="${anjutubuild.districtCityId }"/></td></tr>
						<tr><td>streetId:<input type="input" name="streetId" id="streetId" value="${anjutubuild.streetId }"/></td></tr>
						<tr><td>busName:<input type="input" name="busName" id="busName" value="${anjutubuild.busName }"/></td></tr>
						<tr><td>utime:<input type="input" name="utime" id="utime" value="${anjutubuild.utime }"/></td></tr>
						<tr><td>level:<input type="input" name="level" id="level" value="${anjutubuild.level }"/></td></tr>
						<tr><td>ctime:<input type="input" name="ctime" id="ctime" value="${anjutubuild.ctime }"/></td></tr>
						<tr><td>status:<input type="input" name="status" id="status" value="${anjutubuild.status }"/></td></tr>
						<tr><td>pictureNum:<input type="input" name="pictureNum" id="pictureNum" value="${anjutubuild.pictureNum }"/></td></tr>
						<tr><td>grade:<input type="input" name="grade" id="grade" value="${anjutubuild.grade }"/></td></tr>
						<tr><td>vtimes:<input type="input" name="vtimes" id="vtimes" value="${anjutubuild.vtimes }"/></td></tr>
						<tr><td>address:<input type="input" name="address" id="address" value="${anjutubuild.address }"/></td></tr>
						<tr><td>features:<input type="input" name="features" id="features" value="${anjutubuild.features }"/></td></tr>
						<tr><td>saleAddress:<input type="input" name="saleAddress" id="saleAddress" value="${anjutubuild.saleAddress }"/></td></tr>
						<tr><td>agentPhone:<input type="input" name="agentPhone" id="agentPhone" value="${anjutubuild.agentPhone }"/></td></tr>
						<tr><td>centerPhone:<input type="input" name="centerPhone" id="centerPhone" value="${anjutubuild.centerPhone }"/></td></tr>
						<tr><td>longitude:<input type="input" name="longitude" id="longitude" value="${anjutubuild.longitude }"/></td></tr>
						<tr><td>latitude:<input type="input" name="latitude" id="latitude" value="${anjutubuild.latitude }"/></td></tr>
						<tr><td>propertyType:<input type="input" name="propertyType" id="propertyType" value="${anjutubuild.propertyType }"/></td></tr>
						<tr><td>buildType:<input type="input" name="buildType" id="buildType" value="${anjutubuild.buildType }"/></td></tr>
						<tr><td>decoration:<input type="input" name="decoration" id="decoration" value="${anjutubuild.decoration }"/></td></tr>
						<tr><td>mprice:<input type="input" name="mprice" id="mprice" value="${anjutubuild.mprice }"/></td></tr>
						<tr><td>saleStatus:<input type="input" name="saleStatus" id="saleStatus" value="${anjutubuild.saleStatus }"/></td></tr>
						<tr><td>adviserNum:<input type="input" name="adviserNum" id="adviserNum" value="${anjutubuild.adviserNum }"/></td></tr>
						<tr><td>jiwuId:<input type="input" name="jiwuId" id="jiwuId" value="${anjutubuild.jiwuId }"/></td></tr>
			<tr><td><input type="submit" value="保存"/></td></tr>
		</table>
	</form>
<%@ include file="../footer.jsp" %>
