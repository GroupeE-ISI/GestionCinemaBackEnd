<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

</head>

<body>
	<h2 class="centrage">Liste des salles</h2>

	<div class="container">
		<table border="1" class="table table-striped table-bordered">
		<tr class="thead-dark">
			<th>Nom Salle</th>
			<th>Capacité</th>
			<th>Cinéma</th>
		</tr>
		<c:forEach items="${liste}" var="salle">
			<tr>
				<td>${ salle.nom }</td>
				<td>${ salle.capacite }</td>
				<td>${ salle.cinema.nom}</td>
			</tr>
		</c:forEach>
	</table>
	</div>
	
	
	<!-- Footer 
            <footer class="mojFooter">
                <font face="Roboto Condensed" size="4"> <center>
                <div class="container">
                    <div class="row" style="margin-top: 7px;">
                         <p> &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &copy; Copyright IB Cegos 2020.</p> 
                    </div>
                    <div class="bottom-footer">
                        <div class="col-md-12"> 
                            <ul class="footer-nav">
                                <li> <a href="https://www.facebook.com/"> Facebook </a> </li>
                                <li> <a href="https://twitter.com/"> Twitter </a> </li>
                                <li> <a href="https://plus.google.com/"> Google+ </a> </li>
                            </ul>
                        </div>
                    </div>
                </div>
                </font> </center>
            </footer> -->
</body>
</html>