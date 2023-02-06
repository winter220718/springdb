<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>

<table>

<tr>
	<th>글 번호</th>
	<th>글 제목</th>
	<th>작성자</th>
	<th>작성일</th>
	<th>조회수</th>
</tr>

<c:forEach items="${boards }" var="b">
<tr>
	<td>${b.board_id }</td>
	<td>${b.write_title }</td>
	<td>${b.writer_id }</td>
	<td>${b.write_date }</td>
	<td>${b.write_view }</td>
</tr>


</c:forEach>
</table>


</body>
</html>