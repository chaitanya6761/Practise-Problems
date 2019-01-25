<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE>

<html>

<head>

<title>Student registration Form</title>

</head>

<body>


  <form:form action="processForm" modelAttribute="student">

		First name: <form:input path="firstName"/>
		
		<br><br>
		
		Last name: <form:input path="lastName" />
		
		<br><br>
		
		Country : <form:select path="country">
		
		<form:options items="${theCountryOptions}"/>
		
		</form:select>
		
		<br><br>
		
		Favorite Language : 
		
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby " />
		
		<br><br>
		
		Operating System:
		
		Windows <form:checkbox path="operatingSystems" value="Windows" />
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		Mac Os <form:checkbox path="operatingSystems" value="Mac Os" />
		
		<br><br>
		
		<input type="submit" value="submit">



  </form:form>


</body>

</html>