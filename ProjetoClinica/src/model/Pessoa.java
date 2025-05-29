package model;

public class Pessoa {
	protected String nome;
	protected String telefone;
	
	// Método construtor
	public Pessoa(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public void dados() {
		System.out.println("Nome: " + nome);
		System.out.println("Telefone: " + telefone);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return telefone;
	}
}
