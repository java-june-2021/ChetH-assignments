<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Login</title>
        <meta name="description" content="Registration for an account">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="/css/style.css">
    </head>
    <body>
    	<div class="error">
        <br>
            <c:out value=" ${errors}"/><br><br>
        </div>
        <form method="POST" action="/login">
            <label>
                What is the code?<br><input type="password" name="password">
            </label>
            <br><br>
            <button>Try Code</button>
        </form>
    </body>
</html>