<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="creator" content="Enter new Language">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h1>New Song</h1>
		<form:form action="/new" method="POST" modelAttribute="song">
			<p>
				<form:label path="name">Name of song</form:label>
				<form:errors path="name" />
				<form:input path="name" class="form-control" />
			</p>
			<p>
				<form:label path="artist">Artist</form:label>
				<form:errors path="artist" />
				<form:input path="artist" class="form-control" />
			</p>
			<p>
				<form:label path="rating">Rating</form:label>
				<form:errors path="rating" />
				<form:input path="rating" class="form-control" />
			</p>
			<input type="submit" value="Add Song" />
		</form:form>
	</div>
</body>
</html>