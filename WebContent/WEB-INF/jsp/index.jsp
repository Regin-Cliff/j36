<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1px" align="center">
		<tr>
			<th>学号</th>
			<th>姓名</th>
			<th>年级</th>
			<th>成绩</th>
			<th>年龄</th>
			<th>住址</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${msg}" var="abc">
			<tr>
				<th>${abc.sno}</th>
				<th>${abc.sname}</th>
				<th>${abc.cid}</th>
				<th>${abc.sresult}</th>
				<th>${abc.age}</th>
				<th>${abc.address}</th>
				<th><a href="../student/delete?sno=${abc.sno}">删除</a></th>
			</tr>
		</c:forEach>
	</table>
	<p align="center">
	<c:if test="${currPage<=1}">
		<a href="javascript:void(0)">上一页</a>
	</c:if>
	<c:if test="${currPage>1}">
		<a href="index?currPage=${currPage-1}&pageSize=${pageSize}">上一页</a>
	</c:if>
	
	${currPage}|${totalPage}
	
	<c:if test="${currPage>=totalPage}">
		<a href="#">下一页</a>
	</c:if>
	<c:if test="${currPage<totalPage}">
		<a href="index?currPage=${currPage+1}&pageSize=${pageSize}">下一页</a>
	</c:if>
	</p>
</body>
</html>