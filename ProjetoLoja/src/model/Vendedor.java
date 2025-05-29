package model;

public class Vendedor extends Pessoa {
	private String metaMensal;
	
	public Vendedor(String nome, String telefone, String metaMensal) {
		super(nome, telefone);
		this.metaMensal = metaMensal;
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Telefone: " + telefone);
		System.out.println("Meta Mensal: " + metaMensal);
	}
	
	public void setMetaMensal(String metaMensal) {
		this.metaMensal = metaMensal;
	}
	
	public String getMetaMensal() {
		return metaMensal;
	}
}
