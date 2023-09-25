package utils;

import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

import javax.servlet.http.HttpServletResponse;

public class JSFunction {
	public static void alertLocation(HttpServletResponse resp, String msg, String url) {
        resp.setCharacterEncoding(StandardCharsets.UTF_8.name()); // Set character encoding
        resp.setContentType("text/html"); // Set content type
		try(PrintWriter out = resp.getWriter()) {
			String script = "<script>"
					+ "	alert('" + msg + "');"
					+ "	location.href = '" + url + "';"
					+ "</script>";
			out.println(script);
									
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public static void alertBack(HttpServletResponse resp, String msg) {
        resp.setCharacterEncoding(StandardCharsets.UTF_8.name()); // Set character encoding
        resp.setContentType("text/html"); // Set content type
		try (PrintWriter out = resp.getWriter()){
			String script = "<script>"
					+ "	alert('" + msg + "');"
					+ "	history.back();"
					+ "</script>";
			out.println(script);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
