<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Dashboard</title>
        <meta name="description" content="Programming Languages">
        <meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
    </head>
    <body>
<h1>All Songs</h1>
<table class="table">
	<thead>
		<tr>
			<th>Name</th>
			<th>Artist</th>
			<th>Rating</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${songs}" var="song" varStatus="loop">
		<tr>
			<td><c:out value="${song.name}"/></td>
			<td><c:out value="${song.artist}"/></td>
			<td><c:out value="${song.rating}"/></td>
			<td><a href="/edit/${loop.index+1}">Edit </a>
			<a href="/delete/${loop.index+1}">Delete</a></td>
		</tr>
		</c:forEach>
	</tbody>
</table>
<h1>New Song</h1>
<form:form action="/new" method="post" modelAttribute="newSong">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="artist">Artist</form:label>
        <form:errors path="artist"/>
        <form:textarea path="artist"/>
    </p>
    <p>
        <form:label path="rating">Rating</form:label>
        <form:errors path="rating"/>
        <form:input path="rating"/>
    </p>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>