
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Show songs</title>
        <meta name="description" content="Language details">
        <meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
    </head>
    <body>
	<a href="/">Dashboard</a>
<h1><c:out value="${song.name}"/></h1>
<p>Creator: <c:out value="${song.artist}"/></p>
<p>Version: <c:out value="${song.rating}"/></p>
<a href="/edit/${song.id}">Edit</a>
<form action="/${song.id}" method="post">
<a href="/delete/${id}">Delete </a>
</form>
</body>
</html>
