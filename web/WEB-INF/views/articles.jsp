<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>QB Articles</title>
    <link rel="stylesheet" href="css/index.css">
    <link rel="stylesheet" href='<c:url value="/resources/css/yandex.css"/>' type="text/css"/>
</head>
<body>
<div id="topMenu">
    <jsp:include page="topMenu.jsp"/>
</div>
<div id="container">
    <div id="articles"><h3>Articles</h3>
        <script src="//news.yandex.ru/ru/internet5.utf8.js" charset="utf-8"></script>
        <script src="js/ya_news.js"></script>
    </div>
</div>

</body>
</html>
