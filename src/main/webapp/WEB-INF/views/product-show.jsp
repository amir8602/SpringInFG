<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Amir
  Date: 2/15/2022
  Time: 12:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Product</title>
</head>
<body>
<%--    <form action="/product/save" method="post" >--%>
<%--        Name : <input name="name" type="text"/> <br/> <br/>--%>
<%--        Price : <input name="price" type="text"/> <br/> <br/>--%>

<%--        <input type="submit" value="add product" />--%>
<%--    </form>--%>

<form:form action="/product/save" method="post" modelAttribute="dto">
    Name : <form:input path="name" name="name"/><br/><br/>
    Price : <form:input path="price" name="price"/> <br/><br/>
    Type :
    <form:select path="type">
    <form:options items="${dto.validTypes}" />
    </form:select>
    <input type="submit" value="add product" />
</form:form>
</body>
</html>
