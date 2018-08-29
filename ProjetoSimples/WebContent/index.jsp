<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Sistema</title>
</head>
<body>

	<br>
	<div class="w3-row w3-container">

		<div class="w3-col s4 w3-white w3-center">
			<c:import url="formCadastro.jsp" />
		</div>
		<div class="w3-col s8 w3-white w3-center">
			<c:import url="tabelaPessoa.jsp" />
		</div>
	</div>
	
</body>
</html>