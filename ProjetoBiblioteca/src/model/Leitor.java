package model;

public class Leitor extends Pessoa {
	private String matricula;
	
	public Leitor(String nome, String cpf, String matricula) {
		super(nome,cpf);
		this.matricula = matricula;
	}
	
	public void mostrarDados() {
		dados();
		System.out.println("Matricula: " + matricula);
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return matricula;
	}
}
