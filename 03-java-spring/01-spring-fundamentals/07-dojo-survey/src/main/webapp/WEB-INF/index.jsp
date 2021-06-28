<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Dojo Survey</title>
        <meta name="description" content="Registration for an account">
        <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <body>
    	<div id="wrapper">
    	<div class="mainBody">
    	<h1>Please fill out following survey</h1>
        <form method="POST" action="/submit">
        	<label>
        		Your name: <input type="text" name="username">
        	</label><br>
        	<label>
        		Dojo location: <select name="location">
        			<option value="Boston">Boston</option>
        			<option value="Chicago">Chicago</option>
        			<option value="San Jose">San Jose</option>
        		</select>
        	</label><br>
        	<label>
        		Favorite language: <select name="language">
        			<option value="C#">C#</option>
        			<option value="Java">Java</option>
        			<option value="Python">Python</option>
        		</select>
        	</label><br>
            <label>
                Comment (optional):<br><input type="text" name="comment">
            </label>
            <br><br>
            <button>Submit</button>
        </form>
        </div>
        </div>
    </body>
</html>