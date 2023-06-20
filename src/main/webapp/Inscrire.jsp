<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inscription</title>
</head>
<body>


	<form action="Inscription" method="post">

		<table>
			<tr>
				<td>Prenom</td>
				<td><input type="text" name="prenom"
					placeholder="Entrez votre prénom"></td>
			</tr>
			<tr>
				<td>Nom</td>
				<td><input type="text" name="nom"
					placeholder="Entrez votre nom"></td>
			</tr>
			<tr>
				<td>Pséudo</td>
				<td><input type="text" name="pseudo"
					placeholder="Entrez votre pseudo"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="email"
					placeholder="Entrez votre email"></td>
			</tr>
			<tr>
				<td>Mot de passe</td>
				<td><input type="password" name="mdp"
					placeholder="Entrez votre mot de passe"></td>
			</tr>
			<tr>
				<td>Confimer mot de passe</td>
				<td><input type="password" name="mdp2"
					placeholder="Confirmer votre mot de passe"></td>
			</tr>

			<tr>
				<td><input type="submit" name="btn" value="Valider"></td>
				<td><a href="Login.jsp">Connectez-vous</a></td>
			</tr>


		</table>

	</form>

</body>
</html>