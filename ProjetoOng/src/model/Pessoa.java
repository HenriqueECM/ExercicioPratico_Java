package model;

public class Pessoa {
	protected String nome, cidade;
	
	public Pessoa(String nome,String cidade) {
		this.cidade = cidade;
		this.nome = nome;
	}
	
	public void dados() {
		System.out.println("Nome: " + nome);
		System.out.println("Cidade: " + cidade);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getCidade() {
		return cidade;
	}
}
