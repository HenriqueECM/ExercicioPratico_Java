package model;

public class Aluno extends Pessoa {
	private String objetivo;
	
	public Aluno (String nome, int idade, String objetivo) {
		super(nome, idade);
		this.objetivo = objetivo;
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Objetivo: " + objetivo);
	}
	
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	
	public String getObjetivo() {
		return objetivo;
	}
}
