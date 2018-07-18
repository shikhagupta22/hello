<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>CRUD CUSTOMER</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Customer</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="Home.jsp">HOME</a></li>
      <li><a href="New.jsp">NEW</a></li>
      <li><a href="Update1.jsp">UPDATE</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">VIEW<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="Single1.jsp">Single</a></li>
          <li><a href="All1.jsp">All</a></li>
        </ul>
      </li>
      <li><a href="Delete.jsp">DELETE</a></li>
      <li><a href="#">LOG OUT</a></li>
    </ul>
  </div>
</nav>

</body>
</html>