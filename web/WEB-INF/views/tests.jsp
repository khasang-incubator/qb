<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>QB Tests</title>
    <link rel="stylesheet" href="css/index.css">
</head>
<body>
<div id="topMenu">
    <jsp:include page="topMenu.jsp"/>
</div>
<div id="container">
    <div id="articles">
        <h3>Tests</h3>
        <select id="tests" name="tests">
            <option value="test">Basics</option>
            <option value="test">Generics</option>
            <option value="test">Lambda</option>
            <option value="test">Spring</option>
        </select>
        <button id="signinButton">Submit</button>
    </div>
</div>
</body>
</html>
