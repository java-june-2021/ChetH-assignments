<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Registration Page</title>
<meta name="description"
	content="Register new account">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
</head>
<body>
	<div class="container-fluid">
		<h1>Register!</h1>
		<p><c:out value="${regError}"/></p>
		<p><form:errors path="user.*"/></p>
		<form:form method="POST" action="/registration" modelAttribute="user">
		<p>
			<form:label path="email">Email:</form:label>
			<form:input type="email" path="email" class="form-control"/>
		</p>
		<p>
			<form:label path="password">Password:</form:label>
			<form:password path="password" class="form-control"/>
		</p>
		<p>
			<form:label path="passwordConfirmation">Confirm Password:</form:label>
			<form:password path="passwordConfirmation" class="form-control"/>
		</p>
		<input type="submit" value="Register!"/>
		</form:form>
	</div>
</body>
</html>
