<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://openhome.cc/jstl/fake" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
    request.setAttribute("x", java.util.Arrays.asList("z", "x", "y"));
%>
<f:toUpperCase>
    <f:forEach var="name" items="${x}">
        ${name} <br>
    </f:forEach>
</f:toUpperCase>

${i}
</body>
</html>