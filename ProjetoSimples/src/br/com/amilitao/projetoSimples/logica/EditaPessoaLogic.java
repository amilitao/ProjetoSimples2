package br.com.amilitao.projetoSimples.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.amilitao.projetoSimples.model.Pessoa;
import br.com.amilitao.projetoSimples.model.SimuladorDao;

public class EditaPessoaLogic implements Logica {

	public void executa(HttpServletRequest req, HttpServletResponse resp) throws Exception {

		SimuladorDao dao = new SimuladorDao();
		Pessoa pessoa = new Pessoa();

		if(!req.getParameter("id").equals("") ) {
		int id = Integer.parseInt(req.getParameter("id"));
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");

		pessoa.setId(id);
		pessoa.setNome(nome);
		pessoa.setEmail(email);	
		
		dao.alterar(pessoa);
		}else {
			req.setAttribute("msgErro", "Os dados devem ser preenchidos!");
		}
		
		req.setAttribute("lista", dao.getList());

	}

}
