package model;

public class Pessoa {
	protected String nome, email;
	
	public Pessoa(String nome, String email) {
		this.email = email;
		this.nome = nome;
	}
	
	public void dados() {
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String email() {
		return email;
	}
}
