<%@ page import ="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head> </head>
<body>

    <c:forEach var="item" items="${students}">
        <h2> <c:out value="${item}"></c:out> </h2>
    </c:forEach>

    <h1> ${students} </h1>
</body>
</html>