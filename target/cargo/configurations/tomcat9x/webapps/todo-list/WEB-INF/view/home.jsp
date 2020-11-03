<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="todolist.tutorial.project.util.Mappings" %>

<html>
<head>
    <title>To Do List Application</title>
</head>
<body>
    <div align="center">
        <c:url var="itemsLink" value="${Mappings.ITEMS}"/>
        <h2><a href="${itemsLink}">Show To Do Items</a></h2>
    </div>
</body>
</html>