<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>HELLO</title>
  </head>
  <body>
  О чудо!!! </br>

  <c:forEach items="${answerses}" var="answers">
    <td>Id: ${answers.getId()} </td>
    <td>Вопрос: ${answers.getQuestion_id()} </td>
    <td>Ответ: ${answers.getAnswer()} </td>
    <td>Правильный ответ: ${answers.getIs_correct()} </td>
    </br>
  </c:forEach>
  </body>
</html>
