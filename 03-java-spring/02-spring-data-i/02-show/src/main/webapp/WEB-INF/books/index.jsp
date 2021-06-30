<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Books</title>
        <meta name="description" content="Registration for an account">
        <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <body>
<h1>All Books</h1>
<table>
	<thead>
		<tr>
			<th>Title</th>
			<th>Description</th>
			<th>Language</th>
			<th>Number of Pages</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${books}" var="book">
		<tr>
			<td><c:out value="${book.title}"/></td>
			<td><c:out value="${book.description}"/></td>
			<td><c:out value="${book.language}"/></td>
			<td><c:out value="${book.numberOfPages}"/></td>
		</tr>
		</c:forEach>
	</tbody>
</table>
<a href="books/new">New Book</a>
</body>
</html>