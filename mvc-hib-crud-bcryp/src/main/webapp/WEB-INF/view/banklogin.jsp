<!DOCTYPE html>
<html lang="en">
<head>
<title>loginpage</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
</head>
<body>
    <center>
        <H1>WELCOME TO LOGIN PAGE</H1>
    </center>
   <center> <form   style="width:500px" name="dropdownbox" action="LoginController" method="post">
            <b>UserName:</b> <input type="text" name="UserName" value="jagadesh" id="user" class="form-control">
                <br>
            <b>Password:</b> <input type="password" name="password" id="password" value="ranga"class="form-control">
                <br>
            <b>Type of an Employee:</b>
            <br>
            <select name="list" id="id" accesskey="target">
                    <option value='none' selected>Choose a type</option>
                    <option value="ROLE_USER" name="user" >Maker</option>
                    <option value="ROLE_ADMIN" name="admin" >Checker</option>
                   
                </select>
                <br><br> 
                <input type=submit  name ="login"  value="login" class="btn btn-default"/>
           </form></center>
              
    
</body>

</html>