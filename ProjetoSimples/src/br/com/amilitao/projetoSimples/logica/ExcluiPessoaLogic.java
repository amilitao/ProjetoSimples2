package br.com.amilitao.projetoSimples.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.amilitao.projetoSimples.model.SimuladorDao;

public class ExcluiPessoaLogic implements Logica {

	public void executa(HttpServletRequest req, HttpServletResponse resp) throws Exception {

		SimuladorDao dao = new SimuladorDao();

		if(!req.getParameter("id").equals("")) {
		int id = Integer.parseInt(req.getParameter("id"));		
		dao.excluir(id);
		}else {
			req.setAttribute("msgErro", "Uma pessoa deve ser escolhida!");
		}
		req.setAttribute("lista", dao.getList());

	}

}
