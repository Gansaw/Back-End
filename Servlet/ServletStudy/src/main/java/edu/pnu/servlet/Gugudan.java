package edu.pnu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Gugudan extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset = utf-8");

		String type = request.getParameter("type");
		String snum = request.getParameter("num");
		int num = 2;
		if (snum != null)
			num = Integer.parseInt(snum);
		try (PrintWriter out = response.getWriter()) {
			out.println("<h1> Servlet Gugudan </h1>");
			out.println("<h2>" + num + "단입니다.</h2>");

			if (type == null || type == "") {

				for (int i = 1; i <= 9; i++) {
					out.println("<p>" + num + " * " + i + " = " + num * i + "</p>");
				}
			} else if (type.equals("reverse")) {

				for (int i = 9; i >= 1; i--) {
					out.println("<p>" + num + " * " + i + " = " + num * i + "</p>");
				}

			} else if (type.equals("list")) {
				for (int i = 1; i <= 9; i++) {
					out.println("<li>" + num + " * " + i + " = " + num * i + "</li>");
				}
			} else if (type.equals("reverselist")) {
				for (int i = 9; i >= 1; i--) {
					out.println("<li>" + num + " * " + i + " = " + num * i + "</li>");
				}
			}

			else if (type.equals("table")) {
				for (int i = 1; i <= 9; i++) {
					out.println("<table border=\"1\">");
					out.println("<tr>");
					out.println("<td>" + num + " * " + i + " = " + num * i + "</td>");
					out.println("</tr>");
					out.println("</table>");
				}
			} else if (type.equals("reversetable")) {
				for (int i = 9; i >= 1; i--) {
					out.println("<table border=\"1\">");
					out.println("<tr>");
					out.println("<td>" + num + " * " + i + " = " + num * i + "</td>");
					out.println("</tr>");
					out.println("</table>");
				}
			} else if (type.equals("odd")) {
				for (int i = 1; i <= 9; i += 2) {
					out.println("<p>" + num + " * " + i + " = " + num * i + "</p>");
				}
			} else if (type.equals("even")) {
				for (int i = 2; i <= 9; i += 2) {
					out.println("<p>" + num + " * " + i + " = " + num * i + "</p>");
				}
			} else if (type.equals("oddlist")) {
				for (int i = 1; i <= 9; i += 2) {
					out.println("<li>" + num + " * " + i + " = " + num * i + "</li>");
				}
			} else if (type.equals("evenlist")) {
				for (int i = 2; i <= 9; i += 2) {
					out.println("<li>" + num + " * " + i + " = " + num * i + "</li>");
				}
			} else if (type.equals("oddtable")) {
				for (int i = 1; i <= 9; i += 2) {
					out.println("<table border=\"1\">");
					out.println("<tr>");
					out.println("<td>" + num + " * " + i + " = " + num * i + "</td>");
					out.println("</tr>");
					out.println("</table>");
				}
			} else if (type.equals("eventable")) {
				for (int i = 2; i <= 9; i += 2) {
					out.println("<table border=\"1\">");
					out.println("<tr>");
					out.println("<td>" + num + " * " + i + " = " + num * i + "</td>");
					out.println("</tr>");
					out.println("</table>");
				}
			}

			else {
				out.println("<p>Invalid type!! Insert valid type.</p>");
			}

			out.close();

		} catch (

		Exception e) {
			e.printStackTrace();
		}

	}

}
