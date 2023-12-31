<%@ page import="membership.MemberDTO" %>
<%@ page import="membership.MemberDAO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
String userId = request.getParameter("user_id");
String userPwd = request.getParameter("user_pw");

String driver = application.getInitParameter("MySQLDriver");
String url = application.getInitParameter("MySQLURL");
String username = application.getInitParameter("MySQLId");
String password = application.getInitParameter("MySQLPwd");

MemberDAO dao = new MemberDAO();
MemberDTO memberDTO = dao.getMemberDTO(userId, userPwd);

if (memberDTO != null) {
    // Login successful
    session.setAttribute("UserId", memberDTO.getId());
    session.setAttribute("UserName", memberDTO.getName());
    response.sendRedirect("LoginForm.jsp");
} else {
    // Login failed
    request.setAttribute("LoginErrMsg", "로그인 오류입니다.");
    request.getRequestDispatcher("LoginForm.jsp").forward(request, response);
}
%>
