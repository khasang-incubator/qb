<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">QB-4A(чтоб знали...)</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">НЕВопросы</a></li>
                <li><a href="#">Ответы на НЕВопросы</a></li>

            </ul>

            <ul class="nav navbar-nav navbar-right">

                <sec:authorize access="!isAuthenticated()">
                    <li><a href="/regist">Регистрация</a></li>
                    <li><a href="/auth">Авторизация</a></li>
                </sec:authorize>
                <sec:authorize access="isAuthenticated()">
                    <li>Ваш логин: <sec:authentication property="principal.username" /></li>
                    <li><a href="<c:url value="/logout" />" role="button">Выйти</a></li>

                </sec:authorize>

            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>