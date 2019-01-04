<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>User Login</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<h2>LOGIN USER</h2>
		<form:form action="validateUser" modelAttribute="user" method="POST">
			<div class="form-group">
				<label for="userName">Username:</label>
				<form:input path="userName" class="form-control" name="userName"/>

			</div>
			<div class="form-group">
				<label for="password">Password:</label>
				<form:input type="password" path="password" class="form-control" />
			</div>

		<td><input type="submit" value="Login" class="btn btn-default"/></td><br>
		
		</form:form>
			<a href="dashboard">BACK TO DASHBOARD</a>
	</div>

</body>
</html>
