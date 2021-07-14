<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="creator" content="Enter new Ninja">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
    </head>
    <body>

<h1>New Product</h1>
<form:form action="/products/new" method="post" modelAttribute="newProduct">
    <p>
        <form:label path="name">Name:</form:label>
        <form:errors path="name"/>
        <form:textarea path="name"/>
    </p>
    <p>
        <form:label path="description">Description:</form:label>
        <form:errors path="description"/>
        <form:textarea path="description"/>
    </p>
    <p>
      	<form:label path="price">Price:</form:label>
     	<form:errors path="price"/>
     	<form:textarea path="price"/>
    </p>
    <input type="submit" value="Create"/>
</form:form>

</body>
</html>