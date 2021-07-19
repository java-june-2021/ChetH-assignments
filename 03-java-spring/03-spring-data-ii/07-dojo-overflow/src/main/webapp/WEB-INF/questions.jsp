<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Dojo Overflow Questions</title>
<meta name="description"
	content="Dojo Overflow questions and answers from the interwebs">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
</head>
<body>
	<div class="container-fluid">
		<h1>Questions Dashboard</h1>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Question</th>
					<th>Tags</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${questions}" var="question">
					<tr>
						<td><a href="/show/${question.id}">${question.questionText}</a>
						</td>
						<td><c:forEach items="${question.questionTags}" var="tagText">
								<a href="#" class="btn btn-default btn-sm" role="button">${tagText.subject}</a>
							</c:forEach></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
		<a href="/newQuestion">New Question</a>
	</div>
</body>
</html>
