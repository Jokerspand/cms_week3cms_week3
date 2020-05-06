<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- ?? -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>
<link href="/resource/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/js/bootstrap.min.js"></script>
</head>
<body>
<form action="list" method="post" id="f">
姓名：<input type="text" name="name" value="${houseVO.name }">
手机：<input type="text" name="phone" value="${houseVO.phone }"><br>
房型：<input type="text" name="tname" value="${houseVO.tname }">
房价：<input type="text" name="p1" value="${houseVO.p1 }">到<input type="text" name="p2" value="${houseVO.p2 }"><br>
预订日期范围：<input type="text" name="d1" value="${houseVO.d1}">到<input type="text" name="d2" value="${houseVO.d2}">

<input type="submit" value="查询">
</form>



<table class="table">

<tr>
<td>预定日期</td>
<td>姓名</td>
<td>手机</td>
<td>房型</td>
<td>房价</td>
<td>备注</td>

</tr>
<c:forEach items="${info.list }" var="s">
<tr>
<td>${s.date }</td>
<td>${s.name }</td>
<td>${s.phone }</td>

<c:forEach items="${s.types }" var="a">
<td>${a.name }</td>
<td>${a.price }</td>

</c:forEach>

<td>${s.bz }</td>

</tr>


</c:forEach>

<tr>
<td colspan="100">
<jsp:include page="/WEB-INF/view/common/pages.jsp"></jsp:include>


</td>

</tr>

</table>
</body>
<script type="text/javascript">
function goPage(n){
	location ="list?pageNum="+n+"&"+$("#f").serialize();
}



</script>


</html>