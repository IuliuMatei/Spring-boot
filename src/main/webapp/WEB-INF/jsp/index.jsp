<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/index.css">
<title>Insert title here</title>
</head>
<body>
	<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<h3>
				Easy management
			</h3>
		</div>
	</div>
	<div class="row">
		<div class="col-md-12">
			<div class="jumbotron">
				<h2>
					Salutare, utilizatorule!
				</h2>
				<p>
					Aceasta aplicatie este facuta de mine pentru utilizatori pentru a se putea descurca mai usor cu 
					numarul foarte mare de clienti
				</p>
				<p>
					<a class="btn btn-primary btn-large" href="#">Learn more</a>
				</p>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-12">
			<div class="btn-group" role="group">
				 
				<a href="/addClient">
					<button class="btn btn-secondary" type="button">
						Adauga client
					</button> 
				</a>
				<a href="/users/allClients">
						Afiseaza client
				</a>
				<button class="btn btn-secondary" type="button">
					Updateaza client
				</button> 
				<button class="btn btn-secondary" type="button">
					Sterge client
				</button> 
			</div>
		</div>
	</div>
</div>
</body>
</html>