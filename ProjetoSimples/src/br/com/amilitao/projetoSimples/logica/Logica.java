package br.com.amilitao.projetoSimples.logica;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Logica {
	
	void executa(HttpServletRequest req, HttpServletResponse resp) throws Exception;

}
