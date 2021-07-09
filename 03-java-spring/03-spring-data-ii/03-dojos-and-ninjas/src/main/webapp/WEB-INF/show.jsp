
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Dojo details</title>
        <meta name="description" content="Dojo details">
        <meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
    </head>
    <h1><c:out value="${dojo.name}"/> Location Ninjas</h1>
    <body>		
		<table class="table table-dark">
		<thead>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Age</th>
		</tr>
		</thead>
		<tbody>
		
		<c:forEach items="${dojo.ninjas}" var="ninja">
		<tr>
			<td>${ninja.firstName}</td>
			<td>${ninja.lastName}</td>
			<td>${ninja.age}</td>
		</tr>
		</c:forEach>
		
		</tbody>
		</table>
	</body>
</html>
