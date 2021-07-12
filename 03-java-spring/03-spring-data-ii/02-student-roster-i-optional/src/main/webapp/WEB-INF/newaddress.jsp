
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="creator" content="Enter contact info">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
    </head>
    <body>

<h1>Contact Info</h1>
<form:form action="/contact/new" method="post" modelAttribute="newAddress">
    <p>
        <form:label path="student">Student:</form:label>
        <form:select path="student">
        	<form:option value="0" label="Select"/>
			<c:forEach items="${studentList}" var="student">
				<form:option value="${student.id}" label="${student.firstName} ${student.lastName}"/>
			</c:forEach>
        </form:select>
    </p>
    <p>
        <form:label path="address">Address:</form:label>
        <form:errors path="address"/>
        <form:textarea path="address"/>
    </p>
    <p>
      	<form:label path="city">City:</form:label>
     	<form:errors path="city"/>
     	<form:textarea path="city"/>
    </p>
    <p>
      	<form:label path="state">State:</form:label>
     	<form:errors path="state"/>
     	<form:textarea path="state"/>
    </p>
    <input type="submit" value="Create"/>
</form:form>

</body>
</html>