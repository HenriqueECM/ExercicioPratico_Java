package model;

public class Pessoa {
	protected String nome;
	protected int idade;
	
	public Pessoa(String nome, int idade) {
		this.idade = idade;
		this.nome = nome;
	}
	
	public void dados() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
}
