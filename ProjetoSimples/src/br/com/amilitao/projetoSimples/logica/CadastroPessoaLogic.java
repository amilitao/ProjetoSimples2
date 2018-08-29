package br.com.amilitao.projetoSimples.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.amilitao.projetoSimples.model.Pessoa;
import br.com.amilitao.projetoSimples.model.SimuladorDao;

public class CadastroPessoaLogic implements Logica {

	public void executa(HttpServletRequest req, HttpServletResponse resp) throws Exception {

		Pessoa pessoa = new Pessoa();
		SimuladorDao dao = new SimuladorDao();
		
		pessoa.setNome(req.getParameter("nome"));
		pessoa.setEmail(req.getParameter("email"));


		if(!pessoa.getNome().equals("") || !pessoa.getEmail().equals("") ) {
		dao.cadastrar(pessoa);
		}else {
			req.setAttribute("msgErro", "Os dados devem ser preenchidos!");
		}
		req.setAttribute("lista", dao.getList());

	}

}
