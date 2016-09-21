<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Авторизация</title>
</head>
<body>
<div class="container">

    <spring:form action="/getauth" class="form-signin" role="form" modelAttribute="user" method="post">
        <h2 class="form-signin-heading">Авторизация</h2>
        <spring:input type="text" class="form-control" placeholder="Email address" required="" autofocus="" name="login" path="login"/>
        <spring:input type="password" class="form-control" placeholder="Password" required="" name="password" path="password"/>
        <label class="checkbox">
            <input type="checkbox" value="remember-me"> Запомнить меня.
        </label>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Войти</button>
    </spring:form>
</div> <!-- /container -->
</body>
</html>
