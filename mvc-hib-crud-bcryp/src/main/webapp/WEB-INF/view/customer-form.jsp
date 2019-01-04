<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
<title>Save Customer</title>

<title>User Login</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
   .error {
         color: #ff0000;
      }
</style>
</head>

<body>


	<div id="wrapper">
		<div id="header">
			<h2>INSERT OR UPDATE DATA</h2>
		</div>
	</div>

	<div class="container">

		<form:form action="saveCustomer" modelAttribute="customer" 
			method="POST">
			<div class="form-group">
				<label for="customercode">Customer Code:</label>
				<form:input path="customercode" class="form-control" />
				<form:errors path="customercode" cssClass = "error"></form:errors>
			</div>
			<div class="form-group">
				<label for="customername">Customer Name:</label>
				<form:input path="customername" class="form-control"/>
				<form:errors path="customername" cssClass = "error"></form:errors>
			</div>
			<div class="form-group">
				<label for="customeraddress">Customer Address:</label>
				<form:input path="customeraddress" class="form-control" />
				<form:errors path="customeraddress" cssClass = "error"></form:errors>
			</div>
			<div class="form-group">
				<label for="customerpincode">Pin Code:</label>
				<form:input path="customerpincode" class="form-control"/>
				<form:errors path="customerpincode" cssClass = "error"></form:errors>
			</div>
			<div class="form-group">
				<label for="customeremail">Customer Email:</label>
				<form:input path="customeremail" class="form-control" />
				<form:errors path="customeremail" cssClass = "error"></form:errors>
			</div>

			<div class="form-group">
				<label for="contactnumber">Contact Number:</label>
				<form:input path="contactnumber" class="form-control" />
				<form:errors path="contactnumber" cssClass = "error"></form:errors>
			</div>
			<input type="submit" value="Save" class="btn btn-default" />
		</form:form>



		<p>
			<a href="${pageContext.request.contextPath}/customer/list">Back
				to List</a>
		</p>


	</div>
	</div>

</body>

</html>










