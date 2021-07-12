
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Dojo details</title>
        <meta name="description" content="Student details">
        <meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
    </head>
    <h1>All students</h1>
    <body>		
		<table class="table table-dark">
		<thead>
		<tr>
			<th>Name</th>
			<th>Age</th>
			<th>Address</th>
			<th>City</th>
			<th>State</th>
		</tr>
		</thead>
		<tbody>
		
		<c:forEach items="${students}" var="student">
		<tr>
			<td>${student.firstName} ${student.lastName}</td>
			<td>${student.age}</td>
			<td>${student.address.address}</td>
			<td>${student.address.city}</td>
			<td>${student.address.state}</td>
		</tr>
		</c:forEach>
		
		</tbody>
		</table>
	</body>
</html>
