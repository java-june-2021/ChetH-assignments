<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Welcome, again</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
    <div id="wrapper">
    	<div class="mainBody">
    		<img src="/img/apu.png" alt="Apu"><br>
       		You have visited <a href="http://localhost:8080">http://localhost</a><c:out value=" ${count}"/> times
       		<br><br>
       		<a href="http://localhost:8080">Test another visit?</a>
    	</div>
    </div>
</body>
</html>