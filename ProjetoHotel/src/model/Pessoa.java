package model;

public class Pessoa {
	protected String nome, documento;
	
	public Pessoa(String nome, String documento) {
		this.documento = documento;
		this.nome = nome;
	}
	
	public void dados() {
		System.out.println("Nome: " + nome);
		System.out.println("Documento: " + documento);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDocumento() {
		return documento;
	}
}
