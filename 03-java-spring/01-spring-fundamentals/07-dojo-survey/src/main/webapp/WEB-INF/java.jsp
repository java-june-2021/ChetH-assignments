<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Java</title>
        <meta name="description" content="Registration for an account">
        <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <body>
    	<div id="wrapper">
	    	<div class="mainBody">
				<h1>
					<c:out value=" ${username}"/>, you have chosen <c:out value=" ${language}"/> wisely!
				</h1>
				<form method="POST" action="/reset">
		    	<button>Go Back</button>
		    	</form>
			</div>
		</div>
    </body>
</html>