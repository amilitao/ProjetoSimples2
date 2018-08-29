package br.com.amilitao.projetoSimples.logica;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.amilitao.projetoSimples.model.SimuladorDao;

@WebServlet(urlPatterns = "/ControllerServlet")
public class ControllerServlet extends HttpServlet {

	SimuladorDao pessoaService = new SimuladorDao();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nomeDaClasse = req.getParameter("logica");

		try {
			Class<?> classe = Class.forName("br.com.amilitao.projetoSimples.logica." + nomeDaClasse);

			Logica logica = (Logica) classe.newInstance();

			logica.executa(req, resp);
			RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");

			dispatcher.forward(req, resp);

		} catch (Exception e) {
			throw new ServletException("Encontrou erro" + e);
		}
	}

}
