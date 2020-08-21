<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Ajouter Salle</h1>
	
	<form:form action="/ajouter" method="Post" modelAttribute="salle">
		<form:label path="nom">Nom de la salle :</form:label>
		<form:input path="nom" />
		<br />
		<form:label path="capacite">Capacité :</form:label>
		<form:input path="capacite" />
		<br />
 
		<form:label path="cinema.nom">Nom de cinéma :</form:label>
		<form:input path="cinema.nom" />
		<br /> 
		<form:button>Ajouter</form:button>
	</form:form>
	
</body>
</html>