<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Product details</title>
        <meta name="description" content="Product details">
        <meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
    </head>
    <h1><c:out value="${product.name}"/></h1>
    <body>		
		<table class="table table-dark">
		<thead>
		<tr>
			<th>Categories</th>
			<th></th>
			<th></th>
			<th></th>
		</tr>
		</thead>
		<tbody>
		
		<tr>
			<td><ul>
				<c:forEach items="${product.categories}" var="category">
				<li>${category.name}</li>
				</c:forEach>
			</ul></td>
			<td></td>
			<td></td>
			<td>
			
			<form action="/products/${index}" method="POST">
        	<label for="category">Add Category:</label>
        	<select name="category">
        		<option value="0" label="Select"/>
				<c:forEach items="${categories}" var="category">
					<option value="${category.id}" label="${category.name}"/>
				</c:forEach>
        	</select>
        	<br>
    		<button>Add</button>
			</form>
			
			</td>
		</tr>
		
		</tbody>
		</table>
	</body>
</html>
