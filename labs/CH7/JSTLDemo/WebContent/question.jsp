<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<!-- 完成練習缺少部份 -->

<html>
    <head>
        <meta http-equiv="Content-Type"
                 content="text/html; charset=UTF-8">
        <title>Questionnaire</title>
    </head>
    <body>
        <form action="question.jsp" method="post">
            <c:choose>
                <c:when test="${param.page == 'page1'}">
                    問題一：<input type="text" name="p1q1"><br>
                    問題二：<input type="text" name="p1q2"><br>
                    <input type="submit" name="page" value="page2">
                </c:when>
                <c:when test="${param.page == 'page2'}">
                    <!-- 完成練習缺少部份 -->
                    問題三：<input type="text" name="p2q1"><br>
                    <input type="submit" name="page" value="finish">
                </c:when>
                <c:when test="${param.page == 'finish'}">
                    ${sessionScope.p1q1}<br>
                    ${sessionScope.p1q2}<br>
                    ${param.p2q1}<br>
                </c:when>
            </c:choose>
        </form>
    </body>
</html> 