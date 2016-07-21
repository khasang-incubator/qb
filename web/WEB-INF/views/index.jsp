<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Welcome to QB</title>
  <link rel="stylesheet" href="css/index.css">
</head>
<body>
<div id="topMenu">
	<jsp:include page="topMenu.jsp"/>
</div>
<div id="container">
	<div id="articles"><h3>Articles</h3>
	</div>
	<div id="login">
	<h3>Please signin</h3>
	<form>
		<label for="loginName">Login<br>
		<input type="text" id="loginName" name="loginName"/></label><br>
		<label for="password">Password</label><br>
		<input type="password" id="password" name="password"><br>
		<button id="signinButton">Sing in</button>
	</form>
	</div>
</div>
</body>
</html>
