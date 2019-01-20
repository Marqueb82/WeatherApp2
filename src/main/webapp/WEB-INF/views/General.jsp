<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width = device-width, initial-scale = 1.0">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<title>General Landing page</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
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
		<h1>Enter a location for weather data</h1>

		<form action="/generalTemp">
			Enter location: <input name="location" type="text"
				placeholder="(City or State)" required> <br>
			<br> <input type="submit">
		</form>
	</div>
	
</body>
</html>