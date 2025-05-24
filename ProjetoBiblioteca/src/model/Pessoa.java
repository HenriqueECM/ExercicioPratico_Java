package model;

public class Pessoa {
	protected String nome, cpf;
	
	public Pessoa (String nome, String cpf) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public void dados() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
}