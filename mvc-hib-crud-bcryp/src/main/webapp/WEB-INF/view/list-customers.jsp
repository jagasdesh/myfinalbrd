<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
<title>List Customers</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script type="text/javascript">
	setTimeout(function() {
		window.location = window.location;
	}, 5000);
</script>
<link rel="icon" type="/image/png" href="images/download.jpg">


<!-- reference our style sheet -->




</head>

<body>



	<div id="container">

		<div id="content">

			<!-- put new button: Add Customer -->

			<center>
				<input type="button" value="Add Customer"
					onclick="window.location.href='showFormForAdd'; return false;"
					class="btn btn-default" />
			</center>
			<table class="table table-striped">
				<tr>

					<th>Customer Code</th>
					<th>Customer Name</th>
					<th>Customer Address</th>
					<th>Customer Pin Code</th>

					<th>Customer Email</th>
					<th>Contact Number</th>
					<th>Registration Date</th>
					<th>Created By</th>
					<th>Modified Date</th>
					<th>edit</th>
					<th>delete</th>
				</tr>

				<c:forEach var="tempCustomer" items="${customers}">

					<c:url var="updatelink" value="/customer/ShowFormForUpdate">
						<c:param name="customercode" value="${tempCustomer.customercode}" />
					</c:url>

					<c:url var="deletelink" value="/customer/delete">
						<c:param name="customercode" value="${tempCustomer.customercode}" />
					</c:url>



					<!--  add our html table here -->


					<!-- loop over and print our customers -->


					<tr>

						<td>${tempCustomer.customercode}</td>
						<td>${tempCustomer.customername}</td>
						<td>${tempCustomer.customeraddress}</td>
						<td>${tempCustomer.customerpincode}</td>
						<td>${tempCustomer.customeremail}</td>
						<td>${tempCustomer.contactnumber}</td>
						<td>${tempCustomer.registrationdate}</td>
						<td>${tempCustomer.createdby}</td>
						<td>${tempCustomer.modifieddate}</td>

						<td><a href="${updatelink}">edit</a>
						<td><a href="${deletelink}" onclick="return confirm('Are you sure you want to delete?')">delete</a>
					</tr>

				</c:forEach>

			</table>

		</div>

	</div>
	<a href="/mvc-hib-crud-bcrypt/login/dashboard">LOGOUT</a>


</body>

</html>









