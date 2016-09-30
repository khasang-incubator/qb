<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Регистрация</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/signin.css" rel="stylesheet">
</head>

<body>
<div class="container">

    <spring:form action="/registadd" class="form-signin" role="form" modelAttribute="user" method="post">
        <h2 class="form-signin-heading">Регистрация</h2>

        <spring:input type="text" class="form-control" placeholder="Email address" required="" autofocus="" name="login" path="login"/>
        <spring:errors path="login"></spring:errors>
        <label for="passwordIn">Password: </label>
        <spring:input type="passwordIn" class="form-control" placeholder="PasswordIn" required="" name="passwordIn" path="passwordIn"/>
        <spring:errors path="passwordIn"></spring:errors>
        <label class="checkbox">
            <input type="checkbox" value="remember-me"> Запомнить меня.
        </label>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Зарегистрироваться</button>
    </spring:form>
</div> <!-- /container -->
</body>

</html>