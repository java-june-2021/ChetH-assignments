<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="creator" content="Enter new Dojo Overflow question">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
</head>
<body>
	<div class="container-fluid">
		<h1>What is your question?</h1>
		<form:form action="/newQuestion" method="post"
			modelAttribute="newQuestion">
			<p>
				<form:label path="questionText">Question:</form:label>
				<form:errors path="questionText" />
				<form:textarea path="questionText" class="form-control" rows="3" />
			</p>
			<p>
				<form:label path="tagsEphemeral">Tags (comma separated, 3 max):</form:label>
				<form:errors path="tagsEphemeral" />
				<form:input path="tagsEphemeral" class="form-control" rows="1" />
			</p>
			<input type="submit" value="Submit" />
		</form:form>
	</div>
</body>
</html>