package model;

public class Funcionario extends Pessoa {
	private String cargo;
	
	public Funcionario(String nome, String email, String cargo) {
		super(nome, email);
		this.cargo = cargo;
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("Cargo: " + cargo);
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String getCargo() {
		return cargo;
	}
}
