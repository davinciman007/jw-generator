<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuEsfhouse添加编辑</H1>
	<form action="<c:url value="/anjutuesfhouse/addoredit"/>" method="post">
		<input type="hidden" name="houseid" id="houseid"
		value='<c:out value="${anjutuesfhouse.houseid}" default="0" />'/>
		<table>
						<tr><td>houseNumber:<input type="input" name="houseNumber" id="houseNumber" value="${anjutuesfhouse.houseNumber }"/></td></tr>
						<tr><td>bid:<input type="input" name="bid" id="bid" value="${anjutuesfhouse.bid }"/></td></tr>
						<tr><td>bname:<input type="input" name="bname" id="bname" value="${anjutuesfhouse.bname }"/></td></tr>
						<tr><td>cityId:<input type="input" name="cityId" id="cityId" value="${anjutuesfhouse.cityId }"/></td></tr>
						<tr><td>cityName:<input type="input" name="cityName" id="cityName" value="${anjutuesfhouse.cityName }"/></td></tr>
						<tr><td>districtId:<input type="input" name="districtId" id="districtId" value="${anjutuesfhouse.districtId }"/></td></tr>
						<tr><td>districtName:<input type="input" name="districtName" id="districtName" value="${anjutuesfhouse.districtName }"/></td></tr>
						<tr><td>streetId:<input type="input" name="streetId" id="streetId" value="${anjutuesfhouse.streetId }"/></td></tr>
						<tr><td>streetName:<input type="input" name="streetName" id="streetName" value="${anjutuesfhouse.streetName }"/></td></tr>
						<tr><td>building:<input type="input" name="building" id="building" value="${anjutuesfhouse.building }"/></td></tr>
						<tr><td>buildUnit:<input type="input" name="buildUnit" id="buildUnit" value="${anjutuesfhouse.buildUnit }"/></td></tr>
						<tr><td>doorNumber:<input type="input" name="doorNumber" id="doorNumber" value="${anjutuesfhouse.doorNumber }"/></td></tr>
						<tr><td>uniqueMark:<input type="input" name="uniqueMark" id="uniqueMark" value="${anjutuesfhouse.uniqueMark }"/></td></tr>
						<tr><td>room:<input type="input" name="room" id="room" value="${anjutuesfhouse.room }"/></td></tr>
						<tr><td>hall:<input type="input" name="hall" id="hall" value="${anjutuesfhouse.hall }"/></td></tr>
						<tr><td>toilet:<input type="input" name="toilet" id="toilet" value="${anjutuesfhouse.toilet }"/></td></tr>
						<tr><td>veranda:<input type="input" name="veranda" id="veranda" value="${anjutuesfhouse.veranda }"/></td></tr>
						<tr><td>buildArea:<input type="input" name="buildArea" id="buildArea" value="${anjutuesfhouse.buildArea }"/></td></tr>
						<tr><td>storey:<input type="input" name="storey" id="storey" value="${anjutuesfhouse.storey }"/></td></tr>
						<tr><td>buildNature:<input type="input" name="buildNature" id="buildNature" value="${anjutuesfhouse.buildNature }"/></td></tr>
						<tr><td>direction:<input type="input" name="direction" id="direction" value="${anjutuesfhouse.direction }"/></td></tr>
						<tr><td>buildAge:<input type="input" name="buildAge" id="buildAge" value="${anjutuesfhouse.buildAge }"/></td></tr>
						<tr><td>buildLevel:<input type="input" name="buildLevel" id="buildLevel" value="${anjutuesfhouse.buildLevel }"/></td></tr>
						<tr><td>ladder:<input type="input" name="ladder" id="ladder" value="${anjutuesfhouse.ladder }"/></td></tr>
						<tr><td>decoration:<input type="input" name="decoration" id="decoration" value="${anjutuesfhouse.decoration }"/></td></tr>
						<tr><td>path:<input type="input" name="path" id="path" value="${anjutuesfhouse.path }"/></td></tr>
						<tr><td>structure:<input type="input" name="structure" id="structure" value="${anjutuesfhouse.structure }"/></td></tr>
						<tr><td>propertyType:<input type="input" name="propertyType" id="propertyType" value="${anjutuesfhouse.propertyType }"/></td></tr>
						<tr><td>totalPrice:<input type="input" name="totalPrice" id="totalPrice" value="${anjutuesfhouse.totalPrice }"/></td></tr>
						<tr><td>averagePrice:<input type="input" name="averagePrice" id="averagePrice" value="${anjutuesfhouse.averagePrice }"/></td></tr>
						<tr><td>flatId:<input type="input" name="flatId" id="flatId" value="${anjutuesfhouse.flatId }"/></td></tr>
						<tr><td>saleModeNumber:<input type="input" name="saleModeNumber" id="saleModeNumber" value="${anjutuesfhouse.saleModeNumber }"/></td></tr>
						<tr><td>remark:<input type="input" name="remark" id="remark" value="${anjutuesfhouse.remark }"/></td></tr>
						<tr><td>ownerName:<input type="input" name="ownerName" id="ownerName" value="${anjutuesfhouse.ownerName }"/></td></tr>
						<tr><td>ownerSex:<input type="input" name="ownerSex" id="ownerSex" value="${anjutuesfhouse.ownerSex }"/></td></tr>
						<tr><td>ownerPhone:<input type="input" name="ownerPhone" id="ownerPhone" value="${anjutuesfhouse.ownerPhone }"/></td></tr>
						<tr><td>paymentWay:<input type="input" name="paymentWay" id="paymentWay" value="${anjutuesfhouse.paymentWay }"/></td></tr>
						<tr><td>type:<input type="input" name="type" id="type" value="${anjutuesfhouse.type }"/></td></tr>
						<tr><td>isPrivate:<input type="input" name="isPrivate" id="isPrivate" value="${anjutuesfhouse.isPrivate }"/></td></tr>
						<tr><td>status:<input type="input" name="status" id="status" value="${anjutuesfhouse.status }"/></td></tr>
						<tr><td>ctime:<input type="input" name="ctime" id="ctime" value="${anjutuesfhouse.ctime }"/></td></tr>
						<tr><td>utime:<input type="input" name="utime" id="utime" value="${anjutuesfhouse.utime }"/></td></tr>
						<tr><td>operateId:<input type="input" name="operateId" id="operateId" value="${anjutuesfhouse.operateId }"/></td></tr>
						<tr><td>operateName:<input type="input" name="operateName" id="operateName" value="${anjutuesfhouse.operateName }"/></td></tr>
			<tr><td><input type="submit" value="保存"/></td></tr>
		</table>
	</form>
<%@ include file="../footer.jsp" %>
