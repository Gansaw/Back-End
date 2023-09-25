<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GugudanMain</title>
</head>
<body>
	<%
	String sel = request.getParameter("sel");
	String val = request.getParameter("val");
	
	if(sel.equals("gugudanType1"))
		/* response.sendRedirect("Gugudan1.jsp?num=" + vol); */
		request.getRequestDispatcher("Gugudan1.jsp?num=" + val).forward(request,response);

	else if(sel.equals("gugudanType2"))
		response.sendRedirect("Gugudan2.jsp?col=" + val);
	%>
</body>
</html>