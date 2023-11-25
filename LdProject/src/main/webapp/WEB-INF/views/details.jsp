<%@ page import ="java.util.List"%>

<!DOCTYPE html>
<html>
<head> </head>
<body>
    <%
        List<String> students = (List<String>) request.getAttribute("students");
        for (String student: students) {
    %>
       <h1> <%= student%> </h1>
    <% } %>
</body>
</html>