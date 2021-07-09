
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <name>New Person</name>
        <meta name="creator" content="Enter new Language">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
    </head>
    <body>

<h1>New Person</h1>
<form:form action="/persons/new" method="post" modelAttribute="newPerson">
    <p>
        <form:label path="firstName">First name:</form:label>
        <form:errors path="firstName"/>
        <form:input path="firstName"/>
    </p>
    <p>
        <form:label path="lastName">Last name:</form:label>
        <form:errors path="lastName"/>
        <form:textarea path="lastName"/>
    </p>
    <input type="submit" value="Submit"/>
</form:form>

</body>
</html>