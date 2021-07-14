<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Category details</title>
        <meta name="description" content="Category details">
        <meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
    </head>
    <h1><c:out value="${category.name}"/></h1>
    <body>		
		<table class="table table-dark">
		<thead>
		<tr>
			<th>Products</th>
			<th></th>
			<th></th>
			<th></th>
		</tr>
		</thead>
		<tbody>
		
		<tr>
			<td><ul>
				<c:forEach items="${category.products}" var="product">
				<li>${product.name}</li>
				</c:forEach>
			</ul></td>
			<td></td>
			<td></td>
			<td>
			
			<form action="/categories/${index}" method="POST">
        	<label for="product">Add Product:</label>
        	<select name="product">
        		<option value="0" label="Select"/>
				<c:forEach items="${products}" var="product">
					<option value="${product.id}" label="${product.name}"/>
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
