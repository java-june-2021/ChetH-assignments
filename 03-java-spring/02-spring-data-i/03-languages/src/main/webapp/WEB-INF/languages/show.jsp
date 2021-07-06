
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Show languages</title>
        <meta name="description" content="Language details">
        <meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
    </head>
    <body>

<h1><c:out value="${language.name}"/></h1>
<p>Creator: <c:out value="${language.creator}"/></p>
<p>Version: <c:out value="${language.version}"/></p>
<a href="/edit/${language.id}">Edit Language</a>
<form action="/${language.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>
</body>
</html>
