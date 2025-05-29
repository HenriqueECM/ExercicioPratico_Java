package model;

public class Coordenador extends Pessoa {
	private String responsabilidade;
	
	public Coordenador (String nome, String cidade, String responsabilidade) {
		super(nome, cidade);
		this.responsabilidade = responsabilidade;
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Cidade: " + cidade);
		System.out.println("Responsabilidade: " + responsabilidade);
	}
	
	public void setResponsabilidade(String responsabilidade) {
		this.responsabilidade = responsabilidade;
	}
	
	public String getResponsabilidade() {
		return responsabilidade;
	}
}
