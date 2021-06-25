<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Time Templates</title>
    <link rel="stylesheet" href="/css/style.css">
    <script src="/js/script.js"></script>
</head>
<body onload="alertTimeTemplate()">
    <div id="wrapper">
    	<div class="time">
        	<c:out value="${currentTime}"/>
	    </div>
	</div>
</body>
</html>