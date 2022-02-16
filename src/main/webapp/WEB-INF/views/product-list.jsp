<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Amir
  Date: 2/15/2022
  Time: 4:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>

    <table style="border: black 1px solid">
        <tr>
            <th>Name</th>
            <th>Price</th>
            <th>Detail</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach items="${productdto}" var="productdto2">
            <tr>
                <td>${productdto2.name}</td>
                <td>${productdto2.price}</td>
                <td><a href="/product/detail/${productdto2.id}" ><img style="width:20px;height: 20px" src="/resource/img/a.png"></a></td>
                <td>edit</td>
                <td>delete</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
