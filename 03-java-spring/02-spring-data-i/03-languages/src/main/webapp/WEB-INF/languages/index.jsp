<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Languages</title>
        <meta name="description" content="Programming Languages">
        <meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
    </head>
    <body>
<h1>All Languages</h1>
<table class="table">
	<thead>
		<tr>
			<th>Name</th>
			<th>Creator</th>
			<th>Version</th>
			<th>Action</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${languages}" var="language" varStatus="loop">
		<tr>
			<td><c:out value="${language.name}"/></td>
			<td><c:out value="${language.creator}"/></td>
			<td><c:out value="${language.version}"/></td>
			<td><a href="/languages/edit/${loop.index+1}">Edit </a>
			<a href="/languages/delete/${loop.index+1}">Delete</a></td>
		</tr>
		</c:forEach>
	</tbody>
</table>
<h1>New Language</h1>
<form:form action="/languages/new" method="post" modelAttribute="language">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="creator">Creator</form:label>
        <form:errors path="creator"/>
        <form:textarea path="creator"/>
    </p>
    <p>
        <form:label path="version">Version</form:label>
        <form:errors path="version"/>
        <form:input path="version"/>
    </p>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>