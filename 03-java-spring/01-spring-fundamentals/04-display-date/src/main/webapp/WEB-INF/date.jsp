<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Date Template</title>
    <link rel="stylesheet" href="/css/style.css">
    <script src="/js/script.js"></script>
</head>
<body onload="alertDateTemplate()">
    <div id="wrapper">
    	<div class="date">
        	<c:out value="${currentDate}"/>
    	</div>
    </div>
</body>
</html>