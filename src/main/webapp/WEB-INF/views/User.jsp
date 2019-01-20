<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>User Values page</title>
<style>
	body {
 			background-image: url("images/weather-7.gif");
 			background-size:cover
		 }
	div {
  			padding-top: 130px;
			
	    }
</style>
</head>
<body>
	
	
	<div align="center" style="background-color:lightblue">
		<h1>Enter current location address</h1>

		<form action="/userTemp">
			Enter address: <input name="address" type="text"
				placeholder="(Address Street City)" required> <br>
			<br> <input type="submit">
		</form>
	</div>
	
	
</body>
</html>