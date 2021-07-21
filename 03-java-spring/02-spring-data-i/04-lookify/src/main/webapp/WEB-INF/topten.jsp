<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Top 10</title>
<meta name="description" content="Programming Languages">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
			<nav>
			<h3>Searched for: ${ artist }</h3>
			<form action="/search">
				<input type="text" name="artist" />
				<button class="btn btn-primary">Search Artists</button>
			</form>
			<a href="/dashboard">Dashboard</a>
		</nav>
		<h1>Top 10 Songs</h1>
		<ul>
			<c:forEach items="${songs}" var="song" varStatus="loop">
				<li>
				<c:out value="${song.rating} - ${song.name} - ${song.artist}"></c:out>
				</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>