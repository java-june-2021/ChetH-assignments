<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Dashboard</title>
<meta name="description" content="Programming Languages">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h1>All Songs</h1>
		<nav>
			<h3>
				<a href="/new">Add New Song</a> | <a href="/topten">Top 10 Songs</a>
			</h3>
			<form action="/search" class="float-right">
				<input type="text" name="artist" />
				<button class="btn btn-primary">Search by Artists</button>
			</form>
		</nav>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Name</th>
					<th>Rating</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${songs}" var="song" varStatus="loop">
					<tr>
						<td><a href="/${song.id}">${song.name}</a></td>
						<td><c:out value="${song.rating}" /></td>
						<td><a href="/delete/${song.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>