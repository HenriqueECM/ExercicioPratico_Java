package model;

public class Medico extends Pessoa {
	private String especialidade;
	
	public Medico(String nome, String telefone, String especialidade) {
		super(nome, telefone);
		this.especialidade = especialidade;
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		
		System.out.println("Telefone: " + telefone);
		
		System.out.println("Especialidade: " + especialidade);
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
}
