package edu.pnu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("MyServlet03");
		response.setContentType("text/html; charset = utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h2>이것은 sublet에서 출력하는 문서입니다.</h2>");
		out.println("<h3>잘 보이면 성공!</h3>");
		out.close();
	}

}
