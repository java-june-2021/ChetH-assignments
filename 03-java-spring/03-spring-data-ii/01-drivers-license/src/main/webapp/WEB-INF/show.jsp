
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Person details</title>
        <meta name="description" content="Language details">
        <meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
    </head>
    <body>
		<h1><c:out value="${person.firstName} ${person.lastName}"/></h1>
		<p>License number: <c:out value="${person.license.id}"/></p>
		<p>State: <c:out value="${person.license.state}"/></p>
		<p>Expiration Date: <c:out value="${person.license.expiration_date}"/></p>
	</body>
</html>
