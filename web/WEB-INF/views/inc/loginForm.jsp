<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="modal fade" id="login-modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
    <div class="modal-dialog">
        <div class="loginmodal-container">

            <div class="loginmodal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h3>Введите логин и пароль</h3>
            </div>

            <c:url value="/j_spring_security_check" var="loginUrl" />
            <form action="${loginUrl}" method="post" role="form">
                <div class="form-group">
                    <div class="input-group">
                        <input type="text" name="j_username" id="uLogin" placeholder="Логин" required autofocus>
                        <label for="uLogin" class="input-group-addon glyphicon glyphicon-user"></label>
                    </div>
                </div>

                <div class="form-group">
                    <div class="input-group">
                        <input type="password" name="j_password" id="uPassword" placeholder="Пароль" required>
                        <label for="uPassword" class="input-group-addon glyphicon glyphicon-lock"></label>
                    </div>
                </div>

                <button type="submit"class="login loginmodal-submit">Войти</button>
            </form>

            <div class="login-help">
                <a href="/signup">Регистрация</a>
            </div>
        </div>
    </div>
</div>