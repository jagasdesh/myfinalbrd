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
		<h2>ADMIN(CREATE USER)</h2>
		<form:form action="saveUser" modelAttribute="user" method="POST">
			<div class="form-group">
				<label for="userName">Username:</label>
				<form:input path="userName" class="form-control" />

			</div>
			<div class="form-group">
				<label for="password">Password:</label>
				<form:input path="password" class="form-control" />
			</div>

			<input type="submit" value="save"  class="btn btn-default" />
		
		</form:form>
			<a href="dashboard">BACK TO DASHBOARD</a>
	</div>

</body>
</html>
