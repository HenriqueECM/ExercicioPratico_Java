package model;

public class Cliente extends Pessoa{
	private String tipoIngresso;
	
	public Cliente(String nome, String email, String tipoIngresso) {
		super(nome, email);
		this.tipoIngresso = tipoIngresso;
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("Tipo ingresso: " + tipoIngresso);
	}
	
	public void setTipoIngresso(String tipoIngresso) {
		this.tipoIngresso = tipoIngresso;
	}
	
	public String getTipoIngresso() {
		return tipoIngresso;
	}
}
