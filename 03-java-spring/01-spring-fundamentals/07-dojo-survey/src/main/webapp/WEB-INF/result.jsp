<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Your submitted results</title>
        <meta name="description" content="Registration for an account">
        <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <body>
    	<div id="wrapper">
	    	<div class="mainBody">
				<h1>Your submitted responses</h1>
				Name: <c:out value=" ${username}"/><br>
				Dojo Location: <c:out value=" ${location}"/><br>
				Favorite Language: <c:out value=" ${language}"/><br>
				Comment: <c:out value=" ${comment}"/><br>
		    	<br><br>
		    	<form method="POST" action="/reset">
		    	<button>Go Back</button>
		    	</form>
	    	</div>
    	</div>
    </body>
</html>