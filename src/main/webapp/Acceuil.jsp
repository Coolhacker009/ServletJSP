<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Acceuil</title>
</head>
<body>

					
					<h1>Bienvenue ${sessionScope.prenom} ${sessionScope.nom}</h1>
					
					<form  method="login" action="post">
					<input type="submit" value="Déconnexion" >
					</form>
					
					
</body>
</html>