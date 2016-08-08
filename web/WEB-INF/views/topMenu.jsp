<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
   <link rel="stylesheet" href="css/topMenu.css">
</head>
<body>
<a id="menuContainer">
   &ensp;
   <a href="articles"><button id="menuButton">Articles</button></a>
   <a href="tests"><button id="menuButton">Tests</button></a>
   <button id="menuButton">HZ</button>
   <button id="menuButton">Profile</button>
   &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
   &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
   &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
   <a href="<c:url value="/logout" />"><button id="menuButton">Logout</button></a>
</div>
</body>
</html>