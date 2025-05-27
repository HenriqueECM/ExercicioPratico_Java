package model;

public class Instrutor extends Pessoa {
	private String especialidade;
	
	public Instrutor (String especialidade, String nome, int idade) {
		super(nome, idade);
		this.especialidade = especialidade;
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Especialidade: " + especialidade);
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
}
