<%@ page language="java" pageEncoding="utf-8"%>
<%@ include file="../header.jsp" %>
	<H1>AnjutuContract添加编辑</H1>
	<form action="<c:url value="/anjutucontract/addoredit"/>" method="post">
		<input type="hidden" name="contractid" id="contractid"
		value='<c:out value="${anjutucontract.contractid}" default="0" />'/>
		<table>
						<tr><td>contractNumber:<input type="input" name="contractNumber" id="contractNumber" value="${anjutucontract.contractNumber }"/></td></tr>
						<tr><td>houseId:<input type="input" name="houseId" id="houseId" value="${anjutucontract.houseId }"/></td></tr>
						<tr><td>houseNumber:<input type="input" name="houseNumber" id="houseNumber" value="${anjutucontract.houseNumber }"/></td></tr>
						<tr><td>bid:<input type="input" name="bid" id="bid" value="${anjutucontract.bid }"/></td></tr>
						<tr><td>bname:<input type="input" name="bname" id="bname" value="${anjutucontract.bname }"/></td></tr>
						<tr><td>building:<input type="input" name="building" id="building" value="${anjutucontract.building }"/></td></tr>
						<tr><td>buildUnit:<input type="input" name="buildUnit" id="buildUnit" value="${anjutucontract.buildUnit }"/></td></tr>
						<tr><td>doorNumber:<input type="input" name="doorNumber" id="doorNumber" value="${anjutucontract.doorNumber }"/></td></tr>
						<tr><td>buildLevel:<input type="input" name="buildLevel" id="buildLevel" value="${anjutucontract.buildLevel }"/></td></tr>
						<tr><td>flat:<input type="input" name="flat" id="flat" value="${anjutucontract.flat }"/></td></tr>
						<tr><td>saleModeNumber:<input type="input" name="saleModeNumber" id="saleModeNumber" value="${anjutucontract.saleModeNumber }"/></td></tr>
						<tr><td>ownerName:<input type="input" name="ownerName" id="ownerName" value="${anjutucontract.ownerName }"/></td></tr>
						<tr><td>ownerPhone:<input type="input" name="ownerPhone" id="ownerPhone" value="${anjutucontract.ownerPhone }"/></td></tr>
						<tr><td>ownerTelephone:<input type="input" name="ownerTelephone" id="ownerTelephone" value="${anjutucontract.ownerTelephone }"/></td></tr>
						<tr><td>ownerIdCardNumber:<input type="input" name="ownerIdCardNumber" id="ownerIdCardNumber" value="${anjutucontract.ownerIdCardNumber }"/></td></tr>
						<tr><td>ownerAddress:<input type="input" name="ownerAddress" id="ownerAddress" value="${anjutucontract.ownerAddress }"/></td></tr>
						<tr><td>cusId:<input type="input" name="cusId" id="cusId" value="${anjutucontract.cusId }"/></td></tr>
						<tr><td>cusNumber:<input type="input" name="cusNumber" id="cusNumber" value="${anjutucontract.cusNumber }"/></td></tr>
						<tr><td>cusName:<input type="input" name="cusName" id="cusName" value="${anjutucontract.cusName }"/></td></tr>
						<tr><td>cusMobile:<input type="input" name="cusMobile" id="cusMobile" value="${anjutucontract.cusMobile }"/></td></tr>
						<tr><td>cusTelePhone:<input type="input" name="cusTelePhone" id="cusTelePhone" value="${anjutucontract.cusTelePhone }"/></td></tr>
						<tr><td>cusIdCardNumber:<input type="input" name="cusIdCardNumber" id="cusIdCardNumber" value="${anjutucontract.cusIdCardNumber }"/></td></tr>
						<tr><td>cusAddress:<input type="input" name="cusAddress" id="cusAddress" value="${anjutucontract.cusAddress }"/></td></tr>
						<tr><td>signName:<input type="input" name="signName" id="signName" value="${anjutucontract.signName }"/></td></tr>
						<tr><td>signTime:<input type="input" name="signTime" id="signTime" value="${anjutucontract.signTime }"/></td></tr>
						<tr><td>turnoverPrice:<input type="input" name="turnoverPrice" id="turnoverPrice" value="${anjutucontract.turnoverPrice }"/></td></tr>
						<tr><td>turnoveWay:<input type="input" name="turnoveWay" id="turnoveWay" value="${anjutucontract.turnoveWay }"/></td></tr>
						<tr><td>housePayment:<input type="input" name="housePayment" id="housePayment" value="${anjutucontract.housePayment }"/></td></tr>
						<tr><td>flatId:<input type="input" name="flatId" id="flatId" value="${anjutucontract.flatId }"/></td></tr>
						<tr><td>flatName:<input type="input" name="flatName" id="flatName" value="${anjutucontract.flatName }"/></td></tr>
						<tr><td>cstatus:<input type="input" name="cstatus" id="cstatus" value="${anjutucontract.cstatus }"/></td></tr>
						<tr><td>type:<input type="input" name="type" id="type" value="${anjutucontract.type }"/></td></tr>
						<tr><td>ctime:<input type="input" name="ctime" id="ctime" value="${anjutucontract.ctime }"/></td></tr>
						<tr><td>utime:<input type="input" name="utime" id="utime" value="${anjutucontract.utime }"/></td></tr>
						<tr><td>operateId:<input type="input" name="operateId" id="operateId" value="${anjutucontract.operateId }"/></td></tr>
						<tr><td>operateName:<input type="input" name="operateName" id="operateName" value="${anjutucontract.operateName }"/></td></tr>
			<tr><td><input type="submit" value="保存"/></td></tr>
		</table>
	</form>
<%@ include file="../footer.jsp" %>
