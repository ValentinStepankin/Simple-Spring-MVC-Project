<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>
    Name: ${employee.name}
    <br><br>
    Surname: ${employee.surName}
    <br><br>
    Salary: ${employee.salary}
    <br><br>
    Department: ${employee.department}
    <br><br>
    City: ${employee.city}
    <br><br>
    Language:
    <ul>
        <c:forEach var="lang" items="${employee.languages}">
            <li> ${lang} </li>
        </c:forEach>
    </ul>
    <br><br>
    Phone number: ${employee.phoneNumber}
</h3>
<a href="askDetails">Ввести заново</a>

</body>
</html>
