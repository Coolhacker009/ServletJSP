<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
			<form action="Inscription" method="post">

		<table>
			
			<tr>
				<td>Pseudo</td>
				<td><input type="text" name="pseudo"
					placeholder="Entrez votre pseudo"></td>
			</tr>
			
			<tr>
				<td>Mot de passe</td>
				<td><input type="password" name="mdp"
					placeholder="Entrez votre mot de passe"></td>
			</tr>

			<tr>
				<td><input type="submit" name="btn" value="S'incrire"></td>
				<td><a href="Inscrire.jsp">Créer un compte</a></td>
			</tr>


		</table>

	</form>

</body>
</html>