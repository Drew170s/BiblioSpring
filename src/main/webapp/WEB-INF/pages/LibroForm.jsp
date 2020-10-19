<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>
<link rel="stylesheet" href="https://m.w3newbie.com/you-tube.css">
<title>New/Edit Libro</title>
<link rel="stylesheet" type="text/css" href="http://localhost:8080/BiblioSpring/resources/css/biblio1.css">
</head>
<body 	background = "resources/images/download.jpg" width = "100%" height = "100">
<!-- Navigation  -->
<nav class="navbar navbar-expand-md navbar-light bg-light sticky-top">
<div class="container-fluid">
	<a class="navbar-brand" href="#"><img src="resouces/images/book.png"></a>
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarResponsive">
		<ul class="navbar-nav ml-auto">
			<li class="nav-item">
				<a class="nav-link" href="/BiblioSpring">Home</a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="newLibro">Nuovo Libro</a>
			</li>
		</ul>
	</div>
</div>
</nav>
    <div align="center">
        <h1>New/Edit Libro</h1>
        <form:form action="saveLibro" method="post" modelAttribute="Libro">
        <table class = "tabella">
            <form:hidden path="id_libro"/>
            <tr>
                <td>nome:</td>
                <td><form:input path="nome" /></td>
            </tr>
            <tr>
                <td>genere:</td>
                <td><form:input path="genere" /></td>
            </tr>
            <tr>
                <td>annopubblicazione:</td>
                <td><form:input path="annopubblicazione" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>
	