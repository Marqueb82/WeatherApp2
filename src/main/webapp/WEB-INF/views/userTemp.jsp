<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>User Return page</title>
<style>
	body {
 			background-image: url("images/weather-7.gif");
 			background-size:cover
		 }
	div {
  			padding-top: 90px;

	  }
</style>
</head>
<body>
	
	<div align="center" style="background-color:lightblue">
	<h2>${city} weather for you.....</h2>
		<h3>Current Temperature:</h3>	
		<h4>${currently.temperature}</h4>	
		<h3>Current Weather Summary:</h3>	
		<h4>${currently.summary}</h4>
		<a href="/" type="button" class="btn btn-primary btn-lg">
			Home page</a>
	</div>
	
</body>
</html>