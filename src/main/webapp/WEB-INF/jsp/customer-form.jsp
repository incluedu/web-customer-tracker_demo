<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Save Customer</title>
    <link type="text/css" rel="stylesheet" href="<c:url value="/css/style.css"/>">
    <link type="text/css" rel="stylesheet" href="<c:url value="/css/add-customer-style.css"/>">
</head>
<body>
<div id="wrapper">
    <div id="header">
        <h2>CRM - Customer Relationship Manager</h2>
    </div>
    <div id="container">
        <h3>Save Customer</h3>

        <%--@elvariable id="customer" type="net.lustenauer.spring.webcustomertracker.entity.Customer"--%>
        <form:form action="saveCustomer" modelAttribute="customer" method="post">

            <form:hidden path="id"/>

            <table>
                <tr>
                    <td><label>First name:</label></td>
                    <td><form:input path="firstName"/></td>
                </tr>
                <tr>
                    <td><label>Last name:</label></td>
                    <td><form:input path="lastName"/></td>
                </tr>
                <tr>
                    <td><label>Email:</label></td>
                    <td><form:input path="email"/></td>
                </tr>
                <tr>
                    <td><label></label></td>
                    <td><input type="submit" value="Save" class="save"></td>
                </tr>
            </table>
        </form:form>
        <div style="clear:both"></div>
        <p><a href="${pageContext.request.contextPath}/customer/list">Back to List</a></p>
    </div>
</div>
</body>
</html>