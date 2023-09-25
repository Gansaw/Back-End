<%@page import="utils.CookieManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String loginId = CookieManager.readCookie(request, "loginId");
    String cookieCheck = "";
    if(!loginId.equals(""))
    	cookieCheck = "checked";    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ID 저장하기</title>
</head>
<body>
	<h2>로그인 페이지</h2>
	<form action = "IdSaveProcess.jsp" method = "post">
	ID : <input type = "text" name = "user_id" value = "<%= loginId %>" />
	<input type = "checkbox" name = "save_check" value = "Y" <%= cookieCheck %>>
	아이디 저장하기		
	</br />
	Password : <input type = "password" name = "user_pw" />
	<br />
	<input type = "submit" value = "Login" />
	</form>
</body>
</html>