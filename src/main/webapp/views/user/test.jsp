<%@include file="/common/taglib.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Trang chủ</title>
</head>
<body>

<h1>this is user home</h1><br>
<table border="2">
    <c:forEach var="i" begin="1" end="5">
        <tr>
            <td>Item:<c:out value="${i}"/><p/></td>
        </tr>
    </c:forEach>
</table>
<table border="2">
    <c:forTokens items="${list}" delims="" var="user">
        <tr>
            <td>UserName:<c:out value="${user.userName}"/><p/></td>
        </tr>
        <tr>
            <td>Password:<c:out value="${user.password}"/><p/></td>
        </tr>
        <tr>
            <td>FullName:<c:out value="${user.fullName}"/></td>
        </tr>
    </c:forTokens>
</table>

<%--    Ten: ${user.userName}<br>--%>
<%--    Mat khau: ${user.password}<br>--%>
<%--    Ten day du: ${user.fullName}--%>

<form name="loginForm" method="post" action="loginServlet">
    Username: <input type="text" name="username"/> <br/>
    Password: <input type="password" name="password"/> <br/>
    <input type="submit" value="Login"/>
</form>

</body>
</html>