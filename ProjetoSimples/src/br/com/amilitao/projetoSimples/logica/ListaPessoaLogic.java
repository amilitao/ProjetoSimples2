package br.com.amilitao.projetoSimples.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.amilitao.projetoSimples.model.Pessoa;
import br.com.amilitao.projetoSimples.model.SimuladorDao;

public class ListaPessoaLogic implements Logica{

	public void executa(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		int id = Integer.parseInt(req.getParameter("id"));
		SimuladorDao dao = new SimuladorDao();
		Pessoa p = dao.getById(id);
		req.setAttribute("id", p.getId());
		req.setAttribute("nome", p.getNome());
		req.setAttribute("email", p.getEmail());
		req.setAttribute("lista", dao.getList());
	}

}
