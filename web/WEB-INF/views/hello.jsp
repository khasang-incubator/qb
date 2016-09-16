<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>HELLO</title>
  </head>
  <br>
  О чудо!!! </br>
  
    Roles table </br>
  <c:forEach items="${roleses}" var="roles">
      <td>Id: ${roles.getId()} </td>
      <td>Роли: ${roles.getName()} </td>
      </br>
  </c:forEach>

  </br>

  <c:forEach items="${answerses}" var="answers">
      <td>Id: ${answers.getId()} </td>
      </br>
  </c:forEach>
  </body>

  <c:forEach items="${questionses}" var="questions">
    <td>Id: ${questions.getId()} </td>
    <td>Id: ${questions.getQuestion()} </td>
    </br>
  </c:forEach>
  </body>

</html>
