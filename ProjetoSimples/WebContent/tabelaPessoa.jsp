<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="br.com.amilitao.projetoSimples.model.Pessoa"%>
<%@page import="java.util.List"%>



<div class="w3-container">
	<div class="w3-responsive">
		<table class="w3-table-all w3-hoverable">
			<thead>
				<tr class="w3-blue">
					<th>Id</th>
					<th>Nome</th>
					<th>Email</th>
				</tr>
			</thead>
			<c:forEach var="p" items="${lista}">
				<tr>
					<td>${p.id}</td>
					<td><a
						href="ControllerServlet?id=${p.id}&logica=ListaPessoaLogic">${p.nome}</a></td>
					<td>${p.email}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</div>
