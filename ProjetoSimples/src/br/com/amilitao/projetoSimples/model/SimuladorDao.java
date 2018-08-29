package br.com.amilitao.projetoSimples.model;

import java.util.ArrayList;
import java.util.List;

public class SimuladorDao {

	private static int contCad = 0;
	private static List<Pessoa> lista = new ArrayList<Pessoa>();

	public void cadastrar(Pessoa pessoa) {
		pessoa.setId(contCad + 1);
		lista.add(pessoa);
		contCad++;
	}

	public List<Pessoa> getList() {
		return lista;
	}

	public void excluir(int id) {		
		lista.remove(getById(id));
	}
	
	public void alterar(Pessoa pessoa){
		int cont = 0;
		for(Pessoa p : lista) {
			if(p.getId() == pessoa.getId()) {
				break;
			}
			cont++;
		}
		lista.set(cont, pessoa);
	}

	public Pessoa getById(int id) {
		Pessoa pessoa = new Pessoa();
		for (Pessoa p : lista) {
			if (p.getId() == id) {
				pessoa = p;
				break;
			}
		}
		return pessoa;
	}
	
}
