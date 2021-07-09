
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="creator" content="Enter new Language">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
    </head>
    <body>

<h1>New License</h1>
<form:form action="/licenses/new" method="post" modelAttribute="newLicense">
    <p>
        <form:label path="person">Person:</form:label>
        <form:select path="person">
        	<form:option value="0" label="Select"/>
			<c:forEach items="${personList}" var="person">
				<form:option value="${person.id}" label="${person.firstName} ${person.lastName}"/>
			</c:forEach>			
        </form:select>
    </p>
    <p>
        <form:label path="state">State:</form:label>
        <form:errors path="state"/>
        <form:textarea path="state"/>
    </p>
    <p>
      	<form:label path="expiration_date">Expiration Date</form:label>
     	<form:errors path="expiration_date"/>
     	<form:input type="date" path="expiration_date"/>
    </p>
    <input type="submit" value="Submit"/>
</form:form>

</body>
</html>