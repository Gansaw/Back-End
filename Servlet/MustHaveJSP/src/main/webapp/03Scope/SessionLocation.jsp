<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session 영역</title>
</head>
<body>

	<%
	ArrayList<String> lists1 = (ArrayList<String>)(session.getAttribute("lists"));
	try{
		for(String str : lists1)
			out.print(str + "<br/>");
	} catch(Exception e){
//		//e.printStackTrace();
			out.print("<h2>오류 안뜸 ㅋ</h2>");
	}

/* 	if(lists1 != null){
		out.print("<h2>페이지 이동 후 session 영역의 속성 읽기</h2>");
		for(String str : lists1)
			if(str instanceof String)
			out.print(str + "<br/>");
		}		
			else
				out.print("<h2>오류 안뜸 ㅋ</h2>"); */
		
	%>
</body>
</html>