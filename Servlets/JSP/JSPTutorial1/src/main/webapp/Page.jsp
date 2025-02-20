<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
	int a = 10;
	int b = 20;
	int add(int a,int b){
		return a+b;
	}
%>

<%=a %>
<%=b %>
<%=add(a,b) %>

</body>
</html>