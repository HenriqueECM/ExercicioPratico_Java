package model;

public class Voluntario extends Pessoa {
	private String areaAtuacao;
	
	public Voluntario (String nome, String cidade, String areaAtuacao) {
		super(nome, cidade);
		this.areaAtuacao = areaAtuacao;
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Cidade: " + cidade);
		System.out.println("Área de atuação: " + areaAtuacao);
	}
	
	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}
	
	public String getAreaAtuacao() {
		return areaAtuacao;
	}
}
