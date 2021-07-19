<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Category details</title>
<meta name="description" content="Category details">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
</head>
<body>
	<div class="container-fluid">
		<h1>
			<c:out value="${question.questionText}" />
		</h1>
		<p>
			Tags: <span><c:forEach items="${question.questionTags}"
					var="tagText">
					<a href="#" class="btn btn-default btn-sm" role="button">${tagText.subject}</a>
				</c:forEach></span>
		</p>
		<hr>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Answers</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${question.answers}" var="answer">
					<tr>
						<td>${answer.answerText}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<hr>
		<h3>Add an answer</h3>
		<form:form method="POST" action="/addAnswer" modelAttribute="answer">
			<p>
				<form:label path="answerText">Answer:</form:label>
				<form:errors path="answerText" />
				<form:input path="answerText" class="form-control" rows="5" />
				<form:hidden path="quest" value="${question.id}"
					class="form-control" rows="5" />
			</p>
			<button>Add answer</button>
		</form:form>
	</div>
</body>
</html>
