<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/css/header.css"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>

<%--container start--%>
<div class="user-panel">
    <c:if test="${not empty param.login_error}">
        <font color="red">${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}</font>
    </c:if>

    <sec:authorize access="isAuthenticated()">
        <a href="/user"><sec:authentication property="principal.username" />
        <a class="btn btn-info" href="<c:url value="/logout" />" role="button">Выйти </a>
    </sec:authorize>

    <sec:authorize access="!isAuthenticated()">
            <a class="btn btn-primary" href="#" data-toggle="modal" data-target="#login-modal" role="button">Войти</a>
    </sec:authorize>

    <jsp:include page="loginForm.jsp"/>
</div>

