<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
<title>Libro Management Screen</title>
<link rel="stylesheet" type="text/css" href="http://localhost:8080/BiblioSpring/resources/css/biblio.css">
</head>
<body background = "resources/images/download.jpg" width = "100%" height = "100">
<!-- Navigation  -->
<nav class="navbar navbar-expand-md navbar-light bg-danger sticky-top">
<div class="container-fluid">
	<a class="navbar-brand" href="#"><img src="resources/images/book.png"></a>
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarResponsive">
		<ul class="navbar-nav ml-auto">
			<li class="nav-item ">
				<a class="nav-link " href="/BiblioSpring">Home</a>
			</li>
			<li class="nav-item ">
				<a class="nav-link " href="newLibro">Nuovo Libro</a>
			</li>
		</ul>
	</div>
</div>
</nav>
    <b><div class = "lista" align = center>

      </tables>
        <h1>Lista Libri</h1>
        <table border="1" class = "tabella">
 
            <th>Nome</th>
            <th>Genere</th>
            <th>annopubblicazione</th>
            
            <c:forEach var="Libro" items="${listaLibro}">
                <tr>
 					<td>${Libro.nome}</td>
                    <td>${Libro.genere}</td>
                    <td>${Libro.annopubblicazione}</td>
                   <td><a href="editLibro?id=${Libro.id_libro}">Edit</a>
                             <a
                        href="deleteLibro?id=${Libro.id_libro}">Delete</a></td>
 
                </tr>
            </c:forEach>
        </table>
    </div></b>
</body>
</html>