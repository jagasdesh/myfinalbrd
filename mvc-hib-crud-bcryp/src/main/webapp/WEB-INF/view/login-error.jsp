<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>

<head>
	<title>User Login</title>
	</head>

<body>
	
	<h2>INVALID USERNAME OR PASSWORD</h2>
			<a href="dashboard">GO TO DASHBOARD</a>
<div style="color:red">
                Your fake login attempt was bursted, dare again !!<br />
                Caused : ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
            </div>
</body>

</html>










