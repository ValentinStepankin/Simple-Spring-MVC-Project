<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Введите данные</h2>

<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <form:errors path="name" cssStyle="color: crimson"/>

    <br><br>
    Surname <form:input path="surName"/>
    <form:errors path="surName" cssStyle="color: crimson"/>

    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary" cssStyle="color: crimson"/>

    <br><br>
    Department <form:select path="department">
    <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>

    Choose your city <form:radiobuttons path="city" items="${employee.cities}"/>
    <br><br>

    Languages <form:checkboxes path="languages" items="${employee.languagesList}"/>
    <br><br>

    Phone number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber" cssStyle="color: crimson"/>
    <br><br>

    <input type="submit" value="ok">

</form:form>

</body>
</html>
