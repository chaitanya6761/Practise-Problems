<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE>

<html>

<head>

<title>Student confirmation</title>

</head>

<body>
The student is confirmed: ${student.firstName} ${student.lastName}

<br><br>

Country: ${student.country}

<br><br>

Favorite language: ${student.favoriteLanguage}

<br><br>

Operating System : 

<c:forEach var="temp" items="${student.operatingSystems}">

<ul>
<li>${temp}</li>
</ul>
</c:forEach> 

<br><br>

</body>

</html>