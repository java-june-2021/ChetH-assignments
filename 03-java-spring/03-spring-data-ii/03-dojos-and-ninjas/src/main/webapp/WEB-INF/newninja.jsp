
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

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

<h1>New Ninja</h1>
<form:form action="/ninjas/new" method="post" modelAttribute="newNinja">
    <p>
        <form:label path="dojo">Dojo:</form:label>
        <form:select path="dojo">
        	<form:option value="0" label="Select"/>
			<c:forEach items="${dojoList}" var="dojo">
				<form:option value="${dojo.id}" label="${dojo.name}"/>
			</c:forEach>
        </form:select>
    </p>
    <p>
        <form:label path="firstName">First Name:</form:label>
        <form:errors path="firstName"/>
        <form:textarea path="firstName"/>
    </p>
    <p>
      	<form:label path="lastName">Last Name:</form:label>
     	<form:errors path="lastName"/>
     	<form:textarea path="lastName"/>
    </p>
    <p>
      	<form:label path="age">Age:</form:label>
     	<form:errors path="age"/>
     	<form:textarea path="age"/>
    </p>
    <input type="submit" value="Create"/>
</form:form>

</body>
</html>