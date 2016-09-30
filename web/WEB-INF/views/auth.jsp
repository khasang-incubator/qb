<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="utf-8">
    <title>Авторизация</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/signin.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <spring:form action="/login" class="form-signin" role="form" modelAttribute="user" method="post">
        <h2 class="form-signin-heading">Авторизация</h2>
        <spring:input type="text" class="form-control" placeholder="Email address" required="" autofocus="" name="username" path="login"/>
        <spring:input type="password" class="form-control" placeholder="Password" required="" name="password" path="password"/>
        <label class="checkbox">
            <input type="checkbox" value="remember-me"> Запомнить меня.
        </label>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Войти</button>
    </spring:form>
</div> <!-- /container -->
</body>
</html>
