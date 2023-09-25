<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gugudan3</title>
</head>
<body>
	<form action="GugudanMain.jsp" method="post">
		<table>
			<tr>
				<td><input type="radio" name="sel" value="gugudanType1" checked /> Type1</td>
			</tr>
			<tr>
				<td><input type="radio" name="sel" value="gugudanType2" /> Type2</td>
			</tr>
			<tr>
				<td><input type="text1" name="val" value="2" /> 단수/열수</td>	</tr>		
		<tr>
			<td><input type="submit" value="선택" /></td>
		</tr>
		</table>
	</form>
</body>
</html>