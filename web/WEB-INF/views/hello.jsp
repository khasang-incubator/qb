<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>HELLO</title>
  </head>
  <br>
  О чудо!!! </br>
  
    Roles table </br>
  <c:forEach items="${roles}" var="roles">
      <td>Id: ${roles.getId()} </td>
      <td>Роли: ${roles.getName()} </td>
      </br>
  </c:forEach>

  </br>

  <c:forEach items="${answers}" var="answers">
      <td>Id: ${answers.getId()} </td>
      </br>
  </c:forEach>

  <c:forEach items="${questions}" var="questions">
    <td>Id: ${questions.getId()} </td>
    <td>Id: ${questions.getQuestion()} </td>
    </br>
  </c:forEach>

  ${users.role}
  ${users.role}
  </br>
  </body>

</html>
