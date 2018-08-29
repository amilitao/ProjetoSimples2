<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<div class="w3-card-4">
	<div class="w3-container w3-blue">
		<h2>Dados</h2>
	</div>
	<c:set var="logica" value="" />
	<form class="w3-container" action="ControllerServlet" method="post">
		<input type="hidden" name="id" value="${id}">
		<p>
			<label class="w3-text-blue"><b>Nome</b></label> <input
				class="w3-input w3-border w3-sand" name="nome" type="text"
				value="${nome}">
		</p>
		<p>
			<label class="w3-text-blue"><b>Email</b></label> <input
				class="w3-input w3-border w3-sand" name="email" type="text"
				value="${email}">
		</p>
		<p><br>
			<button class="w3-btn w3-green" name="logica"
				value="CadastroPessoaLogic">Gravar</button>
			<button class="w3-btn w3-yellow" name="logica"
				value="EditaPessoaLogic">Editar</button>
			<button class="w3-btn w3-red" name="logica" 
			value="ExcluiPessoaLogic">Excluir</button>
		</p>
	</form>
	<br>
	<div class="w3-container">
		<div class="w3-panel w3-white ">
			<p>${msgErro}</p>
		</div>
	</div>

</div>
