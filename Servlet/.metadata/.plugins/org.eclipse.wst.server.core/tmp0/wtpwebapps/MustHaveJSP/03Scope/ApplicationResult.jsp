<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Set"%>
<%@page import="common.Person"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Application 영역</title>
</head>
<body>
	<h2>application 영역의 속성 읽기</h2>
	<%
	Map<String, Person> maps = (Map<String, Person>)application.getAttribute("maps");
	Set<String> keys = maps.keySet();
	for (String key : keys){
		Person person = maps.get(key);
		out.print(String.format("key : %s, 이름 : %s, 나이 : %d <br/>",key, person.getName(), person.getAge()));		
	}
	 	
	Map<String, Object> maps1 = (Map<String, Object>)application.getAttribute("maps1");
	Set<String> keys1 = maps1.keySet();
	for (String key : keys1){
		Object object = maps1.get(key);
		if(object instanceof Person){
			Person person = (Person)object;
			out.print(String.format("key : %s, 이름 : %s, 나이 : %d <br/>",key, person.getName(), person.getAge()));			
		}else if(object instanceof ArrayList){
			ArrayList<String> lists= (ArrayList<String>)object;
			for(String s : lists){
		         out.print(String.format("key : %s, 대상 : %s<br/>", key, s));	        
			}
		}
		else
			out.print(String.format("key : %s, 값 : %s<br/>", key, object));
	}
		
	%>
	
</body>
</html>	