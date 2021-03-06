
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Show songs</title>
<meta name="description" content="Language details">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<nav>
			<h3>Searched for: ${artist}</h3>
			<form action="/search">
				<input type="text" name="artist" />
				<button class="btn btn-primary">Search Artists</button>
			</form>
			<a href="/dashboard">Dashboard</a>
		</nav>
		<p>
			Song title:
			<c:out value="${song.name}"/>
		</p>
		<p>
			Artist:
			<c:out value="${song.artist}" />
		</p>
		<p>
			Rating (1-10):
			<c:out value="${song.rating}" />
		</p>
			<a href="/delete/${song.id}">Delete </a>
	</div>
</body>
</html>
