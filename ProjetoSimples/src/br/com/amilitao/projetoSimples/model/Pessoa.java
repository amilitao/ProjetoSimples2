package br.com.amilitao.projetoSimples.model;

public class Pessoa {
	
	private int id;	
	private String nome;
	private String email;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	   public boolean equals(Object o) {
	      boolean result = false;
	      if (this.id == ((Pessoa)o).getId()) {
	         result = true;
	      }
	      return result;
	   }   
	

}
