<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c"  uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title>list.jsp  List Page </title>
<style type="text/css">
	a { text-decoration:  none; }
</style>
</head>
<body>
	<h1>List Page</h1>
	
	<table>
		<tr>
			<th>번호</th>	<th>제목</th><th>작성자</th>	<th>내용</th><th>작성날짜</th><th>조회수</th>
		</tr>
		<c:forEach var="list"  items="${ list }">
			<tr>
				<td>${ list.seq } </td>
				<td>
					<a href="board?cmd=detail&seq=${ list.seq }">${ list.title } </a>
				</td>
				<td>${ list.writer } </td>
				<td>${ list.regdate } </td>
				<td>${ list.readcount } </td>
				<td><a href="loacation.href='board?cmd=deletet&seq=${ list.seq }' ">삭제</a></td>
			</tr>
		</c:forEach>
	</table> <br>
	
	<a href="views/writeForm.jsp" >글쓰기</a>
	<a href="board?cmd=search" >검색</a>
	
</body>
</html>






